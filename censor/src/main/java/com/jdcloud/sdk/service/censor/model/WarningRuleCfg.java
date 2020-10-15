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

package com.jdcloud.sdk.service.censor.model;

import java.util.List;
import java.util.ArrayList;

/**
 * warningRuleCfg
 */
public class WarningRuleCfg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    private String userPin;

    /**
     * 是否开启开关
     */
    private Integer enable;

    /**
     * 是否开启实时消息提醒
     */
    private Integer realTimeNotify;

    /**
     * logTypes
     */
    private List<String> logTypes;

    /**
     * riskLevels
     */
    private List<String> riskLevels;

    /**
     * 通知时间，eg:&quot;10:00:00&quot;
     */
    private String notifyTime;

    /**
     * 告警方式
     */
    private List<String> contactWays;

    /**
     * 告警通知人
     */
    private List<ContactPerson> contactorPersons;

    /**
     * 告警通知群组
     */
    private List<ContactGroup> contactorGroups;


    /**
     * get 用户名
     *
     * @return
     */
    public String getUserPin() {
        return userPin;
    }

    /**
     * set 用户名
     *
     * @param userPin
     */
    public void setUserPin(String userPin) {
        this.userPin = userPin;
    }

    /**
     * get 是否开启开关
     *
     * @return
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * set 是否开启开关
     *
     * @param enable
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * get 是否开启实时消息提醒
     *
     * @return
     */
    public Integer getRealTimeNotify() {
        return realTimeNotify;
    }

    /**
     * set 是否开启实时消息提醒
     *
     * @param realTimeNotify
     */
    public void setRealTimeNotify(Integer realTimeNotify) {
        this.realTimeNotify = realTimeNotify;
    }

    /**
     * get logTypes
     *
     * @return
     */
    public List<String> getLogTypes() {
        return logTypes;
    }

    /**
     * set logTypes
     *
     * @param logTypes
     */
    public void setLogTypes(List<String> logTypes) {
        this.logTypes = logTypes;
    }

    /**
     * get riskLevels
     *
     * @return
     */
    public List<String> getRiskLevels() {
        return riskLevels;
    }

    /**
     * set riskLevels
     *
     * @param riskLevels
     */
    public void setRiskLevels(List<String> riskLevels) {
        this.riskLevels = riskLevels;
    }

    /**
     * get 通知时间，eg:&quot;10:00:00&quot;
     *
     * @return
     */
    public String getNotifyTime() {
        return notifyTime;
    }

    /**
     * set 通知时间，eg:&quot;10:00:00&quot;
     *
     * @param notifyTime
     */
    public void setNotifyTime(String notifyTime) {
        this.notifyTime = notifyTime;
    }

    /**
     * get 告警方式
     *
     * @return
     */
    public List<String> getContactWays() {
        return contactWays;
    }

    /**
     * set 告警方式
     *
     * @param contactWays
     */
    public void setContactWays(List<String> contactWays) {
        this.contactWays = contactWays;
    }

    /**
     * get 告警通知人
     *
     * @return
     */
    public List<ContactPerson> getContactorPersons() {
        return contactorPersons;
    }

    /**
     * set 告警通知人
     *
     * @param contactorPersons
     */
    public void setContactorPersons(List<ContactPerson> contactorPersons) {
        this.contactorPersons = contactorPersons;
    }

    /**
     * get 告警通知群组
     *
     * @return
     */
    public List<ContactGroup> getContactorGroups() {
        return contactorGroups;
    }

    /**
     * set 告警通知群组
     *
     * @param contactorGroups
     */
    public void setContactorGroups(List<ContactGroup> contactorGroups) {
        this.contactorGroups = contactorGroups;
    }


    /**
     * set 用户名
     *
     * @param userPin
     */
    public WarningRuleCfg userPin(String userPin) {
        this.userPin = userPin;
        return this;
    }

    /**
     * set 是否开启开关
     *
     * @param enable
     */
    public WarningRuleCfg enable(Integer enable) {
        this.enable = enable;
        return this;
    }

    /**
     * set 是否开启实时消息提醒
     *
     * @param realTimeNotify
     */
    public WarningRuleCfg realTimeNotify(Integer realTimeNotify) {
        this.realTimeNotify = realTimeNotify;
        return this;
    }

    /**
     * set logTypes
     *
     * @param logTypes
     */
    public WarningRuleCfg logTypes(List<String> logTypes) {
        this.logTypes = logTypes;
        return this;
    }

    /**
     * set riskLevels
     *
     * @param riskLevels
     */
    public WarningRuleCfg riskLevels(List<String> riskLevels) {
        this.riskLevels = riskLevels;
        return this;
    }

    /**
     * set 通知时间，eg:&quot;10:00:00&quot;
     *
     * @param notifyTime
     */
    public WarningRuleCfg notifyTime(String notifyTime) {
        this.notifyTime = notifyTime;
        return this;
    }

    /**
     * set 告警方式
     *
     * @param contactWays
     */
    public WarningRuleCfg contactWays(List<String> contactWays) {
        this.contactWays = contactWays;
        return this;
    }

    /**
     * set 告警通知人
     *
     * @param contactorPersons
     */
    public WarningRuleCfg contactorPersons(List<ContactPerson> contactorPersons) {
        this.contactorPersons = contactorPersons;
        return this;
    }

    /**
     * set 告警通知群组
     *
     * @param contactorGroups
     */
    public WarningRuleCfg contactorGroups(List<ContactGroup> contactorGroups) {
        this.contactorGroups = contactorGroups;
        return this;
    }


    /**
     * add item to logTypes
     *
     * @param logType
     */
    public void addLogType(String logType) {
        if (this.logTypes == null) {
            this.logTypes = new ArrayList<>();
        }
        this.logTypes.add(logType);
    }

    /**
     * add item to riskLevels
     *
     * @param riskLevel
     */
    public void addRiskLevel(String riskLevel) {
        if (this.riskLevels == null) {
            this.riskLevels = new ArrayList<>();
        }
        this.riskLevels.add(riskLevel);
    }

    /**
     * add item to 告警方式
     *
     * @param contactWay
     */
    public void addContactWay(String contactWay) {
        if (this.contactWays == null) {
            this.contactWays = new ArrayList<>();
        }
        this.contactWays.add(contactWay);
    }

    /**
     * add item to 告警通知人
     *
     * @param contactorPerson
     */
    public void addContactorPerson(ContactPerson contactorPerson) {
        if (this.contactorPersons == null) {
            this.contactorPersons = new ArrayList<>();
        }
        this.contactorPersons.add(contactorPerson);
    }

    /**
     * add item to 告警通知群组
     *
     * @param contactorGroup
     */
    public void addContactorGroup(ContactGroup contactorGroup) {
        if (this.contactorGroups == null) {
            this.contactorGroups = new ArrayList<>();
        }
        this.contactorGroups.add(contactorGroup);
    }

}