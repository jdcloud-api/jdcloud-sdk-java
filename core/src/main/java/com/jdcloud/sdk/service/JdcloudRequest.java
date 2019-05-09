package com.jdcloud.sdk.service;

/**
 * 抽象出来的Request
 */
public class JdcloudRequest {

    private transient String regionId;

    private transient String jdcloudVersion;

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getJdcloudVersion() {
        return jdcloudVersion;
    }

    public void setJdcloudVersion(String jdcloudVersion) {
        this.jdcloudVersion = jdcloudVersion;
    }
}
