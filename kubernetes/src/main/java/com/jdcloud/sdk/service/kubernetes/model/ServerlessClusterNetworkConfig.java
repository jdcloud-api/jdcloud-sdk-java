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
public class ServerlessClusterNetworkConfig  implements java.io.Serializable {

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
     * 集群lb子网信息
     */
    
    private List<ClusterNetworkSubnet> lbSubnets;
    /**
     * nat网关配置
     */
    
    private List<NatGateway> natGateways;


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
    * get 集群lb子网信息
    *
    * @return
    */
    public List<ClusterNetworkSubnet> getLbSubnets() {
        return lbSubnets;
    }

    /**
    * set 集群lb子网信息
    *
    * @param lbSubnets
    */
    public void setLbSubnets(List<ClusterNetworkSubnet> lbSubnets) {
        this.lbSubnets = lbSubnets;
    }


    /**
    * get nat网关配置
    *
    * @return
    */
    public List<NatGateway> getNatGateways() {
        return natGateways;
    }

    /**
    * set nat网关配置
    *
    * @param natGateways
    */
    public void setNatGateways(List<NatGateway> natGateways) {
        this.natGateways = natGateways;
    }



    /**
     * set kube-apiserver是否可公网访问，false则kube-apiserver不绑定公网地址，true绑定公网地址
     *
     * @param publicApiServer
     */
    public ServerlessClusterNetworkConfig publicApiServer(Boolean publicApiServer) {
        this.publicApiServer = publicApiServer;
        return this;
    }


    /**
     * set master网络的cidr
     *
     * @param masterCidr
     */
    public ServerlessClusterNetworkConfig masterCidr(String masterCidr) {
        this.masterCidr = masterCidr;
        return this;
    }


    /**
     * set service网络的cidr
     *
     * @param serviceCidr
     */
    public ServerlessClusterNetworkConfig serviceCidr(String serviceCidr) {
        this.serviceCidr = serviceCidr;
        return this;
    }


    /**
     * set 用户侧承载node和pod的vpc id
     *
     * @param vpcId
     */
    public ServerlessClusterNetworkConfig vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }


    /**
    * set 集群Pod子网信息
    *
    * @param podSubnets
    */
    public ServerlessClusterNetworkConfig podSubnets(List<ClusterNetworkPodSubnet> podSubnets) {
        this.podSubnets = podSubnets;
        return this;
    }


    /**
    * set 集群lb子网信息
    *
    * @param lbSubnets
    */
    public ServerlessClusterNetworkConfig lbSubnets(List<ClusterNetworkSubnet> lbSubnets) {
        this.lbSubnets = lbSubnets;
        return this;
    }


    /**
    * set nat网关配置
    *
    * @param natGateways
    */
    public ServerlessClusterNetworkConfig natGateways(List<NatGateway> natGateways) {
        this.natGateways = natGateways;
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
     * add item to 集群lb子网信息
     *
     * @param lbSubnet
     */
    public void addLbSubnet(ClusterNetworkSubnet lbSubnet) {
        if (this.lbSubnets == null) {
            this.lbSubnets = new ArrayList<>();
        }
        this.lbSubnets.add(lbSubnet);
    }

    /**
     * add item to nat网关配置
     *
     * @param natGateway
     */
    public void addNatGateway(NatGateway natGateway) {
        if (this.natGateways == null) {
            this.natGateways = new ArrayList<>();
        }
        this.natGateways.add(natGateway);
    }
}