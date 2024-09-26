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
 * invoiceOweReq
 */
public class InvoiceOweReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 页码
     */
    private Integer pageIndex;

    /**
     * 页大小
     */
    private Integer pageSize;



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
     * get 页码
     *
     * @return
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * set 页码
     *
     * @param pageIndex
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }


    /**
     * get 页大小
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 页大小
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }



    /**
     * set 用户pin
     *
     * @param pin
     */
    public InvoiceOweReq pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 页码
     *
     * @param pageIndex
     */
    public InvoiceOweReq pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }


    /**
     * set 页大小
     *
     * @param pageSize
     */
    public InvoiceOweReq pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


}