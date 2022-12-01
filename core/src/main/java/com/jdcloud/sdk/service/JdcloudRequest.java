package com.jdcloud.sdk.service;

import org.apache.http.cookie.Cookie;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 抽象出来的Request
 */
public class JdcloudRequest {

    private transient String regionId;

    private transient String jdcloudVersion;

    public String getRegionId() {
        return regionId;
    }

    @Exclude
    private Set<Cookie> cookies = new HashSet<Cookie>();

    @Exclude
    private Map<String, String> customHeader = new HashMap<>();

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getJdcloudVersion() {
        return jdcloudVersion;
    }

    public void setJdcloudVersion(String jdcloudVersion) {
        this.jdcloudVersion = jdcloudVersion;
    }

    public Set<Cookie> getCookies() {
        return cookies;
    }

    public void setCookies(Set<Cookie> cookies) {
        this.cookies = cookies;
    }

    public void addCookie(Cookie cookie){
        if (cookie!=null){
            this.cookies.add(cookie);
        }
    }

    public Map<String, String> getCustomHeader() {
        return customHeader;
    }

    public void setCustomHeader(Map<String, String> customHeader) {
        this.customHeader = customHeader;
    }

    public void setCustomHeader(String key, String value) {
        this.customHeader.put(key, value);
    }
}
