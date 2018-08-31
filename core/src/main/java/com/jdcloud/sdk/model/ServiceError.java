package com.jdcloud.sdk.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class ServiceError {

    private int code;
    private String message;
    private String status;
    private LinkedHashMap<String, String>[] details;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, String>[] getDetails() {
        if(details != null) {
            return details.clone();
        }
        return null;
    }

    public void setDetails(LinkedHashMap<String, String>[] details) {
        if(details != null) {
            this.details = details.clone();
        }
    }
}
