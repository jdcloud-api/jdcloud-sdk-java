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

package com.jdcloud.sdk.service.waf.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * setReq
 */
public class SetReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规则id
     * Required:true
     */
    @Required
    private Integer id;

    /**
     * 规则名称
     */
    private String ruleName;

    /**
     * WAF实例id
     */
    private String wafInstanceId;

    /**
     * 域名集
     */
    private List<String> domains;

    /**
     * 告警类型，wafAnti-waf攻击告警，ccAnti-cc攻击告警，statusCode-状态码告警，upstreamStatus-回源IP监控
     * Required:true
     */
    @Required
    private String warnType;

    /**
     * 阈值单位，&quot;&quot;-个数，&quot;percent&quot;-百分比。缺省为个数
     */
    private String unit;

    /**
     * 检测时长单位，hour/minute,缺省为hour
     */
    private String detectUnit;


    /**
     * get 规则id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 规则id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 规则名称
     *
     * @return
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * set 规则名称
     *
     * @param ruleName
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * get WAF实例id
     *
     * @return
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    /**
     * set WAF实例id
     *
     * @param wafInstanceId
     */
    public void setWafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
    }

    /**
     * get 域名集
     *
     * @return
     */
    public List<String> getDomains() {
        return domains;
    }

    /**
     * set 域名集
     *
     * @param domains
     */
    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    /**
     * get 告警类型，wafAnti-waf攻击告警，ccAnti-cc攻击告警，statusCode-状态码告警，upstreamStatus-回源IP监控
     *
     * @return
     */
    public String getWarnType() {
        return warnType;
    }

    /**
     * set 告警类型，wafAnti-waf攻击告警，ccAnti-cc攻击告警，statusCode-状态码告警，upstreamStatus-回源IP监控
     *
     * @param warnType
     */
    public void setWarnType(String warnType) {
        this.warnType = warnType;
    }

    /**
     * get 阈值单位，&quot;&quot;-个数，&quot;percent&quot;-百分比。缺省为个数
     *
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     * set 阈值单位，&quot;&quot;-个数，&quot;percent&quot;-百分比。缺省为个数
     *
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * get 检测时长单位，hour/minute,缺省为hour
     *
     * @return
     */
    public String getDetectUnit() {
        return detectUnit;
    }

    /**
     * set 检测时长单位，hour/minute,缺省为hour
     *
     * @param detectUnit
     */
    public void setDetectUnit(String detectUnit) {
        this.detectUnit = detectUnit;
    }


    /**
     * set 规则id
     *
     * @param id
     */
    public SetReq id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 规则名称
     *
     * @param ruleName
     */
    public SetReq ruleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * set WAF实例id
     *
     * @param wafInstanceId
     */
    public SetReq wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }

    /**
     * set 域名集
     *
     * @param domains
     */
    public SetReq domains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    /**
     * set 告警类型，wafAnti-waf攻击告警，ccAnti-cc攻击告警，statusCode-状态码告警，upstreamStatus-回源IP监控
     *
     * @param warnType
     */
    public SetReq warnType(String warnType) {
        this.warnType = warnType;
        return this;
    }

    /**
     * set 阈值单位，&quot;&quot;-个数，&quot;percent&quot;-百分比。缺省为个数
     *
     * @param unit
     */
    public SetReq unit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * set 检测时长单位，hour/minute,缺省为hour
     *
     * @param detectUnit
     */
    public SetReq detectUnit(String detectUnit) {
        this.detectUnit = detectUnit;
        return this;
    }


    /**
     * add item to 域名集
     *
     * @param domain
     */
    public void addDomain(String domain) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domain);
    }

}