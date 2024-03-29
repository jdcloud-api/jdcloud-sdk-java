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
 * 视频检测相关接口
 * API related to video scan
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.censor.model;

import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 视频检测结果获取接口，获取离线处理的数据后，下次调用，不会再次返回之前获取过的离线数据。小于10s/20次，请求频率过快服务器会拒绝处理
 */
public class VideoCallbackV2Request extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 业务bizType，请联系客户经理获取
     */
    private String bizType;

    /**
     * 接口版本v1
     */
    private String version;


    /**
     * get 业务bizType，请联系客户经理获取
     *
     * @return
     */
    public String getBizType() {
        return bizType;
    }

    /**
     * set 业务bizType，请联系客户经理获取
     *
     * @param bizType
     */
    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    /**
     * get 接口版本v1
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * set 接口版本v1
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }


    /**
     * set 业务bizType，请联系客户经理获取
     *
     * @param bizType
     */
    public VideoCallbackV2Request bizType(String bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * set 接口版本v1
     *
     * @param version
     */
    public VideoCallbackV2Request version(String version) {
        this.version = version;
        return this;
    }


}