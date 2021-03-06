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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;


/**
 * server
 */
public class Server  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 服务器ID
     */
    private String serverId;

    /**
     * 资源类型
     */
    private String instanceType;

    /**
     * 实例名称
     */
    private String instanceName;

    /**
     * 后端云物理服务器ID
     */
    private String instanceId;

    /**
     * 可用区
     */
    private String az;

    /**
     * 内网Ip
     */
    private String privateIp;

    /**
     * 端口
     */
    private Integer port;

    /**
     * 后端云物理服务器权重
     */
    private Integer weight;

    /**
     * 状态
     */
    private String status;

    /**
     * 健康状态
     */
    private String healthyStatus;

    /**
     * 别名IP
     */
    private String aliasip;

    /**
     * IP类型：别名IPv4 or 内网IPv4
     */
    private String iptype;


    /**
     * get 服务器ID
     *
     * @return
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * set 服务器ID
     *
     * @param serverId
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * get 资源类型
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 资源类型
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get 实例名称
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 后端云物理服务器ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 后端云物理服务器ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 可用区
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 可用区
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }

    /**
     * get 内网Ip
     *
     * @return
     */
    public String getPrivateIp() {
        return privateIp;
    }

    /**
     * set 内网Ip
     *
     * @param privateIp
     */
    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    /**
     * get 端口
     *
     * @return
     */
    public Integer getPort() {
        return port;
    }

    /**
     * set 端口
     *
     * @param port
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * get 后端云物理服务器权重
     *
     * @return
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * set 后端云物理服务器权重
     *
     * @param weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * get 状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 健康状态
     *
     * @return
     */
    public String getHealthyStatus() {
        return healthyStatus;
    }

    /**
     * set 健康状态
     *
     * @param healthyStatus
     */
    public void setHealthyStatus(String healthyStatus) {
        this.healthyStatus = healthyStatus;
    }

    /**
     * get 别名IP
     *
     * @return
     */
    public String getAliasip() {
        return aliasip;
    }

    /**
     * set 别名IP
     *
     * @param aliasip
     */
    public void setAliasip(String aliasip) {
        this.aliasip = aliasip;
    }

    /**
     * get IP类型：别名IPv4 or 内网IPv4
     *
     * @return
     */
    public String getIptype() {
        return iptype;
    }

    /**
     * set IP类型：别名IPv4 or 内网IPv4
     *
     * @param iptype
     */
    public void setIptype(String iptype) {
        this.iptype = iptype;
    }


    /**
     * set 服务器ID
     *
     * @param serverId
     */
    public Server serverId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * set 资源类型
     *
     * @param instanceType
     */
    public Server instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public Server instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 后端云物理服务器ID
     *
     * @param instanceId
     */
    public Server instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 可用区
     *
     * @param az
     */
    public Server az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 内网Ip
     *
     * @param privateIp
     */
    public Server privateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * set 端口
     *
     * @param port
     */
    public Server port(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * set 后端云物理服务器权重
     *
     * @param weight
     */
    public Server weight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * set 状态
     *
     * @param status
     */
    public Server status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 健康状态
     *
     * @param healthyStatus
     */
    public Server healthyStatus(String healthyStatus) {
        this.healthyStatus = healthyStatus;
        return this;
    }

    /**
     * set 别名IP
     *
     * @param aliasip
     */
    public Server aliasip(String aliasip) {
        this.aliasip = aliasip;
        return this;
    }

    /**
     * set IP类型：别名IPv4 or 内网IPv4
     *
     * @param iptype
     */
    public Server iptype(String iptype) {
        this.iptype = iptype;
        return this;
    }


}