package com.jdcloud.sdk.service;

import com.jdcloud.sdk.model.ServiceError;

public class JdcloudResponse<R extends JdcloudResult> {

    protected String requestId;

    protected ServiceError error;

    protected R result;

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public ServiceError getError() {
        return error;
    }

    public R getResult() {
        return result;
    }
}
