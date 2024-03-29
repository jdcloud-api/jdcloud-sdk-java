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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.privatezone.model.BindVpcReq;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * - 添加一个私有解析的zone，可添加以下三种类型的zone
- 云内全局zone：zone的后缀是指定的后缀，如：local。该域名在云内自动全局生效，不用关联vpc即可在vpc内解析，该类型全局唯一，不能重复添加
- 反向解析zone：zone的后缀是in-addr.arpa时，我们认为他是一个反向解析的zone，反向解析域名前缀目前支持10/172.16-31/192.168网段，如：10.in-addr.arpa、16.172.in-addr.arpa。反向解析的zone只能添加反向解析的记录
- 私有解析zone：该类型的zone可以时任意符合格式的域名，私有解析zone需要关联vpc后，在vpc内生效解析

 */
public class CreateZoneRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * zone
     * Required:true
     */
    @Required
    private String zone;

    /**
     * 购买的套餐实例ID
     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 域名类型 LOCAL-&gt;云内全局 PTR-&gt;反向解析zone PV-&gt;私有zone
     * Required:true
     */
    @Required
    private String zoneType;

    /**
     * 解析失败后是否进行递归解析
     */
    private Boolean retryRecurse;

    /**
     * 绑定的vpc信息
     */
    private List<BindVpcReq> bindVpc;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get zone
     *
     * @return
     */
    public String getZone() {
        return zone;
    }

    /**
     * set zone
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
     * get 域名类型 LOCAL-&gt;云内全局 PTR-&gt;反向解析zone PV-&gt;私有zone
     *
     * @return
     */
    public String getZoneType() {
        return zoneType;
    }

    /**
     * set 域名类型 LOCAL-&gt;云内全局 PTR-&gt;反向解析zone PV-&gt;私有zone
     *
     * @param zoneType
     */
    public void setZoneType(String zoneType) {
        this.zoneType = zoneType;
    }

    /**
     * get 解析失败后是否进行递归解析
     *
     * @return
     */
    public Boolean getRetryRecurse() {
        return retryRecurse;
    }

    /**
     * set 解析失败后是否进行递归解析
     *
     * @param retryRecurse
     */
    public void setRetryRecurse(Boolean retryRecurse) {
        this.retryRecurse = retryRecurse;
    }

    /**
     * get 绑定的vpc信息
     *
     * @return
     */
    public List<BindVpcReq> getBindVpc() {
        return bindVpc;
    }

    /**
     * set 绑定的vpc信息
     *
     * @param bindVpc
     */
    public void setBindVpc(List<BindVpcReq> bindVpc) {
        this.bindVpc = bindVpc;
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
     * set zone
     *
     * @param zone
     */
    public CreateZoneRequest zone(String zone) {
        this.zone = zone;
        return this;
    }

    /**
     * set 购买的套餐实例ID
     *
     * @param instanceId
     */
    public CreateZoneRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 域名类型 LOCAL-&gt;云内全局 PTR-&gt;反向解析zone PV-&gt;私有zone
     *
     * @param zoneType
     */
    public CreateZoneRequest zoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }

    /**
     * set 解析失败后是否进行递归解析
     *
     * @param retryRecurse
     */
    public CreateZoneRequest retryRecurse(Boolean retryRecurse) {
        this.retryRecurse = retryRecurse;
        return this;
    }

    /**
     * set 绑定的vpc信息
     *
     * @param bindVpc
     */
    public CreateZoneRequest bindVpc(List<BindVpcReq> bindVpc) {
        this.bindVpc = bindVpc;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public CreateZoneRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 绑定的vpc信息
     *
     * @param bindVpc
     */
    public void addBindVpc(BindVpcReq bindVpc) {
        if (this.bindVpc == null) {
            this.bindVpc = new ArrayList<>();
        }
        this.bindVpc.add(bindVpc);
    }

}