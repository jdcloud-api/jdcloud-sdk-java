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
 * Data-Replication
 * TiCDC复制管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.tidb.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改复制任务
 */
public class ModifyReplicationRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 复制任务ID
     * Required:true
     */
    @Required
    private String taskId;

    /**
     * 目标实例备注说明
     */
    private String targetComment;

    /**
     * 目标类型为TiDB或MySQL时，连接目标实例的用户名
     */
    private String targetUser;

    /**
     * 目标类型为TiDB或MySQL时，连接目标实例的密码
     */
    private String targetPassword;

    /**
     * Kafka的Topic
     */
    private String kafkaTopic;

    /**
     * Kafka的版本
     */
    private String kafkaVersion;

    /**
     * 地域代码
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例ID
     * Required:true
     */
    @Required
    private String instanceId;



    /**
     * get 复制任务ID
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 复制任务ID
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }


    /**
     * get 目标实例备注说明
     *
     * @return
     */
    public String getTargetComment() {
        return targetComment;
    }

    /**
     * set 目标实例备注说明
     *
     * @param targetComment
     */
    public void setTargetComment(String targetComment) {
        this.targetComment = targetComment;
    }


    /**
     * get 目标类型为TiDB或MySQL时，连接目标实例的用户名
     *
     * @return
     */
    public String getTargetUser() {
        return targetUser;
    }

    /**
     * set 目标类型为TiDB或MySQL时，连接目标实例的用户名
     *
     * @param targetUser
     */
    public void setTargetUser(String targetUser) {
        this.targetUser = targetUser;
    }


    /**
     * get 目标类型为TiDB或MySQL时，连接目标实例的密码
     *
     * @return
     */
    public String getTargetPassword() {
        return targetPassword;
    }

    /**
     * set 目标类型为TiDB或MySQL时，连接目标实例的密码
     *
     * @param targetPassword
     */
    public void setTargetPassword(String targetPassword) {
        this.targetPassword = targetPassword;
    }


    /**
     * get Kafka的Topic
     *
     * @return
     */
    public String getKafkaTopic() {
        return kafkaTopic;
    }

    /**
     * set Kafka的Topic
     *
     * @param kafkaTopic
     */
    public void setKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
    }


    /**
     * get Kafka的版本
     *
     * @return
     */
    public String getKafkaVersion() {
        return kafkaVersion;
    }

    /**
     * set Kafka的版本
     *
     * @param kafkaVersion
     */
    public void setKafkaVersion(String kafkaVersion) {
        this.kafkaVersion = kafkaVersion;
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
     * get 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }



    /**
     * set 复制任务ID
     *
     * @param taskId
     */
    public ModifyReplicationRequest taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }


    /**
     * set 目标实例备注说明
     *
     * @param targetComment
     */
    public ModifyReplicationRequest targetComment(String targetComment) {
        this.targetComment = targetComment;
        return this;
    }


    /**
     * set 目标类型为TiDB或MySQL时，连接目标实例的用户名
     *
     * @param targetUser
     */
    public ModifyReplicationRequest targetUser(String targetUser) {
        this.targetUser = targetUser;
        return this;
    }


    /**
     * set 目标类型为TiDB或MySQL时，连接目标实例的密码
     *
     * @param targetPassword
     */
    public ModifyReplicationRequest targetPassword(String targetPassword) {
        this.targetPassword = targetPassword;
        return this;
    }


    /**
     * set Kafka的Topic
     *
     * @param kafkaTopic
     */
    public ModifyReplicationRequest kafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
        return this;
    }


    /**
     * set Kafka的版本
     *
     * @param kafkaVersion
     */
    public ModifyReplicationRequest kafkaVersion(String kafkaVersion) {
        this.kafkaVersion = kafkaVersion;
        return this;
    }


    /**
     * set 地域代码
     *
     * @param regionId
     */
    public ModifyReplicationRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public ModifyReplicationRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}