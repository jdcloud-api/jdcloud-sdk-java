package com.jdcloud.sdk.client;

import com.google.api.client.http.*;
import com.google.api.client.http.apache.ApacheHttpTransport;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.http.HttpRequestConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Openapi的客户端封装
 */
public abstract class JdcloudClient {

    public static final String JSON = "application/json";

    // http请求相关配置
    HttpTransport httpTransport = new ApacheHttpTransport();
    HttpRequestFactory httpRequestFactory;
    Gson gson = new Gson();
    private Map<String, String> customHeader = new HashMap<>();

    /**
     * 构造
     */
    void init() {
        this.httpRequestFactory = this.httpTransport.createRequestFactory(
                new HttpRequestInitializer() {
                    @Override
                    public void initialize(HttpRequest request) throws IOException {
                        HttpRequestConfig httpRequestConfig = getHttpRequestConfig();
                        if (httpRequestConfig != null) {
                            if (httpRequestConfig.getConnectionTimeout() != -1) {
                                request.setConnectTimeout(httpRequestConfig.getConnectionTimeout());
                            }
                            if (httpRequestConfig.getSocketTimeout() != -1) {
                                request.setReadTimeout(httpRequestConfig.getSocketTimeout());
                            }
                        }
                    }
                });
    }

    /**
     * 构建HttpRequest
     *
     * @param requestMethod
     * @param url
     * @param content
     * @return
     * @throws IOException
     */
    HttpRequest buildRequest(String requestMethod, GenericUrl url, HttpContent content) throws IOException {
        return this.httpRequestFactory.buildRequest(requestMethod, url, content);
    }

    /**
     * HttpResponse结果读取
     *
     * @param src
     * @param valueType
     * @param <T>
     * @return
     * @throws IOException
     * @throws JsonParseException
     * @throws JsonMappingException
     */
    <T> T readValue(InputStream src, Class<T> valueType) throws IOException {
        if(src == null)
            return null;
        JsonReader reader = new JsonReader(new InputStreamReader(src, "UTF-8"));
        return this.gson.fromJson(reader, valueType);
    }

    /**
     * 字符串读取
     *
     * @param text
     * @param valueType
     * @param <T>
     * @return
     * @throws IOException
     * @throws JsonParseException
     * @throws JsonMappingException
     */
    <T> T readValue(String text, Class<T> valueType) {
        return this.gson.fromJson(text, valueType);
    }

    String getEndpoint() {
        Environment environment = getEnvironment();
        if (environment != null) {
            return environment.getEndpoint();
        }
        return null;
    }

    String getRealEndPoints() {
        Environment environment = getEnvironment();
        if (environment != null) {
            return environment.getRealEndPoints();
        }
        return null;
    }

    public abstract CredentialsProvider getCredentialsProvider();

    public abstract HttpRequestConfig getHttpRequestConfig();

    public abstract Environment getEnvironment();

    public abstract String getUserAgent();

    public abstract String getServiceName();

    public abstract String getVersion();

    public void setCustomHeader(String key, String value) {
        this.customHeader.put(key, value);
    }

    public Map<String, String> getCustomHeader() {
        return this.customHeader;
    }
}
