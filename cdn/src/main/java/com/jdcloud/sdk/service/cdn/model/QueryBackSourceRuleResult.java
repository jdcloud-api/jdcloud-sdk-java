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
 * 域名操作类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询回源改写配置
 */
public class QueryBackSourceRuleResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 加速域名
     */
    private String domain;

    /**
     * 回源改写之前的正则表达式
     */
    private String beforeRegex;

    /**
     * 回源改写之后的正则表达式
     */
    private String afterRegex;



    /**
     * get 加速域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 加速域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * get 回源改写之前的正则表达式
     *
     * @return
     */
    public String getBeforeRegex() {
        return beforeRegex;
    }

    /**
     * set 回源改写之前的正则表达式
     *
     * @param beforeRegex
     */
    public void setBeforeRegex(String beforeRegex) {
        this.beforeRegex = beforeRegex;
    }


    /**
     * get 回源改写之后的正则表达式
     *
     * @return
     */
    public String getAfterRegex() {
        return afterRegex;
    }

    /**
     * set 回源改写之后的正则表达式
     *
     * @param afterRegex
     */
    public void setAfterRegex(String afterRegex) {
        this.afterRegex = afterRegex;
    }



    /**
     * set 加速域名
     *
     * @param domain
     */
    public QueryBackSourceRuleResult domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set 回源改写之前的正则表达式
     *
     * @param beforeRegex
     */
    public QueryBackSourceRuleResult beforeRegex(String beforeRegex) {
        this.beforeRegex = beforeRegex;
        return this;
    }


    /**
     * set 回源改写之后的正则表达式
     *
     * @param afterRegex
     */
    public QueryBackSourceRuleResult afterRegex(String afterRegex) {
        this.afterRegex = afterRegex;
        return this;
    }


}