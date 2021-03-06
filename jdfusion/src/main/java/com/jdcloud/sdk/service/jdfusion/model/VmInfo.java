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

package com.jdcloud.sdk.service.jdfusion.model;

import java.util.List;
import java.util.ArrayList;

/**
 * vmInfo
 */
public class VmInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源ID，如果为空，则执行创建操作，否则执行修改操作
     */
    private String id;

    /**
     * 可用区,根据各云平台规范填写
     */
    private String region;

    /**
     * 云主机所属的可用区
     */
    private String az;

    /**
     * 云主机名称
     */
    private String name;

    /**
     * 云主机
     */
    private String hostName;

    /**
     * imageType
     */
    private ImageType imageType;

    /**
     * instanceType
     */
    private InstanceType instanceType;

    /**
     * 云主机描述
     */
    private String description;

    /**
     * 子网ID
     */
    private String subnetId;

    /**
     * tags
     */
    private List<Tag> tags;

    /**
     * 所属云提供商ID
     */
    private String cloudID;

    /**
     * 密钥对名称,jd当前只支持传入一个
     */
    private List<String> keyNames;

    /**
     * 主网卡主IP绑定弹性IP的地址
     */
    private String elasticIpAddress;

    /**
     * 私有ip地址
     */
    private String privateIpAddress;

    /**
     * 云主机状态
     */
    private String status;

    /**
     * 创建时间
     */
    private String createdTime;

    /**
     * 镜像ID
     */
    private String imageId;

    /**
     * 安全组ID
     */
    private List<String> securityGroupIds;


    /**
     * get 资源ID，如果为空，则执行创建操作，否则执行修改操作
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 资源ID，如果为空，则执行创建操作，否则执行修改操作
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 可用区,根据各云平台规范填写
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 可用区,根据各云平台规范填写
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 云主机所属的可用区
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 云主机所属的可用区
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }

    /**
     * get 云主机名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 云主机名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 云主机
     *
     * @return
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * set 云主机
     *
     * @param hostName
     */
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * get imageType
     *
     * @return
     */
    public ImageType getImageType() {
        return imageType;
    }

    /**
     * set imageType
     *
     * @param imageType
     */
    public void setImageType(ImageType imageType) {
        this.imageType = imageType;
    }

    /**
     * get instanceType
     *
     * @return
     */
    public InstanceType getInstanceType() {
        return instanceType;
    }

    /**
     * set instanceType
     *
     * @param instanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get 云主机描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 云主机描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 子网ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get tags
     *
     * @return
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * set tags
     *
     * @param tags
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    /**
     * get 所属云提供商ID
     *
     * @return
     */
    public String getCloudID() {
        return cloudID;
    }

    /**
     * set 所属云提供商ID
     *
     * @param cloudID
     */
    public void setCloudID(String cloudID) {
        this.cloudID = cloudID;
    }

    /**
     * get 密钥对名称,jd当前只支持传入一个
     *
     * @return
     */
    public List<String> getKeyNames() {
        return keyNames;
    }

    /**
     * set 密钥对名称,jd当前只支持传入一个
     *
     * @param keyNames
     */
    public void setKeyNames(List<String> keyNames) {
        this.keyNames = keyNames;
    }

    /**
     * get 主网卡主IP绑定弹性IP的地址
     *
     * @return
     */
    public String getElasticIpAddress() {
        return elasticIpAddress;
    }

    /**
     * set 主网卡主IP绑定弹性IP的地址
     *
     * @param elasticIpAddress
     */
    public void setElasticIpAddress(String elasticIpAddress) {
        this.elasticIpAddress = elasticIpAddress;
    }

    /**
     * get 私有ip地址
     *
     * @return
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * set 私有ip地址
     *
     * @param privateIpAddress
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * get 云主机状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 云主机状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * get 镜像ID
     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 镜像ID
     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * get 安全组ID
     *
     * @return
     */
    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * set 安全组ID
     *
     * @param securityGroupIds
     */
    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }


    /**
     * set 资源ID，如果为空，则执行创建操作，否则执行修改操作
     *
     * @param id
     */
    public VmInfo id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 可用区,根据各云平台规范填写
     *
     * @param region
     */
    public VmInfo region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 云主机所属的可用区
     *
     * @param az
     */
    public VmInfo az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 云主机名称
     *
     * @param name
     */
    public VmInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 云主机
     *
     * @param hostName
     */
    public VmInfo hostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * set imageType
     *
     * @param imageType
     */
    public VmInfo imageType(ImageType imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * set instanceType
     *
     * @param instanceType
     */
    public VmInfo instanceType(InstanceType instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 云主机描述
     *
     * @param description
     */
    public VmInfo description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public VmInfo subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set tags
     *
     * @param tags
     */
    public VmInfo tags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set 所属云提供商ID
     *
     * @param cloudID
     */
    public VmInfo cloudID(String cloudID) {
        this.cloudID = cloudID;
        return this;
    }

    /**
     * set 密钥对名称,jd当前只支持传入一个
     *
     * @param keyNames
     */
    public VmInfo keyNames(List<String> keyNames) {
        this.keyNames = keyNames;
        return this;
    }

    /**
     * set 主网卡主IP绑定弹性IP的地址
     *
     * @param elasticIpAddress
     */
    public VmInfo elasticIpAddress(String elasticIpAddress) {
        this.elasticIpAddress = elasticIpAddress;
        return this;
    }

    /**
     * set 私有ip地址
     *
     * @param privateIpAddress
     */
    public VmInfo privateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * set 云主机状态
     *
     * @param status
     */
    public VmInfo status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createdTime
     */
    public VmInfo createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set 镜像ID
     *
     * @param imageId
     */
    public VmInfo imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * set 安全组ID
     *
     * @param securityGroupIds
     */
    public VmInfo securityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }


    /**
     * add item to tags
     *
     * @param tag
     */
    public void addTag(Tag tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

    /**
     * add item to 密钥对名称,jd当前只支持传入一个
     *
     * @param keyName
     */
    public void addKeyName(String keyName) {
        if (this.keyNames == null) {
            this.keyNames = new ArrayList<>();
        }
        this.keyNames.add(keyName);
    }

    /**
     * add item to 安全组ID
     *
     * @param securityGroupId
     */
    public void addSecurityGroupId(String securityGroupId) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        this.securityGroupIds.add(securityGroupId);
    }

}