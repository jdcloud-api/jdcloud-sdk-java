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
 * k8s watch Heartbeat APIs
 * K8s watch心跳接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.logs.model;

import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * k8s watch heartbeat
 */
public class K8sWatchHeartbeatRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 集群
     */
    private String cluster;

    /**
     * 设备id
     */
    private String devId;

    /**
     * 公有云集群标识
     */
    private Boolean cloud;

    /**
     * node数量
     */
    private Integer nodeCount;

    /**
     * 容器数量
     */
    private Integer containerCount;

    /**
     * 最新容器变化时间
     */
    private Long latestPodChangeTime;



    /**
     * get 集群
     *
     * @return
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * set 集群
     *
     * @param cluster
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }


    /**
     * get 设备id
     *
     * @return
     */
    public String getDevId() {
        return devId;
    }

    /**
     * set 设备id
     *
     * @param devId
     */
    public void setDevId(String devId) {
        this.devId = devId;
    }


    /**
     * get 公有云集群标识
     *
     * @return
     */
    public Boolean getCloud() {
        return cloud;
    }

    /**
     * set 公有云集群标识
     *
     * @param cloud
     */
    public void setCloud(Boolean cloud) {
        this.cloud = cloud;
    }


    /**
     * get node数量
     *
     * @return
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    /**
     * set node数量
     *
     * @param nodeCount
     */
    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }


    /**
     * get 容器数量
     *
     * @return
     */
    public Integer getContainerCount() {
        return containerCount;
    }

    /**
     * set 容器数量
     *
     * @param containerCount
     */
    public void setContainerCount(Integer containerCount) {
        this.containerCount = containerCount;
    }


    /**
     * get 最新容器变化时间
     *
     * @return
     */
    public Long getLatestPodChangeTime() {
        return latestPodChangeTime;
    }

    /**
     * set 最新容器变化时间
     *
     * @param latestPodChangeTime
     */
    public void setLatestPodChangeTime(Long latestPodChangeTime) {
        this.latestPodChangeTime = latestPodChangeTime;
    }



    /**
     * set 集群
     *
     * @param cluster
     */
    public K8sWatchHeartbeatRequest cluster(String cluster) {
        this.cluster = cluster;
        return this;
    }


    /**
     * set 设备id
     *
     * @param devId
     */
    public K8sWatchHeartbeatRequest devId(String devId) {
        this.devId = devId;
        return this;
    }


    /**
     * set 公有云集群标识
     *
     * @param cloud
     */
    public K8sWatchHeartbeatRequest cloud(Boolean cloud) {
        this.cloud = cloud;
        return this;
    }


    /**
     * set node数量
     *
     * @param nodeCount
     */
    public K8sWatchHeartbeatRequest nodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }


    /**
     * set 容器数量
     *
     * @param containerCount
     */
    public K8sWatchHeartbeatRequest containerCount(Integer containerCount) {
        this.containerCount = containerCount;
        return this;
    }


    /**
     * set 最新容器变化时间
     *
     * @param latestPodChangeTime
     */
    public K8sWatchHeartbeatRequest latestPodChangeTime(Long latestPodChangeTime) {
        this.latestPodChangeTime = latestPodChangeTime;
        return this;
    }


}