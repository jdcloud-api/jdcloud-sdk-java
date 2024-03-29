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
 * 集群自动伸缩参数：&lt;br&gt;

 */
public class CAConfig  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否启用了自动伸缩

     */
    private Boolean enable;

    /**
     * 自动扩容最大工作节点数
     */
    private Integer maxNode;

    /**
     * 自动扩容最小工作节点数
     */
    private Integer minNode;



    /**
     * get 是否启用了自动伸缩

     *
     * @return
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * set 是否启用了自动伸缩

     *
     * @param enable
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }


    /**
     * get 自动扩容最大工作节点数
     *
     * @return
     */
    public Integer getMaxNode() {
        return maxNode;
    }

    /**
     * set 自动扩容最大工作节点数
     *
     * @param maxNode
     */
    public void setMaxNode(Integer maxNode) {
        this.maxNode = maxNode;
    }


    /**
     * get 自动扩容最小工作节点数
     *
     * @return
     */
    public Integer getMinNode() {
        return minNode;
    }

    /**
     * set 自动扩容最小工作节点数
     *
     * @param minNode
     */
    public void setMinNode(Integer minNode) {
        this.minNode = minNode;
    }



    /**
     * set 是否启用了自动伸缩

     *
     * @param enable
     */
    public CAConfig enable(Boolean enable) {
        this.enable = enable;
        return this;
    }


    /**
     * set 自动扩容最大工作节点数
     *
     * @param maxNode
     */
    public CAConfig maxNode(Integer maxNode) {
        this.maxNode = maxNode;
        return this;
    }


    /**
     * set 自动扩容最小工作节点数
     *
     * @param minNode
     */
    public CAConfig minNode(Integer minNode) {
        this.minNode = minNode;
        return this;
    }


}