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

package com.jdcloud.sdk.service.deploy.model;


/**
 * deployInstance
 */
public class DeployInstance  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部署ID
     */
    private String deployId;

    /**
     * 云主机ID
     */
    private String uuid;

    /**
     * 云主机名称
     */
    private String instanceName;

    /**
     * ip
     */
    private String ip;

    /**
     * 公网ip
     */
    private String public_ip;

    /**
     * 地域
     */
    private String regionId;

    /**
     * 私有网络
     */
    private Vpc vpc;

    /**
     * 类型 1云主机，2原生容器
     */
    private Integer type;

    /**
     * 高可用组
     */
    private Ag ag;

    /**
     * 标签
     */
    private String tags;

    /**
     * 所属部署组ID，多个,分隔
     */
    private String groupId;

    /**
     * 部署方式：1滚动 2蓝组 3绿组
     */
    private Integer method;

    /**
     * 部署状态
     */
    private Integer status;


    /**
     * get 部署ID
     *
     * @return
     */
    public String getDeployId() {
        return deployId;
    }

    /**
     * set 部署ID
     *
     * @param deployId
     */
    public void setDeployId(String deployId) {
        this.deployId = deployId;
    }

    /**
     * get 云主机ID
     *
     * @return
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * set 云主机ID
     *
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * get 云主机名称
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 云主机名称
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get ip
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set ip
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * get 公网ip
     *
     * @return
     */
    public String getPublic_ip() {
        return public_ip;
    }

    /**
     * set 公网ip
     *
     * @param public_ip
     */
    public void setPublic_ip(String public_ip) {
        this.public_ip = public_ip;
    }

    /**
     * get 地域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 私有网络
     *
     * @return
     */
    public Vpc getVpc() {
        return vpc;
    }

    /**
     * set 私有网络
     *
     * @param vpc
     */
    public void setVpc(Vpc vpc) {
        this.vpc = vpc;
    }

    /**
     * get 类型 1云主机，2原生容器
     *
     * @return
     */
    public Integer getType() {
        return type;
    }

    /**
     * set 类型 1云主机，2原生容器
     *
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * get 高可用组
     *
     * @return
     */
    public Ag getAg() {
        return ag;
    }

    /**
     * set 高可用组
     *
     * @param ag
     */
    public void setAg(Ag ag) {
        this.ag = ag;
    }

    /**
     * get 标签
     *
     * @return
     */
    public String getTags() {
        return tags;
    }

    /**
     * set 标签
     *
     * @param tags
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * get 所属部署组ID，多个,分隔
     *
     * @return
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * set 所属部署组ID，多个,分隔
     *
     * @param groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * get 部署方式：1滚动 2蓝组 3绿组
     *
     * @return
     */
    public Integer getMethod() {
        return method;
    }

    /**
     * set 部署方式：1滚动 2蓝组 3绿组
     *
     * @param method
     */
    public void setMethod(Integer method) {
        this.method = method;
    }

    /**
     * get 部署状态
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 部署状态
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }


    /**
     * set 部署ID
     *
     * @param deployId
     */
    public DeployInstance deployId(String deployId) {
        this.deployId = deployId;
        return this;
    }

    /**
     * set 云主机ID
     *
     * @param uuid
     */
    public DeployInstance uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * set 云主机名称
     *
     * @param instanceName
     */
    public DeployInstance instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set ip
     *
     * @param ip
     */
    public DeployInstance ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set 公网ip
     *
     * @param public_ip
     */
    public DeployInstance public_ip(String public_ip) {
        this.public_ip = public_ip;
        return this;
    }

    /**
     * set 地域
     *
     * @param regionId
     */
    public DeployInstance regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 私有网络
     *
     * @param vpc
     */
    public DeployInstance vpc(Vpc vpc) {
        this.vpc = vpc;
        return this;
    }

    /**
     * set 类型 1云主机，2原生容器
     *
     * @param type
     */
    public DeployInstance type(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * set 高可用组
     *
     * @param ag
     */
    public DeployInstance ag(Ag ag) {
        this.ag = ag;
        return this;
    }

    /**
     * set 标签
     *
     * @param tags
     */
    public DeployInstance tags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set 所属部署组ID，多个,分隔
     *
     * @param groupId
     */
    public DeployInstance groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * set 部署方式：1滚动 2蓝组 3绿组
     *
     * @param method
     */
    public DeployInstance method(Integer method) {
        this.method = method;
        return this;
    }

    /**
     * set 部署状态
     *
     * @param status
     */
    public DeployInstance status(Integer status) {
        this.status = status;
        return this;
    }


}