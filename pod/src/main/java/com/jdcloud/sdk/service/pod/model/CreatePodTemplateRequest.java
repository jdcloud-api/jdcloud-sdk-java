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
 * PodTemplate
 * Pod模板相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pod.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.pod.model.PodTemplateSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建Pod模板
 */
public class CreatePodTemplateRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pod模板的名称，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     * Required:true
     */
    @Required
    private String name;

    /**
     * pod模板描述，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     */
    private String description;

    /**
     * pod模板创建参数
     * Required:true
     */
    @Required
    private PodTemplateSpec podTemplateSpec;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get pod模板的名称，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set pod模板的名称，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get pod模板描述，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set pod模板描述，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get pod模板创建参数
     *
     * @return
     */
    public PodTemplateSpec getPodTemplateSpec() {
        return podTemplateSpec;
    }

    /**
     * set pod模板创建参数
     *
     * @param podTemplateSpec
     */
    public void setPodTemplateSpec(PodTemplateSpec podTemplateSpec) {
        this.podTemplateSpec = podTemplateSpec;
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
     * set pod模板的名称，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     *
     * @param name
     */
    public CreatePodTemplateRequest name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set pod模板描述，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     *
     * @param description
     */
    public CreatePodTemplateRequest description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set pod模板创建参数
     *
     * @param podTemplateSpec
     */
    public CreatePodTemplateRequest podTemplateSpec(PodTemplateSpec podTemplateSpec) {
        this.podTemplateSpec = podTemplateSpec;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public CreatePodTemplateRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}