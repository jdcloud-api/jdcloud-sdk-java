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

package com.jdcloud.sdk.service.partner.model;

import java.util.List;
import java.util.ArrayList;

/**
 * serviceCodeBill
 */
public class ServiceCodeBill  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pin
     */
    private String pin;

    /**
     * 按serviceCode汇总的账单列表
     */
    
    private List<ServiceCodeItemBill> billSummaryServiceCodeItemVoList;


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
    * get 按serviceCode汇总的账单列表
    *
    * @return
    */
    public List<ServiceCodeItemBill> getBillSummaryServiceCodeItemVoList() {
        return billSummaryServiceCodeItemVoList;
    }

    /**
    * set 按serviceCode汇总的账单列表
    *
    * @param billSummaryServiceCodeItemVoList
    */
    public void setBillSummaryServiceCodeItemVoList(List<ServiceCodeItemBill> billSummaryServiceCodeItemVoList) {
        this.billSummaryServiceCodeItemVoList = billSummaryServiceCodeItemVoList;
    }



    /**
     * set pin
     *
     * @param pin
     */
    public ServiceCodeBill pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
    * set 按serviceCode汇总的账单列表
    *
    * @param billSummaryServiceCodeItemVoList
    */
    public ServiceCodeBill billSummaryServiceCodeItemVoList(List<ServiceCodeItemBill> billSummaryServiceCodeItemVoList) {
        this.billSummaryServiceCodeItemVoList = billSummaryServiceCodeItemVoList;
        return this;
    }



    /**
     * add item to 按serviceCode汇总的账单列表
     *
     * @param billSummaryServiceCodeItemVoList
     */
    public void addBillSummaryServiceCodeItemVoList(ServiceCodeItemBill billSummaryServiceCodeItemVoList) {
        if (this.billSummaryServiceCodeItemVoList == null) {
            this.billSummaryServiceCodeItemVoList = new ArrayList<>();
        }
        this.billSummaryServiceCodeItemVoList.add(billSummaryServiceCodeItemVoList);
    }
}