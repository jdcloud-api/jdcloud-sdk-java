// Copyright 2018 JDCLOUD.COM
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// This signer is modified from AWS V4 signer algorithm.

package com.jdcloud.sdk.auth.sign;

import com.jdcloud.sdk.auth.Credentials;
import com.jdcloud.sdk.auth.SessionCredentials;
import com.jdcloud.sdk.constant.ParameterConstant;
import com.jdcloud.sdk.client.SdkClientException;
import com.jdcloud.sdk.http.SdkHttpFullRequest;
import com.jdcloud.sdk.http.SdkHttpRequest;
import com.jdcloud.sdk.utils.BinaryUtils;
import com.jdcloud.sdk.utils.SdkHttpUtils;
import com.jdcloud.sdk.utils.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.jdcloud.sdk.utils.StringUtils.lowerCase;


/**
 * Author xumanyi1
 * 2017/7/18
 * 14:49
 * function
 */
public class JdCloudSigner extends AbstractSigner implements ServiceSigner, RegionSigner{

    private static final List<String> LIST_OF_HEADERS_TO_IGNORE_IN_LOWER_CASE = Arrays.asList("connection", "x-jdcloud-trace-id");

    /**
     * 服务名称
     */
    protected String serviceName;
    /**
     * 服务区域名称
     */
    protected String regionName;


    public String getRegionName() {
        return regionName;
    }

    @Override
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getServiceName() {
        return serviceName;
    }

    @Override
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    private Date overriddenDate;

    private boolean doubleUrlEncode;

    public JdCloudSigner(){

    }

    public JdCloudSigner(boolean doubleUrlEncode) {
        this.doubleUrlEncode = doubleUrlEncode;
    }

    public void setOverrideDate(Date overriddenDate) {
        if (overriddenDate != null) {
            this.overriddenDate = new Date(overriddenDate.getTime());
        } else {
            this.overriddenDate = null;
        }
    }

    @Override
    public SdkHttpFullRequest sign(SdkHttpFullRequest.Builder builder, Credentials credentials) {
        return this.doSign(builder, credentials).build();
    }

    /**
     * 方法描述：签名的具体实现
     * @param builder
     * @param credentials
     * @return 
     * @author lixuenan3
     * @date 2018年3月22日 下午5:40:55
     */
    private SdkHttpFullRequest.Builder doSign(SdkHttpFullRequest.Builder builder, Credentials credentials) {
        Credentials sanitizedCredentials = sanitizeCredentials(credentials);
        if (sanitizedCredentials instanceof SessionCredentials) {
            addSessionCredentials(builder, (SessionCredentials) sanitizedCredentials);
        }

        final SignerRequestParams signerParams = new SignerRequestParams(
                builder, overriddenDate, regionName, serviceName,
                ParameterConstant.JDCLOUD2_SIGNING_ALGORITHM);

        addHostHeader(builder);
        builder.header(ParameterConstant.X_JDCLOUD_DATE, signerParams.getFormattedSigningDateTime());

        // TODO: if set x_jdcloud_content_sha256=required in header, should calc body hash value
        String contentSha256 = calculateContentHash(builder);//负载hash
        final String canonicalRequest = createCanonicalRequest(builder, contentSha256);//构造规范请求
        final String stringToSign = createStringToSign(canonicalRequest, signerParams);//构造待签名串

        final byte[] signingKey = deriveSigningKey(sanitizedCredentials, signerParams);//处理秘钥验证

        final byte[] signature = computeSignature(stringToSign, signingKey);//计算签名

        builder.header(ParameterConstant.AUTHORIZATION,
                buildAuthorizationHeader(builder, signature, sanitizedCredentials, signerParams));

        processRequestPayload(builder, signature, signingKey, signerParams);
        return builder;
    }


    /**
     * 方法描述：在头信息中添加host
     * @param mutableRequest 
     * @author lixuenan3
     * @date 2018年3月22日 下午5:42:18
     */
    private void addHostHeader(SdkHttpFullRequest.Builder mutableRequest) {
        // AWS4 requires that we sign the Host header so we
        // have to have it in the request by the time we sign.

        final URI endpoint = mutableRequest.getEndpoint();
        final StringBuilder hostHeaderBuilder = new StringBuilder(
                endpoint.getHost());
        if (SdkHttpUtils.isUsingNonDefaultPort(endpoint)) {
            hostHeaderBuilder.append(":").append(endpoint.getPort());
        }

        mutableRequest.header(ParameterConstant.HOST, hostHeaderBuilder.toString());
    }

    /**
     * 方法描述：对请求内容进行hash并转为16进制
     * @param request
     * @return 
     * @author lixuenan3
     * @date 2018年3月22日 下午5:43:31
     */
    protected String calculateContentHash(SdkHttpFullRequest.Builder request) {
        InputStream payloadStream = getBinaryRequestPayloadStream(request.getContent());
        String contentSha256 = BinaryUtils.toHex(hash(payloadStream));
        try {
            payloadStream.reset();
        } catch (IOException e) {
            throw new SdkClientException("Unable to reset stream after calculating signature", e);
        }
        return contentSha256;
    }

    /**
     * 方法描述：格式化请求信息
     * @param request
     * @param contentSha256
     * @return 
     * @author lixuenan3
     * @date 2018年3月22日 下午5:44:31
     */
    private String createCanonicalRequest(SdkHttpRequest request,
                                          String contentSha256) {
        /* This would url-encode the resource path for the first time. */
        final String path = SdkHttpUtils.appendUri(
                request.getEndpoint().getPath(), request.getResourcePath());

        final String canonicalRequest = new StringBuilder(request.getHttpMethod().toString())
                .append(ParameterConstant.LINE_SEPARATOR)
                // This would optionally double url-encode the resource path
                .append(getCanonicalizedResourcePath(path, doubleUrlEncode))
                .append(ParameterConstant.LINE_SEPARATOR)
                .append(getCanonicalizedQueryString(request.getParameters()))
                .append(ParameterConstant.LINE_SEPARATOR)
                .append(getCanonicalizedHeaderString(request))
                .append(ParameterConstant.LINE_SEPARATOR)
                .append(getSignedHeadersString(request)).append(ParameterConstant.LINE_SEPARATOR)
                .append(contentSha256)
                .toString();

        return canonicalRequest;
    }

    /**
     * 方法描述：对请求头信息的进行排序并格式化返回
     * @param request
     * @return 
     * @author lixuenan3
     * @date 2018年3月22日 下午5:45:11
     */
    private String getCanonicalizedHeaderString(SdkHttpRequest request) {
        final List<String> sortedHeaders = new ArrayList<>(request.getHeaders().keySet());
        Collections.sort(sortedHeaders, String.CASE_INSENSITIVE_ORDER);

        final Map<String, List<String>> requestHeaders = request.getHeaders();
        StringBuilder buffer = new StringBuilder();
        for (String header : sortedHeaders) {
            if (shouldExcludeHeaderFromSigning(header)) {
                continue;
            }
            String key = lowerCase(header);

            for (String headerValue : requestHeaders.get(header)) {
                StringUtils.appendCompactedString(buffer, key);
                buffer.append(":");
                if (headerValue != null) {
                    StringUtils.appendCompactedString(buffer, headerValue);
                }
                buffer.append("\n");
            }
        }

        return buffer.toString();
    }

    /**
     * 方法描述：是否属于被排除的报文头
     * @param header
     * @return 
     * @author lixuenan3
     * @date 2018年3月22日 下午5:46:59
     */
    private boolean shouldExcludeHeaderFromSigning(String header) {
        return LIST_OF_HEADERS_TO_IGNORE_IN_LOWER_CASE.contains(lowerCase(header));
    }

    /**
     * 方法描述：获取签名头信息SignedHeaders
     * @param request
     * @return key1;key2....
     * @author lixuenan3
     * @date 2018年3月22日 下午5:47:22
     */
    private String getSignedHeadersString(SdkHttpRequest request) {
        final List<String> sortedHeaders = new ArrayList<>(request.getHeaders().keySet());
        Collections.sort(sortedHeaders, String.CASE_INSENSITIVE_ORDER);

        StringBuilder buffer = new StringBuilder();
        for (String header : sortedHeaders) {
            if (shouldExcludeHeaderFromSigning(header)) {
                continue;
            }
            if (buffer.length() > 0) {
                buffer.append(";");
            }
            buffer.append(lowerCase(header));
        }

        return buffer.toString();
    }

    /**
     * 创建待签名串
     * @param canonicalRequest
     * @param signerParams
     * @return
     */
    private String createStringToSign(String canonicalRequest,
                                      SignerRequestParams signerParams) {

        final String stringToSign = new StringBuilder(signerParams.getSigningAlgorithm())
                .append(ParameterConstant.LINE_SEPARATOR)
                .append(signerParams.getFormattedSigningDateTime())
                .append(ParameterConstant.LINE_SEPARATOR)
                .append(signerParams.getScope())
                .append(ParameterConstant.LINE_SEPARATOR)
                .append(BinaryUtils.toHex(hash(canonicalRequest)))
                .toString();
        return stringToSign;
    }

    /**
     * 计算参与签名的秘钥验证
     * @param credentials
     * @param signerRequestParams
     * @return
     */
    private byte[] deriveSigningKey(Credentials credentials,
                                    SignerRequestParams signerRequestParams) {
        byte[] signingKey = newSigningKey(credentials,
                signerRequestParams.getFormattedSigningDate(),
                signerRequestParams.getRegionName(),
                signerRequestParams.getServiceName());
        return signingKey;
    }

    /**
     * 方法描述：计算参与签名的秘钥验证
     * @param credentials
     * @param dateStamp
     * @param regionName
     * @param serviceName
     * @return 
     * @author lixuenan3
     * @date 2018年3月22日 下午5:57:52
     */
    private byte[] newSigningKey(Credentials credentials,
                                 String dateStamp, String regionName, String serviceName) {
        byte[] kSecret = ("JDCLOUD2" + credentials.secretAccessKey()).getBytes(Charset.forName("UTF-8"));
        byte[] kDate = sign(dateStamp, kSecret, SigningAlgorithm.HmacSHA256);
        byte[] kRegion = sign(regionName, kDate, SigningAlgorithm.HmacSHA256);
        byte[] kService = sign(serviceName, kRegion,
                SigningAlgorithm.HmacSHA256);
        return sign(ParameterConstant.JDCLOUD_TERMINATOR, kService, SigningAlgorithm.HmacSHA256);
    }

    /**
     * 方法描述：计算签名
     * @param stringToSign
     * @param signingKey
     * @return 
     * @author lixuenan3
     * @date 2018年3月22日 下午5:58:58
     */
    private byte[] computeSignature(String stringToSign, byte[] signingKey) {
        return sign(stringToSign.getBytes(Charset.forName("UTF-8")), signingKey,
                SigningAlgorithm.HmacSHA256);
    }

    /**
     * 方法描述：构建Authorization头信息
     * @param request
     * @param signature
     * @param credentials
     * @param signerParams
     * @return 
     * @author lixuenan3
     * @date 2018年3月22日 下午5:59:17
     */
    private String buildAuthorizationHeader(SdkHttpRequest request,
                                            byte[] signature, Credentials credentials,
                                            SignerRequestParams signerParams) {

        String signingCredentials = credentials.accessKeyId() + "/" + signerParams.getScope();
        String credential = "Credential=" + signingCredentials;
        String signerHeaders = "SignedHeaders=" + getSignedHeadersString(request);
        String signatureHeader = "Signature=" + BinaryUtils.toHex(signature);

        return new StringBuilder().append(ParameterConstant.JDCLOUD2_SIGNING_ALGORITHM)
                .append(" ")
                .append(credential)
                .append(", ")
                .append(signerHeaders)
                .append(", ")
                .append(signatureHeader)
                .toString();
    }

    /**
     * 处理请求负载
     * @param request
     * @param signature
     * @param signingKey
     * @param signerRequestParams
     */
    protected void processRequestPayload(SdkHttpFullRequest.Builder request, byte[] signature,
                                         byte[] signingKey, SignerRequestParams signerRequestParams) {
    }

    @Override
    protected void addSessionCredentials(SdkHttpFullRequest.Builder mutableRequest,
                                         SessionCredentials credentials) {
        mutableRequest.header(ParameterConstant.X_JDCLOUD_SECURITY_TOKEN, credentials.sessionToken());
    }
}
