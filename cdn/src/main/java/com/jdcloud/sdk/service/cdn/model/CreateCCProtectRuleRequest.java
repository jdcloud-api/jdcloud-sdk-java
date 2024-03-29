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
 * SCDN相关接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 新增一条CC防护规则
 */
public class CreateCCProtectRuleRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * null
     */
    private String uri;

    /**
     * null
     */
    private Integer detectPeriod;

    /**
     * null
     */
    private Integer singleIpLimit;

    /**
     * null
     */
    private Integer blockType;

    /**
     * null
     */
    private Integer blockTime;

    /**
     * 用户域名
     * Required:true
     */
    @Required
    private String domain;



    /**
     * get null
     *
     * @return
     */
    public String getUri() {
        return uri;
    }

    /**
     * set null
     *
     * @param uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }


    /**
     * get null
     *
     * @return
     */
    public Integer getDetectPeriod() {
        return detectPeriod;
    }

    /**
     * set null
     *
     * @param detectPeriod
     */
    public void setDetectPeriod(Integer detectPeriod) {
        this.detectPeriod = detectPeriod;
    }


    /**
     * get null
     *
     * @return
     */
    public Integer getSingleIpLimit() {
        return singleIpLimit;
    }

    /**
     * set null
     *
     * @param singleIpLimit
     */
    public void setSingleIpLimit(Integer singleIpLimit) {
        this.singleIpLimit = singleIpLimit;
    }


    /**
     * get null
     *
     * @return
     */
    public Integer getBlockType() {
        return blockType;
    }

    /**
     * set null
     *
     * @param blockType
     */
    public void setBlockType(Integer blockType) {
        this.blockType = blockType;
    }


    /**
     * get null
     *
     * @return
     */
    public Integer getBlockTime() {
        return blockTime;
    }

    /**
     * set null
     *
     * @param blockTime
     */
    public void setBlockTime(Integer blockTime) {
        this.blockTime = blockTime;
    }


    /**
     * get 用户域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }



    /**
     * set null
     *
     * @param uri
     */
    public CreateCCProtectRuleRequest uri(String uri) {
        this.uri = uri;
        return this;
    }


    /**
     * set null
     *
     * @param detectPeriod
     */
    public CreateCCProtectRuleRequest detectPeriod(Integer detectPeriod) {
        this.detectPeriod = detectPeriod;
        return this;
    }


    /**
     * set null
     *
     * @param singleIpLimit
     */
    public CreateCCProtectRuleRequest singleIpLimit(Integer singleIpLimit) {
        this.singleIpLimit = singleIpLimit;
        return this;
    }


    /**
     * set null
     *
     * @param blockType
     */
    public CreateCCProtectRuleRequest blockType(Integer blockType) {
        this.blockType = blockType;
        return this;
    }


    /**
     * set null
     *
     * @param blockTime
     */
    public CreateCCProtectRuleRequest blockTime(Integer blockTime) {
        this.blockTime = blockTime;
        return this;
    }


    /**
     * set 用户域名
     *
     * @param domain
     */
    public CreateCCProtectRuleRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


}