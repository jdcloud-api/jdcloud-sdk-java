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
 * Vedit
 * 视频剪辑作业相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建视频剪辑作业

 */
public class CreateVeditJobResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 作业ID
     */
    private Long jobId;

    /**
     * 工程ID
     */
    private Long projectId;


    /**
     * get 作业ID
     *
     * @return
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * set 作业ID
     *
     * @param jobId
     */
    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    /**
     * get 工程ID
     *
     * @return
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * set 工程ID
     *
     * @param projectId
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }


    /**
     * set 作业ID
     *
     * @param jobId
     */
    public CreateVeditJobResult jobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * set 工程ID
     *
     * @param projectId
     */
    public CreateVeditJobResult projectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }


}