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
 * Acl
 * Acl相关接口
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
 * 修改networkAcl接口
 */
public class ModifyNetworkAclRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * networkAcl名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     */
    private String networkAclName;

    /**
     * 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     */
    private String description;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * networkAclId ID
     * Required:true
     */
    @Required
    private String networkAclId;



    /**
     * get networkAcl名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @return
     */
    public String getNetworkAclName() {
        return networkAclName;
    }

    /**
     * set networkAcl名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param networkAclName
     */
    public void setNetworkAclName(String networkAclName) {
        this.networkAclName = networkAclName;
    }


    /**
     * get 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
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
     * get networkAclId ID
     *
     * @return
     */
    public String getNetworkAclId() {
        return networkAclId;
    }

    /**
     * set networkAclId ID
     *
     * @param networkAclId
     */
    public void setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }



    /**
     * set networkAcl名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param networkAclName
     */
    public ModifyNetworkAclRequest networkAclName(String networkAclName) {
        this.networkAclName = networkAclName;
        return this;
    }


    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public ModifyNetworkAclRequest description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public ModifyNetworkAclRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set networkAclId ID
     *
     * @param networkAclId
     */
    public ModifyNetworkAclRequest networkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }


}