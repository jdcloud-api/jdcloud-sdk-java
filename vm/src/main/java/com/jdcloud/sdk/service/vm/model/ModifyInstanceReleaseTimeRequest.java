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
 * 云主机
 * 与主机操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 更改云主机定时删除信息。

 */
public class ModifyInstanceReleaseTimeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 需要更改定时删除信息的云主机id列表。

     */
    
    private List<String> instanceIds;
    /**
     * ｜ 为云主机设置或修改定时删除时间，如果为空，若云主机存在定时删除任务，则取消其定时删除任务。 支持的时间范围为当前时间+1小时至当前时间+10年。示例：&quot;2025-01-01 00:00:00&quot;
     */
    private String autoReleaseTime;

    /**
     * 地域ID。
     * Required:true
     */
    @Required
    private String regionId;



    /**
    * get 需要更改定时删除信息的云主机id列表。

    *
    * @return
    */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    /**
    * set 需要更改定时删除信息的云主机id列表。

    *
    * @param instanceIds
    */
    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }


    /**
     * get ｜ 为云主机设置或修改定时删除时间，如果为空，若云主机存在定时删除任务，则取消其定时删除任务。 支持的时间范围为当前时间+1小时至当前时间+10年。示例：&quot;2025-01-01 00:00:00&quot;
     *
     * @return
     */
    public String getAutoReleaseTime() {
        return autoReleaseTime;
    }

    /**
     * set ｜ 为云主机设置或修改定时删除时间，如果为空，若云主机存在定时删除任务，则取消其定时删除任务。 支持的时间范围为当前时间+1小时至当前时间+10年。示例：&quot;2025-01-01 00:00:00&quot;
     *
     * @param autoReleaseTime
     */
    public void setAutoReleaseTime(String autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
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
    * set 需要更改定时删除信息的云主机id列表。

    *
    * @param instanceIds
    */
    public ModifyInstanceReleaseTimeRequest instanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }


    /**
     * set ｜ 为云主机设置或修改定时删除时间，如果为空，若云主机存在定时删除任务，则取消其定时删除任务。 支持的时间范围为当前时间+1小时至当前时间+10年。示例：&quot;2025-01-01 00:00:00&quot;
     *
     * @param autoReleaseTime
     */
    public ModifyInstanceReleaseTimeRequest autoReleaseTime(String autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }


    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public ModifyInstanceReleaseTimeRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to 需要更改定时删除信息的云主机id列表。

     *
     * @param instanceId
     */
    public void addInstanceId(String instanceId) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceId);
    }
}