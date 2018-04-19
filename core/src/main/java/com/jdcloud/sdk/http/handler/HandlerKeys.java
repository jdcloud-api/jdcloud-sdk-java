package com.jdcloud.sdk.http.handler;


import com.jdcloud.sdk.auth.Credentials;

public class HandlerKeys {

    /**
     * The key under which the request credentials are set.
     */
    public static final HandlerContextKey<Credentials> JDCLOUD_CREDENTIALS =
            new HandlerContextKey<>(Credentials.class, "JDCLOUDCredentials");

    /**
     * The key under which the request config is stored.
     */
//    public static final HandlerContextKey<RequestConfig> REQUEST_CONFIG =
//            new HandlerContextKey<>(RequestConfig.class, "RequestConfig");

    /**
     * The key under which the service name is stored.
     */
    public static final HandlerContextKey<String> SERVICE_NAME =
            new HandlerContextKey<>(String.class, "ServiceName");

    /**
     * The key under which the time offset (for clock skew correction) is stored.
     */
    public static final HandlerContextKey<Integer> TIME_OFFSET =
            new HandlerContextKey<>(Integer.class, "TimeOffset");

    /**
     * Handler context key for advanced configuration.
     */
//    public static final HandlerContextKey<ServiceAdvancedConfiguration> SERVICE_ADVANCED_CONFIG =
//            new HandlerContextKey<>(ServiceAdvancedConfiguration.class, "ServiceConfig");
}
