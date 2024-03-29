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


/**
 * 节点组的网络配置，如果集群的类型customized类型，则必须指定该参数，如果是auto，则不是必须
 */
public class NodeGroupNetworkSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * node所在子网id
     */
    private String subnetId;



    /**
     * get node所在子网id
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set node所在子网id
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }



    /**
     * set node所在子网id
     *
     * @param subnetId
     */
    public NodeGroupNetworkSpec subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }


}