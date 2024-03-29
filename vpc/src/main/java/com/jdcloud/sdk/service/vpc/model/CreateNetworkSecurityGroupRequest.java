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
 * Security-Group
 * 安全组相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建安全组
 */
public class CreateNetworkSecurityGroupRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 私有网络ID
     * Required:true
     */
    @Required
    private String vpcId;

    /**
     * 安全组名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     * Required:true
     */
    @Required
    private String networkSecurityGroupName;

    /**
     * 描述,​ 允许输入UTF-8编码下的全部字符，不超过256字符
     */
    private String description;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 私有网络ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 私有网络ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }


    /**
     * get 安全组名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @return
     */
    public String getNetworkSecurityGroupName() {
        return networkSecurityGroupName;
    }

    /**
     * set 安全组名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param networkSecurityGroupName
     */
    public void setNetworkSecurityGroupName(String networkSecurityGroupName) {
        this.networkSecurityGroupName = networkSecurityGroupName;
    }


    /**
     * get 描述,​ 允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述,​ 允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 私有网络ID
     *
     * @param vpcId
     */
    public CreateNetworkSecurityGroupRequest vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }


    /**
     * set 安全组名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param networkSecurityGroupName
     */
    public CreateNetworkSecurityGroupRequest networkSecurityGroupName(String networkSecurityGroupName) {
        this.networkSecurityGroupName = networkSecurityGroupName;
        return this;
    }


    /**
     * set 描述,​ 允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public CreateNetworkSecurityGroupRequest description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public CreateNetworkSecurityGroupRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}