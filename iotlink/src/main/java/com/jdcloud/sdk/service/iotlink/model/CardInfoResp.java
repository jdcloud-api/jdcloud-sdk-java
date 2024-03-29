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

package com.jdcloud.sdk.service.iotlink.model;


/**
 * cardInfoResp
 */
public class CardInfoResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 物联网卡iccid
     */
    private String iccid;

    /**
     * 物联网卡套餐名称
     */
    private String packageName;

    /**
     * 物联网卡激活时间
     */
    private String activeTm;

    /**
     * 套餐到期时间
     */
    private String packageExpiredTm;



    /**
     * get 物联网卡iccid
     *
     * @return
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * set 物联网卡iccid
     *
     * @param iccid
     */
    public void setIccid(String iccid) {
        this.iccid = iccid;
    }


    /**
     * get 物联网卡套餐名称
     *
     * @return
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * set 物联网卡套餐名称
     *
     * @param packageName
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }


    /**
     * get 物联网卡激活时间
     *
     * @return
     */
    public String getActiveTm() {
        return activeTm;
    }

    /**
     * set 物联网卡激活时间
     *
     * @param activeTm
     */
    public void setActiveTm(String activeTm) {
        this.activeTm = activeTm;
    }


    /**
     * get 套餐到期时间
     *
     * @return
     */
    public String getPackageExpiredTm() {
        return packageExpiredTm;
    }

    /**
     * set 套餐到期时间
     *
     * @param packageExpiredTm
     */
    public void setPackageExpiredTm(String packageExpiredTm) {
        this.packageExpiredTm = packageExpiredTm;
    }



    /**
     * set 物联网卡iccid
     *
     * @param iccid
     */
    public CardInfoResp iccid(String iccid) {
        this.iccid = iccid;
        return this;
    }


    /**
     * set 物联网卡套餐名称
     *
     * @param packageName
     */
    public CardInfoResp packageName(String packageName) {
        this.packageName = packageName;
        return this;
    }


    /**
     * set 物联网卡激活时间
     *
     * @param activeTm
     */
    public CardInfoResp activeTm(String activeTm) {
        this.activeTm = activeTm;
        return this;
    }


    /**
     * set 套餐到期时间
     *
     * @param packageExpiredTm
     */
    public CardInfoResp packageExpiredTm(String packageExpiredTm) {
        this.packageExpiredTm = packageExpiredTm;
        return this;
    }


}