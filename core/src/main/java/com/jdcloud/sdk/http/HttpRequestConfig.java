package com.jdcloud.sdk.http;

public interface HttpRequestConfig {

    public int getConnectionTimeout();

    public int getSocketTimeout();

    public int getMaxTotal();

    public int getMaxConnPerRoute();

    public boolean getTcpNoDelay();

    /**
     * get read  timeout
     * @return
     */
    public int getReadTimeout();

    /**
     * get the ValidateAfterInactivity time span
     * @return
     */
    public int  getValidateAfterInactivity();


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

        public Builder readTimeout(int timeout){
            config.readTimeout = timeout;
            return this;
        }

        public Builder validateAfterInactivity(int validateAfterInactivity){
            if (validateAfterInactivity>0){
                config.validateAfterInactivity = validateAfterInactivity;
            }
            return this;
        }

        public Builder tcpNoDelay(boolean tcpNoDelay){
            config.tcpNoDelay = tcpNoDelay;
            return this;
        }

        public Builder maxConnPerRoute(int maxConnPerRoute){
            config.maxConnPerRoute  = maxConnPerRoute;
            return this;
        }

        public Builder maxTotal(int maxTotal){
            config.maxTotal = maxTotal;
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

            private int maxTotal;

            private int maxConnPerRoute;

            private boolean tcpNoDelay;


            private int readTimeout =-1;

            private int validateAfterInactivity=2000;

            @Override
            public int getReadTimeout(){
                return readTimeout;
            }

            @Override
            public int getMaxTotal(){
                return maxTotal;
            }

            @Override
            public int getMaxConnPerRoute(){
                return maxConnPerRoute;
            }

            @Override
            public boolean getTcpNoDelay(){
                return tcpNoDelay;
            }


            @Override
            public int getConnectionTimeout() {
                return connectionTimeout;
            }

            @Override
            public int  getValidateAfterInactivity(){
                return  validateAfterInactivity;
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
