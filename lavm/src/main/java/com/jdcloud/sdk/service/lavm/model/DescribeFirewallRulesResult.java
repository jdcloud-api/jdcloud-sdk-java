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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.lavm.model.FirewallRule;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询指定轻量应用云主机的防火墙规则。

 */
public class DescribeFirewallRulesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * firewallRules
     */
    
    private List<FirewallRule> firewallRules;
    /**
     * totalCount
     */
    private Integer totalCount;



    /**
    * get firewallRules
    *
    * @return
    */
    public List<FirewallRule> getFirewallRules() {
        return firewallRules;
    }

    /**
    * set firewallRules
    *
    * @param firewallRules
    */
    public void setFirewallRules(List<FirewallRule> firewallRules) {
        this.firewallRules = firewallRules;
    }


    /**
     * get totalCount
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }



    /**
    * set firewallRules
    *
    * @param firewallRules
    */
    public DescribeFirewallRulesResult firewallRules(List<FirewallRule> firewallRules) {
        this.firewallRules = firewallRules;
        return this;
    }


    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeFirewallRulesResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }



    /**
     * add item to firewallRules
     *
     * @param firewallRule
     */
    public void addFirewallRule(FirewallRule firewallRule) {
        if (this.firewallRules == null) {
            this.firewallRules = new ArrayList<>();
        }
        this.firewallRules.add(firewallRule);
    }
}