package com.jdcloud.sdk.service;

import com.jdcloud.sdk.model.ServiceError;

public class JdcloudResponse<R extends JdcloudResult> {

    private String requestId;

    private ServiceError error;

    private R result;
    
    private JdcloudHttpResponse jdcloudHttpResponse;

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }
    
    public void setError(ServiceError error) {
        this.error = error;
    }

    public ServiceError getError() {
        return error;
    }

    public void setResult(R result) {
        this.result = result;
    }

    public R getResult() {
        return result;
    }

    public JdcloudHttpResponse getJdcloudHttpResponse() {
        return jdcloudHttpResponse;
    }

    public void setJdcloudHttpResponse(JdcloudHttpResponse jdcloudHttpResponse) {
        this.jdcloudHttpResponse = jdcloudHttpResponse;
    }

}
