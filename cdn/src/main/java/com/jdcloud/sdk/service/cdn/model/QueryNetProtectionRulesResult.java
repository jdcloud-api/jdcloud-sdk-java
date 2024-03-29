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
 * SCDN相关接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.cdn.model.GeoArea;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询网络防护层规则接口
 */
public class QueryNetProtectionRulesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 网络防护层总开关，取值on,off，其中on开启，off关闭
     */
    private String switchStatus;

    /**
     * 源新建连接限速，取值on,off，其中on开启，off关闭
     */
    private String srcNewConnLimitEnable;

    /**
     * 目的新建连接，取值on,off，其中on开启，off关闭
     */
    private String dstNewConnLimitEnable;

    /**
     * 报文最小长度（包最小长度）,取值：1-1500
     */
    private Long datagramRangeMin;

    /**
     * 报文最大长度（包最大长度）,取值：1-1500
     */
    private Long datagramRangeMax;

    /**
     * 源新建连接限速值，取值：0-4294967295
     */
    private Long srcNewConnLimitValue;

    /**
     * 目的新建连接限速值，取值：0-4294967295
     */
    private Long dstNewConnLimitValue;

    /**
     * geoBlack
     */
    
    private List<GeoArea> geoBlack;
    /**
     * ipBlack
     */
    
    private List<String> ipBlack;
    /**
     * ipWhite
     */
    
    private List<String> ipWhite;


    /**
     * get 网络防护层总开关，取值on,off，其中on开启，off关闭
     *
     * @return
     */
    public String getSwitchStatus() {
        return switchStatus;
    }

    /**
     * set 网络防护层总开关，取值on,off，其中on开启，off关闭
     *
     * @param switchStatus
     */
    public void setSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
    }


    /**
     * get 源新建连接限速，取值on,off，其中on开启，off关闭
     *
     * @return
     */
    public String getSrcNewConnLimitEnable() {
        return srcNewConnLimitEnable;
    }

    /**
     * set 源新建连接限速，取值on,off，其中on开启，off关闭
     *
     * @param srcNewConnLimitEnable
     */
    public void setSrcNewConnLimitEnable(String srcNewConnLimitEnable) {
        this.srcNewConnLimitEnable = srcNewConnLimitEnable;
    }


    /**
     * get 目的新建连接，取值on,off，其中on开启，off关闭
     *
     * @return
     */
    public String getDstNewConnLimitEnable() {
        return dstNewConnLimitEnable;
    }

    /**
     * set 目的新建连接，取值on,off，其中on开启，off关闭
     *
     * @param dstNewConnLimitEnable
     */
    public void setDstNewConnLimitEnable(String dstNewConnLimitEnable) {
        this.dstNewConnLimitEnable = dstNewConnLimitEnable;
    }


    /**
     * get 报文最小长度（包最小长度）,取值：1-1500
     *
     * @return
     */
    public Long getDatagramRangeMin() {
        return datagramRangeMin;
    }

    /**
     * set 报文最小长度（包最小长度）,取值：1-1500
     *
     * @param datagramRangeMin
     */
    public void setDatagramRangeMin(Long datagramRangeMin) {
        this.datagramRangeMin = datagramRangeMin;
    }


    /**
     * get 报文最大长度（包最大长度）,取值：1-1500
     *
     * @return
     */
    public Long getDatagramRangeMax() {
        return datagramRangeMax;
    }

    /**
     * set 报文最大长度（包最大长度）,取值：1-1500
     *
     * @param datagramRangeMax
     */
    public void setDatagramRangeMax(Long datagramRangeMax) {
        this.datagramRangeMax = datagramRangeMax;
    }


    /**
     * get 源新建连接限速值，取值：0-4294967295
     *
     * @return
     */
    public Long getSrcNewConnLimitValue() {
        return srcNewConnLimitValue;
    }

    /**
     * set 源新建连接限速值，取值：0-4294967295
     *
     * @param srcNewConnLimitValue
     */
    public void setSrcNewConnLimitValue(Long srcNewConnLimitValue) {
        this.srcNewConnLimitValue = srcNewConnLimitValue;
    }


    /**
     * get 目的新建连接限速值，取值：0-4294967295
     *
     * @return
     */
    public Long getDstNewConnLimitValue() {
        return dstNewConnLimitValue;
    }

    /**
     * set 目的新建连接限速值，取值：0-4294967295
     *
     * @param dstNewConnLimitValue
     */
    public void setDstNewConnLimitValue(Long dstNewConnLimitValue) {
        this.dstNewConnLimitValue = dstNewConnLimitValue;
    }


    /**
    * get geoBlack
    *
    * @return
    */
    public List<GeoArea> getGeoBlack() {
        return geoBlack;
    }

    /**
    * set geoBlack
    *
    * @param geoBlack
    */
    public void setGeoBlack(List<GeoArea> geoBlack) {
        this.geoBlack = geoBlack;
    }


    /**
    * get ipBlack
    *
    * @return
    */
    public List<String> getIpBlack() {
        return ipBlack;
    }

    /**
    * set ipBlack
    *
    * @param ipBlack
    */
    public void setIpBlack(List<String> ipBlack) {
        this.ipBlack = ipBlack;
    }


    /**
    * get ipWhite
    *
    * @return
    */
    public List<String> getIpWhite() {
        return ipWhite;
    }

    /**
    * set ipWhite
    *
    * @param ipWhite
    */
    public void setIpWhite(List<String> ipWhite) {
        this.ipWhite = ipWhite;
    }



    /**
     * set 网络防护层总开关，取值on,off，其中on开启，off关闭
     *
     * @param switchStatus
     */
    public QueryNetProtectionRulesResult switchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }


    /**
     * set 源新建连接限速，取值on,off，其中on开启，off关闭
     *
     * @param srcNewConnLimitEnable
     */
    public QueryNetProtectionRulesResult srcNewConnLimitEnable(String srcNewConnLimitEnable) {
        this.srcNewConnLimitEnable = srcNewConnLimitEnable;
        return this;
    }


    /**
     * set 目的新建连接，取值on,off，其中on开启，off关闭
     *
     * @param dstNewConnLimitEnable
     */
    public QueryNetProtectionRulesResult dstNewConnLimitEnable(String dstNewConnLimitEnable) {
        this.dstNewConnLimitEnable = dstNewConnLimitEnable;
        return this;
    }


    /**
     * set 报文最小长度（包最小长度）,取值：1-1500
     *
     * @param datagramRangeMin
     */
    public QueryNetProtectionRulesResult datagramRangeMin(Long datagramRangeMin) {
        this.datagramRangeMin = datagramRangeMin;
        return this;
    }


    /**
     * set 报文最大长度（包最大长度）,取值：1-1500
     *
     * @param datagramRangeMax
     */
    public QueryNetProtectionRulesResult datagramRangeMax(Long datagramRangeMax) {
        this.datagramRangeMax = datagramRangeMax;
        return this;
    }


    /**
     * set 源新建连接限速值，取值：0-4294967295
     *
     * @param srcNewConnLimitValue
     */
    public QueryNetProtectionRulesResult srcNewConnLimitValue(Long srcNewConnLimitValue) {
        this.srcNewConnLimitValue = srcNewConnLimitValue;
        return this;
    }


    /**
     * set 目的新建连接限速值，取值：0-4294967295
     *
     * @param dstNewConnLimitValue
     */
    public QueryNetProtectionRulesResult dstNewConnLimitValue(Long dstNewConnLimitValue) {
        this.dstNewConnLimitValue = dstNewConnLimitValue;
        return this;
    }


    /**
    * set geoBlack
    *
    * @param geoBlack
    */
    public QueryNetProtectionRulesResult geoBlack(List<GeoArea> geoBlack) {
        this.geoBlack = geoBlack;
        return this;
    }


    /**
    * set ipBlack
    *
    * @param ipBlack
    */
    public QueryNetProtectionRulesResult ipBlack(List<String> ipBlack) {
        this.ipBlack = ipBlack;
        return this;
    }


    /**
    * set ipWhite
    *
    * @param ipWhite
    */
    public QueryNetProtectionRulesResult ipWhite(List<String> ipWhite) {
        this.ipWhite = ipWhite;
        return this;
    }



    /**
     * add item to geoBlack
     *
     * @param geoBlack
     */
    public void addGeoBlack(GeoArea geoBlack) {
        if (this.geoBlack == null) {
            this.geoBlack = new ArrayList<>();
        }
        this.geoBlack.add(geoBlack);
    }

    /**
     * add item to ipBlack
     *
     * @param ipBlack
     */
    public void addIpBlack(String ipBlack) {
        if (this.ipBlack == null) {
            this.ipBlack = new ArrayList<>();
        }
        this.ipBlack.add(ipBlack);
    }

    /**
     * add item to ipWhite
     *
     * @param ipWhite
     */
    public void addIpWhite(String ipWhite) {
        if (this.ipWhite == null) {
            this.ipWhite = new ArrayList<>();
        }
        this.ipWhite.add(ipWhite);
    }
}