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
 * Mount-Target
 * 挂载目标相关接口。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.zfs.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * - 为一个文件系统创建一个挂载目标。通过这个挂载目标,你可以挂载将一个文件系统挂载到主机实例上。
- 创建一个挂载目标，为这个挂载目标分配一个Id

 */
public class CreateMountTargetRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建挂载目标的文件系统
     * Required:true
     */
    @Required
    private String fileSystemId;

    /**
     * 子网id
     * Required:true
     */
    @Required
    private String subnetId;

    /**
     * vpcId
     * Required:true
     */
    @Required
    private String vpcId;

    /**
     * 安全组id
     */
    private String securityGroupId;

    /**
     * 幂等性参数(只支持数字、大小写字母，且不能超过64字符)
     * Required:true
     */
    @Required
    private String clientToken;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 创建挂载目标的文件系统
     *
     * @return
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * set 创建挂载目标的文件系统
     *
     * @param fileSystemId
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }


    /**
     * get 子网id
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 子网id
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }


    /**
     * get vpcId
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set vpcId
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }


    /**
     * get 安全组id
     *
     * @return
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    /**
     * set 安全组id
     *
     * @param securityGroupId
     */
    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }


    /**
     * get 幂等性参数(只支持数字、大小写字母，且不能超过64字符)
     *
     * @return
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * set 幂等性参数(只支持数字、大小写字母，且不能超过64字符)
     *
     * @param clientToken
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
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
     * set 创建挂载目标的文件系统
     *
     * @param fileSystemId
     */
    public CreateMountTargetRequest fileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }


    /**
     * set 子网id
     *
     * @param subnetId
     */
    public CreateMountTargetRequest subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }


    /**
     * set vpcId
     *
     * @param vpcId
     */
    public CreateMountTargetRequest vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }


    /**
     * set 安全组id
     *
     * @param securityGroupId
     */
    public CreateMountTargetRequest securityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }


    /**
     * set 幂等性参数(只支持数字、大小写字母，且不能超过64字符)
     *
     * @param clientToken
     */
    public CreateMountTargetRequest clientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public CreateMountTargetRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}