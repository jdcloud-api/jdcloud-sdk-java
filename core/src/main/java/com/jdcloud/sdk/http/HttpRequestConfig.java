package com.jdcloud.sdk.http;

public interface HttpRequestConfig {
	
	public int getConnectionTimeout();
	public int getSocketTimeout();
	public Protocol getProtocol();
	
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
		public HttpRequestConfig build() {
			return config;
		}
		
		private static class DefaultHttpRequestConfig implements HttpRequestConfig {
			private int connectionTimeout = -1;
			private int socketTimeout = -1;
			private Protocol protocol = Protocol.HTTPS;
			
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
		}
	}
}
