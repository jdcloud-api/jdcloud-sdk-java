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
 * Peering-Connection
 * 对等连接相关接口
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
 * 修改VpcPeering接口
 */
public class ModifyVpcPeeringRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * VpcPeering的名字,不为空。名称取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     */
    private String vpcPeeringName;

    /**
     * VpcPeering 描述，取值范围：0-256个中文、英文大小写的字母、数字和下划线分隔符
     */
    private String description;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * vpcPeeringId ID
     * Required:true
     */
    @Required
    private String vpcPeeringId;



    /**
     * get VpcPeering的名字,不为空。名称取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @return
     */
    public String getVpcPeeringName() {
        return vpcPeeringName;
    }

    /**
     * set VpcPeering的名字,不为空。名称取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @param vpcPeeringName
     */
    public void setVpcPeeringName(String vpcPeeringName) {
        this.vpcPeeringName = vpcPeeringName;
    }


    /**
     * get VpcPeering 描述，取值范围：0-256个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set VpcPeering 描述，取值范围：0-256个中文、英文大小写的字母、数字和下划线分隔符
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
     * get vpcPeeringId ID
     *
     * @return
     */
    public String getVpcPeeringId() {
        return vpcPeeringId;
    }

    /**
     * set vpcPeeringId ID
     *
     * @param vpcPeeringId
     */
    public void setVpcPeeringId(String vpcPeeringId) {
        this.vpcPeeringId = vpcPeeringId;
    }



    /**
     * set VpcPeering的名字,不为空。名称取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @param vpcPeeringName
     */
    public ModifyVpcPeeringRequest vpcPeeringName(String vpcPeeringName) {
        this.vpcPeeringName = vpcPeeringName;
        return this;
    }


    /**
     * set VpcPeering 描述，取值范围：0-256个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @param description
     */
    public ModifyVpcPeeringRequest description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public ModifyVpcPeeringRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set vpcPeeringId ID
     *
     * @param vpcPeeringId
     */
    public ModifyVpcPeeringRequest vpcPeeringId(String vpcPeeringId) {
        this.vpcPeeringId = vpcPeeringId;
        return this;
    }


}