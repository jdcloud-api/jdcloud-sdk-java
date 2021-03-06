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
 * Domain
 * 域名配置相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import com.jdcloud.sdk.service.vod.model.RefererRuleConfigObject;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询CDN域名Referer防盗链规则配置
 */
public class GetRefererRuleResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规则类型，取值 &#39;referer&#39;
     */
    private String ruleType;

    /**
     * Referer防盗链规则配置对象
     */
    private RefererRuleConfigObject config;

    /**
     * 是否启用该规则
     */
    private Boolean enabled;


    /**
     * get 规则类型，取值 &#39;referer&#39;
     *
     * @return
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * set 规则类型，取值 &#39;referer&#39;
     *
     * @param ruleType
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * get Referer防盗链规则配置对象
     *
     * @return
     */
    public RefererRuleConfigObject getConfig() {
        return config;
    }

    /**
     * set Referer防盗链规则配置对象
     *
     * @param config
     */
    public void setConfig(RefererRuleConfigObject config) {
        this.config = config;
    }

    /**
     * get 是否启用该规则
     *
     * @return
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * set 是否启用该规则
     *
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * set 规则类型，取值 &#39;referer&#39;
     *
     * @param ruleType
     */
    public GetRefererRuleResult ruleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * set Referer防盗链规则配置对象
     *
     * @param config
     */
    public GetRefererRuleResult config(RefererRuleConfigObject config) {
        this.config = config;
        return this;
    }

    /**
     * set 是否启用该规则
     *
     * @param enabled
     */
    public GetRefererRuleResult enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }


}