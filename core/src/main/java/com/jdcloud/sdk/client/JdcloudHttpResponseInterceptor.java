package com.jdcloud.sdk.client;

import java.io.IOException;
import java.nio.charset.Charset;

import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseInterceptor;
import com.jdcloud.sdk.utils.StringUtils;

public class JdcloudHttpResponseInterceptor implements HttpResponseInterceptor {

    @Override
    public void interceptResponse(HttpResponse response) throws IOException {
        if(StringUtils.isBlank(response.getMediaType().getParameter("charset"))) {
            response.getMediaType().setParameter("charset", "UTF-8");
            response.getMediaType().setCharsetParameter(Charset.forName("UTF-8"));
        }
    }

}
