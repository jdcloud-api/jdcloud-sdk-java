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
 * 原生容器
 * 原生容器相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.nativecontainer.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询单个容器日志

 */
public class GetLogsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 返回日志文件中倒数 tailLines 行，如不指定，默认从容器启动时或 sinceSeconds 指定的时间读取。

     */
    private Integer tailLines;

    /**
     * 返回相对于当前时间之前sinceSeconds之内的日志。

     */
    private Integer sinceSeconds;

    /**
     * 限制返回的日志文件内容字节数，取值范围 [1-4]KB，最大 4KB.

     */
    private Integer limitBytes;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Container ID
     * Required:true
     */
    @Required
    private String containerId;



    /**
     * get 返回日志文件中倒数 tailLines 行，如不指定，默认从容器启动时或 sinceSeconds 指定的时间读取。

     *
     * @return
     */
    public Integer getTailLines() {
        return tailLines;
    }

    /**
     * set 返回日志文件中倒数 tailLines 行，如不指定，默认从容器启动时或 sinceSeconds 指定的时间读取。

     *
     * @param tailLines
     */
    public void setTailLines(Integer tailLines) {
        this.tailLines = tailLines;
    }


    /**
     * get 返回相对于当前时间之前sinceSeconds之内的日志。

     *
     * @return
     */
    public Integer getSinceSeconds() {
        return sinceSeconds;
    }

    /**
     * set 返回相对于当前时间之前sinceSeconds之内的日志。

     *
     * @param sinceSeconds
     */
    public void setSinceSeconds(Integer sinceSeconds) {
        this.sinceSeconds = sinceSeconds;
    }


    /**
     * get 限制返回的日志文件内容字节数，取值范围 [1-4]KB，最大 4KB.

     *
     * @return
     */
    public Integer getLimitBytes() {
        return limitBytes;
    }

    /**
     * set 限制返回的日志文件内容字节数，取值范围 [1-4]KB，最大 4KB.

     *
     * @param limitBytes
     */
    public void setLimitBytes(Integer limitBytes) {
        this.limitBytes = limitBytes;
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
     * get Container ID
     *
     * @return
     */
    public String getContainerId() {
        return containerId;
    }

    /**
     * set Container ID
     *
     * @param containerId
     */
    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }



    /**
     * set 返回日志文件中倒数 tailLines 行，如不指定，默认从容器启动时或 sinceSeconds 指定的时间读取。

     *
     * @param tailLines
     */
    public GetLogsRequest tailLines(Integer tailLines) {
        this.tailLines = tailLines;
        return this;
    }


    /**
     * set 返回相对于当前时间之前sinceSeconds之内的日志。

     *
     * @param sinceSeconds
     */
    public GetLogsRequest sinceSeconds(Integer sinceSeconds) {
        this.sinceSeconds = sinceSeconds;
        return this;
    }


    /**
     * set 限制返回的日志文件内容字节数，取值范围 [1-4]KB，最大 4KB.

     *
     * @param limitBytes
     */
    public GetLogsRequest limitBytes(Integer limitBytes) {
        this.limitBytes = limitBytes;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public GetLogsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set Container ID
     *
     * @param containerId
     */
    public GetLogsRequest containerId(String containerId) {
        this.containerId = containerId;
        return this;
    }


}