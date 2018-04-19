package com.jdcloud.sdk.auth.sign;

import com.jdcloud.sdk.auth.Credentials;
import com.jdcloud.sdk.http.SdkHttpFullRequest;

/**
 * Author xumanyi1
 * 2017/7/18
 * 11:39
 * function 签名根接口
 */
public interface Signer {
    /**
     * 使用凭据签名请求
     * @param builder
     * @param credentials
     * @return
     */
    SdkHttpFullRequest sign(SdkHttpFullRequest.Builder builder, Credentials credentials);
}
