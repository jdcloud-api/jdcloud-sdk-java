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

package com.jdcloud.sdk.service.kubernetes.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 集群的网络配置参数
 */
public class ClusterNetwork  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * kube-apiserver是否可公网访问，false则kube-apiserver不绑定公网地址，true绑定公网地址
     */
    private Boolean publicApiServer;

    /**
     * master网络的cidr
     */
    private String masterCidr;

    /**
     * service网络的cidr
     */
    private String serviceCidr;

    /**
     * 用户侧承载node和pod的vpc id
     */
    private String vpcId;

    /**
     * 集群Pod子网信息
     */
    
    private List<ClusterNetworkPodSubnet> podSubnets;
    /**
     * 集群子网信息
     */
    
    private List<ClusterNetworkSubnet> clusterSubnets;
    /**
     * nat网关配置
     */
    
    private List<NatGateway> natGateway;
    /**
     * 节点公网IP的配置，如果设置了节点公网IP，此项不为空
     */
    private NodeElasticIpSpec nodeElasticIpSpec;



    /**
     * get kube-apiserver是否可公网访问，false则kube-apiserver不绑定公网地址，true绑定公网地址
     *
     * @return
     */
    public Boolean getPublicApiServer() {
        return publicApiServer;
    }

    /**
     * set kube-apiserver是否可公网访问，false则kube-apiserver不绑定公网地址，true绑定公网地址
     *
     * @param publicApiServer
     */
    public void setPublicApiServer(Boolean publicApiServer) {
        this.publicApiServer = publicApiServer;
    }


    /**
     * get master网络的cidr
     *
     * @return
     */
    public String getMasterCidr() {
        return masterCidr;
    }

    /**
     * set master网络的cidr
     *
     * @param masterCidr
     */
    public void setMasterCidr(String masterCidr) {
        this.masterCidr = masterCidr;
    }


    /**
     * get service网络的cidr
     *
     * @return
     */
    public String getServiceCidr() {
        return serviceCidr;
    }

    /**
     * set service网络的cidr
     *
     * @param serviceCidr
     */
    public void setServiceCidr(String serviceCidr) {
        this.serviceCidr = serviceCidr;
    }


    /**
     * get 用户侧承载node和pod的vpc id
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 用户侧承载node和pod的vpc id
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }


    /**
    * get 集群Pod子网信息
    *
    * @return
    */
    public List<ClusterNetworkPodSubnet> getPodSubnets() {
        return podSubnets;
    }

    /**
    * set 集群Pod子网信息
    *
    * @param podSubnets
    */
    public void setPodSubnets(List<ClusterNetworkPodSubnet> podSubnets) {
        this.podSubnets = podSubnets;
    }


    /**
    * get 集群子网信息
    *
    * @return
    */
    public List<ClusterNetworkSubnet> getClusterSubnets() {
        return clusterSubnets;
    }

    /**
    * set 集群子网信息
    *
    * @param clusterSubnets
    */
    public void setClusterSubnets(List<ClusterNetworkSubnet> clusterSubnets) {
        this.clusterSubnets = clusterSubnets;
    }


    /**
    * get nat网关配置
    *
    * @return
    */
    public List<NatGateway> getNatGateway() {
        return natGateway;
    }

    /**
    * set nat网关配置
    *
    * @param natGateway
    */
    public void setNatGateway(List<NatGateway> natGateway) {
        this.natGateway = natGateway;
    }


    /**
     * get 节点公网IP的配置，如果设置了节点公网IP，此项不为空
     *
     * @return
     */
    public NodeElasticIpSpec getNodeElasticIpSpec() {
        return nodeElasticIpSpec;
    }

    /**
     * set 节点公网IP的配置，如果设置了节点公网IP，此项不为空
     *
     * @param nodeElasticIpSpec
     */
    public void setNodeElasticIpSpec(NodeElasticIpSpec nodeElasticIpSpec) {
        this.nodeElasticIpSpec = nodeElasticIpSpec;
    }



    /**
     * set kube-apiserver是否可公网访问，false则kube-apiserver不绑定公网地址，true绑定公网地址
     *
     * @param publicApiServer
     */
    public ClusterNetwork publicApiServer(Boolean publicApiServer) {
        this.publicApiServer = publicApiServer;
        return this;
    }


    /**
     * set master网络的cidr
     *
     * @param masterCidr
     */
    public ClusterNetwork masterCidr(String masterCidr) {
        this.masterCidr = masterCidr;
        return this;
    }


    /**
     * set service网络的cidr
     *
     * @param serviceCidr
     */
    public ClusterNetwork serviceCidr(String serviceCidr) {
        this.serviceCidr = serviceCidr;
        return this;
    }


    /**
     * set 用户侧承载node和pod的vpc id
     *
     * @param vpcId
     */
    public ClusterNetwork vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }


    /**
    * set 集群Pod子网信息
    *
    * @param podSubnets
    */
    public ClusterNetwork podSubnets(List<ClusterNetworkPodSubnet> podSubnets) {
        this.podSubnets = podSubnets;
        return this;
    }


    /**
    * set 集群子网信息
    *
    * @param clusterSubnets
    */
    public ClusterNetwork clusterSubnets(List<ClusterNetworkSubnet> clusterSubnets) {
        this.clusterSubnets = clusterSubnets;
        return this;
    }


    /**
    * set nat网关配置
    *
    * @param natGateway
    */
    public ClusterNetwork natGateway(List<NatGateway> natGateway) {
        this.natGateway = natGateway;
        return this;
    }


    /**
     * set 节点公网IP的配置，如果设置了节点公网IP，此项不为空
     *
     * @param nodeElasticIpSpec
     */
    public ClusterNetwork nodeElasticIpSpec(NodeElasticIpSpec nodeElasticIpSpec) {
        this.nodeElasticIpSpec = nodeElasticIpSpec;
        return this;
    }



    /**
     * add item to 集群Pod子网信息
     *
     * @param podSubnet
     */
    public void addPodSubnet(ClusterNetworkPodSubnet podSubnet) {
        if (this.podSubnets == null) {
            this.podSubnets = new ArrayList<>();
        }
        this.podSubnets.add(podSubnet);
    }

    /**
     * add item to 集群子网信息
     *
     * @param clusterSubnet
     */
    public void addClusterSubnet(ClusterNetworkSubnet clusterSubnet) {
        if (this.clusterSubnets == null) {
            this.clusterSubnets = new ArrayList<>();
        }
        this.clusterSubnets.add(clusterSubnet);
    }

    /**
     * add item to nat网关配置
     *
     * @param natGateway
     */
    public void addNatGateway(NatGateway natGateway) {
        if (this.natGateway == null) {
            this.natGateway = new ArrayList<>();
        }
        this.natGateway.add(natGateway);
    }
}