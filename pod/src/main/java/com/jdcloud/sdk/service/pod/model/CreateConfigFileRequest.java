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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.pod.model.ConfigFileData;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建一个 configFile，存放文件内容（键值对）。

 */
public class CreateConfigFileRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ConfigFile 的名字，名称不能重复
长度不超过63（命名字母小写，数字和-）

     * Required:true
     */
    @Required
    private String name;

    /**
     * configFile数据，个数不超过32个

     * Required:true
     */
    @Required
    
    private List<ConfigFileData> data;
    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get ConfigFile 的名字，名称不能重复
长度不超过63（命名字母小写，数字和-）

     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set ConfigFile 的名字，名称不能重复
长度不超过63（命名字母小写，数字和-）

     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
    * get configFile数据，个数不超过32个

    *
    * @return
    */
    public List<ConfigFileData> getData() {
        return data;
    }

    /**
    * set configFile数据，个数不超过32个

    *
    * @param data
    */
    public void setData(List<ConfigFileData> data) {
        this.data = data;
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
     * set ConfigFile 的名字，名称不能重复
长度不超过63（命名字母小写，数字和-）

     *
     * @param name
     */
    public CreateConfigFileRequest name(String name) {
        this.name = name;
        return this;
    }


    /**
    * set configFile数据，个数不超过32个

    *
    * @param data
    */
    public CreateConfigFileRequest data(List<ConfigFileData> data) {
        this.data = data;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public CreateConfigFileRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to configFile数据，个数不超过32个

     *
     * @param data
     */
    public void addData(ConfigFileData data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }
}