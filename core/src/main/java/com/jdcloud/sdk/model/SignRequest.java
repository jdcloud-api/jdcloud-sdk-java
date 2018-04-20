package com.jdcloud.sdk.model;

import com.google.api.client.http.HttpRequest;
import com.jdcloud.sdk.auth.ICredentials;

/**
 * Created by guofangyu on 2017/10/18.
 */
public class SignRequest {

    private String host;
    private String path;
    private String region;
    private String serviceName;
    private HttpRequest request;
    private ICredentials credentials;

    public SignRequest(String host, String path, String region, String serviceName, HttpRequest httpRequest, ICredentials credentials) {
        this.host = host;
        this.path = path;
        this.region = region;
        this.serviceName = serviceName;
        this.request = httpRequest;
        this.credentials = credentials;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ICredentials getCredentials() {
        return credentials;
    }

    public void setCredentials(ICredentials credentials) {
        this.credentials = credentials;
    }

    public HttpRequest getRequest() {
        return request;
    }

    public void setRequest(HttpRequest request) {
        this.request = request;
    }
}
