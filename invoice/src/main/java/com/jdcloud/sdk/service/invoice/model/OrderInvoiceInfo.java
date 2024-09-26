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
 * orderInvoiceInfo
 */
public class OrderInvoiceInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 开票总金额
     */
    private Number invoiceTotalAmount;

    /**
     * 订单开票详细信息列表
     */
    
    private List<OrderInvoiceDetail> orderInvoiceDetailList;
    /**
     * 退款订单发票状态，1-退款订单有发票 0-退款订单无发票/已退票
     */
    private Integer invoiceStatus;



    /**
     * get 开票总金额
     *
     * @return
     */
    public Number getInvoiceTotalAmount() {
        return invoiceTotalAmount;
    }

    /**
     * set 开票总金额
     *
     * @param invoiceTotalAmount
     */
    public void setInvoiceTotalAmount(Number invoiceTotalAmount) {
        this.invoiceTotalAmount = invoiceTotalAmount;
    }


    /**
    * get 订单开票详细信息列表
    *
    * @return
    */
    public List<OrderInvoiceDetail> getOrderInvoiceDetailList() {
        return orderInvoiceDetailList;
    }

    /**
    * set 订单开票详细信息列表
    *
    * @param orderInvoiceDetailList
    */
    public void setOrderInvoiceDetailList(List<OrderInvoiceDetail> orderInvoiceDetailList) {
        this.orderInvoiceDetailList = orderInvoiceDetailList;
    }


    /**
     * get 退款订单发票状态，1-退款订单有发票 0-退款订单无发票/已退票
     *
     * @return
     */
    public Integer getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * set 退款订单发票状态，1-退款订单有发票 0-退款订单无发票/已退票
     *
     * @param invoiceStatus
     */
    public void setInvoiceStatus(Integer invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }



    /**
     * set 开票总金额
     *
     * @param invoiceTotalAmount
     */
    public OrderInvoiceInfo invoiceTotalAmount(Number invoiceTotalAmount) {
        this.invoiceTotalAmount = invoiceTotalAmount;
        return this;
    }


    /**
    * set 订单开票详细信息列表
    *
    * @param orderInvoiceDetailList
    */
    public OrderInvoiceInfo orderInvoiceDetailList(List<OrderInvoiceDetail> orderInvoiceDetailList) {
        this.orderInvoiceDetailList = orderInvoiceDetailList;
        return this;
    }


    /**
     * set 退款订单发票状态，1-退款订单有发票 0-退款订单无发票/已退票
     *
     * @param invoiceStatus
     */
    public OrderInvoiceInfo invoiceStatus(Integer invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
        return this;
    }



    /**
     * add item to 订单开票详细信息列表
     *
     * @param orderInvoiceDetailList
     */
    public void addOrderInvoiceDetailList(OrderInvoiceDetail orderInvoiceDetailList) {
        if (this.orderInvoiceDetailList == null) {
            this.orderInvoiceDetailList = new ArrayList<>();
        }
        this.orderInvoiceDetailList.add(orderInvoiceDetailList);
    }
}