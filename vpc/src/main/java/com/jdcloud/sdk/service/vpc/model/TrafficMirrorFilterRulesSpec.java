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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * trafficMirrorFilterRulesSpec
 */
public class TrafficMirrorFilterRulesSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 需要添加的过滤器规则
     * Required:true
     */
    @Required
    
    private List<TrafficMirrorFilterRuleSpec> mirrorFilterRules;


    /**
    * get 需要添加的过滤器规则
    *
    * @return
    */
    public List<TrafficMirrorFilterRuleSpec> getMirrorFilterRules() {
        return mirrorFilterRules;
    }

    /**
    * set 需要添加的过滤器规则
    *
    * @param mirrorFilterRules
    */
    public void setMirrorFilterRules(List<TrafficMirrorFilterRuleSpec> mirrorFilterRules) {
        this.mirrorFilterRules = mirrorFilterRules;
    }



    /**
    * set 需要添加的过滤器规则
    *
    * @param mirrorFilterRules
    */
    public TrafficMirrorFilterRulesSpec mirrorFilterRules(List<TrafficMirrorFilterRuleSpec> mirrorFilterRules) {
        this.mirrorFilterRules = mirrorFilterRules;
        return this;
    }



    /**
     * add item to 需要添加的过滤器规则
     *
     * @param mirrorFilterRule
     */
    public void addMirrorFilterRule(TrafficMirrorFilterRuleSpec mirrorFilterRule) {
        if (this.mirrorFilterRules == null) {
            this.mirrorFilterRules = new ArrayList<>();
        }
        this.mirrorFilterRules.add(mirrorFilterRule);
    }
}