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

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询监控大盘监控值
 */
public class DescribePanelMetricValueByGidRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询起始时间，格式为：2021-11-11T15:04:05Z
     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 查询截止时间，格式为：2021-11-11T15:04:05Z
     * Required:true
     */
    @Required
    private String endTime;

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
     * 监控指标，如： tps、qps 等，在supportMetrics接口有返回
     * Required:true
     */
    @Required
    private String metric;


    /**
     * get 查询起始时间，格式为：2021-11-11T15:04:05Z
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询起始时间，格式为：2021-11-11T15:04:05Z
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询截止时间，格式为：2021-11-11T15:04:05Z
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询截止时间，格式为：2021-11-11T15:04:05Z
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
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
     * get 监控指标，如： tps、qps 等，在supportMetrics接口有返回
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set 监控指标，如： tps、qps 等，在supportMetrics接口有返回
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }


    /**
     * set 查询起始时间，格式为：2021-11-11T15:04:05Z
     *
     * @param startTime
     */
    public DescribePanelMetricValueByGidRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询截止时间，格式为：2021-11-11T15:04:05Z
     *
     * @param endTime
     */
    public DescribePanelMetricValueByGidRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 数据库类型,默认MySQL
     *
     * @param dbType
     */
    public DescribePanelMetricValueByGidRequest dbType(String dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public DescribePanelMetricValueByGidRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 监控大盘id
     *
     * @param panelGid
     */
    public DescribePanelMetricValueByGidRequest panelGid(String panelGid) {
        this.panelGid = panelGid;
        return this;
    }

    /**
     * set 监控指标，如： tps、qps 等，在supportMetrics接口有返回
     *
     * @param metric
     */
    public DescribePanelMetricValueByGidRequest metric(String metric) {
        this.metric = metric;
        return this;
    }


}