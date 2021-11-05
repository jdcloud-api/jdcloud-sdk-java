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

package com.jdcloud.sdk.service.starshield.model;


/**
 * workerScript
 */
public class WorkerScript  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * worker name
     */
    private String id;

    /**
     * Raw script content, as a string
     */
    private String script;

    /**
     * Hashed script content, can be used in a If-None-Match header when updating
     */
    private String etag;

    /**
     * Size of the script, in bytes
     */
    private Number size;

    /**
     * When the script was created
     */
    private String created_on;

    /**
     * When the script was last modified
     */
    private String modified_on;

    /**
     * available_on_subdomain
     */
    private Boolean available_on_subdomain;

    /**
     * 过去24小时的请求数
     */
    private Number requestCount;


    /**
     * get worker name
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set worker name
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get Raw script content, as a string
     *
     * @return
     */
    public String getScript() {
        return script;
    }

    /**
     * set Raw script content, as a string
     *
     * @param script
     */
    public void setScript(String script) {
        this.script = script;
    }

    /**
     * get Hashed script content, can be used in a If-None-Match header when updating
     *
     * @return
     */
    public String getEtag() {
        return etag;
    }

    /**
     * set Hashed script content, can be used in a If-None-Match header when updating
     *
     * @param etag
     */
    public void setEtag(String etag) {
        this.etag = etag;
    }

    /**
     * get Size of the script, in bytes
     *
     * @return
     */
    public Number getSize() {
        return size;
    }

    /**
     * set Size of the script, in bytes
     *
     * @param size
     */
    public void setSize(Number size) {
        this.size = size;
    }

    /**
     * get When the script was created
     *
     * @return
     */
    public String getCreated_on() {
        return created_on;
    }

    /**
     * set When the script was created
     *
     * @param created_on
     */
    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    /**
     * get When the script was last modified
     *
     * @return
     */
    public String getModified_on() {
        return modified_on;
    }

    /**
     * set When the script was last modified
     *
     * @param modified_on
     */
    public void setModified_on(String modified_on) {
        this.modified_on = modified_on;
    }

    /**
     * get available_on_subdomain
     *
     * @return
     */
    public Boolean getAvailable_on_subdomain() {
        return available_on_subdomain;
    }

    /**
     * set available_on_subdomain
     *
     * @param available_on_subdomain
     */
    public void setAvailable_on_subdomain(Boolean available_on_subdomain) {
        this.available_on_subdomain = available_on_subdomain;
    }

    /**
     * get 过去24小时的请求数
     *
     * @return
     */
    public Number getRequestCount() {
        return requestCount;
    }

    /**
     * set 过去24小时的请求数
     *
     * @param requestCount
     */
    public void setRequestCount(Number requestCount) {
        this.requestCount = requestCount;
    }


    /**
     * set worker name
     *
     * @param id
     */
    public WorkerScript id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set Raw script content, as a string
     *
     * @param script
     */
    public WorkerScript script(String script) {
        this.script = script;
        return this;
    }

    /**
     * set Hashed script content, can be used in a If-None-Match header when updating
     *
     * @param etag
     */
    public WorkerScript etag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * set Size of the script, in bytes
     *
     * @param size
     */
    public WorkerScript size(Number size) {
        this.size = size;
        return this;
    }

    /**
     * set When the script was created
     *
     * @param created_on
     */
    public WorkerScript created_on(String created_on) {
        this.created_on = created_on;
        return this;
    }

    /**
     * set When the script was last modified
     *
     * @param modified_on
     */
    public WorkerScript modified_on(String modified_on) {
        this.modified_on = modified_on;
        return this;
    }

    /**
     * set available_on_subdomain
     *
     * @param available_on_subdomain
     */
    public WorkerScript available_on_subdomain(Boolean available_on_subdomain) {
        this.available_on_subdomain = available_on_subdomain;
        return this;
    }

    /**
     * set 过去24小时的请求数
     *
     * @param requestCount
     */
    public WorkerScript requestCount(Number requestCount) {
        this.requestCount = requestCount;
        return this;
    }


}