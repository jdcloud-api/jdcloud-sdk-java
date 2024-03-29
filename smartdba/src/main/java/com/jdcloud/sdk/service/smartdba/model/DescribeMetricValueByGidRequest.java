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
 * Metrics
 * 实时性能、性能够趋相关接口
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
 * 查询监控值
 */
public class DescribeMetricValueByGidRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * metric名称
     * Required:true
     */
    @Required
    private String metric;

    /**
     * 查询开始时间，格式为：2006-01-02T15:04:05Z
     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 查询截止时间，格式为：2006-01-02T15:04:05Z
     * Required:true
     */
    @Required
    private String endTime;

    /**
     * 实例角色，默认master
     */
    private String role;

    /**
     * 地域代码
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * RDS 实例ID，唯一标识一个RDS实例。
     * Required:true
     */
    @Required
    private String instanceGid;


    /**
     * get metric名称
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set metric名称
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * get 查询开始时间，格式为：2006-01-02T15:04:05Z
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询开始时间，格式为：2006-01-02T15:04:05Z
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询截止时间，格式为：2006-01-02T15:04:05Z
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询截止时间，格式为：2006-01-02T15:04:05Z
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 实例角色，默认master
     *
     * @return
     */
    public String getRole() {
        return role;
    }

    /**
     * set 实例角色，默认master
     *
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
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
     * get RDS 实例ID，唯一标识一个RDS实例。
     *
     * @return
     */
    public String getInstanceGid() {
        return instanceGid;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例。
     *
     * @param instanceGid
     */
    public void setInstanceGid(String instanceGid) {
        this.instanceGid = instanceGid;
    }


    /**
     * set metric名称
     *
     * @param metric
     */
    public DescribeMetricValueByGidRequest metric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * set 查询开始时间，格式为：2006-01-02T15:04:05Z
     *
     * @param startTime
     */
    public DescribeMetricValueByGidRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询截止时间，格式为：2006-01-02T15:04:05Z
     *
     * @param endTime
     */
    public DescribeMetricValueByGidRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 实例角色，默认master
     *
     * @param role
     */
    public DescribeMetricValueByGidRequest role(String role) {
        this.role = role;
        return this;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public DescribeMetricValueByGidRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例。
     *
     * @param instanceGid
     */
    public DescribeMetricValueByGidRequest instanceGid(String instanceGid) {
        this.instanceGid = instanceGid;
        return this;
    }


}