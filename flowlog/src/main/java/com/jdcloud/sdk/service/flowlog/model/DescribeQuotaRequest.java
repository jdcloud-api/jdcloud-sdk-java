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
 * Quota
 * 配额的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.flowlog.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询配额信息
 */
public class DescribeQuotaRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源类型，取值范围：flowLog、flowLogResource
     * Required:true
     */
    @Required
    private String type;

    /**
     * type为flowLog不设置,
flowLogResource设置为flowLogId

     */
    private String parentResourceId;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 资源类型，取值范围：flowLog、flowLogResource
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set 资源类型，取值范围：flowLog、flowLogResource
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * get type为flowLog不设置,
flowLogResource设置为flowLogId

     *
     * @return
     */
    public String getParentResourceId() {
        return parentResourceId;
    }

    /**
     * set type为flowLog不设置,
flowLogResource设置为flowLogId

     *
     * @param parentResourceId
     */
    public void setParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
    }


    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 资源类型，取值范围：flowLog、flowLogResource
     *
     * @param type
     */
    public DescribeQuotaRequest type(String type) {
        this.type = type;
        return this;
    }


    /**
     * set type为flowLog不设置,
flowLogResource设置为flowLogId

     *
     * @param parentResourceId
     */
    public DescribeQuotaRequest parentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public DescribeQuotaRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}