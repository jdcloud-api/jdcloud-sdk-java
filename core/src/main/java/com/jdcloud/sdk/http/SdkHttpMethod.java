package com.jdcloud.sdk.http;

import java.util.Locale;

/**
 * Author xumanyi1
 * 2017/7/18
 * 12:38
 * function
 */
public enum SdkHttpMethod {

    GET,
    POST,
    PUT,
    DELETE,
    HEAD,
    PATCH,
    OPTIONS;

    public static SdkHttpMethod fromValue(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        for (SdkHttpMethod method : values()) {
            final String upperCaseValue = value.toUpperCase(Locale.ENGLISH);
            if (method.name().equals(upperCaseValue)) {
                return method;
            }
        }

        throw new IllegalArgumentException("Unsupported HTTP method name " + value);
    }

}
