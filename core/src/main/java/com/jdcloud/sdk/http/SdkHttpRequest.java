package com.jdcloud.sdk.http;

import com.jdcloud.sdk.http.handler.HandlerContextKey;

import java.net.URI;
import java.util.List;
import java.util.Map;

/**
 * Author xumanyi1
 * 2017/7/18
 * 12:30
 * function
 */
public interface SdkHttpRequest {

    Map<String, List<String>> getHeaders();
    /**
     * 请求资源路径
     * @return
     */
    String getResourcePath();

    /**
     * 返回请求的所有参数map
     * @return
     */
    Map<String, List<String>> getParameters();

    /**
     * 返回服务端点 请求发送的服务端点
     * @return
     */
    URI getEndpoint();

    /**
     * 返回 发送请求的方法
     * @return
     */
    SdkHttpMethod getHttpMethod();

    /**
     * 检索上下文的关键
     */
    <T> T handlerContext(HandlerContextKey<T> key);
}
