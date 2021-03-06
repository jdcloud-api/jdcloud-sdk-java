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
 * 应用管理平台API (仅对授权用户使用)
 * 应用管理平台API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ams.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取收流基础数据查询
 */
public class DescribeStreamsInputRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 起始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 流ID
     * Required:true
     */
    @Required
    private String streamId;


    /**
     * get 起始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 起始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 结束时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 流ID
     *
     * @return
     */
    public String getStreamId() {
        return streamId;
    }

    /**
     * set 流ID
     *
     * @param streamId
     */
    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }


    /**
     * set 起始时间
     *
     * @param startTime
     */
    public DescribeStreamsInputRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 结束时间
     *
     * @param endTime
     */
    public DescribeStreamsInputRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 流ID
     *
     * @param streamId
     */
    public DescribeStreamsInputRequest streamId(String streamId) {
        this.streamId = streamId;
        return this;
    }


}