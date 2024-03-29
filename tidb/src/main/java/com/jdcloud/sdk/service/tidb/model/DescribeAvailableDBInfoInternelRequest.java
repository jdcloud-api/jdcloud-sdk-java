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
 * Instance-Management
 * 实例管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.tidb.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询 TiDB支持的基本信息。
 */
public class DescribeAvailableDBInfoInternelRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户可用区[多个使用,分隔]
     */
    private String azs;

    /**
     * 地域代码
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 用户可用区[多个使用,分隔]
     *
     * @return
     */
    public String getAzs() {
        return azs;
    }

    /**
     * set 用户可用区[多个使用,分隔]
     *
     * @param azs
     */
    public void setAzs(String azs) {
        this.azs = azs;
    }


    /**
     * get 地域代码
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 用户可用区[多个使用,分隔]
     *
     * @param azs
     */
    public DescribeAvailableDBInfoInternelRequest azs(String azs) {
        this.azs = azs;
        return this;
    }


    /**
     * set 地域代码
     *
     * @param regionId
     */
    public DescribeAvailableDBInfoInternelRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}