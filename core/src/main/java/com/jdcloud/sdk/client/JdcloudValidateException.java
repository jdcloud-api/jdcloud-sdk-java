package com.jdcloud.sdk.client;

import com.jdcloud.sdk.JdcloudSdkException;

public class JdcloudValidateException extends JdcloudSdkException {

	private static final long serialVersionUID = 7879571283944582831L;

	public JdcloudValidateException(String message, Throwable cause) {
		super(message, cause);
	}

	public JdcloudValidateException(String message) {
		super(message);
	}

	public JdcloudValidateException(Throwable cause) {
		super(cause);
	}

	public static void checkNotNull(Object o, String field) throws JdcloudValidateException {
		if (o == null) {
			throw new JdcloudValidateException(new StringBuilder("property ").append(field).append("is null").toString());
		}
	}


}
