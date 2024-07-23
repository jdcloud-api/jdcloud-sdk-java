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
 * instance
 * 轻量应用云主机实例的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lavm.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询轻量应用云主机列表。

 */
public class DescribeInstancesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 轻量应用云主机的实例ID, &#x60;[\&quot;lavm-xxx\&quot;, \&quot;lavm-yyy\&quot;]&#x60;, json array 字串

     */
    private String instanceIds;

    /**
     * 实例的计费方式, 目前只支持且默认值prepaid_by_duration, 包年包月, 

     */
    private String chargeType;

    /**
     * 轻量应用云主机的公网IP, 例如: &#x60;[\&quot;114.1.x.y\&quot;, \&quot;114.2.x.z\&quot;]&#x60;, json array 字串

     */
    private String publicIpAddresses;

    /**
     * 轻量应用云主机的实例名称, 支持模糊搜索, 例如: &#x60;[\&quot;instanceName-1\&quot;, \&quot;instanceName-2\&quot;]&#x60;, json array 字串

     */
    private String names;

    /**
     * 页码；默认为1。
     */
    private Integer pageNumber;

    /**
     * 分页大小；&lt;br&gt;默认为20；取值范围[10, 100]。
     */
    private Integer pageSize;

    /**
     * regionId

     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 轻量应用云主机的实例ID, &#x60;[\&quot;lavm-xxx\&quot;, \&quot;lavm-yyy\&quot;]&#x60;, json array 字串

     *
     * @return
     */
    public String getInstanceIds() {
        return instanceIds;
    }

    /**
     * set 轻量应用云主机的实例ID, &#x60;[\&quot;lavm-xxx\&quot;, \&quot;lavm-yyy\&quot;]&#x60;, json array 字串

     *
     * @param instanceIds
     */
    public void setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
    }


    /**
     * get 实例的计费方式, 目前只支持且默认值prepaid_by_duration, 包年包月, 

     *
     * @return
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * set 实例的计费方式, 目前只支持且默认值prepaid_by_duration, 包年包月, 

     *
     * @param chargeType
     */
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }


    /**
     * get 轻量应用云主机的公网IP, 例如: &#x60;[\&quot;114.1.x.y\&quot;, \&quot;114.2.x.z\&quot;]&#x60;, json array 字串

     *
     * @return
     */
    public String getPublicIpAddresses() {
        return publicIpAddresses;
    }

    /**
     * set 轻量应用云主机的公网IP, 例如: &#x60;[\&quot;114.1.x.y\&quot;, \&quot;114.2.x.z\&quot;]&#x60;, json array 字串

     *
     * @param publicIpAddresses
     */
    public void setPublicIpAddresses(String publicIpAddresses) {
        this.publicIpAddresses = publicIpAddresses;
    }


    /**
     * get 轻量应用云主机的实例名称, 支持模糊搜索, 例如: &#x60;[\&quot;instanceName-1\&quot;, \&quot;instanceName-2\&quot;]&#x60;, json array 字串

     *
     * @return
     */
    public String getNames() {
        return names;
    }

    /**
     * set 轻量应用云主机的实例名称, 支持模糊搜索, 例如: &#x60;[\&quot;instanceName-1\&quot;, \&quot;instanceName-2\&quot;]&#x60;, json array 字串

     *
     * @param names
     */
    public void setNames(String names) {
        this.names = names;
    }


    /**
     * get 页码；默认为1。
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认为1。
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * get 分页大小；&lt;br&gt;默认为20；取值范围[10, 100]。
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；&lt;br&gt;默认为20；取值范围[10, 100]。
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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
     * set 轻量应用云主机的实例ID, &#x60;[\&quot;lavm-xxx\&quot;, \&quot;lavm-yyy\&quot;]&#x60;, json array 字串

     *
     * @param instanceIds
     */
    public DescribeInstancesRequest instanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }


    /**
     * set 实例的计费方式, 目前只支持且默认值prepaid_by_duration, 包年包月, 

     *
     * @param chargeType
     */
    public DescribeInstancesRequest chargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }


    /**
     * set 轻量应用云主机的公网IP, 例如: &#x60;[\&quot;114.1.x.y\&quot;, \&quot;114.2.x.z\&quot;]&#x60;, json array 字串

     *
     * @param publicIpAddresses
     */
    public DescribeInstancesRequest publicIpAddresses(String publicIpAddresses) {
        this.publicIpAddresses = publicIpAddresses;
        return this;
    }


    /**
     * set 轻量应用云主机的实例名称, 支持模糊搜索, 例如: &#x60;[\&quot;instanceName-1\&quot;, \&quot;instanceName-2\&quot;]&#x60;, json array 字串

     *
     * @param names
     */
    public DescribeInstancesRequest names(String names) {
        this.names = names;
        return this;
    }


    /**
     * set 页码；默认为1。
     *
     * @param pageNumber
     */
    public DescribeInstancesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 分页大小；&lt;br&gt;默认为20；取值范围[10, 100]。
     *
     * @param pageSize
     */
    public DescribeInstancesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set regionId

     *
     * @param regionId
     */
    public DescribeInstancesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}