package com.jdcloud.sdk.auth;


import com.jdcloud.sdk.utils.Validate;

import java.util.Objects;

/**
 * Author xumanyi1
 * 2017/7/18
 * 13:18
 * function  带session 的凭据
 */
public class SessionCredentials extends Credentials{
    /**
     *  会话token
     */
    private final String sessionToken;


    public SessionCredentials(String accessKey, String secretKey, String sessionToken) {
        super(accessKey, secretKey);
        this.sessionToken = Validate.notNull(sessionToken, "Session token cannot be null.");
    }

    public final String sessionToken() {
        return sessionToken;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + accessKeyId() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final SessionCredentials that = (SessionCredentials) o;
        return Objects.equals(sessionToken, that.sessionToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sessionToken);
    }
}
