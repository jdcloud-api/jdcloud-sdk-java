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


/**
 * precheckPlan
 */
public class PrecheckPlan  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 预检查任务Id
     */
    private String jobId;

    /**
     * 预检查任务项
     */
    private String checkItem;

    /**
     * 预检查任务项的描述
     */
    private String description;

    /**
     * 是否成功
     */
    private Boolean success;

    /**
     * 错误信息，仅sucess为false时返回
     */
    private String errorMessages;


    /**
     * get 预检查任务Id
     *
     * @return
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * set 预检查任务Id
     *
     * @param jobId
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * get 预检查任务项
     *
     * @return
     */
    public String getCheckItem() {
        return checkItem;
    }

    /**
     * set 预检查任务项
     *
     * @param checkItem
     */
    public void setCheckItem(String checkItem) {
        this.checkItem = checkItem;
    }

    /**
     * get 预检查任务项的描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 预检查任务项的描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 是否成功
     *
     * @return
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * set 是否成功
     *
     * @param success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * get 错误信息，仅sucess为false时返回
     *
     * @return
     */
    public String getErrorMessages() {
        return errorMessages;
    }

    /**
     * set 错误信息，仅sucess为false时返回
     *
     * @param errorMessages
     */
    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }


    /**
     * set 预检查任务Id
     *
     * @param jobId
     */
    public PrecheckPlan jobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * set 预检查任务项
     *
     * @param checkItem
     */
    public PrecheckPlan checkItem(String checkItem) {
        this.checkItem = checkItem;
        return this;
    }

    /**
     * set 预检查任务项的描述
     *
     * @param description
     */
    public PrecheckPlan description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 是否成功
     *
     * @param success
     */
    public PrecheckPlan success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * set 错误信息，仅sucess为false时返回
     *
     * @param errorMessages
     */
    public PrecheckPlan errorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
        return this;
    }


}