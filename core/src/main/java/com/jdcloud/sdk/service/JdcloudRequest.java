package com.jdcloud.sdk.service;

/**
 * 抽象出来的Request
 */
public class JdcloudRequest {

    private transient String regionId;

    private transient String version;

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
