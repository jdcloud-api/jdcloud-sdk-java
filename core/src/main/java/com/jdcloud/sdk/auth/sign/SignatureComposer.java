package com.jdcloud.sdk.auth.sign;

import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.HttpRequest;
import com.jdcloud.sdk.auth.Credentials;
import com.jdcloud.sdk.constant.ParameterConstant;
import com.jdcloud.sdk.http.SdkHttpMethod;
import com.jdcloud.sdk.client.SdkClientException;
import com.jdcloud.sdk.http.DefaultSdkHttpFullRequest;
import com.jdcloud.sdk.http.SdkHttpFullRequest;
import com.jdcloud.sdk.model.SignRequest;
import com.jdcloud.sdk.utils.SdkHttpUtils;

import java.net.URI;
import java.util.*;

/**
 * Created by tancong on 2017/8/14.
 */
public class SignatureComposer implements ISignatureComposer {

    @SuppressWarnings("rawtypes")
    @Override
    public void sign(SignRequest signRequest) throws SdkClientException {

        HttpRequest request = signRequest.getRequest();

        // v4signer
        JdCloudSigner signer = new JdCloudSigner();
        signer.setRegionName(signRequest.getRegion());
        signer.setServiceName(signRequest.getServiceName());

        String nonceId = UUID.randomUUID().toString();

        // Builder
        SdkHttpFullRequest.Builder reqBuilder = DefaultSdkHttpFullRequest.builder()
                .httpMethod(SdkHttpMethod.fromValue(request.getRequestMethod()))
                .endpoint(URI.create(signRequest.getHost()))
                .resourcePath(SdkHttpUtils.urlEncode(signRequest.getPath(), true))
                .header(ParameterConstant.X_JDCLOUD_NONCE, nonceId)
                .header(ParameterConstant.CONTENT_TYPE, request.getHeaders().getContentType())
                .content(request.getContent() == null ? null : ((ByteArrayContent) request.getContent()).getInputStream());

        // Parameter
        if (request.getUrl() != null && request.getUrl().size() > 0) {
            for (Map.Entry<String, Object> entry : request.getUrl().entrySet()) {
                if (entry.getValue() instanceof List) {
                    for (Object o : (List) entry.getValue()) {
                        reqBuilder.queryParameter(entry.getKey(), (String) o);
                    }
                } else if (entry.getValue() instanceof String) {
                    reqBuilder.queryParameter(entry.getKey(), SdkHttpUtils.urlEncode((String) entry.getValue(), true));
                }
            }
        }

        // sign
        SdkHttpFullRequest signed = signer.sign(reqBuilder, new Credentials(signRequest.getCredentials().accessKeyId(), signRequest.getCredentials().secretAccessKey()));

        // set header
        request.getHeaders().put(ParameterConstant.X_JDCLOUD_NONCE, nonceId);
        request.getHeaders().put(ParameterConstant.X_JDCLOUD_DATE, signed.getHeaders().get(ParameterConstant.X_JDCLOUD_DATE).get(0));
        request.getHeaders().setAuthorization(signed.getHeaders().get(ParameterConstant.AUTHORIZATION).get(0));
    }

}
