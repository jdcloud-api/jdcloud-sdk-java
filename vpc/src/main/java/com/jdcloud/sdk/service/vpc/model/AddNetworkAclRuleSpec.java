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

package com.jdcloud.sdk.service.vpc.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * addNetworkAclRuleSpec
 */
public class AddNetworkAclRuleSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规则限定协议。取值范围：All,TCP,UDP,ICMP
     * Required:true
     */
    @Required
    private String protocol;

    /**
     * 规则限定起始传输层端口, 取值范围:1-65535, 若protocol为传输层协议，默认值为1，若protocol不是传输层协议，设置无效，恒为0。如果规则只限定一个端口号，fromPort和toPort填写同一个值
     */
    private Integer fromPort;

    /**
     * 规则限定终止传输层端口, 取值范围:1-65535, 若protocol为传输层协议，默认值为65535，若protocol不是传输层协议，设置无效，恒为0。如果规则只限定一个端口号，fromPort和toPort填写同一个值
     */
    private Integer toPort;

    /**
     * networkAcl规则方向。ingress：入规则; egress：出规则
     * Required:true
     */
    @Required
    private String direction;

    /**
     * 匹配地址前缀
     * Required:true
     */
    @Required
    private String addressPrefix;

    /**
     * 访问控制策略：allow:允许，deny：拒绝
     * Required:true
     */
    @Required
    private String ruleAction;

    /**
     * 规则匹配优先级，取值范围为[1,32768]，优先级数字越小优先级越高
     * Required:true
     */
    @Required
    private Integer priority;

    /**
     * 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     */
    private String description;


    /**
     * get 规则限定协议。取值范围：All,TCP,UDP,ICMP
     *
     * @return
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * set 规则限定协议。取值范围：All,TCP,UDP,ICMP
     *
     * @param protocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * get 规则限定起始传输层端口, 取值范围:1-65535, 若protocol为传输层协议，默认值为1，若protocol不是传输层协议，设置无效，恒为0。如果规则只限定一个端口号，fromPort和toPort填写同一个值
     *
     * @return
     */
    public Integer getFromPort() {
        return fromPort;
    }

    /**
     * set 规则限定起始传输层端口, 取值范围:1-65535, 若protocol为传输层协议，默认值为1，若protocol不是传输层协议，设置无效，恒为0。如果规则只限定一个端口号，fromPort和toPort填写同一个值
     *
     * @param fromPort
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * get 规则限定终止传输层端口, 取值范围:1-65535, 若protocol为传输层协议，默认值为65535，若protocol不是传输层协议，设置无效，恒为0。如果规则只限定一个端口号，fromPort和toPort填写同一个值
     *
     * @return
     */
    public Integer getToPort() {
        return toPort;
    }

    /**
     * set 规则限定终止传输层端口, 取值范围:1-65535, 若protocol为传输层协议，默认值为65535，若protocol不是传输层协议，设置无效，恒为0。如果规则只限定一个端口号，fromPort和toPort填写同一个值
     *
     * @param toPort
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * get networkAcl规则方向。ingress：入规则; egress：出规则
     *
     * @return
     */
    public String getDirection() {
        return direction;
    }

    /**
     * set networkAcl规则方向。ingress：入规则; egress：出规则
     *
     * @param direction
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * get 匹配地址前缀
     *
     * @return
     */
    public String getAddressPrefix() {
        return addressPrefix;
    }

    /**
     * set 匹配地址前缀
     *
     * @param addressPrefix
     */
    public void setAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
    }

    /**
     * get 访问控制策略：allow:允许，deny：拒绝
     *
     * @return
     */
    public String getRuleAction() {
        return ruleAction;
    }

    /**
     * set 访问控制策略：allow:允许，deny：拒绝
     *
     * @param ruleAction
     */
    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }

    /**
     * get 规则匹配优先级，取值范围为[1,32768]，优先级数字越小优先级越高
     *
     * @return
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * set 规则匹配优先级，取值范围为[1,32768]，优先级数字越小优先级越高
     *
     * @param priority
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * get 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * set 规则限定协议。取值范围：All,TCP,UDP,ICMP
     *
     * @param protocol
     */
    public AddNetworkAclRuleSpec protocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * set 规则限定起始传输层端口, 取值范围:1-65535, 若protocol为传输层协议，默认值为1，若protocol不是传输层协议，设置无效，恒为0。如果规则只限定一个端口号，fromPort和toPort填写同一个值
     *
     * @param fromPort
     */
    public AddNetworkAclRuleSpec fromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    /**
     * set 规则限定终止传输层端口, 取值范围:1-65535, 若protocol为传输层协议，默认值为65535，若protocol不是传输层协议，设置无效，恒为0。如果规则只限定一个端口号，fromPort和toPort填写同一个值
     *
     * @param toPort
     */
    public AddNetworkAclRuleSpec toPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }

    /**
     * set networkAcl规则方向。ingress：入规则; egress：出规则
     *
     * @param direction
     */
    public AddNetworkAclRuleSpec direction(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * set 匹配地址前缀
     *
     * @param addressPrefix
     */
    public AddNetworkAclRuleSpec addressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * set 访问控制策略：allow:允许，deny：拒绝
     *
     * @param ruleAction
     */
    public AddNetworkAclRuleSpec ruleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }

    /**
     * set 规则匹配优先级，取值范围为[1,32768]，优先级数字越小优先级越高
     *
     * @param priority
     */
    public AddNetworkAclRuleSpec priority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public AddNetworkAclRuleSpec description(String description) {
        this.description = description;
        return this;
    }


}