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

package com.jdcloud.sdk.service.partner.model;


/**
 * oaDetail
 */
public class OaDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 审批人
     */
    private String submitRealName;

    /**
     * 任务状态
     */
    private String submitResult;

    /**
     * 审批意见
     */
    private String submitComments;

    /**
     * 任务开始时间
     */
    private String startTime;

    /**
     * 任务结束时间
     */
    private String endTime;



    /**
     * get 任务名称
     *
     * @return
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * set 任务名称
     *
     * @param taskName
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }


    /**
     * get 审批人
     *
     * @return
     */
    public String getSubmitRealName() {
        return submitRealName;
    }

    /**
     * set 审批人
     *
     * @param submitRealName
     */
    public void setSubmitRealName(String submitRealName) {
        this.submitRealName = submitRealName;
    }


    /**
     * get 任务状态
     *
     * @return
     */
    public String getSubmitResult() {
        return submitResult;
    }

    /**
     * set 任务状态
     *
     * @param submitResult
     */
    public void setSubmitResult(String submitResult) {
        this.submitResult = submitResult;
    }


    /**
     * get 审批意见
     *
     * @return
     */
    public String getSubmitComments() {
        return submitComments;
    }

    /**
     * set 审批意见
     *
     * @param submitComments
     */
    public void setSubmitComments(String submitComments) {
        this.submitComments = submitComments;
    }


    /**
     * get 任务开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 任务开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 任务结束时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 任务结束时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }



    /**
     * set 任务名称
     *
     * @param taskName
     */
    public OaDetail taskName(String taskName) {
        this.taskName = taskName;
        return this;
    }


    /**
     * set 审批人
     *
     * @param submitRealName
     */
    public OaDetail submitRealName(String submitRealName) {
        this.submitRealName = submitRealName;
        return this;
    }


    /**
     * set 任务状态
     *
     * @param submitResult
     */
    public OaDetail submitResult(String submitResult) {
        this.submitResult = submitResult;
        return this;
    }


    /**
     * set 审批意见
     *
     * @param submitComments
     */
    public OaDetail submitComments(String submitComments) {
        this.submitComments = submitComments;
        return this;
    }


    /**
     * set 任务开始时间
     *
     * @param startTime
     */
    public OaDetail startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 任务结束时间
     *
     * @param endTime
     */
    public OaDetail endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


}