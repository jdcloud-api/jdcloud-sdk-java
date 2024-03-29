package com.jdcloud.sdk.client;

import com.alibaba.fastjson.parser.Feature;
import com.google.api.client.http.*;
import com.google.api.client.http.apache.ApacheHttpTransport;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.http.HttpRequestConfig;
import org.apache.http.HttpHost;
import org.apache.http.conn.params.ConnManagerPNames;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

import java.io.IOException;
import java.io.InputStream;
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

    private Map<String, String> customHeader = new HashMap<>();

    private boolean retryQuest = true;

    private final static Feature[] FEATURES = {Feature.AutoCloseSource, Feature.UseBigDecimal,
            Feature.AllowUnQuotedFieldNames, Feature.AllowSingleQuotes, Feature.AllowArbitraryCommas,
            Feature.AllowArbitraryCommas, Feature.SortFeidFastMatch, Feature.IgnoreNotMatch, Feature.DisableSpecialKeyDetect};

    /**
     * 构造
     */
    void init() {
        final HttpRequestConfig httpRequestConfig = getHttpRequestConfig();
        ApacheHttpTransport.Builder transportBuilder = new ApacheHttpTransport.Builder();
        HttpParams basicHttpParams = transportBuilder.getHttpParams();
        if (httpRequestConfig.getMaxTotal()>20){
            basicHttpParams.setIntParameter(ConnManagerPNames.MAX_TOTAL_CONNECTIONS,httpRequestConfig.getMaxTotal());
        }
        if ( httpRequestConfig.getMaxConnPerRoute()>0 ) {
            ConnPerRouteBean connPerRoute = new ConnPerRouteBean();
            connPerRoute.setDefaultMaxPerRoute( httpRequestConfig.getMaxConnPerRoute());
            basicHttpParams.setParameter(ConnManagerPNames.MAX_CONNECTIONS_PER_ROUTE,connPerRoute);
        }
        if (httpRequestConfig.getProxyHost() != null) {
            HttpHost proxy = new HttpHost(httpRequestConfig.getProxyHost(), httpRequestConfig.getProxyPort(), httpRequestConfig.getProxyProtocol().toString());
            ConnRouteParams.setDefaultProxy(basicHttpParams, proxy);
        }
        if (httpRequestConfig.getSocketTimeout()>0){
            basicHttpParams.setParameter(HttpConnectionParams.SO_TIMEOUT, httpRequestConfig.getSocketTimeout());
        }

        if (httpRequestConfig.getValidateAfterInactivity() > 0) {
            basicHttpParams.setParameter(HttpConnectionParams.STALE_CONNECTION_CHECK, true);
        }
        if (httpRequestConfig.getConnectionTimeout() > 0) {
            basicHttpParams.setParameter(HttpConnectionParams.CONNECTION_TIMEOUT, httpRequestConfig.getConnectionTimeout());
        }
        if (httpRequestConfig.getTcpNoDelay()){
            basicHttpParams.setParameter(HttpConnectionParams.TCP_NODELAY,httpRequestConfig.getTcpNoDelay());
        }
        if( httpRequestConfig.getProxyHost() != null) {
            HttpHost proxy = new HttpHost(httpRequestConfig.getProxyHost(), httpRequestConfig.getProxyPort(), httpRequestConfig.getProxyProtocol().toString());
            transportBuilder.setProxy(proxy);
        }
        this.httpTransport = transportBuilder.build();
        this.httpRequestFactory = this.httpTransport.createRequestFactory(
                new HttpRequestInitializer() {
                    @Override
                    public void initialize(HttpRequest request) throws IOException {
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


    public HttpParams getHttpConnectionParams() {
        return ((ApacheHttpTransport)this.httpTransport).getHttpClient().getParams();
    }

    public void setStaleCheckingEnabled(boolean enabled){
        ((ApacheHttpTransport)this.httpTransport).getHttpClient().getParams().setBooleanParameter(HttpConnectionParams.STALE_CONNECTION_CHECK, enabled);
    }

    public void setTcpNoDelay(boolean enabled) {
        ((ApacheHttpTransport)this.httpTransport).getHttpClient().getParams().setBooleanParameter(HttpConnectionParams.TCP_NODELAY, enabled);
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
        return this.httpRequestFactory.buildRequest(requestMethod, url, content).setResponseInterceptor(new JdcloudHttpResponseInterceptor());
    }

    <T> T readValue(InputStream src, Class<T> valueType) throws IOException {
        if (src == null) {
            return null;
        }
        return com.alibaba.fastjson.JSON.parseObject(src, valueType, FEATURES);
    }

    <T> T readValue(byte[] src, Class<T> valueType) throws IOException {
        if (src == null) {
            return null;
        }
        return com.alibaba.fastjson.JSON.parseObject(src, valueType, FEATURES);
    }

    <T> T readValue(String text, Class<T> valueType) {
        return com.alibaba.fastjson.JSON.parseObject(text, valueType, FEATURES);
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

    public boolean isRetryQuest() {
        return retryQuest;
    }

    public void setRetryQuest(boolean retryQuest) {
        this.retryQuest = retryQuest;
    }
}
