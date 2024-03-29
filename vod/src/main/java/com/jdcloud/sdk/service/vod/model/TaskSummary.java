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

package com.jdcloud.sdk.service.vod.model;


/**
 * 任务列表结果信息
 */
public class TaskSummary  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务ID
     */
    private String taskId;

    /**
     * 模板类型。取值范围：
  sample - 采样截图模板
  sprite - 雪碧图模板

     */
    private String snapshotType;

    /**
     * 任务状态。
- submitted
- processing
- succeeded
- failed

     */
    private String status;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误信息
     */
    private String errorMessage;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String updateTime;


    /**
     * get 任务ID
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 任务ID
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * get 模板类型。取值范围：
  sample - 采样截图模板
  sprite - 雪碧图模板

     *
     * @return
     */
    public String getSnapshotType() {
        return snapshotType;
    }

    /**
     * set 模板类型。取值范围：
  sample - 采样截图模板
  sprite - 雪碧图模板

     *
     * @param snapshotType
     */
    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * get 任务状态。
- submitted
- processing
- succeeded
- failed

     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 任务状态。
- submitted
- processing
- succeeded
- failed

     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 错误码
     *
     * @return
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * set 错误码
     *
     * @param errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * get 错误信息
     *
     * @return
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * set 错误信息
     *
     * @param errorMessage
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
     * get 修改时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 任务ID
     *
     * @param taskId
     */
    public TaskSummary taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * set 模板类型。取值范围：
  sample - 采样截图模板
  sprite - 雪碧图模板

     *
     * @param snapshotType
     */
    public TaskSummary snapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }

    /**
     * set 任务状态。
- submitted
- processing
- succeeded
- failed

     *
     * @param status
     */
    public TaskSummary status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 错误码
     *
     * @param errorCode
     */
    public TaskSummary errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * set 错误信息
     *
     * @param errorMessage
     */
    public TaskSummary errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public TaskSummary createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public TaskSummary updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}