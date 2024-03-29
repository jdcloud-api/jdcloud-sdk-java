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

package com.jdcloud.sdk.service.bgw.model;


/**
 * partner
 */
public class Partner  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Partner的Id
     */
    private String partnerId;

    /**
     * Partner的名称, 只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     */
    private String partnerName;

    /**
     * Partner的编码
     */
    private String partnerCode;

    /**
     * Partner的创建时间
     */
    private String createdTime;

    /**
     * 合作伙伴联系电话，11位数字且需要13、14、15、16、17、18、19开头
     */
    private String phoneNumber;

    /**
     * 合作伙伴联系邮箱，最长支持50个字符
     */
    private String mailbox;

    /**
     * 合作伙伴对应的pin
     */
    private String pin;



    /**
     * get Partner的Id
     *
     * @return
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * set Partner的Id
     *
     * @param partnerId
     */
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }


    /**
     * get Partner的名称, 只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @return
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * set Partner的名称, 只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param partnerName
     */
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }


    /**
     * get Partner的编码
     *
     * @return
     */
    public String getPartnerCode() {
        return partnerCode;
    }

    /**
     * set Partner的编码
     *
     * @param partnerCode
     */
    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }


    /**
     * get Partner的创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set Partner的创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * get 合作伙伴联系电话，11位数字且需要13、14、15、16、17、18、19开头
     *
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * set 合作伙伴联系电话，11位数字且需要13、14、15、16、17、18、19开头
     *
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * get 合作伙伴联系邮箱，最长支持50个字符
     *
     * @return
     */
    public String getMailbox() {
        return mailbox;
    }

    /**
     * set 合作伙伴联系邮箱，最长支持50个字符
     *
     * @param mailbox
     */
    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }


    /**
     * get 合作伙伴对应的pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 合作伙伴对应的pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }



    /**
     * set Partner的Id
     *
     * @param partnerId
     */
    public Partner partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }


    /**
     * set Partner的名称, 只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param partnerName
     */
    public Partner partnerName(String partnerName) {
        this.partnerName = partnerName;
        return this;
    }


    /**
     * set Partner的编码
     *
     * @param partnerCode
     */
    public Partner partnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }


    /**
     * set Partner的创建时间
     *
     * @param createdTime
     */
    public Partner createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }


    /**
     * set 合作伙伴联系电话，11位数字且需要13、14、15、16、17、18、19开头
     *
     * @param phoneNumber
     */
    public Partner phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }


    /**
     * set 合作伙伴联系邮箱，最长支持50个字符
     *
     * @param mailbox
     */
    public Partner mailbox(String mailbox) {
        this.mailbox = mailbox;
        return this;
    }


    /**
     * set 合作伙伴对应的pin
     *
     * @param pin
     */
    public Partner pin(String pin) {
        this.pin = pin;
        return this;
    }


}