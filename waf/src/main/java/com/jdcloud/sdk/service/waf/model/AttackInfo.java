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


/**
 * attackInfo
 */
public class AttackInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自定义规则防护
     */
    private Long aclAnti;

    /**
     * cc防护
     */
    private Long ccAnti;

    /**
     * web防护
     */
    private Long wafAnti;



    /**
     * get 自定义规则防护
     *
     * @return
     */
    public Long getAclAnti() {
        return aclAnti;
    }

    /**
     * set 自定义规则防护
     *
     * @param aclAnti
     */
    public void setAclAnti(Long aclAnti) {
        this.aclAnti = aclAnti;
    }


    /**
     * get cc防护
     *
     * @return
     */
    public Long getCcAnti() {
        return ccAnti;
    }

    /**
     * set cc防护
     *
     * @param ccAnti
     */
    public void setCcAnti(Long ccAnti) {
        this.ccAnti = ccAnti;
    }


    /**
     * get web防护
     *
     * @return
     */
    public Long getWafAnti() {
        return wafAnti;
    }

    /**
     * set web防护
     *
     * @param wafAnti
     */
    public void setWafAnti(Long wafAnti) {
        this.wafAnti = wafAnti;
    }



    /**
     * set 自定义规则防护
     *
     * @param aclAnti
     */
    public AttackInfo aclAnti(Long aclAnti) {
        this.aclAnti = aclAnti;
        return this;
    }


    /**
     * set cc防护
     *
     * @param ccAnti
     */
    public AttackInfo ccAnti(Long ccAnti) {
        this.ccAnti = ccAnti;
        return this;
    }


    /**
     * set web防护
     *
     * @param wafAnti
     */
    public AttackInfo wafAnti(Long wafAnti) {
        this.wafAnti = wafAnti;
        return this;
    }


}