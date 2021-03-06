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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;


/**
 * liveRecordConfig
 */
public class LiveRecordConfig  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 推流域名
     */
    private String publishDomain;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * 流名称
     */
    private String streamName;

    /**
     * recordConfig
     */
    private String recordConfig;


    /**
     * get 推流域名
     *
     * @return
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    /**
     * set 推流域名
     *
     * @param publishDomain
     */
    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    /**
     * get 应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * get 流名称
     *
     * @return
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * set 流名称
     *
     * @param streamName
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * get recordConfig
     *
     * @return
     */
    public String getRecordConfig() {
        return recordConfig;
    }

    /**
     * set recordConfig
     *
     * @param recordConfig
     */
    public void setRecordConfig(String recordConfig) {
        this.recordConfig = recordConfig;
    }


    /**
     * set 推流域名
     *
     * @param publishDomain
     */
    public LiveRecordConfig publishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public LiveRecordConfig appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 流名称
     *
     * @param streamName
     */
    public LiveRecordConfig streamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * set recordConfig
     *
     * @param recordConfig
     */
    public LiveRecordConfig recordConfig(String recordConfig) {
        this.recordConfig = recordConfig;
        return this;
    }


}