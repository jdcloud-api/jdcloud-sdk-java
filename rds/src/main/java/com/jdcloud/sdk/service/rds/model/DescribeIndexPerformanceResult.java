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
 * 性能统计
 * 性能统计相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.rds.model.MissingIndexResult;
import com.jdcloud.sdk.service.rds.model.IndexPerformanceResult;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 根据用户定义的查询条件，获取索引性能的统计信息，并提供缺失索引及索引创建建议。用户可以根据这些信息查找与索引相关的性能瓶颈，并进行优化。&lt;br&gt;- 仅支持SQL Server
 */
public class DescribeIndexPerformanceResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * missingIndexResult
     */
    
    private List<MissingIndexResult> missingIndexResult;
    /**
     * indexPerformanceResult
     */
    
    private List<IndexPerformanceResult> indexPerformanceResult;
    /**
     * 总记录条数
     */
    private Integer totalCount;

    /**
     * 当前数据的页码
     */
    private Integer pageNumber;

    /**
     * 每页显示的数据条数
     */
    private Integer pageSize;



    /**
    * get missingIndexResult
    *
    * @return
    */
    public List<MissingIndexResult> getMissingIndexResult() {
        return missingIndexResult;
    }

    /**
    * set missingIndexResult
    *
    * @param missingIndexResult
    */
    public void setMissingIndexResult(List<MissingIndexResult> missingIndexResult) {
        this.missingIndexResult = missingIndexResult;
    }


    /**
    * get indexPerformanceResult
    *
    * @return
    */
    public List<IndexPerformanceResult> getIndexPerformanceResult() {
        return indexPerformanceResult;
    }

    /**
    * set indexPerformanceResult
    *
    * @param indexPerformanceResult
    */
    public void setIndexPerformanceResult(List<IndexPerformanceResult> indexPerformanceResult) {
        this.indexPerformanceResult = indexPerformanceResult;
    }


    /**
     * get 总记录条数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 总记录条数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * get 当前数据的页码
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 当前数据的页码
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * get 每页显示的数据条数
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页显示的数据条数
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }



    /**
    * set missingIndexResult
    *
    * @param missingIndexResult
    */
    public DescribeIndexPerformanceResult missingIndexResult(List<MissingIndexResult> missingIndexResult) {
        this.missingIndexResult = missingIndexResult;
        return this;
    }


    /**
    * set indexPerformanceResult
    *
    * @param indexPerformanceResult
    */
    public DescribeIndexPerformanceResult indexPerformanceResult(List<IndexPerformanceResult> indexPerformanceResult) {
        this.indexPerformanceResult = indexPerformanceResult;
        return this;
    }


    /**
     * set 总记录条数
     *
     * @param totalCount
     */
    public DescribeIndexPerformanceResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * set 当前数据的页码
     *
     * @param pageNumber
     */
    public DescribeIndexPerformanceResult pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 每页显示的数据条数
     *
     * @param pageSize
     */
    public DescribeIndexPerformanceResult pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }



    /**
     * add item to missingIndexResult
     *
     * @param missingIndexResult
     */
    public void addMissingIndexResult(MissingIndexResult missingIndexResult) {
        if (this.missingIndexResult == null) {
            this.missingIndexResult = new ArrayList<>();
        }
        this.missingIndexResult.add(missingIndexResult);
    }

    /**
     * add item to indexPerformanceResult
     *
     * @param indexPerformanceResult
     */
    public void addIndexPerformanceResult(IndexPerformanceResult indexPerformanceResult) {
        if (this.indexPerformanceResult == null) {
            this.indexPerformanceResult = new ArrayList<>();
        }
        this.indexPerformanceResult.add(indexPerformanceResult);
    }
}