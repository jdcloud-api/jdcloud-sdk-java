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
 * firewall
 * 轻量应用云主机防火墙的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lavm.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 为指定的轻量应用云主机创建一条防火墙规则。

 */
public class CreateFirewallRuleRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 指定的轻量应用云主机的实例ID

     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 源Ip的CRDI格式的地址

     * Required:true
     */
    @Required
    private String sourceAddress;

    /**
     * 规则限定协议。取值范围：
TCP：TCP协议。
UDP：UDP协议。
ICMP：ICMP协议。

     * Required:true
     */
    @Required
    private String ruleProtocol;

    /**
     * 端口范围。若规则限定协议为传输层协议（TCP、UDP)，取值范围为1&#x60;~&#x60;65535，若规则限定协议为非传输层协议（ICMP协议），恒为0。使用正斜线（/）隔开起始端口和终止端口，例如：1024/1055表示端口范围为1024&#x60;~&#x60;1055。

     * Required:true
     */
    @Required
    private String port;

    /**
     * 防火墙规则的备注, 不超过100个字符

     */
    private String remark;

    /**
     * 用于保证请求的幂等性。由客户端生成，并确保不同请求中该参数唯一，长度不能超过64个字符。

     */
    private String clientToken;

    /**
     * regionId

     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 指定的轻量应用云主机的实例ID

     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 指定的轻量应用云主机的实例ID

     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * get 源Ip的CRDI格式的地址

     *
     * @return
     */
    public String getSourceAddress() {
        return sourceAddress;
    }

    /**
     * set 源Ip的CRDI格式的地址

     *
     * @param sourceAddress
     */
    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }


    /**
     * get 规则限定协议。取值范围：
TCP：TCP协议。
UDP：UDP协议。
ICMP：ICMP协议。

     *
     * @return
     */
    public String getRuleProtocol() {
        return ruleProtocol;
    }

    /**
     * set 规则限定协议。取值范围：
TCP：TCP协议。
UDP：UDP协议。
ICMP：ICMP协议。

     *
     * @param ruleProtocol
     */
    public void setRuleProtocol(String ruleProtocol) {
        this.ruleProtocol = ruleProtocol;
    }


    /**
     * get 端口范围。若规则限定协议为传输层协议（TCP、UDP)，取值范围为1&#x60;~&#x60;65535，若规则限定协议为非传输层协议（ICMP协议），恒为0。使用正斜线（/）隔开起始端口和终止端口，例如：1024/1055表示端口范围为1024&#x60;~&#x60;1055。

     *
     * @return
     */
    public String getPort() {
        return port;
    }

    /**
     * set 端口范围。若规则限定协议为传输层协议（TCP、UDP)，取值范围为1&#x60;~&#x60;65535，若规则限定协议为非传输层协议（ICMP协议），恒为0。使用正斜线（/）隔开起始端口和终止端口，例如：1024/1055表示端口范围为1024&#x60;~&#x60;1055。

     *
     * @param port
     */
    public void setPort(String port) {
        this.port = port;
    }


    /**
     * get 防火墙规则的备注, 不超过100个字符

     *
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set 防火墙规则的备注, 不超过100个字符

     *
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }


    /**
     * get 用于保证请求的幂等性。由客户端生成，并确保不同请求中该参数唯一，长度不能超过64个字符。

     *
     * @return
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * set 用于保证请求的幂等性。由客户端生成，并确保不同请求中该参数唯一，长度不能超过64个字符。

     *
     * @param clientToken
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }


    /**
     * get regionId

     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set regionId

     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 指定的轻量应用云主机的实例ID

     *
     * @param instanceId
     */
    public CreateFirewallRuleRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * set 源Ip的CRDI格式的地址

     *
     * @param sourceAddress
     */
    public CreateFirewallRuleRequest sourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
        return this;
    }


    /**
     * set 规则限定协议。取值范围：
TCP：TCP协议。
UDP：UDP协议。
ICMP：ICMP协议。

     *
     * @param ruleProtocol
     */
    public CreateFirewallRuleRequest ruleProtocol(String ruleProtocol) {
        this.ruleProtocol = ruleProtocol;
        return this;
    }


    /**
     * set 端口范围。若规则限定协议为传输层协议（TCP、UDP)，取值范围为1&#x60;~&#x60;65535，若规则限定协议为非传输层协议（ICMP协议），恒为0。使用正斜线（/）隔开起始端口和终止端口，例如：1024/1055表示端口范围为1024&#x60;~&#x60;1055。

     *
     * @param port
     */
    public CreateFirewallRuleRequest port(String port) {
        this.port = port;
        return this;
    }


    /**
     * set 防火墙规则的备注, 不超过100个字符

     *
     * @param remark
     */
    public CreateFirewallRuleRequest remark(String remark) {
        this.remark = remark;
        return this;
    }


    /**
     * set 用于保证请求的幂等性。由客户端生成，并确保不同请求中该参数唯一，长度不能超过64个字符。

     *
     * @param clientToken
     */
    public CreateFirewallRuleRequest clientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }


    /**
     * set regionId

     *
     * @param regionId
     */
    public CreateFirewallRuleRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}