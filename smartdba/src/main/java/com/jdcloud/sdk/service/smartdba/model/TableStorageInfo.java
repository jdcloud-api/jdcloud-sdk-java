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

package com.jdcloud.sdk.service.smartdba.model;


/**
 * tableStorageInfo
 */
public class TableStorageInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 表名
     */
    private String tableName;

    /**
     * 数据库名
     */
    private String dbName;

    /**
     * 引擎
     */
    private String engine;

    /**
     * 表空间大小
     */
    private String totalSize;

    /**
     * 表空间占比
     */
    private String percentage;

    /**
     * 数据空间
     */
    private String dataSize;

    /**
     * 索引空间
     */
    private String idxSize;

    /**
     * 碎片率
     */
    private String fragment;

    /**
     * 表行数
     */
    private Integer dataRows;


    /**
     * get 表名
     *
     * @return
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * set 表名
     *
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * get 数据库名
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 数据库名
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * get 引擎
     *
     * @return
     */
    public String getEngine() {
        return engine;
    }

    /**
     * set 引擎
     *
     * @param engine
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * get 表空间大小
     *
     * @return
     */
    public String getTotalSize() {
        return totalSize;
    }

    /**
     * set 表空间大小
     *
     * @param totalSize
     */
    public void setTotalSize(String totalSize) {
        this.totalSize = totalSize;
    }

    /**
     * get 表空间占比
     *
     * @return
     */
    public String getPercentage() {
        return percentage;
    }

    /**
     * set 表空间占比
     *
     * @param percentage
     */
    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    /**
     * get 数据空间
     *
     * @return
     */
    public String getDataSize() {
        return dataSize;
    }

    /**
     * set 数据空间
     *
     * @param dataSize
     */
    public void setDataSize(String dataSize) {
        this.dataSize = dataSize;
    }

    /**
     * get 索引空间
     *
     * @return
     */
    public String getIdxSize() {
        return idxSize;
    }

    /**
     * set 索引空间
     *
     * @param idxSize
     */
    public void setIdxSize(String idxSize) {
        this.idxSize = idxSize;
    }

    /**
     * get 碎片率
     *
     * @return
     */
    public String getFragment() {
        return fragment;
    }

    /**
     * set 碎片率
     *
     * @param fragment
     */
    public void setFragment(String fragment) {
        this.fragment = fragment;
    }

    /**
     * get 表行数
     *
     * @return
     */
    public Integer getDataRows() {
        return dataRows;
    }

    /**
     * set 表行数
     *
     * @param dataRows
     */
    public void setDataRows(Integer dataRows) {
        this.dataRows = dataRows;
    }


    /**
     * set 表名
     *
     * @param tableName
     */
    public TableStorageInfo tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * set 数据库名
     *
     * @param dbName
     */
    public TableStorageInfo dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * set 引擎
     *
     * @param engine
     */
    public TableStorageInfo engine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * set 表空间大小
     *
     * @param totalSize
     */
    public TableStorageInfo totalSize(String totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * set 表空间占比
     *
     * @param percentage
     */
    public TableStorageInfo percentage(String percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * set 数据空间
     *
     * @param dataSize
     */
    public TableStorageInfo dataSize(String dataSize) {
        this.dataSize = dataSize;
        return this;
    }

    /**
     * set 索引空间
     *
     * @param idxSize
     */
    public TableStorageInfo idxSize(String idxSize) {
        this.idxSize = idxSize;
        return this;
    }

    /**
     * set 碎片率
     *
     * @param fragment
     */
    public TableStorageInfo fragment(String fragment) {
        this.fragment = fragment;
        return this;
    }

    /**
     * set 表行数
     *
     * @param dataRows
     */
    public TableStorageInfo dataRows(Integer dataRows) {
        this.dataRows = dataRows;
        return this;
    }


}