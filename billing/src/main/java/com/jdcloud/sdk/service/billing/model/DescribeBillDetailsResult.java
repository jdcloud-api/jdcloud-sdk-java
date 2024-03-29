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
 * Billing Management APIs
 * 帐单查询API接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.billing.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.billing.model.Pagination;
import com.jdcloud.sdk.service.billing.model.BillSummaryV2;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询账单明细数据V2版本
 */
public class DescribeBillDetailsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pagination
     */
    private Pagination pagination;

    /**
     * result
     */
    
    private List<BillSummaryV2> result;


    /**
     * get pagination
     *
     * @return
     */
    public Pagination getPagination() {
        return pagination;
    }

    /**
     * set pagination
     *
     * @param pagination
     */
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }


    /**
    * get result
    *
    * @return
    */
    public List<BillSummaryV2> getResult() {
        return result;
    }

    /**
    * set result
    *
    * @param result
    */
    public void setResult(List<BillSummaryV2> result) {
        this.result = result;
    }



    /**
     * set pagination
     *
     * @param pagination
     */
    public DescribeBillDetailsResult pagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }


    /**
    * set result
    *
    * @param result
    */
    public DescribeBillDetailsResult result(List<BillSummaryV2> result) {
        this.result = result;
        return this;
    }



    /**
     * add item to result
     *
     * @param result
     */
    public void addResult(BillSummaryV2 result) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(result);
    }
}