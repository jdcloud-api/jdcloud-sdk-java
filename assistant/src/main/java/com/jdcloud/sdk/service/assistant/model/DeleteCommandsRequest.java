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
 * Command
 * 云助手相关命令操作接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.assistant.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 
删除用户自定义命令。

详细操作说明请参考帮助文档：[用户自定义命令概述](https://docs.jdcloud.com/cn/virtual-machines/assistant-overview)

## 接口说明
- 该接口用于删除用户自定义命令。

 */
public class DeleteCommandsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户创建的命令Id

     * Required:true
     */
    @Required
    
    private List<String> commandIds;
    /**
     * 地域ID。
     * Required:true
     */
    @Required
    private String regionId;



    /**
    * get 用户创建的命令Id

    *
    * @return
    */
    public List<String> getCommandIds() {
        return commandIds;
    }

    /**
    * set 用户创建的命令Id

    *
    * @param commandIds
    */
    public void setCommandIds(List<String> commandIds) {
        this.commandIds = commandIds;
    }


    /**
     * get 地域ID。
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
    * set 用户创建的命令Id

    *
    * @param commandIds
    */
    public DeleteCommandsRequest commandIds(List<String> commandIds) {
        this.commandIds = commandIds;
        return this;
    }


    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public DeleteCommandsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to 用户创建的命令Id

     *
     * @param commandId
     */
    public void addCommandId(String commandId) {
        if (this.commandIds == null) {
            this.commandIds = new ArrayList<>();
        }
        this.commandIds.add(commandId);
    }
}