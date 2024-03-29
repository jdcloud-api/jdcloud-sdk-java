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
 * order
 * 云堡垒机实例相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.bastion.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询一个堡垒机的信息
 */
public class DescribeSourceIdRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * sourceid
     * Required:true
     */
    @Required
    private String sourceId;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get sourceid
     *
     * @return
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * set sourceid
     *
     * @param sourceId
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }


    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set sourceid
     *
     * @param sourceId
     */
    public DescribeSourceIdRequest sourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DescribeSourceIdRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}