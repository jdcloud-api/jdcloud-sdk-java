package com.jdcloud.sdk.auth.sign;

import com.jdcloud.sdk.auth.Credentials;
import com.jdcloud.sdk.auth.SessionCredentials;
import com.jdcloud.sdk.client.SdkClientException;
import com.jdcloud.sdk.http.SdkHttpFullRequest;
import com.jdcloud.sdk.utils.Base64Utils;
import com.jdcloud.sdk.utils.BinaryUtils;
import com.jdcloud.sdk.utils.SdkHttpUtils;
import com.jdcloud.sdk.utils.StringUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * 提供加密算法及格式化加密内容
 * Author xumanyi1
 * 2017/7/18
 * 12:41
 * function
 */
public abstract class AbstractSigner implements Signer {
    /**
     * 空字符串的16进制消息摘要
     */
    public static final String EMPTY_STRING_SHA256_HEX;

    /**
     * 实现SHA-256算法的 MessageDigest对象
     */
    private static final ThreadLocal<MessageDigest> SHA256_MESSAGE_DIGEST;

    static {
        SHA256_MESSAGE_DIGEST = new ThreadLocal<MessageDigest>() {
            @Override
            protected MessageDigest initialValue() {
                try {
                    return MessageDigest.getInstance("SHA-256");
                } catch (NoSuchAlgorithmException e) {
                    throw new SdkClientException(
                            "Unable to get SHA256 Function"
                                    + e.getMessage(), e);
                }
            }
        };
        EMPTY_STRING_SHA256_HEX = BinaryUtils.toHex(doHash(""));
    }

    /**
     * 方法描述：计算hash值
     * @param text
     * @return
     * @throws SdkClientException 
     * @author lixuenan3
     * @date 2018年3月22日 下午2:18:59
     */
    private static byte[] doHash(String text) throws SdkClientException {
        try {
            MessageDigest md = getMessageDigestInstance();
            md.update(text.getBytes(StandardCharsets.UTF_8));
            return md.digest();
        } catch (Exception e) {
            throw new SdkClientException(
                    "Unable to compute hash while signing request: "
                            + e.getMessage(), e);
        }
    }

    /**
     * Returns the re-usable thread local version of MessageDigest.
     */
    private static MessageDigest getMessageDigestInstance() {
        MessageDigest messageDigest = SHA256_MESSAGE_DIGEST.get();
        messageDigest.reset();
        return messageDigest;
    }

    /**
     * Computes an RFC 2104-compliant HMAC signature and returns the result as a
     * Base64 encoded string.
     */
    protected String signAndBase64Encode(String data, String key,
                                         SigningAlgorithm algorithm) throws SdkClientException {
        return signAndBase64Encode(data.getBytes(StandardCharsets.UTF_8), key, algorithm);
    }

    /**
     * Computes an RFC 2104-compliant HMAC signature for an array of bytes and
     * returns the result as a Base64 encoded string.
     */
    private String signAndBase64Encode(byte[] data, String key,
                                       SigningAlgorithm algorithm) throws SdkClientException {
        try {
            byte[] signature = sign(data, key.getBytes(StandardCharsets.UTF_8), algorithm);
            return Base64Utils.encodeAsString(signature);
        } catch (Exception e) {
            throw new SdkClientException(
                    "Unable to calculate a request signature: "
                            + e.getMessage(), e);
        }
    }

    /**
     * 方法描述：使用Mac算法进行签名
     * @param stringData
     * @param mac
     * @return 
     * @author lixuenan3
     * @date 2018年3月22日 下午2:36:15
     */
    public byte[] signWithMac(String stringData, Mac mac) {
        try {
            return mac.doFinal(stringData.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            throw new SdkClientException(
                    "Unable to calculate a request signature: "
                            + e.getMessage(), e);
        }
    }

    /**
     * 方法描述：签名
     * @param stringData
     * @param key 密钥
     * @param algorithm 算法
     * @return
     * @throws SdkClientException 
     * @author lixuenan3
     * @date 2018年3月22日 下午3:10:46
     */
    public byte[] sign(String stringData, byte[] key,
                       SigningAlgorithm algorithm) throws SdkClientException {
        try {
            byte[] data = stringData.getBytes(StandardCharsets.UTF_8);
            return sign(data, key, algorithm);
        } catch (Exception e) {
            throw new SdkClientException(
                    "Unable to calculate a request signature: "
                            + e.getMessage(), e);
        }
    }

    /**
     * 方法描述：签名
     * @param data 二进制数据
     * @param key 密钥
     * @param algorithm 算法
     * @return
     * @throws SdkClientException 
     * @author lixuenan3
     * @date 2018年3月22日 下午3:18:46
     */
    protected byte[] sign(byte[] data, byte[] key, SigningAlgorithm algorithm) throws SdkClientException {
        try {
            Mac mac = algorithm.getMac();
            mac.init(new SecretKeySpec(key, algorithm.toString()));
            return mac.doFinal(data);
        } catch (Exception e) {
            throw new SdkClientException(
                    "Unable to calculate a request signature: "
                            + e.getMessage(), e);
        }
    }

    /**
     * Hashes the string contents (assumed to be UTF-8) using the SHA-256
     * algorithm.
     *
     * @param text The string to hash.
     * @return The hashed bytes from the specified string.
     * @throws SdkClientException If the hash cannot be computed.
     */
    public byte[] hash(String text) throws SdkClientException {
        return AbstractSigner.doHash(text);
    }

    /**
     * 方法描述：计算hash值
     * @param input
     * @return
     * @throws SdkClientException 
     * @author lixuenan3
     * @date 2018年3月22日 下午3:26:35
     */
    protected byte[] hash(InputStream input) throws SdkClientException {
        try {
            MessageDigest md = getMessageDigestInstance();
            @SuppressWarnings("resource")
            DigestInputStream digestInputStream = new SdkDigestInputStream(
                    input, md);
            byte[] buffer = new byte[1024];
            while (digestInputStream.read(buffer) > -1) {
                ;
            }
            return digestInputStream.getMessageDigest().digest();
        } catch (Exception e) {
            throw new SdkClientException(
                    "Unable to compute hash while signing request: "
                            + e.getMessage(), e);
        }
    }

    /**
     * 用SHA256 对 字节数组进行摘要
     *
     * @param data 待摘要的字节数组.
     * @return 摘要的结果字节数组
     * @throws SdkClientException 无法计算返回异常.
     */
    public byte[] hash(byte[] data) throws SdkClientException {
        try {
            MessageDigest md = getMessageDigestInstance();
            md.update(data);
            return md.digest();
        } catch (Exception e) {
            throw new SdkClientException(
                    "Unable to compute hash while signing request: "
                            + e.getMessage(), e);
        }
    }


    /**
     * 方法描述：格式化后返回
     * @param parameters
     * @return  key1=value1&key2=value2
     * @author lixuenan3
     * @date 2018年3月22日 下午3:31:48
     */
    protected String getCanonicalizedQueryString(Map<String, List<String>> parameters) {

        final SortedMap<String, List<String>> sorted = new TreeMap<String, List<String>>();

        /**
         * Signing protocol expects the param values also to be sorted after url
         * encoding in addition to sorted parameter names.
         */
        for (Map.Entry<String, List<String>> entry : parameters.entrySet()) {
            final String encodedParamName = SdkHttpUtils.urlEncode(
                    entry.getKey(), false);
            final List<String> paramValues = entry.getValue();
            final List<String> encodedValues = new ArrayList<String>(
                    paramValues.size());
            for (String value : paramValues) {
                encodedValues.add(SdkHttpUtils.urlEncode(value, false));
            }
            Collections.sort(encodedValues);
            sorted.put(encodedParamName, encodedValues);

        }

        final StringBuilder result = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : sorted.entrySet()) {
            for (String value : entry.getValue()) {
                if (result.length() > 0) {
                    result.append("&");
                }
                result.append(entry.getKey())
                        .append("=")
                        .append(value);
            }
        }

        return result.toString();
    }


    /**
     * 方法描述：获取二进制流
     * @param wrapped
     * @return ByteArrayInputStream
     * @author lixuenan3
     * @date 2018年3月22日 下午3:42:10
     */
    protected InputStream getBinaryRequestPayloadStream(InputStream wrapped) {
        try {
            InputStream unwrapped = getContentUnwrapped(wrapped);
            if (unwrapped == null) {
                return new ByteArrayInputStream(new byte[0]);
            }
            if (!unwrapped.markSupported()) {
                throw new SdkClientException("Unable to read request payload to sign request.");
            }
            return unwrapped;
        } catch (SdkClientException e) {
            throw e;
        } catch (Exception e) {
            throw new SdkClientException("Unable to read request payload to sign request: " + e.getMessage(), e);
        }
    }

    /**
     * 方法描述：获取未被包装的内容
     * @param is
     * @return 
     * @author lixuenan3
     * @date 2018年3月22日 下午3:42:47
     */
    private InputStream getContentUnwrapped(InputStream is) {
        if (is == null) {
            return null;
        }
        // We want to disable the progress reporting when the stream is
        // consumed for signing purpose.
        while (is instanceof ProgressInputStream) {
            ProgressInputStream pris = (ProgressInputStream) is;
            is = pris.getWrappedInputStream();
        }
        return is;
    }

    /**
     * 方法描述：获取规范的路径
     * @param resourcePath
     * @param urlEncode
     * @return 
     * @author lixuenan3
     * @date 2018年3月22日 下午3:43:00
     */
    protected String getCanonicalizedResourcePath(String resourcePath, boolean urlEncode) {
        if (resourcePath == null || resourcePath.isEmpty()) {
            return "/";
        } else {
            String value = urlEncode ? SdkHttpUtils.urlEncode(resourcePath, true) : resourcePath;
            if (value.startsWith("/")) {
                return value;
            } else {
                return "/".concat(value);
            }
        }
    }

    /**
     * 方法描述：获取规范的端点服务
     * @param endpoint
     * @return 
     * @author lixuenan3
     * @date 2018年3月22日 下午3:56:02
     */
    protected String getCanonicalizedEndpoint(URI endpoint) {
        String endpointForStringToSign = StringUtils.lowerCase(endpoint.getHost());
        /*
         * Apache HttpClient will omit the port in the Host header for default
         * port values (i.e. 80 for HTTP and 443 for HTTPS) even if we
         * explicitly specify it, so we need to be careful that we use the same
         * value here when we calculate the string to sign and in the Host
         * header we send in the HTTP request.
         */
        if (SdkHttpUtils.isUsingNonDefaultPort(endpoint)) {
            endpointForStringToSign += ":" + endpoint.getPort();
        }

        return endpointForStringToSign;
    }


    /**
     * 方法描述：证书类转换
     * @param credentials
     * @return 
     * @author lixuenan3
     * @date 2018年3月22日 下午3:58:16
     */
    protected Credentials sanitizeCredentials(Credentials credentials) {
        String accessKeyId = StringUtils.trim(credentials.accessKeyId());
        String secretKey = StringUtils.trim(credentials.secretAccessKey());

        if (credentials instanceof SessionCredentials) {
            SessionCredentials sessionCredentials = (SessionCredentials) credentials;
            return new SessionCredentials(accessKeyId,
                    secretKey,
                    StringUtils.trim(sessionCredentials.sessionToken()));
        }

        return credentials;
    }

    /**
     * Returns the current time minus the given offset in seconds.
     * The intent is to adjust the current time in the running JVM to the
     * corresponding wall clock time at AWS for request signing purposes.
     *
     * @param offsetInSeconds offset in seconds
     */
    protected Date getSignatureDate(int offsetInSeconds) {
        return new Date(System.currentTimeMillis() - (1000L * offsetInSeconds));
    }

    /**
     * Adds session credentials to the request given.
     *
     * @param mutableRequest The request to add session credentials information to
     * @param credentials    The session credentials to add to the request
     */
    protected abstract void addSessionCredentials(SdkHttpFullRequest.Builder mutableRequest,
                                                  SessionCredentials credentials);

}
