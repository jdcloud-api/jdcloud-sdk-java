/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.jdcloud.sdk.auth.sign;

import com.jdcloud.sdk.constant.ParameterConstant;
import com.jdcloud.sdk.http.SdkHttpRequest;
import com.jdcloud.sdk.http.handler.HandlerKeys;
import com.jdcloud.sdk.utils.HostNameUtils;
import com.jdcloud.sdk.utils.SignerUtils;

import java.util.Date;

/**
 * Parameters that are used for computing a AWS 4 signature for a request.
 */
public final class SignerRequestParams {

    /**
     * The request for which the signature needs to be computed.
     */
    private final SdkHttpRequest request;

    /**
     * The datetime in milliseconds for which the signature needs to be
     * computed.
     */
    private final long signingDateTimeMilli;

    /**
     * The scope of the signature.
     */
    private final String scope;

    /**
     * The AWS region to be used for computing the signature.
     */
    private final String regionName;


    private final String serviceName;


    private final String formattedSigningDateTime;


    private final String formattedSigningDate;


    private final String signingAlgorithm;


    public SignerRequestParams(SdkHttpRequest request,
                               Date signingDateOverride, String regionNameOverride,
                               String serviceName, String signingAlgorithm) {
        if (request == null) {
            throw new IllegalArgumentException("Request cannot be null");
        }
        if (signingAlgorithm == null) {
            throw new IllegalArgumentException(
                    "Signing Algorithm cannot be null");
        }
        this.request = request;
        this.signingDateTimeMilli = signingDateOverride != null ? signingDateOverride
                .getTime() : getSigningDate(request);
        this.formattedSigningDate = SignerUtils
                .formatDateStamp(signingDateTimeMilli);
        this.serviceName = serviceName;
        this.regionName = parseRegion(request, regionNameOverride);
        this.scope = generateScope(formattedSigningDate, this.serviceName, regionName);
        this.formattedSigningDateTime = SignerUtils.formatTimestamp(signingDateTimeMilli);
        this.signingAlgorithm = signingAlgorithm;
    }

    private String parseRegion(SdkHttpRequest request, String regionNameOverride) {
        return regionNameOverride != null ? regionNameOverride
                : HostNameUtils.parseRegion(request.getEndpoint()
                .getHost(), this.serviceName);
    }


    private long getSigningDate(SdkHttpRequest request) {
        if (request.handlerContext(HandlerKeys.TIME_OFFSET) == null) {
            return System.currentTimeMillis();
        } else {
            return System.currentTimeMillis() - request.handlerContext(HandlerKeys.TIME_OFFSET) * 1000L;
        }
    }

    /**
     * Returns the scope to be used for the signing.
     */
    private String generateScope(String dateStamp, String serviceName, String regionName) {
        return new StringBuilder().append(dateStamp).append("/").append(regionName)
                                  .append("/").append(serviceName).append("/")
                                  .append(ParameterConstant.JDCLOUD_TERMINATOR).toString();
    }


    public SdkHttpRequest getRequest() {
        return request;
    }


    public String getScope() {
        return scope;
    }

    public String getFormattedSigningDateTime() {
        return formattedSigningDateTime;
    }


    public long getSigningDateTimeMilli() {
        return signingDateTimeMilli;
    }

    /**
     * 返回用来计算签名的区域
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * 返回请求的服务
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * 签名日期的UTC返回
     */
    public String getFormattedSigningDate() {
        return formattedSigningDate;
    }

    /**
     * 返回签名算法
     */
    public String getSigningAlgorithm() {
        return signingAlgorithm;
    }
}
