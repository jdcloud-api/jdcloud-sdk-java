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
 * Logpush-Jobs
 * Logpush jobs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 数据集可用的所有默认字段列表。
 */
public class FieldsDefaultRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * zone_identifier
     * Required:true
     */
    @Required
    private String zone_identifier;

    /**
     * dataset
     * Required:true
     */
    @Required
    private String dataset;



    /**
     * get zone_identifier
     *
     * @return
     */
    public String getZone_identifier() {
        return zone_identifier;
    }

    /**
     * set zone_identifier
     *
     * @param zone_identifier
     */
    public void setZone_identifier(String zone_identifier) {
        this.zone_identifier = zone_identifier;
    }


    /**
     * get dataset
     *
     * @return
     */
    public String getDataset() {
        return dataset;
    }

    /**
     * set dataset
     *
     * @param dataset
     */
    public void setDataset(String dataset) {
        this.dataset = dataset;
    }



    /**
     * set zone_identifier
     *
     * @param zone_identifier
     */
    public FieldsDefaultRequest zone_identifier(String zone_identifier) {
        this.zone_identifier = zone_identifier;
        return this;
    }


    /**
     * set dataset
     *
     * @param dataset
     */
    public FieldsDefaultRequest dataset(String dataset) {
        this.dataset = dataset;
        return this;
    }


}