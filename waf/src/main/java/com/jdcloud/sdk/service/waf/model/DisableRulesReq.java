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
 * disableRulesReq
 */
public class DisableRulesReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例id，代表要设置的WAF实例
     * Required:true
     */
    @Required
    private String wafInstanceId;

    /**
     * 域名
     * Required:true
     */
    @Required
    private String domain;

    /**
     * 0:使用规则，1：禁用规则
     */
    private Integer disable;

    /**
     * 操作的规则id, ruleType非&quot;waf&quot;时必填
     */
    
    private List<Integer> ids;
    /**
     * 操作的规则类型，&quot;waf&quot;:waf总体防护开关，&quot;cc&quot;:cc规则，&quot;ratelimit&quot;：限速，&quot;usrdefCookie&quot;:cookie类型的黑白名单，&quot;usrdefGeo&quot;:geo类型的黑白名单，&quot;usrdefOwner&quot;:owner类型的黑白名单,&quot;usrdefHeaders&quot;:header类型的黑白名单，&quot;usrdefIP&quot;:ip类型的黑白名单，&quot;usrdefURI&quot;:uri类型的黑白名单，&quot;filterReqresp&quot;:请求头类型的流量管理，&quot;filterSenseinfo&quot;:敏感信息防泄漏，&quot;usrdefWaf&quot;:waf自定义规则,&quot;rewriteRule&quot;:重写规则（目前是uri重写规则）,&quot;listRule&quot;:黑白名单规则（目前指method黑白名单）,&quot;proxycache&quot;:url缓存，&quot;botUsr&quot;:自定义类型BOT规则,&quot;risk&quot;:风险防护规则,&quot;riskEvent&quot;:风险控制事件,&quot;riskUsrList&quot;:风险控制用户自定义名单
     * Required:true
     */
    @Required
    private String ruleType;



    /**
     * get 实例id，代表要设置的WAF实例
     *
     * @return
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    /**
     * set 实例id，代表要设置的WAF实例
     *
     * @param wafInstanceId
     */
    public void setWafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
    }


    /**
     * get 域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * get 0:使用规则，1：禁用规则
     *
     * @return
     */
    public Integer getDisable() {
        return disable;
    }

    /**
     * set 0:使用规则，1：禁用规则
     *
     * @param disable
     */
    public void setDisable(Integer disable) {
        this.disable = disable;
    }


    /**
    * get 操作的规则id, ruleType非&quot;waf&quot;时必填
    *
    * @return
    */
    public List<Integer> getIds() {
        return ids;
    }

    /**
    * set 操作的规则id, ruleType非&quot;waf&quot;时必填
    *
    * @param ids
    */
    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }


    /**
     * get 操作的规则类型，&quot;waf&quot;:waf总体防护开关，&quot;cc&quot;:cc规则，&quot;ratelimit&quot;：限速，&quot;usrdefCookie&quot;:cookie类型的黑白名单，&quot;usrdefGeo&quot;:geo类型的黑白名单，&quot;usrdefOwner&quot;:owner类型的黑白名单,&quot;usrdefHeaders&quot;:header类型的黑白名单，&quot;usrdefIP&quot;:ip类型的黑白名单，&quot;usrdefURI&quot;:uri类型的黑白名单，&quot;filterReqresp&quot;:请求头类型的流量管理，&quot;filterSenseinfo&quot;:敏感信息防泄漏，&quot;usrdefWaf&quot;:waf自定义规则,&quot;rewriteRule&quot;:重写规则（目前是uri重写规则）,&quot;listRule&quot;:黑白名单规则（目前指method黑白名单）,&quot;proxycache&quot;:url缓存，&quot;botUsr&quot;:自定义类型BOT规则,&quot;risk&quot;:风险防护规则,&quot;riskEvent&quot;:风险控制事件,&quot;riskUsrList&quot;:风险控制用户自定义名单
     *
     * @return
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * set 操作的规则类型，&quot;waf&quot;:waf总体防护开关，&quot;cc&quot;:cc规则，&quot;ratelimit&quot;：限速，&quot;usrdefCookie&quot;:cookie类型的黑白名单，&quot;usrdefGeo&quot;:geo类型的黑白名单，&quot;usrdefOwner&quot;:owner类型的黑白名单,&quot;usrdefHeaders&quot;:header类型的黑白名单，&quot;usrdefIP&quot;:ip类型的黑白名单，&quot;usrdefURI&quot;:uri类型的黑白名单，&quot;filterReqresp&quot;:请求头类型的流量管理，&quot;filterSenseinfo&quot;:敏感信息防泄漏，&quot;usrdefWaf&quot;:waf自定义规则,&quot;rewriteRule&quot;:重写规则（目前是uri重写规则）,&quot;listRule&quot;:黑白名单规则（目前指method黑白名单）,&quot;proxycache&quot;:url缓存，&quot;botUsr&quot;:自定义类型BOT规则,&quot;risk&quot;:风险防护规则,&quot;riskEvent&quot;:风险控制事件,&quot;riskUsrList&quot;:风险控制用户自定义名单
     *
     * @param ruleType
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }



    /**
     * set 实例id，代表要设置的WAF实例
     *
     * @param wafInstanceId
     */
    public DisableRulesReq wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }


    /**
     * set 域名
     *
     * @param domain
     */
    public DisableRulesReq domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set 0:使用规则，1：禁用规则
     *
     * @param disable
     */
    public DisableRulesReq disable(Integer disable) {
        this.disable = disable;
        return this;
    }


    /**
    * set 操作的规则id, ruleType非&quot;waf&quot;时必填
    *
    * @param ids
    */
    public DisableRulesReq ids(List<Integer> ids) {
        this.ids = ids;
        return this;
    }


    /**
     * set 操作的规则类型，&quot;waf&quot;:waf总体防护开关，&quot;cc&quot;:cc规则，&quot;ratelimit&quot;：限速，&quot;usrdefCookie&quot;:cookie类型的黑白名单，&quot;usrdefGeo&quot;:geo类型的黑白名单，&quot;usrdefOwner&quot;:owner类型的黑白名单,&quot;usrdefHeaders&quot;:header类型的黑白名单，&quot;usrdefIP&quot;:ip类型的黑白名单，&quot;usrdefURI&quot;:uri类型的黑白名单，&quot;filterReqresp&quot;:请求头类型的流量管理，&quot;filterSenseinfo&quot;:敏感信息防泄漏，&quot;usrdefWaf&quot;:waf自定义规则,&quot;rewriteRule&quot;:重写规则（目前是uri重写规则）,&quot;listRule&quot;:黑白名单规则（目前指method黑白名单）,&quot;proxycache&quot;:url缓存，&quot;botUsr&quot;:自定义类型BOT规则,&quot;risk&quot;:风险防护规则,&quot;riskEvent&quot;:风险控制事件,&quot;riskUsrList&quot;:风险控制用户自定义名单
     *
     * @param ruleType
     */
    public DisableRulesReq ruleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }



    /**
     * add item to 操作的规则id, ruleType非&quot;waf&quot;时必填
     *
     * @param id
     */
    public void addId(Integer id) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(id);
    }
}