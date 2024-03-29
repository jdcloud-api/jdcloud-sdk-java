/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 域名操作类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 域名限速
 */
public class SpeedLimitRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 限速值,单位为KB/s,取值范围[1,20480]
     */
    private Integer limitRate;

    /**
     * 用户域名
     * Required:true
     */
    @Required
    private String domain;



    /**
     * get 限速值,单位为KB/s,取值范围[1,20480]
     *
     * @return
     */
    public Integer getLimitRate() {
        return limitRate;
    }

    /**
     * set 限速值,单位为KB/s,取值范围[1,20480]
     *
     * @param limitRate
     */
    public void setLimitRate(Integer limitRate) {
        this.limitRate = limitRate;
    }


    /**
     * get 用户域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }



    /**
     * set 限速值,单位为KB/s,取值范围[1,20480]
     *
     * @param limitRate
     */
    public SpeedLimitRequest limitRate(Integer limitRate) {
        this.limitRate = limitRate;
        return this;
    }


    /**
     * set 用户域名
     *
     * @param domain
     */
    public SpeedLimitRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


}