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
 * 审计管理
 * 审计管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查看RDS实例的审计内容&lt;br&gt;- 仅支持 MySQL 5.6, MySQL 5.7, Percona, MariaDB, PostgreSQL
 */
public class DescribeAuditResultRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询开始时间，格式为：YYYY-MM-DD HH:mm:ss，开始时间不能早于当前时间3天
     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 查询截止时间，格式为：YYYY-MM-DD HH:mm:ss，开始时间到结束时间不能超过3天
     * Required:true
     */
    @Required
    private String endTime;

    /**
     * 废弃，使用filter，数据库名
     */
    private String dbName;

    /**
     * 废弃，使用filter，账号名
     */
    private String accountName;

    /**
     * 显示数据的页码，默认为1，取值范围：[-1,∞)
     */
    private Integer pageNumber;

    /**
     * 每页显示的数据条数，默认为10，取值范围：[10,100]
     */
    private Integer pageSize;

    /**
     * 过滤参数，多个过滤参数之间的关系为“与”(and支持以下属性的过滤(默认等值)：)
- operation：仅第一个value生效，语句类型【create/alter/drop/truncate/select/insert/update/delete/replace/ddl/dml/disconnect/connect/failed_connect/query】,operator仅支持eq或者in
- account：实例账号名，operator仅支持eq或者in
- keyword：SQL 关键词，模糊查询，operator仅支持eq或者in
- database：实例库名，operator仅支持eq或者in
- threadId：会话id，operator仅支持eq或者in

     */
    
    private List<Filter> filters;
    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * RDS 实例ID，唯一标识一个RDS实例
     * Required:true
     */
    @Required
    private String instanceId;



    /**
     * get 查询开始时间，格式为：YYYY-MM-DD HH:mm:ss，开始时间不能早于当前时间3天
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询开始时间，格式为：YYYY-MM-DD HH:mm:ss，开始时间不能早于当前时间3天
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 查询截止时间，格式为：YYYY-MM-DD HH:mm:ss，开始时间到结束时间不能超过3天
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询截止时间，格式为：YYYY-MM-DD HH:mm:ss，开始时间到结束时间不能超过3天
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * get 废弃，使用filter，数据库名
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 废弃，使用filter，数据库名
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }


    /**
     * get 废弃，使用filter，账号名
     *
     * @return
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * set 废弃，使用filter，账号名
     *
     * @param accountName
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


    /**
     * get 显示数据的页码，默认为1，取值范围：[-1,∞)
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 显示数据的页码，默认为1，取值范围：[-1,∞)
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * get 每页显示的数据条数，默认为10，取值范围：[10,100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页显示的数据条数，默认为10，取值范围：[10,100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
    * get 过滤参数，多个过滤参数之间的关系为“与”(and支持以下属性的过滤(默认等值)：)
- operation：仅第一个value生效，语句类型【create/alter/drop/truncate/select/insert/update/delete/replace/ddl/dml/disconnect/connect/failed_connect/query】,operator仅支持eq或者in
- account：实例账号名，operator仅支持eq或者in
- keyword：SQL 关键词，模糊查询，operator仅支持eq或者in
- database：实例库名，operator仅支持eq或者in
- threadId：会话id，operator仅支持eq或者in

    *
    * @return
    */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
    * set 过滤参数，多个过滤参数之间的关系为“与”(and支持以下属性的过滤(默认等值)：)
- operation：仅第一个value生效，语句类型【create/alter/drop/truncate/select/insert/update/delete/replace/ddl/dml/disconnect/connect/failed_connect/query】,operator仅支持eq或者in
- account：实例账号名，operator仅支持eq或者in
- keyword：SQL 关键词，模糊查询，operator仅支持eq或者in
- database：实例库名，operator仅支持eq或者in
- threadId：会话id，operator仅支持eq或者in

    *
    * @param filters
    */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }


    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get RDS 实例ID，唯一标识一个RDS实例
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }



    /**
     * set 查询开始时间，格式为：YYYY-MM-DD HH:mm:ss，开始时间不能早于当前时间3天
     *
     * @param startTime
     */
    public DescribeAuditResultRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 查询截止时间，格式为：YYYY-MM-DD HH:mm:ss，开始时间到结束时间不能超过3天
     *
     * @param endTime
     */
    public DescribeAuditResultRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    /**
     * set 废弃，使用filter，数据库名
     *
     * @param dbName
     */
    public DescribeAuditResultRequest dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }


    /**
     * set 废弃，使用filter，账号名
     *
     * @param accountName
     */
    public DescribeAuditResultRequest accountName(String accountName) {
        this.accountName = accountName;
        return this;
    }


    /**
     * set 显示数据的页码，默认为1，取值范围：[-1,∞)
     *
     * @param pageNumber
     */
    public DescribeAuditResultRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 每页显示的数据条数，默认为10，取值范围：[10,100]
     *
     * @param pageSize
     */
    public DescribeAuditResultRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
    * set 过滤参数，多个过滤参数之间的关系为“与”(and支持以下属性的过滤(默认等值)：)
- operation：仅第一个value生效，语句类型【create/alter/drop/truncate/select/insert/update/delete/replace/ddl/dml/disconnect/connect/failed_connect/query】,operator仅支持eq或者in
- account：实例账号名，operator仅支持eq或者in
- keyword：SQL 关键词，模糊查询，operator仅支持eq或者in
- database：实例库名，operator仅支持eq或者in
- threadId：会话id，operator仅支持eq或者in

    *
    * @param filters
    */
    public DescribeAuditResultRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public DescribeAuditResultRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public DescribeAuditResultRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }



    /**
     * add item to 过滤参数，多个过滤参数之间的关系为“与”(and支持以下属性的过滤(默认等值)：)
- operation：仅第一个value生效，语句类型【create/alter/drop/truncate/select/insert/update/delete/replace/ddl/dml/disconnect/connect/failed_connect/query】,operator仅支持eq或者in
- account：实例账号名，operator仅支持eq或者in
- keyword：SQL 关键词，模糊查询，operator仅支持eq或者in
- database：实例库名，operator仅支持eq或者in
- threadId：会话id，operator仅支持eq或者in

     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }
}