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
 * addRoutePropagationSpec
 */
public class AddRoutePropagationSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 允许路由表学习的网段范围，多个网段通过&quot;,&quot;分隔
     * Required:true
     */
    @Required
    private String propagationCidrs;

    /**
     * 传播的bgw ID
     * Required:true
     */
    @Required
    private String bgwId;



    /**
     * get 允许路由表学习的网段范围，多个网段通过&quot;,&quot;分隔
     *
     * @return
     */
    public String getPropagationCidrs() {
        return propagationCidrs;
    }

    /**
     * set 允许路由表学习的网段范围，多个网段通过&quot;,&quot;分隔
     *
     * @param propagationCidrs
     */
    public void setPropagationCidrs(String propagationCidrs) {
        this.propagationCidrs = propagationCidrs;
    }


    /**
     * get 传播的bgw ID
     *
     * @return
     */
    public String getBgwId() {
        return bgwId;
    }

    /**
     * set 传播的bgw ID
     *
     * @param bgwId
     */
    public void setBgwId(String bgwId) {
        this.bgwId = bgwId;
    }



    /**
     * set 允许路由表学习的网段范围，多个网段通过&quot;,&quot;分隔
     *
     * @param propagationCidrs
     */
    public AddRoutePropagationSpec propagationCidrs(String propagationCidrs) {
        this.propagationCidrs = propagationCidrs;
        return this;
    }


    /**
     * set 传播的bgw ID
     *
     * @param bgwId
     */
    public AddRoutePropagationSpec bgwId(String bgwId) {
        this.bgwId = bgwId;
        return this;
    }


}