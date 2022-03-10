package com.jdcloud.sdk.service;

import org.apache.http.cookie.Cookie;

import java.util.HashSet;
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
    private Set<Cookie> cookies = new HashSet<Cookie>();;

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
}
