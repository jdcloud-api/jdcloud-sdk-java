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

package com.jdcloud.sdk.service.vpc.model;

import java.util.List;
import java.util.ArrayList;

/**
 * networkAcl
 */
public class NetworkAcl  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * networkAcl ID
     */
    private String networkAclId;

    /**
     * networkAcl名称
     */
    private String networkAclName;

    /**
     * 私有网络 ID
     */
    private String vpcId;

    /**
     * networkAcl规则列表
     */
    
    private List<NetworkAclRule> networkAclRules;
    /**
     * networkAcl绑定的子网列表
     */
    
    private List<String> subnetIds;
    /**
     * 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     */
    private String description;

    /**
     * networkAcl创建时间
     */
    private String createdTime;



    /**
     * get networkAcl ID
     *
     * @return
     */
    public String getNetworkAclId() {
        return networkAclId;
    }

    /**
     * set networkAcl ID
     *
     * @param networkAclId
     */
    public void setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }


    /**
     * get networkAcl名称
     *
     * @return
     */
    public String getNetworkAclName() {
        return networkAclName;
    }

    /**
     * set networkAcl名称
     *
     * @param networkAclName
     */
    public void setNetworkAclName(String networkAclName) {
        this.networkAclName = networkAclName;
    }


    /**
     * get 私有网络 ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 私有网络 ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }


    /**
    * get networkAcl规则列表
    *
    * @return
    */
    public List<NetworkAclRule> getNetworkAclRules() {
        return networkAclRules;
    }

    /**
    * set networkAcl规则列表
    *
    * @param networkAclRules
    */
    public void setNetworkAclRules(List<NetworkAclRule> networkAclRules) {
        this.networkAclRules = networkAclRules;
    }


    /**
    * get networkAcl绑定的子网列表
    *
    * @return
    */
    public List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
    * set networkAcl绑定的子网列表
    *
    * @param subnetIds
    */
    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }


    /**
     * get 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get networkAcl创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set networkAcl创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }



    /**
     * set networkAcl ID
     *
     * @param networkAclId
     */
    public NetworkAcl networkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }


    /**
     * set networkAcl名称
     *
     * @param networkAclName
     */
    public NetworkAcl networkAclName(String networkAclName) {
        this.networkAclName = networkAclName;
        return this;
    }


    /**
     * set 私有网络 ID
     *
     * @param vpcId
     */
    public NetworkAcl vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }


    /**
    * set networkAcl规则列表
    *
    * @param networkAclRules
    */
    public NetworkAcl networkAclRules(List<NetworkAclRule> networkAclRules) {
        this.networkAclRules = networkAclRules;
        return this;
    }


    /**
    * set networkAcl绑定的子网列表
    *
    * @param subnetIds
    */
    public NetworkAcl subnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }


    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public NetworkAcl description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set networkAcl创建时间
     *
     * @param createdTime
     */
    public NetworkAcl createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }



    /**
     * add item to networkAcl规则列表
     *
     * @param networkAclRule
     */
    public void addNetworkAclRule(NetworkAclRule networkAclRule) {
        if (this.networkAclRules == null) {
            this.networkAclRules = new ArrayList<>();
        }
        this.networkAclRules.add(networkAclRule);
    }

    /**
     * add item to networkAcl绑定的子网列表
     *
     * @param subnetId
     */
    public void addSubnetId(String subnetId) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        this.subnetIds.add(subnetId);
    }
}