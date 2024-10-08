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
 * JDCLOUD Invoice API
 * 京东云发票
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.invoice.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 发票列表
 */
public class DescribeInvoicesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 发票状态[已申请-applied ，处理中-processing ，已开票-invoiced ，已邮寄-mailed ，已驳回-dismissed ，已作废-obsolete ，已取消-cancelled，退票中-refund，已退票-refunded，退票驳回-refund_rejected]
     */
    private String status;

    /**
     * 开始时间
     */
    private String searchStartDate;

    /**
     * 结束时间
     */
    private String searchEndDate;

    /**
     * 页码
     */
    private Integer pageNumber;

    /**
     * 页大小
     */
    private Integer pageSize;

    /**
     * 按明细开票 1 按月结算单开票 2 按指定金额开票 3
     */
    private Integer invoiceType;

    /**
     * 地域编码，参考OpenAPI公共说明
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 发票状态[已申请-applied ，处理中-processing ，已开票-invoiced ，已邮寄-mailed ，已驳回-dismissed ，已作废-obsolete ，已取消-cancelled，退票中-refund，已退票-refunded，退票驳回-refund_rejected]
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 发票状态[已申请-applied ，处理中-processing ，已开票-invoiced ，已邮寄-mailed ，已驳回-dismissed ，已作废-obsolete ，已取消-cancelled，退票中-refund，已退票-refunded，退票驳回-refund_rejected]
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get 开始时间
     *
     * @return
     */
    public String getSearchStartDate() {
        return searchStartDate;
    }

    /**
     * set 开始时间
     *
     * @param searchStartDate
     */
    public void setSearchStartDate(String searchStartDate) {
        this.searchStartDate = searchStartDate;
    }


    /**
     * get 结束时间
     *
     * @return
     */
    public String getSearchEndDate() {
        return searchEndDate;
    }

    /**
     * set 结束时间
     *
     * @param searchEndDate
     */
    public void setSearchEndDate(String searchEndDate) {
        this.searchEndDate = searchEndDate;
    }


    /**
     * get 页码
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
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
     * get 按明细开票 1 按月结算单开票 2 按指定金额开票 3
     *
     * @return
     */
    public Integer getInvoiceType() {
        return invoiceType;
    }

    /**
     * set 按明细开票 1 按月结算单开票 2 按指定金额开票 3
     *
     * @param invoiceType
     */
    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }


    /**
     * get 地域编码，参考OpenAPI公共说明
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域编码，参考OpenAPI公共说明
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 发票状态[已申请-applied ，处理中-processing ，已开票-invoiced ，已邮寄-mailed ，已驳回-dismissed ，已作废-obsolete ，已取消-cancelled，退票中-refund，已退票-refunded，退票驳回-refund_rejected]
     *
     * @param status
     */
    public DescribeInvoicesRequest status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set 开始时间
     *
     * @param searchStartDate
     */
    public DescribeInvoicesRequest searchStartDate(String searchStartDate) {
        this.searchStartDate = searchStartDate;
        return this;
    }


    /**
     * set 结束时间
     *
     * @param searchEndDate
     */
    public DescribeInvoicesRequest searchEndDate(String searchEndDate) {
        this.searchEndDate = searchEndDate;
        return this;
    }


    /**
     * set 页码
     *
     * @param pageNumber
     */
    public DescribeInvoicesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 页大小
     *
     * @param pageSize
     */
    public DescribeInvoicesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set 按明细开票 1 按月结算单开票 2 按指定金额开票 3
     *
     * @param invoiceType
     */
    public DescribeInvoicesRequest invoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }


    /**
     * set 地域编码，参考OpenAPI公共说明
     *
     * @param regionId
     */
    public DescribeInvoicesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}