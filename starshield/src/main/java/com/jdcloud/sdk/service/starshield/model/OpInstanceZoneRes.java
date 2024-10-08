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

package com.jdcloud.sdk.service.starshield.model;


/**
 * opInstanceZoneRes
 */
public class OpInstanceZoneRes  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名id
     */
    private String zoneId;

    /**
     * 域名
     */
    private String zoneName;

    /**
     * 域名状态(pending-&gt;待激活 active-&gt;已激活)
     */
    private String zoneStatus;



    /**
     * get 域名id
     *
     * @return
     */
    public String getZoneId() {
        return zoneId;
    }

    /**
     * set 域名id
     *
     * @param zoneId
     */
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }


    /**
     * get 域名
     *
     * @return
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * set 域名
     *
     * @param zoneName
     */
    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }


    /**
     * get 域名状态(pending-&gt;待激活 active-&gt;已激活)
     *
     * @return
     */
    public String getZoneStatus() {
        return zoneStatus;
    }

    /**
     * set 域名状态(pending-&gt;待激活 active-&gt;已激活)
     *
     * @param zoneStatus
     */
    public void setZoneStatus(String zoneStatus) {
        this.zoneStatus = zoneStatus;
    }



    /**
     * set 域名id
     *
     * @param zoneId
     */
    public OpInstanceZoneRes zoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }


    /**
     * set 域名
     *
     * @param zoneName
     */
    public OpInstanceZoneRes zoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }


    /**
     * set 域名状态(pending-&gt;待激活 active-&gt;已激活)
     *
     * @param zoneStatus
     */
    public OpInstanceZoneRes zoneStatus(String zoneStatus) {
        this.zoneStatus = zoneStatus;
        return this;
    }


}