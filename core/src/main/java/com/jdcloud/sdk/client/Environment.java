package com.jdcloud.sdk.client;

import com.jdcloud.sdk.JdcloudSdkException;

/**
 * 端点服务
 * 
 * @author lixuenan3
 *
 */
public interface Environment {
    public String getEndpoint();

    public String getRealEndPoints();

    public static class Builder {
        DefaultEnv env;

        public Builder() {
            env = new DefaultEnv();
        }

        public Builder endpoint(String endpoint) {
            env.endpoint = endpoint;
            env.realEndPoints = null;
            return this;
        }

        /*
         * 用于内部通过配置路由或代理间接访问京东云的情况，京东云收到的host为京东云的域名 endpoint: 用哪个域名联网
         * realEndpoint：请求实际会被转发到哪个京东云的域名
         */
        public Builder endpoint(String endpoint, String realEndpoint) {
            env.endpoint = endpoint;
            env.realEndPoints = realEndpoint;
            return this;
        }

        public Environment build() {
            if (env.endpoint != null) {
                if (env.endpoint.length() != 0) {
                    return env;
                }
            }
            throw new JdcloudSdkException("environment's endpoint not set");
        }

        private static class DefaultEnv implements Environment {

            private String endpoint;
            private String realEndPoints;

            @Override
            public String getEndpoint() {
                return endpoint;
            }

            @Override
            public String getRealEndPoints() {
                return realEndPoints;
            }
        }
    }
}
