package com.jdcloud.sdk.http;

public enum ContentType {
    APPLICATION_JSON {
        @Override
        public String toString() {
            return "application/json";
        }
    },
    APPLICATION_XML {
        @Override
        public String toString() {
            return "application/xml";
        }
    }
}
