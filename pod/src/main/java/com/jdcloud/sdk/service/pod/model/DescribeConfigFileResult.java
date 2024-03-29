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

import com.jdcloud.sdk.service.pod.model.ConfigFile;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询单个 configFile 详情

 */
public class DescribeConfigFileResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * configFile
     */
    private ConfigFile configFile;



    /**
     * get configFile
     *
     * @return
     */
    public ConfigFile getConfigFile() {
        return configFile;
    }

    /**
     * set configFile
     *
     * @param configFile
     */
    public void setConfigFile(ConfigFile configFile) {
        this.configFile = configFile;
    }



    /**
     * set configFile
     *
     * @param configFile
     */
    public DescribeConfigFileResult configFile(ConfigFile configFile) {
        this.configFile = configFile;
        return this;
    }


}