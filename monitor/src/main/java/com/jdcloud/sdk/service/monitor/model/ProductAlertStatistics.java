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

package com.jdcloud.sdk.service.monitor.model;


/**
 * productAlertStatistics
 */
public class ProductAlertStatistics  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规则个数
     */
    private Long alertCount;

    /**
     * 产品
     */
    private String product;

    /**
     * 产品名称
     */
    private String productName;


    /**
     * get 规则个数
     *
     * @return
     */
    public Long getAlertCount() {
        return alertCount;
    }

    /**
     * set 规则个数
     *
     * @param alertCount
     */
    public void setAlertCount(Long alertCount) {
        this.alertCount = alertCount;
    }

    /**
     * get 产品
     *
     * @return
     */
    public String getProduct() {
        return product;
    }

    /**
     * set 产品
     *
     * @param product
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * get 产品名称
     *
     * @return
     */
    public String getProductName() {
        return productName;
    }

    /**
     * set 产品名称
     *
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }


    /**
     * set 规则个数
     *
     * @param alertCount
     */
    public ProductAlertStatistics alertCount(Long alertCount) {
        this.alertCount = alertCount;
        return this;
    }

    /**
     * set 产品
     *
     * @param product
     */
    public ProductAlertStatistics product(String product) {
        this.product = product;
        return this;
    }

    /**
     * set 产品名称
     *
     * @param productName
     */
    public ProductAlertStatistics productName(String productName) {
        this.productName = productName;
        return this;
    }


}