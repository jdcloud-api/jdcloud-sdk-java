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

package com.jdcloud.sdk.service.jmr.model;


/**
 * jmrJobViewModel
 */
public class JmrJobViewModel  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * null
     */
    private Integer id;

    /**
     * 作业ID
     */
    private String jobId;

    /**
     * 作业名称
     */
    private String jobName;

    /**
     * 作业类型
     */
    private String jobType;

    /**
     * 作业状态
     */
    private String jobStatus;

    /**
     * 作业组
     */
    private String jobGroup;

    /**
     * 作业触发器
     */
    private String jobTrigger;

    /**
     * 定时任务的时间
     */
    private String cronExpression;

    /**
     * 额外字段，可选
     */
    private String orderBy;

    /**
     * isSelfDependence
     */
    private Integer isSelfDependence;

    /**
     * isVirtualTask
     */
    private Integer isVirtualTask;

    /**
     * taskScheduleType
     */
    private Integer taskScheduleType;

    /**
     * 作业重试次数
     */
    private Integer retryTimes;

    /**
     * 作业失败后是否发送短信通知
     */
    private Boolean isSendMsg;

    /**
     * 用户名
     */
    private String userpin;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 位置
     */
    private String location;

    /**
     * 所需参数
     */
    private String params;

    /**
     * 数据中心
     */
    private String dataCenter;

    /**
     * 集群ID
     */
    private String clusterId;

    /**
     * 集群名称
     */
    private String clusterName;

    /**
     * 额外字段
     */
    private String clusterStatus;


    /**
     * get null
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set null
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 作业ID
     *
     * @return
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * set 作业ID
     *
     * @param jobId
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * get 作业名称
     *
     * @return
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * set 作业名称
     *
     * @param jobName
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * get 作业类型
     *
     * @return
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * set 作业类型
     *
     * @param jobType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * get 作业状态
     *
     * @return
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * set 作业状态
     *
     * @param jobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * get 作业组
     *
     * @return
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * set 作业组
     *
     * @param jobGroup
     */
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    /**
     * get 作业触发器
     *
     * @return
     */
    public String getJobTrigger() {
        return jobTrigger;
    }

    /**
     * set 作业触发器
     *
     * @param jobTrigger
     */
    public void setJobTrigger(String jobTrigger) {
        this.jobTrigger = jobTrigger;
    }

    /**
     * get 定时任务的时间
     *
     * @return
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * set 定时任务的时间
     *
     * @param cronExpression
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    /**
     * get 额外字段，可选
     *
     * @return
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * set 额外字段，可选
     *
     * @param orderBy
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * get isSelfDependence
     *
     * @return
     */
    public Integer getIsSelfDependence() {
        return isSelfDependence;
    }

    /**
     * set isSelfDependence
     *
     * @param isSelfDependence
     */
    public void setIsSelfDependence(Integer isSelfDependence) {
        this.isSelfDependence = isSelfDependence;
    }

    /**
     * get isVirtualTask
     *
     * @return
     */
    public Integer getIsVirtualTask() {
        return isVirtualTask;
    }

    /**
     * set isVirtualTask
     *
     * @param isVirtualTask
     */
    public void setIsVirtualTask(Integer isVirtualTask) {
        this.isVirtualTask = isVirtualTask;
    }

    /**
     * get taskScheduleType
     *
     * @return
     */
    public Integer getTaskScheduleType() {
        return taskScheduleType;
    }

    /**
     * set taskScheduleType
     *
     * @param taskScheduleType
     */
    public void setTaskScheduleType(Integer taskScheduleType) {
        this.taskScheduleType = taskScheduleType;
    }

    /**
     * get 作业重试次数
     *
     * @return
     */
    public Integer getRetryTimes() {
        return retryTimes;
    }

    /**
     * set 作业重试次数
     *
     * @param retryTimes
     */
    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    /**
     * get 作业失败后是否发送短信通知
     *
     * @return
     */
    public Boolean getIsSendMsg() {
        return isSendMsg;
    }

    /**
     * set 作业失败后是否发送短信通知
     *
     * @param isSendMsg
     */
    public void setIsSendMsg(Boolean isSendMsg) {
        this.isSendMsg = isSendMsg;
    }

    /**
     * get 用户名
     *
     * @return
     */
    public String getUserpin() {
        return userpin;
    }

    /**
     * set 用户名
     *
     * @param userpin
     */
    public void setUserpin(String userpin) {
        this.userpin = userpin;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 位置
     *
     * @return
     */
    public String getLocation() {
        return location;
    }

    /**
     * set 位置
     *
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * get 所需参数
     *
     * @return
     */
    public String getParams() {
        return params;
    }

    /**
     * set 所需参数
     *
     * @param params
     */
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * get 数据中心
     *
     * @return
     */
    public String getDataCenter() {
        return dataCenter;
    }

    /**
     * set 数据中心
     *
     * @param dataCenter
     */
    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    /**
     * get 集群ID
     *
     * @return
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * set 集群ID
     *
     * @param clusterId
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * get 集群名称
     *
     * @return
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * set 集群名称
     *
     * @param clusterName
     */
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * get 额外字段
     *
     * @return
     */
    public String getClusterStatus() {
        return clusterStatus;
    }

    /**
     * set 额外字段
     *
     * @param clusterStatus
     */
    public void setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
    }


    /**
     * set null
     *
     * @param id
     */
    public JmrJobViewModel id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 作业ID
     *
     * @param jobId
     */
    public JmrJobViewModel jobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * set 作业名称
     *
     * @param jobName
     */
    public JmrJobViewModel jobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * set 作业类型
     *
     * @param jobType
     */
    public JmrJobViewModel jobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * set 作业状态
     *
     * @param jobStatus
     */
    public JmrJobViewModel jobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * set 作业组
     *
     * @param jobGroup
     */
    public JmrJobViewModel jobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
        return this;
    }

    /**
     * set 作业触发器
     *
     * @param jobTrigger
     */
    public JmrJobViewModel jobTrigger(String jobTrigger) {
        this.jobTrigger = jobTrigger;
        return this;
    }

    /**
     * set 定时任务的时间
     *
     * @param cronExpression
     */
    public JmrJobViewModel cronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }

    /**
     * set 额外字段，可选
     *
     * @param orderBy
     */
    public JmrJobViewModel orderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * set isSelfDependence
     *
     * @param isSelfDependence
     */
    public JmrJobViewModel isSelfDependence(Integer isSelfDependence) {
        this.isSelfDependence = isSelfDependence;
        return this;
    }

    /**
     * set isVirtualTask
     *
     * @param isVirtualTask
     */
    public JmrJobViewModel isVirtualTask(Integer isVirtualTask) {
        this.isVirtualTask = isVirtualTask;
        return this;
    }

    /**
     * set taskScheduleType
     *
     * @param taskScheduleType
     */
    public JmrJobViewModel taskScheduleType(Integer taskScheduleType) {
        this.taskScheduleType = taskScheduleType;
        return this;
    }

    /**
     * set 作业重试次数
     *
     * @param retryTimes
     */
    public JmrJobViewModel retryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }

    /**
     * set 作业失败后是否发送短信通知
     *
     * @param isSendMsg
     */
    public JmrJobViewModel isSendMsg(Boolean isSendMsg) {
        this.isSendMsg = isSendMsg;
        return this;
    }

    /**
     * set 用户名
     *
     * @param userpin
     */
    public JmrJobViewModel userpin(String userpin) {
        this.userpin = userpin;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public JmrJobViewModel createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 位置
     *
     * @param location
     */
    public JmrJobViewModel location(String location) {
        this.location = location;
        return this;
    }

    /**
     * set 所需参数
     *
     * @param params
     */
    public JmrJobViewModel params(String params) {
        this.params = params;
        return this;
    }

    /**
     * set 数据中心
     *
     * @param dataCenter
     */
    public JmrJobViewModel dataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    /**
     * set 集群ID
     *
     * @param clusterId
     */
    public JmrJobViewModel clusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * set 集群名称
     *
     * @param clusterName
     */
    public JmrJobViewModel clusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * set 额外字段
     *
     * @param clusterStatus
     */
    public JmrJobViewModel clusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }


}