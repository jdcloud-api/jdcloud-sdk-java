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

package com.jdcloud.sdk.service.invoice.model;


/**
 * invoiceMsgTemplate
 */
public class InvoiceMsgTemplate  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pin
     */
    private String pin;

    /**
     * 发票类型[个人增值税普通发票-Personal_VAT_Ordinary_Invoice，企业增值税专用发票-Enterprise_VAT_Special_Invoice，企业增值税普通发票-Enterprise_VAT_Ordinary_Invoice]
     */
    private String invoiceType;

    /**
     * 发票抬头
     */
    private String invoiceTitle;

    /**
     * 发票内容
     */
    private String invoiceContent;

    /**
     * 纳税人识别号
     */
    private String taxNo;

    /**
     * 个人发票抬头
     */
    private String personalInvoiceTitle;

    /**
     * 开票类型[电子-electronic]
     */
    private String mediumType;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话
     */
    private String phone;



    /**
     * get pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 发票类型[个人增值税普通发票-Personal_VAT_Ordinary_Invoice，企业增值税专用发票-Enterprise_VAT_Special_Invoice，企业增值税普通发票-Enterprise_VAT_Ordinary_Invoice]
     *
     * @return
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * set 发票类型[个人增值税普通发票-Personal_VAT_Ordinary_Invoice，企业增值税专用发票-Enterprise_VAT_Special_Invoice，企业增值税普通发票-Enterprise_VAT_Ordinary_Invoice]
     *
     * @param invoiceType
     */
    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }


    /**
     * get 发票抬头
     *
     * @return
     */
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    /**
     * set 发票抬头
     *
     * @param invoiceTitle
     */
    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }


    /**
     * get 发票内容
     *
     * @return
     */
    public String getInvoiceContent() {
        return invoiceContent;
    }

    /**
     * set 发票内容
     *
     * @param invoiceContent
     */
    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent;
    }


    /**
     * get 纳税人识别号
     *
     * @return
     */
    public String getTaxNo() {
        return taxNo;
    }

    /**
     * set 纳税人识别号
     *
     * @param taxNo
     */
    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }


    /**
     * get 个人发票抬头
     *
     * @return
     */
    public String getPersonalInvoiceTitle() {
        return personalInvoiceTitle;
    }

    /**
     * set 个人发票抬头
     *
     * @param personalInvoiceTitle
     */
    public void setPersonalInvoiceTitle(String personalInvoiceTitle) {
        this.personalInvoiceTitle = personalInvoiceTitle;
    }


    /**
     * get 开票类型[电子-electronic]
     *
     * @return
     */
    public String getMediumType() {
        return mediumType;
    }

    /**
     * set 开票类型[电子-electronic]
     *
     * @param mediumType
     */
    public void setMediumType(String mediumType) {
        this.mediumType = mediumType;
    }


    /**
     * get 邮箱
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set 邮箱
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * get 电话
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * set 电话
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }



    /**
     * set pin
     *
     * @param pin
     */
    public InvoiceMsgTemplate pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 发票类型[个人增值税普通发票-Personal_VAT_Ordinary_Invoice，企业增值税专用发票-Enterprise_VAT_Special_Invoice，企业增值税普通发票-Enterprise_VAT_Ordinary_Invoice]
     *
     * @param invoiceType
     */
    public InvoiceMsgTemplate invoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }


    /**
     * set 发票抬头
     *
     * @param invoiceTitle
     */
    public InvoiceMsgTemplate invoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
        return this;
    }


    /**
     * set 发票内容
     *
     * @param invoiceContent
     */
    public InvoiceMsgTemplate invoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent;
        return this;
    }


    /**
     * set 纳税人识别号
     *
     * @param taxNo
     */
    public InvoiceMsgTemplate taxNo(String taxNo) {
        this.taxNo = taxNo;
        return this;
    }


    /**
     * set 个人发票抬头
     *
     * @param personalInvoiceTitle
     */
    public InvoiceMsgTemplate personalInvoiceTitle(String personalInvoiceTitle) {
        this.personalInvoiceTitle = personalInvoiceTitle;
        return this;
    }


    /**
     * set 开票类型[电子-electronic]
     *
     * @param mediumType
     */
    public InvoiceMsgTemplate mediumType(String mediumType) {
        this.mediumType = mediumType;
        return this;
    }


    /**
     * set 邮箱
     *
     * @param email
     */
    public InvoiceMsgTemplate email(String email) {
        this.email = email;
        return this;
    }


    /**
     * set 电话
     *
     * @param phone
     */
    public InvoiceMsgTemplate phone(String phone) {
        this.phone = phone;
        return this;
    }


}