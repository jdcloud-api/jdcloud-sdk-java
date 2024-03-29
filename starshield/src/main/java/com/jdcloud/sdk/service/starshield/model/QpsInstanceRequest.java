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
 * Log-Analytics
 * Analytics data for a zone/instance
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * qps
 */
public class QpsInstanceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * queryMode
     */
    private String queryMode;

    /**
     * since
     */
    private String since;

    /**
     * until
     */
    private String until;

    /**
     * instanceId
     * Required:true
     */
    @Required
    private String instanceId;



    /**
     * get queryMode
     *
     * @return
     */
    public String getQueryMode() {
        return queryMode;
    }

    /**
     * set queryMode
     *
     * @param queryMode
     */
    public void setQueryMode(String queryMode) {
        this.queryMode = queryMode;
    }


    /**
     * get since
     *
     * @return
     */
    public String getSince() {
        return since;
    }

    /**
     * set since
     *
     * @param since
     */
    public void setSince(String since) {
        this.since = since;
    }


    /**
     * get until
     *
     * @return
     */
    public String getUntil() {
        return until;
    }

    /**
     * set until
     *
     * @param until
     */
    public void setUntil(String until) {
        this.until = until;
    }


    /**
     * get instanceId
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set instanceId
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }



    /**
     * set queryMode
     *
     * @param queryMode
     */
    public QpsInstanceRequest queryMode(String queryMode) {
        this.queryMode = queryMode;
        return this;
    }


    /**
     * set since
     *
     * @param since
     */
    public QpsInstanceRequest since(String since) {
        this.since = since;
        return this;
    }


    /**
     * set until
     *
     * @param until
     */
    public QpsInstanceRequest until(String until) {
        this.until = until;
        return this;
    }


    /**
     * set instanceId
     *
     * @param instanceId
     */
    public QpsInstanceRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}