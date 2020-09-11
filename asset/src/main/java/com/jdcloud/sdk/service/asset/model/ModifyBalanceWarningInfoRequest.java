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
 * Asset-Management
 * API about asset
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.asset.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.asset.model.BalanceWarningInfoVo;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设置余额预警信息
 */
public class ModifyBalanceWarningInfoRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * balanceWarningInfoVo
     * Required:true
     */
    @Required
    private BalanceWarningInfoVo balanceWarningInfoVo;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get balanceWarningInfoVo
     *
     * @return
     */
    public BalanceWarningInfoVo getBalanceWarningInfoVo() {
        return balanceWarningInfoVo;
    }

    /**
     * set balanceWarningInfoVo
     *
     * @param balanceWarningInfoVo
     */
    public void setBalanceWarningInfoVo(BalanceWarningInfoVo balanceWarningInfoVo) {
        this.balanceWarningInfoVo = balanceWarningInfoVo;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set balanceWarningInfoVo
     *
     * @param balanceWarningInfoVo
     */
    public ModifyBalanceWarningInfoRequest balanceWarningInfoVo(BalanceWarningInfoVo balanceWarningInfoVo) {
        this.balanceWarningInfoVo = balanceWarningInfoVo;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public ModifyBalanceWarningInfoRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}