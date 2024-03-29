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
import com.jdcloud.sdk.annotation.Required;

/**
 * 创建集群请求参数模型
 */
public class ClusterSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 名称（同一用户的 cluster 允许重名）
     * Required:true
     */
    @Required
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 默认开启 basicAuth与clientCertificate最少选择一个
     */
    private Boolean basicAuth;

    /**
     * 默认开启 basicAuth与clientCertificate最少选择一个
     */
    private Boolean clientCertificate;

    /**
     * kubernetes的版本,默认1.8
     */
    private String version;

    /**
     * 集群所在的az
     * Required:true
     */
    @Required
    
    private List<String> azs;
    /**
     * 实例组
     */
    private NodeGroupSpec nodeGroup;

    /**
     * k8s的master的cidr
     * Required:true
     */
    @Required
    private String masterCIDR;

    /**
     * 用户的AccessKey，插件调用open-api时的认证凭证
     * Required:true
     */
    @Required
    private String accessKey;

    /**
     * 用户的SecretKey，插件调用open-api时的认证凭证
     * Required:true
     */
    @Required
    private String secretKey;



    /**
     * get 名称（同一用户的 cluster 允许重名）
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称（同一用户的 cluster 允许重名）
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
     * get 默认开启 basicAuth与clientCertificate最少选择一个
     *
     * @return
     */
    public Boolean getBasicAuth() {
        return basicAuth;
    }

    /**
     * set 默认开启 basicAuth与clientCertificate最少选择一个
     *
     * @param basicAuth
     */
    public void setBasicAuth(Boolean basicAuth) {
        this.basicAuth = basicAuth;
    }


    /**
     * get 默认开启 basicAuth与clientCertificate最少选择一个
     *
     * @return
     */
    public Boolean getClientCertificate() {
        return clientCertificate;
    }

    /**
     * set 默认开启 basicAuth与clientCertificate最少选择一个
     *
     * @param clientCertificate
     */
    public void setClientCertificate(Boolean clientCertificate) {
        this.clientCertificate = clientCertificate;
    }


    /**
     * get kubernetes的版本,默认1.8
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * set kubernetes的版本,默认1.8
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }


    /**
    * get 集群所在的az
    *
    * @return
    */
    public List<String> getAzs() {
        return azs;
    }

    /**
    * set 集群所在的az
    *
    * @param azs
    */
    public void setAzs(List<String> azs) {
        this.azs = azs;
    }


    /**
     * get 实例组
     *
     * @return
     */
    public NodeGroupSpec getNodeGroup() {
        return nodeGroup;
    }

    /**
     * set 实例组
     *
     * @param nodeGroup
     */
    public void setNodeGroup(NodeGroupSpec nodeGroup) {
        this.nodeGroup = nodeGroup;
    }


    /**
     * get k8s的master的cidr
     *
     * @return
     */
    public String getMasterCIDR() {
        return masterCIDR;
    }

    /**
     * set k8s的master的cidr
     *
     * @param masterCIDR
     */
    public void setMasterCIDR(String masterCIDR) {
        this.masterCIDR = masterCIDR;
    }


    /**
     * get 用户的AccessKey，插件调用open-api时的认证凭证
     *
     * @return
     */
    public String getAccessKey() {
        return accessKey;
    }

    /**
     * set 用户的AccessKey，插件调用open-api时的认证凭证
     *
     * @param accessKey
     */
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }


    /**
     * get 用户的SecretKey，插件调用open-api时的认证凭证
     *
     * @return
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * set 用户的SecretKey，插件调用open-api时的认证凭证
     *
     * @param secretKey
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }



    /**
     * set 名称（同一用户的 cluster 允许重名）
     *
     * @param name
     */
    public ClusterSpec name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 描述
     *
     * @param description
     */
    public ClusterSpec description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 默认开启 basicAuth与clientCertificate最少选择一个
     *
     * @param basicAuth
     */
    public ClusterSpec basicAuth(Boolean basicAuth) {
        this.basicAuth = basicAuth;
        return this;
    }


    /**
     * set 默认开启 basicAuth与clientCertificate最少选择一个
     *
     * @param clientCertificate
     */
    public ClusterSpec clientCertificate(Boolean clientCertificate) {
        this.clientCertificate = clientCertificate;
        return this;
    }


    /**
     * set kubernetes的版本,默认1.8
     *
     * @param version
     */
    public ClusterSpec version(String version) {
        this.version = version;
        return this;
    }


    /**
    * set 集群所在的az
    *
    * @param azs
    */
    public ClusterSpec azs(List<String> azs) {
        this.azs = azs;
        return this;
    }


    /**
     * set 实例组
     *
     * @param nodeGroup
     */
    public ClusterSpec nodeGroup(NodeGroupSpec nodeGroup) {
        this.nodeGroup = nodeGroup;
        return this;
    }


    /**
     * set k8s的master的cidr
     *
     * @param masterCIDR
     */
    public ClusterSpec masterCIDR(String masterCIDR) {
        this.masterCIDR = masterCIDR;
        return this;
    }


    /**
     * set 用户的AccessKey，插件调用open-api时的认证凭证
     *
     * @param accessKey
     */
    public ClusterSpec accessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }


    /**
     * set 用户的SecretKey，插件调用open-api时的认证凭证
     *
     * @param secretKey
     */
    public ClusterSpec secretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }



    /**
     * add item to 集群所在的az
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