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
 * Instance-Operation
 * 实例接入、取消接入、实例列表等接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.smartdba.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取待接入的mysql实例
 */
public class ToBeConnectClustersRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例类型，支持MySQL/Percona，默认MySQL
     */
    private String dbType;

    /**
     * 显示数据的页码，默认为1，取值范围：[-1,∞)。pageIndex 为-1时，返回所有数据页码；
     */
    private Integer pageIndex;

    /**
     * 每页显示的数据条数，默认为10，取值范围：[1,100]，用于查询列表的接口
     */
    private Integer pageSize;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 实例类型，支持MySQL/Percona，默认MySQL
     *
     * @return
     */
    public String getDbType() {
        return dbType;
    }

    /**
     * set 实例类型，支持MySQL/Percona，默认MySQL
     *
     * @param dbType
     */
    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    /**
     * get 显示数据的页码，默认为1，取值范围：[-1,∞)。pageIndex 为-1时，返回所有数据页码；
     *
     * @return
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * set 显示数据的页码，默认为1，取值范围：[-1,∞)。pageIndex 为-1时，返回所有数据页码；
     *
     * @param pageIndex
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    /**
     * get 每页显示的数据条数，默认为10，取值范围：[1,100]，用于查询列表的接口
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页显示的数据条数，默认为10，取值范围：[1,100]，用于查询列表的接口
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 实例类型，支持MySQL/Percona，默认MySQL
     *
     * @param dbType
     */
    public ToBeConnectClustersRequest dbType(String dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * set 显示数据的页码，默认为1，取值范围：[-1,∞)。pageIndex 为-1时，返回所有数据页码；
     *
     * @param pageIndex
     */
    public ToBeConnectClustersRequest pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * set 每页显示的数据条数，默认为10，取值范围：[1,100]，用于查询列表的接口
     *
     * @param pageSize
     */
    public ToBeConnectClustersRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public ToBeConnectClustersRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}