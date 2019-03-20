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
 * Cluster
 * 集群相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kubernetes.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设置用户自定义监控状态
 */
public class SetUserMetricsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否开启自定义监控
     */
    private Boolean enabled;

    /**
     * 地域 ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 集群 ID
     * Required:true
     */
    @Required
    private String clusterId;


    /**
     * get 是否开启自定义监控
     *
     * @return
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * set 是否开启自定义监控
     *
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * get 地域 ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 集群 ID
     *
     * @return
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * set 集群 ID
     *
     * @param clusterId
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }


    /**
     * set 是否开启自定义监控
     *
     * @param enabled
     */
    public SetUserMetricsRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public SetUserMetricsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 集群 ID
     *
     * @param clusterId
     */
    public SetUserMetricsRequest clusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }


}