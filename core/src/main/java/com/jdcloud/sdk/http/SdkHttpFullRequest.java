package com.jdcloud.sdk.http;

import com.jdcloud.sdk.builder.SdkBuilder;
import com.jdcloud.sdk.http.handler.HandlerContextKey;

import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;

/**
 * Author xumanyi1
 * 2017/7/18
 * 11:43
 * function SDK请求封装
 */
public interface SdkHttpFullRequest extends SdkHttpRequest {
    InputStream getContent();

    interface Builder extends SdkHttpRequest, SdkBuilder<SdkHttpFullRequest> {
        Builder header(String key, String value);
        Builder header(String key, List<String> values);
        Builder headers(Map<String, List<String>> headers);
        Builder resourcePath(String resourcePath);
        Builder queryParameter(String paramName, String paramValue);
        Builder queryParameter(String paramName, List<String> paramValues);
        Builder queryParameters(Map<String, List<String>> queryParameters);

        Builder removeQueryParameter(String paramName);

        Builder clearQueryParameters();

        Builder endpoint(URI endpoint);

        Builder httpMethod(SdkHttpMethod httpMethod);

        Builder content(InputStream content);

        InputStream getContent();

        /**
         *  为builder 添加处理上下文
         * @param key
         * @param value
         * @param <T>
         * @return
         */
        <T> Builder handlerContext(HandlerContextKey<T> key, T value);
    }
}
