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

package com.jdcloud.sdk.service.cdn.model;


/**
 * snowLeopardDomainSourceInfo
 */
public class SnowLeopardDomainSourceInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 优先级（1-10）
     */
    private Integer priority;

    /**
     * 回源host
     */
    private String sourceHost;

    /**
     * 回源域名
     */
    private String domain;



    /**
     * get 优先级（1-10）
     *
     * @return
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * set 优先级（1-10）
     *
     * @param priority
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }


    /**
     * get 回源host
     *
     * @return
     */
    public String getSourceHost() {
        return sourceHost;
    }

    /**
     * set 回源host
     *
     * @param sourceHost
     */
    public void setSourceHost(String sourceHost) {
        this.sourceHost = sourceHost;
    }


    /**
     * get 回源域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 回源域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }



    /**
     * set 优先级（1-10）
     *
     * @param priority
     */
    public SnowLeopardDomainSourceInfo priority(Integer priority) {
        this.priority = priority;
        return this;
    }


    /**
     * set 回源host
     *
     * @param sourceHost
     */
    public SnowLeopardDomainSourceInfo sourceHost(String sourceHost) {
        this.sourceHost = sourceHost;
        return this;
    }


    /**
     * set 回源域名
     *
     * @param domain
     */
    public SnowLeopardDomainSourceInfo domain(String domain) {
        this.domain = domain;
        return this;
    }


}