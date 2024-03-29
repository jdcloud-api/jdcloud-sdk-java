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
 * NodeGroup
 * 工作节点组相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kubernetes.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.kubernetes.model.CAConfigSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设置工作节点组自动扩容缩容
 */
public class SetNodeGroupCARequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自动伸缩配置，其中 enable 必须指定
     * Required:true
     */
    @Required
    private CAConfigSpec caConfig;

    /**
     * 地域 ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 工作节点组 ID
     * Required:true
     */
    @Required
    private String nodeGroupId;



    /**
     * get 自动伸缩配置，其中 enable 必须指定
     *
     * @return
     */
    public CAConfigSpec getCaConfig() {
        return caConfig;
    }

    /**
     * set 自动伸缩配置，其中 enable 必须指定
     *
     * @param caConfig
     */
    public void setCaConfig(CAConfigSpec caConfig) {
        this.caConfig = caConfig;
    }


    /**
     * get 地域 ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 工作节点组 ID
     *
     * @return
     */
    public String getNodeGroupId() {
        return nodeGroupId;
    }

    /**
     * set 工作节点组 ID
     *
     * @param nodeGroupId
     */
    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }



    /**
     * set 自动伸缩配置，其中 enable 必须指定
     *
     * @param caConfig
     */
    public SetNodeGroupCARequest caConfig(CAConfigSpec caConfig) {
        this.caConfig = caConfig;
        return this;
    }


    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public SetNodeGroupCARequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 工作节点组 ID
     *
     * @param nodeGroupId
     */
    public SetNodeGroupCARequest nodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }


}