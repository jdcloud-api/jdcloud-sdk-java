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
 * Monitor-Market
 * 监控大盘相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.smartdba.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改关联实例，每次都是全量下发
 */
public class UpdatePanelClustersRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * instanceIdList
     */
    private List<String> instanceIdList;

    /**
     * 数据库类型,默认MySQL
     */
    private String dbType;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 监控大盘id
     * Required:true
     */
    @Required
    private String panelGid;


    /**
     * get instanceIdList
     *
     * @return
     */
    public List<String> getInstanceIdList() {
        return instanceIdList;
    }

    /**
     * set instanceIdList
     *
     * @param instanceIdList
     */
    public void setInstanceIdList(List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
    }

    /**
     * get 数据库类型,默认MySQL
     *
     * @return
     */
    public String getDbType() {
        return dbType;
    }

    /**
     * set 数据库类型,默认MySQL
     *
     * @param dbType
     */
    public void setDbType(String dbType) {
        this.dbType = dbType;
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
     * get 监控大盘id
     *
     * @return
     */
    public String getPanelGid() {
        return panelGid;
    }

    /**
     * set 监控大盘id
     *
     * @param panelGid
     */
    public void setPanelGid(String panelGid) {
        this.panelGid = panelGid;
    }


    /**
     * set instanceIdList
     *
     * @param instanceIdList
     */
    public UpdatePanelClustersRequest instanceIdList(List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }

    /**
     * set 数据库类型,默认MySQL
     *
     * @param dbType
     */
    public UpdatePanelClustersRequest dbType(String dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public UpdatePanelClustersRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 监控大盘id
     *
     * @param panelGid
     */
    public UpdatePanelClustersRequest panelGid(String panelGid) {
        this.panelGid = panelGid;
        return this;
    }


    /**
     * add item to instanceIdList
     *
     * @param instanceIdList
     */
    public void addInstanceIdList(String instanceIdList) {
        if (this.instanceIdList == null) {
            this.instanceIdList = new ArrayList<>();
        }
        this.instanceIdList.add(instanceIdList);
    }

}