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
 * 实例管理
 * 实例管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.clickhouse.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询 Clickhouse 推荐规格
 */
public class DescribeDefaultConfigRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 计算节点规格
     */
    private String chNodeClass;

    /**
     * 分片数
     */
    private Integer shardNum;

    /**
     * 副本数
     */
    private Integer replicaNum;

    /**
     * 地域代码
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 计算节点规格
     *
     * @return
     */
    public String getChNodeClass() {
        return chNodeClass;
    }

    /**
     * set 计算节点规格
     *
     * @param chNodeClass
     */
    public void setChNodeClass(String chNodeClass) {
        this.chNodeClass = chNodeClass;
    }

    /**
     * get 分片数
     *
     * @return
     */
    public Integer getShardNum() {
        return shardNum;
    }

    /**
     * set 分片数
     *
     * @param shardNum
     */
    public void setShardNum(Integer shardNum) {
        this.shardNum = shardNum;
    }

    /**
     * get 副本数
     *
     * @return
     */
    public Integer getReplicaNum() {
        return replicaNum;
    }

    /**
     * set 副本数
     *
     * @param replicaNum
     */
    public void setReplicaNum(Integer replicaNum) {
        this.replicaNum = replicaNum;
    }

    /**
     * get 地域代码
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 计算节点规格
     *
     * @param chNodeClass
     */
    public DescribeDefaultConfigRequest chNodeClass(String chNodeClass) {
        this.chNodeClass = chNodeClass;
        return this;
    }

    /**
     * set 分片数
     *
     * @param shardNum
     */
    public DescribeDefaultConfigRequest shardNum(Integer shardNum) {
        this.shardNum = shardNum;
        return this;
    }

    /**
     * set 副本数
     *
     * @param replicaNum
     */
    public DescribeDefaultConfigRequest replicaNum(Integer replicaNum) {
        this.replicaNum = replicaNum;
        return this;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public DescribeDefaultConfigRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}