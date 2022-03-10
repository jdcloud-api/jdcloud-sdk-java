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

package com.jdcloud.sdk.service.dms.model;


/**
 * personalSql
 */
public class PersonalSql  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id。
     */
    private Integer id;

    /**
     * 数据源id。
     */
    private Integer dataSourceId;

    /**
     * 执行sql内容。
     */
    private String sqlStr;

    /**
     * 修改用户。
     */
    private String modifiedBy;

    /**
     * 数据状态。
     */
    private String status;

    /**
     * 创建时间，格式为：YYYY-MM-DD HH:mm:ss。
     */
    private String createTime;

    /**
     * 收藏消息用户。
     */
    private String user;

    /**
     * Sql备注。
     */
    private String hint;


    /**
     * get 主键id。
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 主键id。
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 数据源id。
     *
     * @return
     */
    public Integer getDataSourceId() {
        return dataSourceId;
    }

    /**
     * set 数据源id。
     *
     * @param dataSourceId
     */
    public void setDataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * get 执行sql内容。
     *
     * @return
     */
    public String getSqlStr() {
        return sqlStr;
    }

    /**
     * set 执行sql内容。
     *
     * @param sqlStr
     */
    public void setSqlStr(String sqlStr) {
        this.sqlStr = sqlStr;
    }

    /**
     * get 修改用户。
     *
     * @return
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * set 修改用户。
     *
     * @param modifiedBy
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * get 数据状态。
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 数据状态。
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 创建时间，格式为：YYYY-MM-DD HH:mm:ss。
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间，格式为：YYYY-MM-DD HH:mm:ss。
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 收藏消息用户。
     *
     * @return
     */
    public String getUser() {
        return user;
    }

    /**
     * set 收藏消息用户。
     *
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * get Sql备注。
     *
     * @return
     */
    public String getHint() {
        return hint;
    }

    /**
     * set Sql备注。
     *
     * @param hint
     */
    public void setHint(String hint) {
        this.hint = hint;
    }


    /**
     * set 主键id。
     *
     * @param id
     */
    public PersonalSql id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 数据源id。
     *
     * @param dataSourceId
     */
    public PersonalSql dataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * set 执行sql内容。
     *
     * @param sqlStr
     */
    public PersonalSql sqlStr(String sqlStr) {
        this.sqlStr = sqlStr;
        return this;
    }

    /**
     * set 修改用户。
     *
     * @param modifiedBy
     */
    public PersonalSql modifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * set 数据状态。
     *
     * @param status
     */
    public PersonalSql status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 创建时间，格式为：YYYY-MM-DD HH:mm:ss。
     *
     * @param createTime
     */
    public PersonalSql createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 收藏消息用户。
     *
     * @param user
     */
    public PersonalSql user(String user) {
        this.user = user;
        return this;
    }

    /**
     * set Sql备注。
     *
     * @param hint
     */
    public PersonalSql hint(String hint) {
        this.hint = hint;
        return this;
    }


}