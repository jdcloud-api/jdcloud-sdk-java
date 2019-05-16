package com.jdcloud.sdk.service;

import java.nio.charset.Charset;

import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpMediaType;
import com.google.api.client.http.HttpTransport;

public class JdcloudHttpResponse {

    private byte[] content;

    private Charset contentCharset;

    private String contentEncoding;

    private String contentType;

    private HttpHeaders headers;

    private HttpMediaType MediaType;

    private int contentLoggingLimit;

    private int statusCode;

    private String statusMessage;

    public byte[] getContent() {
        if(content != null) {
            return content.clone();
        } else {
            return null;
        }
    }

    public void setContent(byte[] content) {
        if(content != null) {
            this.content = content.clone();
        } else {
            this.content = null;
        }
        
    }

    public Charset getContentCharset() {
        return contentCharset;
    }

    public void setContentCharset(Charset contentCharset) {
        this.contentCharset = contentCharset;
    }

    public String getContentEncoding() {
        return contentEncoding;
    }

    public void setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public HttpHeaders getHeaders() {
        return headers;
    }

    public void setHeaders(HttpHeaders headers) {
        this.headers = headers;
    }

    public HttpMediaType getMediaType() {
        return MediaType;
    }

    public void setMediaType(HttpMediaType mediaType) {
        MediaType = mediaType;
    }

    public int getContentLoggingLimit() {
        return contentLoggingLimit;
    }

    public void setContentLoggingLimit(int contentLoggingLimit) {
        this.contentLoggingLimit = contentLoggingLimit;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

}
