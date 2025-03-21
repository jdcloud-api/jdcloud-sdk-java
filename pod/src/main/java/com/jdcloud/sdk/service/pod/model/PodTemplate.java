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

import java.util.List;
import java.util.ArrayList;

/**
 * Pod模板详情。
 */
public class PodTemplate  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板ID
     */
    private String id;

    /**
     * Pod模板名称。
     */
    private String name;

    /**
     * pod模板描述。
     */
    private String description;

    /**
     * Pod模板详细配置。
     */
    private PodTemplateData podTemplateData;

    /**
     * Pod模板所属的高可用组详情。
     */
    
    private List<Ag> ags;
    /**
     * Pod模板创建时间。
     */
    private String createdTime;



    /**
     * get 模板ID
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 模板ID
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * get Pod模板名称。
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set Pod模板名称。
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get pod模板描述。
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set pod模板描述。
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get Pod模板详细配置。
     *
     * @return
     */
    public PodTemplateData getPodTemplateData() {
        return podTemplateData;
    }

    /**
     * set Pod模板详细配置。
     *
     * @param podTemplateData
     */
    public void setPodTemplateData(PodTemplateData podTemplateData) {
        this.podTemplateData = podTemplateData;
    }


    /**
    * get Pod模板所属的高可用组详情。
    *
    * @return
    */
    public List<Ag> getAgs() {
        return ags;
    }

    /**
    * set Pod模板所属的高可用组详情。
    *
    * @param ags
    */
    public void setAgs(List<Ag> ags) {
        this.ags = ags;
    }


    /**
     * get Pod模板创建时间。
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set Pod模板创建时间。
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }



    /**
     * set 模板ID
     *
     * @param id
     */
    public PodTemplate id(String id) {
        this.id = id;
        return this;
    }


    /**
     * set Pod模板名称。
     *
     * @param name
     */
    public PodTemplate name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set pod模板描述。
     *
     * @param description
     */
    public PodTemplate description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set Pod模板详细配置。
     *
     * @param podTemplateData
     */
    public PodTemplate podTemplateData(PodTemplateData podTemplateData) {
        this.podTemplateData = podTemplateData;
        return this;
    }


    /**
    * set Pod模板所属的高可用组详情。
    *
    * @param ags
    */
    public PodTemplate ags(List<Ag> ags) {
        this.ags = ags;
        return this;
    }


    /**
     * set Pod模板创建时间。
     *
     * @param createdTime
     */
    public PodTemplate createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }



    /**
     * add item to Pod模板所属的高可用组详情。
     *
     * @param ag
     */
    public void addAg(Ag ag) {
        if (this.ags == null) {
            this.ags = new ArrayList<>();
        }
        this.ags.add(ag);
    }
}