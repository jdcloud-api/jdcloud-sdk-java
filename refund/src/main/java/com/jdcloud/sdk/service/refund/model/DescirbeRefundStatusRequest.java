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
 * 退款
 * 退款服务
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.refund.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询退款状态
 */
public class DescirbeRefundStatusRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pin
     * Required:true
     */
    @Required
    private String pin;

    /**
     * refundId
     */
    private String refundId;

    /**
     * resourceId
     */
    private String resourceId;

    /**
     * 第几页，默认值为0
     */
    private Integer pageNumber;

    /**
     * 每页条数，默认为20
     */
    private Integer pageSize;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


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
     * get refundId
     *
     * @return
     */
    public String getRefundId() {
        return refundId;
    }

    /**
     * set refundId
     *
     * @param refundId
     */
    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    /**
     * get resourceId
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set resourceId
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 第几页，默认值为0
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 第几页，默认值为0
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 每页条数，默认为20
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页条数，默认为20
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set pin
     *
     * @param pin
     */
    public DescirbeRefundStatusRequest pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set refundId
     *
     * @param refundId
     */
    public DescirbeRefundStatusRequest refundId(String refundId) {
        this.refundId = refundId;
        return this;
    }

    /**
     * set resourceId
     *
     * @param resourceId
     */
    public DescirbeRefundStatusRequest resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 第几页，默认值为0
     *
     * @param pageNumber
     */
    public DescirbeRefundStatusRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 每页条数，默认为20
     *
     * @param pageSize
     */
    public DescirbeRefundStatusRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DescirbeRefundStatusRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}