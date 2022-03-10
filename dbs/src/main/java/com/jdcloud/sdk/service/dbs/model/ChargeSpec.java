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

package com.jdcloud.sdk.service.dbs.model;


/**
 * chargeSpec
 */
public class ChargeSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 计费模式，取值为：prepaid_by_duration，postpaid_by_usage或postpaid_by_duration，prepaid_by_duration表示预付费，postpaid_by_usage表示按用量后付费，postpaid_by_duration表示按配置后付费，默认为postpaid_by_duration.请参阅具体产品线帮助文档确认该产品线支持的计费类型
     */
    private String chargeMode;

    /**
     * 预付费计费单位，预付费必填，当chargeMode为prepaid_by_duration时有效，取值为：month、year，默认为month
     */
    private String chargeUnit;

    /**
     * 预付费计费时长，预付费必填，当chargeMode取值为prepaid_by_duration时有效。当chargeUnit为month时取值为：1~9，当chargeUnit为year时取值为：1、2、3
     */
    private Integer chargeDuration;


    /**
     * get 计费模式，取值为：prepaid_by_duration，postpaid_by_usage或postpaid_by_duration，prepaid_by_duration表示预付费，postpaid_by_usage表示按用量后付费，postpaid_by_duration表示按配置后付费，默认为postpaid_by_duration.请参阅具体产品线帮助文档确认该产品线支持的计费类型
     *
     * @return
     */
    public String getChargeMode() {
        return chargeMode;
    }

    /**
     * set 计费模式，取值为：prepaid_by_duration，postpaid_by_usage或postpaid_by_duration，prepaid_by_duration表示预付费，postpaid_by_usage表示按用量后付费，postpaid_by_duration表示按配置后付费，默认为postpaid_by_duration.请参阅具体产品线帮助文档确认该产品线支持的计费类型
     *
     * @param chargeMode
     */
    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    /**
     * get 预付费计费单位，预付费必填，当chargeMode为prepaid_by_duration时有效，取值为：month、year，默认为month
     *
     * @return
     */
    public String getChargeUnit() {
        return chargeUnit;
    }

    /**
     * set 预付费计费单位，预付费必填，当chargeMode为prepaid_by_duration时有效，取值为：month、year，默认为month
     *
     * @param chargeUnit
     */
    public void setChargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit;
    }

    /**
     * get 预付费计费时长，预付费必填，当chargeMode取值为prepaid_by_duration时有效。当chargeUnit为month时取值为：1~9，当chargeUnit为year时取值为：1、2、3
     *
     * @return
     */
    public Integer getChargeDuration() {
        return chargeDuration;
    }

    /**
     * set 预付费计费时长，预付费必填，当chargeMode取值为prepaid_by_duration时有效。当chargeUnit为month时取值为：1~9，当chargeUnit为year时取值为：1、2、3
     *
     * @param chargeDuration
     */
    public void setChargeDuration(Integer chargeDuration) {
        this.chargeDuration = chargeDuration;
    }


    /**
     * set 计费模式，取值为：prepaid_by_duration，postpaid_by_usage或postpaid_by_duration，prepaid_by_duration表示预付费，postpaid_by_usage表示按用量后付费，postpaid_by_duration表示按配置后付费，默认为postpaid_by_duration.请参阅具体产品线帮助文档确认该产品线支持的计费类型
     *
     * @param chargeMode
     */
    public ChargeSpec chargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * set 预付费计费单位，预付费必填，当chargeMode为prepaid_by_duration时有效，取值为：month、year，默认为month
     *
     * @param chargeUnit
     */
    public ChargeSpec chargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit;
        return this;
    }

    /**
     * set 预付费计费时长，预付费必填，当chargeMode取值为prepaid_by_duration时有效。当chargeUnit为month时取值为：1~9，当chargeUnit为year时取值为：1、2、3
     *
     * @param chargeDuration
     */
    public ChargeSpec chargeDuration(Integer chargeDuration) {
        this.chargeDuration = chargeDuration;
        return this;
    }


}