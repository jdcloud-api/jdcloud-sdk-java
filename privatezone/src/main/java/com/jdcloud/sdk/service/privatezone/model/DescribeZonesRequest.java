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
 * 私有域名zone
 * 私有域名zone API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.privatezone.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询私有解析zone列表

 */
public class DescribeZonesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * zone模块匹配查询
     */
    private String zone;

    /**
     * 购买的套餐实例ID
     */
    private String instanceId;

    /**
     * 根据zoneId精准查询(zone模糊查询失效)
     */
    private String zoneId;

    /**
     * 页容量，默认10，取值范围(1 - 100)
     */
    private Integer pageSize;

    /**
     * 页序号，默认1，不能小于1
     */
    private Integer pageNumber;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get zone模块匹配查询
     *
     * @return
     */
    public String getZone() {
        return zone;
    }

    /**
     * set zone模块匹配查询
     *
     * @param zone
     */
    public void setZone(String zone) {
        this.zone = zone;
    }

    /**
     * get 购买的套餐实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 购买的套餐实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 根据zoneId精准查询(zone模糊查询失效)
     *
     * @return
     */
    public String getZoneId() {
        return zoneId;
    }

    /**
     * set 根据zoneId精准查询(zone模糊查询失效)
     *
     * @param zoneId
     */
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    /**
     * get 页容量，默认10，取值范围(1 - 100)
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 页容量，默认10，取值范围(1 - 100)
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 页序号，默认1，不能小于1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页序号，默认1，不能小于1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
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
     * set zone模块匹配查询
     *
     * @param zone
     */
    public DescribeZonesRequest zone(String zone) {
        this.zone = zone;
        return this;
    }

    /**
     * set 购买的套餐实例ID
     *
     * @param instanceId
     */
    public DescribeZonesRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 根据zoneId精准查询(zone模糊查询失效)
     *
     * @param zoneId
     */
    public DescribeZonesRequest zoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /**
     * set 页容量，默认10，取值范围(1 - 100)
     *
     * @param pageSize
     */
    public DescribeZonesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 页序号，默认1，不能小于1
     *
     * @param pageNumber
     */
    public DescribeZonesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DescribeZonesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}