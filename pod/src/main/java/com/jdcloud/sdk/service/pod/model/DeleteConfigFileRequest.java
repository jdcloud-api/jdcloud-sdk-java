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
 * ConfigFile
 * ConfigFile
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pod.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除单个 configFile

 */
public class DeleteConfigFileRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Name
     * Required:true
     */
    @Required
    private String name;



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
     * get Name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set Name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }



    /**
     * set Region ID
     *
     * @param regionId
     */
    public DeleteConfigFileRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set Name
     *
     * @param name
     */
    public DeleteConfigFileRequest name(String name) {
        this.name = name;
        return this;
    }


}