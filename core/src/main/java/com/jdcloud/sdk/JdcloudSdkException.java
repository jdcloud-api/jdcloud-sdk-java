package com.jdcloud.sdk;

public class JdcloudSdkException extends RuntimeException {

	private static final long serialVersionUID = -5588331995952289904L;

	public JdcloudSdkException(String message) {
		super(message);
	}

	public JdcloudSdkException(Throwable cause) {
		super(cause);
	}

	public JdcloudSdkException(String message, Throwable cause) {
		super(message, cause);
	}
	

}
