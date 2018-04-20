package com.jdcloud.sdk.client;

import com.jdcloud.sdk.JdcloudSdkException;

/**
 * Author xumanyi1
 * 2017/7/18
 * 12:55
 * function
 */
public class SdkClientException extends JdcloudSdkException {

    private static final long serialVersionUID = -6398626221187261227L;

    public SdkClientException(String message, Throwable t) {
        super(message, t);
    }

    public SdkClientException(String message){
        super(message);
    }

    public SdkClientException(Throwable t){
        super(t);
    }
}
