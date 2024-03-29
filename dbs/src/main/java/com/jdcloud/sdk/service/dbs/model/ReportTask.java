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

package com.jdcloud.sdk.service.dbs.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * reportTask
 */
public class ReportTask  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * agent
     * Required:true
     */
    @Required
    private Object agent;

    /**
     * taskType
     * Required:true
     */
    @Required
    private String taskType;

    /**
     * planId
     */
    private String planId;

    /**
     * progress
     * Required:true
     */
    @Required
    private Integer progress;

    /**
     * startTime
     */
    private String startTime;

    /**
     * endTime
     */
    private String endTime;

    /**
     * success
     */
    private Boolean success;

    /**
     * errorMessage
     */
    private String errorMessage;


    /**
     * get agent
     *
     * @return
     */
    public Object getAgent() {
        return agent;
    }

    /**
     * set agent
     *
     * @param agent
     */
    public void setAgent(Object agent) {
        this.agent = agent;
    }

    /**
     * get taskType
     *
     * @return
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * set taskType
     *
     * @param taskType
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * get planId
     *
     * @return
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * set planId
     *
     * @param planId
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * get progress
     *
     * @return
     */
    public Integer getProgress() {
        return progress;
    }

    /**
     * set progress
     *
     * @param progress
     */
    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    /**
     * get startTime
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set startTime
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get endTime
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set endTime
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get success
     *
     * @return
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * set success
     *
     * @param success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * get errorMessage
     *
     * @return
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * set errorMessage
     *
     * @param errorMessage
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * set agent
     *
     * @param agent
     */
    public ReportTask agent(Object agent) {
        this.agent = agent;
        return this;
    }

    /**
     * set taskType
     *
     * @param taskType
     */
    public ReportTask taskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * set planId
     *
     * @param planId
     */
    public ReportTask planId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * set progress
     *
     * @param progress
     */
    public ReportTask progress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * set startTime
     *
     * @param startTime
     */
    public ReportTask startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set endTime
     *
     * @param endTime
     */
    public ReportTask endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set success
     *
     * @param success
     */
    public ReportTask success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * set errorMessage
     *
     * @param errorMessage
     */
    public ReportTask errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }


}