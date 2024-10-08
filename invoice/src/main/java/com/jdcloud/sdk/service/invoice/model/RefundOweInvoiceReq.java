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
 * refundOweInvoiceReq
 */
public class RefundOweInvoiceReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 退款欠票信息
     */
    
    private List<RefundOweInvoice> invoiceOweInfoList;


    /**
    * get 退款欠票信息
    *
    * @return
    */
    public List<RefundOweInvoice> getInvoiceOweInfoList() {
        return invoiceOweInfoList;
    }

    /**
    * set 退款欠票信息
    *
    * @param invoiceOweInfoList
    */
    public void setInvoiceOweInfoList(List<RefundOweInvoice> invoiceOweInfoList) {
        this.invoiceOweInfoList = invoiceOweInfoList;
    }



    /**
    * set 退款欠票信息
    *
    * @param invoiceOweInfoList
    */
    public RefundOweInvoiceReq invoiceOweInfoList(List<RefundOweInvoice> invoiceOweInfoList) {
        this.invoiceOweInfoList = invoiceOweInfoList;
        return this;
    }



    /**
     * add item to 退款欠票信息
     *
     * @param invoiceOweInfoList
     */
    public void addInvoiceOweInfoList(RefundOweInvoice invoiceOweInfoList) {
        if (this.invoiceOweInfoList == null) {
            this.invoiceOweInfoList = new ArrayList<>();
        }
        this.invoiceOweInfoList.add(invoiceOweInfoList);
    }
}