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

import com.jdcloud.sdk.annotation.Required;

/**
 * lbConfig
 */
public class LbConfig  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名
     * Required:true
     */
    @Required
    private String domain;

    /**
     * 网站lb配置
     * Required:true
     */
    @Required
    private LbConf lbConf;



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
     * get 网站lb配置
     *
     * @return
     */
    public LbConf getLbConf() {
        return lbConf;
    }

    /**
     * set 网站lb配置
     *
     * @param lbConf
     */
    public void setLbConf(LbConf lbConf) {
        this.lbConf = lbConf;
    }



    /**
     * set 域名
     *
     * @param domain
     */
    public LbConfig domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set 网站lb配置
     *
     * @param lbConf
     */
    public LbConfig lbConf(LbConf lbConf) {
        this.lbConf = lbConf;
        return this;
    }


}