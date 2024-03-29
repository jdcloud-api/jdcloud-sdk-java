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
 * NodeGroup
 * 工作节点组相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kubernetes.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.kubernetes.model.NodeConfigSpec;
import com.jdcloud.sdk.service.kubernetes.model.CAConfigSpec;
import com.jdcloud.sdk.service.kubernetes.model.NodeGroupNetworkSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建工作节点组&lt;br&gt;
- 要求集群状态为running

 */
public class CreateNodeGroupRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 名称（同一用户的 cluster 内部唯一）
     * Required:true
     */
    @Required
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 工作节点所属的集群
     * Required:true
     */
    @Required
    private String clusterId;

    /**
     * 工作节点配置信息
     * Required:true
     */
    @Required
    private NodeConfigSpec nodeConfig;

    /**
     * 工作节点组的 az，必须为集群az的子集，默认为集群az
     */
    
    private List<String> azs;
    /**
     * 工作节点组初始化大小
     * Required:true
     */
    @Required
    private Integer initialNodeCount;

    /**
     * 自动伸缩配置
     */
    private CAConfigSpec caConfig;

    /**
     * 节点组的网络配置，如果集群的类型customized类型，则必须指定该参数，如果是auto，则不是必须
     */
    private NodeGroupNetworkSpec nodeGroupNetwork;

    /**
     * 地域 ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 名称（同一用户的 cluster 内部唯一）
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称（同一用户的 cluster 内部唯一）
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 工作节点所属的集群
     *
     * @return
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * set 工作节点所属的集群
     *
     * @param clusterId
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }


    /**
     * get 工作节点配置信息
     *
     * @return
     */
    public NodeConfigSpec getNodeConfig() {
        return nodeConfig;
    }

    /**
     * set 工作节点配置信息
     *
     * @param nodeConfig
     */
    public void setNodeConfig(NodeConfigSpec nodeConfig) {
        this.nodeConfig = nodeConfig;
    }


    /**
    * get 工作节点组的 az，必须为集群az的子集，默认为集群az
    *
    * @return
    */
    public List<String> getAzs() {
        return azs;
    }

    /**
    * set 工作节点组的 az，必须为集群az的子集，默认为集群az
    *
    * @param azs
    */
    public void setAzs(List<String> azs) {
        this.azs = azs;
    }


    /**
     * get 工作节点组初始化大小
     *
     * @return
     */
    public Integer getInitialNodeCount() {
        return initialNodeCount;
    }

    /**
     * set 工作节点组初始化大小
     *
     * @param initialNodeCount
     */
    public void setInitialNodeCount(Integer initialNodeCount) {
        this.initialNodeCount = initialNodeCount;
    }


    /**
     * get 自动伸缩配置
     *
     * @return
     */
    public CAConfigSpec getCaConfig() {
        return caConfig;
    }

    /**
     * set 自动伸缩配置
     *
     * @param caConfig
     */
    public void setCaConfig(CAConfigSpec caConfig) {
        this.caConfig = caConfig;
    }


    /**
     * get 节点组的网络配置，如果集群的类型customized类型，则必须指定该参数，如果是auto，则不是必须
     *
     * @return
     */
    public NodeGroupNetworkSpec getNodeGroupNetwork() {
        return nodeGroupNetwork;
    }

    /**
     * set 节点组的网络配置，如果集群的类型customized类型，则必须指定该参数，如果是auto，则不是必须
     *
     * @param nodeGroupNetwork
     */
    public void setNodeGroupNetwork(NodeGroupNetworkSpec nodeGroupNetwork) {
        this.nodeGroupNetwork = nodeGroupNetwork;
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
     * set 名称（同一用户的 cluster 内部唯一）
     *
     * @param name
     */
    public CreateNodeGroupRequest name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 描述
     *
     * @param description
     */
    public CreateNodeGroupRequest description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 工作节点所属的集群
     *
     * @param clusterId
     */
    public CreateNodeGroupRequest clusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }


    /**
     * set 工作节点配置信息
     *
     * @param nodeConfig
     */
    public CreateNodeGroupRequest nodeConfig(NodeConfigSpec nodeConfig) {
        this.nodeConfig = nodeConfig;
        return this;
    }


    /**
    * set 工作节点组的 az，必须为集群az的子集，默认为集群az
    *
    * @param azs
    */
    public CreateNodeGroupRequest azs(List<String> azs) {
        this.azs = azs;
        return this;
    }


    /**
     * set 工作节点组初始化大小
     *
     * @param initialNodeCount
     */
    public CreateNodeGroupRequest initialNodeCount(Integer initialNodeCount) {
        this.initialNodeCount = initialNodeCount;
        return this;
    }


    /**
     * set 自动伸缩配置
     *
     * @param caConfig
     */
    public CreateNodeGroupRequest caConfig(CAConfigSpec caConfig) {
        this.caConfig = caConfig;
        return this;
    }


    /**
     * set 节点组的网络配置，如果集群的类型customized类型，则必须指定该参数，如果是auto，则不是必须
     *
     * @param nodeGroupNetwork
     */
    public CreateNodeGroupRequest nodeGroupNetwork(NodeGroupNetworkSpec nodeGroupNetwork) {
        this.nodeGroupNetwork = nodeGroupNetwork;
        return this;
    }


    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public CreateNodeGroupRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to 工作节点组的 az，必须为集群az的子集，默认为集群az
     *
     * @param az
     */
    public void addAz(String az) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        this.azs.add(az);
    }
}