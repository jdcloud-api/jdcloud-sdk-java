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
 * custom domain name openapi
 * custom domain name openapi
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ossopenapi.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * cNameQueryResult
 */
public class CNameQueryResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询结果总数
     */
    private Integer totalCount;

    /**
     * resultList
     */
    
    private List<CName> resultList;


    /**
     * get 查询结果总数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 查询结果总数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
    * get resultList
    *
    * @return
    */
    public List<CName> getResultList() {
        return resultList;
    }

    /**
    * set resultList
    *
    * @param resultList
    */
    public void setResultList(List<CName> resultList) {
        this.resultList = resultList;
    }



    /**
     * set 查询结果总数
     *
     * @param totalCount
     */
    public CNameQueryResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
    * set resultList
    *
    * @param resultList
    */
    public CNameQueryResult resultList(List<CName> resultList) {
        this.resultList = resultList;
        return this;
    }



    /**
     * add item to resultList
     *
     * @param resultList
     */
    public void addResultList(CName resultList) {
        if (this.resultList == null) {
            this.resultList = new ArrayList<>();
        }
        this.resultList.add(resultList);
    }
}