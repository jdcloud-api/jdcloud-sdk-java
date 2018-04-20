package com.jdcloud.sdk.http;

import com.jdcloud.sdk.http.handler.HandlerContextKey;
import com.jdcloud.sdk.utils.AttributeMap;

import java.io.InputStream;
import java.net.URI;
import java.util.*;

import static java.util.Collections.singletonList;

/**
 * Internal implementation of {@link SdkHttpFullRequest}. Provided to HTTP implement to execute a request.
 */
public class DefaultSdkHttpFullRequest implements SdkHttpFullRequest {

    private final Map<String, List<String>> headers = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    private final String resourcePath;
    private final Map<String, List<String>> queryParameters = new LinkedHashMap<>();
    private final URI endpoint;
    private final SdkHttpMethod httpMethod;
    private final InputStream content;
    private final AttributeMap handlerContextKeys;

    private DefaultSdkHttpFullRequest(Builder builder) {
        this.headers.putAll(builder.headers);
        this.queryParameters.putAll(builder.queryParameters);
        this.resourcePath = builder.resourcePath;
        this.endpoint = builder.endpoint;
        this.httpMethod = builder.httpMethod;
        this.content = builder.content;
        this.handlerContextKeys = builder.handlerContextKeys.build();
    }

    @Override
    public Map<String, List<String>> getHeaders() {
        return headers;
    }

    @Override
    public String getResourcePath() {
        return resourcePath;
    }

    @Override
    public Map<String, List<String>> getParameters() {
        return queryParameters;
    }

    @Override
    public URI getEndpoint() {
        return endpoint;
    }

    @Override
    public SdkHttpMethod getHttpMethod() {
        return httpMethod;
    }

    @Override
    public InputStream getContent() {
        return content;
    }

    @Override
    public <T> T handlerContext(HandlerContextKey<T> key) {
        return handlerContextKeys.get(key);
    }

    /**
     * @return Builder instance to construct a {@link DefaultSdkHttpFullRequest}.
     */
    public static Builder builder() {
        return new Builder(AttributeMap.builder());
    }

    /**
     * Builder for a {@link DefaultSdkHttpFullRequest}.
     */
    public static final class Builder implements SdkHttpFullRequest.Builder {

        private final Map<String, List<String>> headers = new HashMap<>();
        private String resourcePath;
        private Map<String, List<String>> queryParameters = new LinkedHashMap<>();
        private URI endpoint;
        private SdkHttpMethod httpMethod;
        private InputStream content;
        private final AttributeMap.Builder handlerContextKeys;

        private Builder(AttributeMap.Builder handlerContextKeys) {
            this.handlerContextKeys = handlerContextKeys;
        }

        @Override
        public Builder header(String key, String value) {
            return header(key, singletonList(value));
        }

        @Override
        public Builder header(String key, List<String> values) {
            this.headers.put(key, new ArrayList<>(values));
            return this;
        }

        @Override
        public Builder headers(Map<String, List<String>> headers) {
            for (Map.Entry<String,List<String>> entry: headers.entrySet()) {
                this.headers.put(entry.getKey(), new ArrayList<>(entry.getValue()));
            }
            return this;
        }

        @Override
        public Map<String, List<String>> getHeaders() {
            return headers;
        }

        @Override
        public Builder resourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        @Override
        public String getResourcePath() {
            return resourcePath;
        }

        @Override
        public Builder queryParameter(String paramName, String paramValue) {
            return queryParameter(paramName, singletonList(paramValue));
        }

        @Override
        public Builder queryParameter(String paramName, List<String> paramValues) {
            this.queryParameters.put(paramName, new ArrayList<>(paramValues));
            return this;
        }

        @Override
        public Builder queryParameters(Map<String, List<String>> queryParameters) {
            for (Map.Entry<String,List<String>> entry : queryParameters.entrySet()) {
                this.queryParameters.put(entry.getKey(), new ArrayList<>(entry.getValue()));
            }
            return this;
        }

        @Override
        public Builder removeQueryParameter(String paramName) {
            this.queryParameters.remove(paramName);
            return this;
        }

        @Override
        public Builder clearQueryParameters() {
            this.queryParameters.clear();
            return this;
        }

        @Override
        public Map<String, List<String>> getParameters() {
            return queryParameters;
        }

        @Override
        public Builder endpoint(URI endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        @Override
        public URI getEndpoint() {
            return endpoint;
        }

        @Override
        public Builder httpMethod(SdkHttpMethod httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        @Override
        public SdkHttpMethod getHttpMethod() {
            return httpMethod;
        }

        @Override
        public Builder content(InputStream content) {
            this.content = content;
            return this;
        }

        @Override
        public InputStream getContent() {
            return content;
        }

        @Override
        public <T> Builder handlerContext(HandlerContextKey<T> key, T value) {
            handlerContextKeys.put(key, value);
            return this;
        }

        @Override
        public <T> T handlerContext(HandlerContextKey<T> key) {
            return handlerContextKeys.get(key);
        }

        @Override
        public DefaultSdkHttpFullRequest build() {
            return new DefaultSdkHttpFullRequest(this);
        }
    }

}
