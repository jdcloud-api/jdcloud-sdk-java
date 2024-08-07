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
 * 用户中心
 * 用户中心接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.user.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * azRequest
 */
public class AzRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 物理可用区
     * Required:true
     */
    @Required
    private String pAz;

    /**
     * 逻辑可用区
     * Required:true
     */
    @Required
    private String lAz;



    /**
     * get 物理可用区
     *
     * @return
     */
    public String getPAz() {
        return pAz;
    }

    /**
     * set 物理可用区
     *
     * @param pAz
     */
    public void setPAz(String pAz) {
        this.pAz = pAz;
    }


    /**
     * get 逻辑可用区
     *
     * @return
     */
    public String getLAz() {
        return lAz;
    }

    /**
     * set 逻辑可用区
     *
     * @param lAz
     */
    public void setLAz(String lAz) {
        this.lAz = lAz;
    }



    /**
     * set 物理可用区
     *
     * @param pAz
     */
    public AzRequest pAz(String pAz) {
        this.pAz = pAz;
        return this;
    }


    /**
     * set 逻辑可用区
     *
     * @param lAz
     */
    public AzRequest lAz(String lAz) {
        this.lAz = lAz;
        return this;
    }


}