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
 * 私有网络
 * 私有网络相关接口
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
 * 修改私有网络接口
 */
public class ModifyVpcRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 私有网络名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     */
    private String vpcName;

    /**
     * vpc描述，允许输入UTF-8编码下的全部字符，不超过256字符。
     */
    private String description;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Vpc ID
     * Required:true
     */
    @Required
    private String vpcId;


    /**
     * get 私有网络名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @return
     */
    public String getVpcName() {
        return vpcName;
    }

    /**
     * set 私有网络名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param vpcName
     */
    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    /**
     * get vpc描述，允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set vpc描述，允许输入UTF-8编码下的全部字符，不超过256字符。
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
     * get Vpc ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set Vpc ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }


    /**
     * set 私有网络名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param vpcName
     */
    public ModifyVpcRequest vpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * set vpc描述，允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @param description
     */
    public ModifyVpcRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public ModifyVpcRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set Vpc ID
     *
     * @param vpcId
     */
    public ModifyVpcRequest vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }


}