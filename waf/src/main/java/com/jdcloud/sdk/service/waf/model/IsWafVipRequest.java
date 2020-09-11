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
 * IP类接口
 * 京东云WAF-OpenAPI IP类接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.waf.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 判断IP是否为waf的vip
 */
public class IsWafVipRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ip列表，多个以逗号分隔
     * Required:true
     */
    @Required
    private String ip;

    /**
     * regionId
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get ip列表，多个以逗号分隔
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set ip列表，多个以逗号分隔
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * get regionId
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set regionId
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set ip列表，多个以逗号分隔
     *
     * @param ip
     */
    public IsWafVipRequest ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set regionId
     *
     * @param regionId
     */
    public IsWafVipRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}