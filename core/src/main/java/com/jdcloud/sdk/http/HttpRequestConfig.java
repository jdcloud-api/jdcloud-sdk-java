package com.jdcloud.sdk.http;

public interface HttpRequestConfig {

    public int getConnectionTimeout();

    public int getSocketTimeout();

    public Protocol getProtocol();

    public Protocol getProxyProtocol();

    public String getProxyHost();

    public int getProxyPort();

    public static class Builder {
        private DefaultHttpRequestConfig config;

        public Builder() {
            config = new DefaultHttpRequestConfig();
        }

        public Builder connectionTimeout(int timeout) {
            config.connectionTimeout = timeout;
            return this;
        }

        public Builder socketTimeout(int timeout) {
            config.socketTimeout = timeout;
            return this;
        }

        public Builder protocol(Protocol protocol) {
            config.protocol = protocol;
            return this;
        }

        public Builder proxyProtocol(Protocol proxyProtocol) {
            config.proxyProtocol = proxyProtocol;
            return this;
        }

        public Builder proxyHost(String proxyHost) {
            config.proxyHost = proxyHost;
            return this;
        }

        public Builder proxyPort(int proxyPort) {
            config.proxyPort = proxyPort;
            return this;
        }

        public HttpRequestConfig build() {
            return config;
        }

        private static class DefaultHttpRequestConfig implements HttpRequestConfig {
            private int connectionTimeout = -1;
            private int socketTimeout = -1;
            private Protocol protocol = Protocol.HTTPS;
            private Protocol proxyProtocol = Protocol.HTTP;
            private String proxyHost = null;
            private int proxyPort = -1;

            @Override
            public int getConnectionTimeout() {
                return connectionTimeout;
            }

            @Override
            public int getSocketTimeout() {
                return socketTimeout;
            }

            @Override
            public Protocol getProtocol() {
                return protocol;
            }

            @Override
            public Protocol getProxyProtocol() {
                return proxyProtocol;
            }

            @Override
            public String getProxyHost() {
                return proxyHost;
            }

            @Override
            public int getProxyPort() {
                return proxyPort;
            }
        }
    }
}
