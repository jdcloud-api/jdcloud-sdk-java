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

import java.util.List;
import java.util.ArrayList;

/**
 * invoicedRenewChildOrder
 */
public class InvoicedRenewChildOrder  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 子单列表
     */
    
    private List<String> childOrderList;


    /**
     * get 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
    * get 子单列表
    *
    * @return
    */
    public List<String> getChildOrderList() {
        return childOrderList;
    }

    /**
    * set 子单列表
    *
    * @param childOrderList
    */
    public void setChildOrderList(List<String> childOrderList) {
        this.childOrderList = childOrderList;
    }



    /**
     * set 用户pin
     *
     * @param pin
     */
    public InvoicedRenewChildOrder pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
    * set 子单列表
    *
    * @param childOrderList
    */
    public InvoicedRenewChildOrder childOrderList(List<String> childOrderList) {
        this.childOrderList = childOrderList;
        return this;
    }



    /**
     * add item to 子单列表
     *
     * @param childOrderList
     */
    public void addChildOrderList(String childOrderList) {
        if (this.childOrderList == null) {
            this.childOrderList = new ArrayList<>();
        }
        this.childOrderList.add(childOrderList);
    }
}