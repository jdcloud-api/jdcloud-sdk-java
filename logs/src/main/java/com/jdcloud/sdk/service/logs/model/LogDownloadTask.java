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

package com.jdcloud.sdk.service.logs.model;


/**
 * logDownloadTask
 */
public class LogDownloadTask  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * UID 全局唯一ID
     */
    private String uID;

    /**
     * Compress 压缩方式：0：不压缩，1：gzip，2：snappy
     */
    private Integer compress;

    /**
     * 任务执行耗时，单位:s
     */
    private Double consumeTime;

    /**
     * 记录创时间
     */
    private String createTime;

    /**
     * DownloadPath 下载文件路径
     */
    private String downloadPath;

    /**
     * EndTimestamp 下载内容截止时间
     */
    private Long endTimestamp;

    /**
     * 文件大小，单位:KB
     */
    private Double fileSize;

    /**
     * FileSort 文件排序，0：正序，1：倒序
     */
    private Integer fileSort;

    /**
     * Format 文件格式：0: CSV, 1:JSON
     */
    private Integer format;

    /**
     * Id 主键Id
     */
    private Long id;

    /**
     * 查询关键字
     */
    private String keyword;

    /**
     * 日志条数
     */
    private Long logCount;

    /**
     * LogsetUID 日志集uid
     */
    private String logsetUID;

    /**
     * LogtopicUID 日志topic uid
     */
    private String logtopicUID;

    /**
     * Name 任务名
     */
    private String name;

    /**
     * Pin 用户pin
     */
    private String pin;

    /**
     * Quote quote：0：双引号；1：单引号
     */
    private Integer quote;

    /**
     * 任务执行重试次数
     */
    private Integer retry;

    /**
     * StartTimestamp 下载内容开始时间
     */
    private Long startTimestamp;

    /**
     * Status 任务状态：0：失败；1：待执行；2：进行中；3：已完成,4: 已取消
     */
    private Integer status;

    /**
     * 任务更新时间
     */
    private String updateTime;



    /**
     * get UID 全局唯一ID
     *
     * @return
     */
    public String getUID() {
        return uID;
    }

    /**
     * set UID 全局唯一ID
     *
     * @param uID
     */
    public void setUID(String uID) {
        this.uID = uID;
    }


    /**
     * get Compress 压缩方式：0：不压缩，1：gzip，2：snappy
     *
     * @return
     */
    public Integer getCompress() {
        return compress;
    }

    /**
     * set Compress 压缩方式：0：不压缩，1：gzip，2：snappy
     *
     * @param compress
     */
    public void setCompress(Integer compress) {
        this.compress = compress;
    }


    /**
     * get 任务执行耗时，单位:s
     *
     * @return
     */
    public Double getConsumeTime() {
        return consumeTime;
    }

    /**
     * set 任务执行耗时，单位:s
     *
     * @param consumeTime
     */
    public void setConsumeTime(Double consumeTime) {
        this.consumeTime = consumeTime;
    }


    /**
     * get 记录创时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 记录创时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get DownloadPath 下载文件路径
     *
     * @return
     */
    public String getDownloadPath() {
        return downloadPath;
    }

    /**
     * set DownloadPath 下载文件路径
     *
     * @param downloadPath
     */
    public void setDownloadPath(String downloadPath) {
        this.downloadPath = downloadPath;
    }


    /**
     * get EndTimestamp 下载内容截止时间
     *
     * @return
     */
    public Long getEndTimestamp() {
        return endTimestamp;
    }

    /**
     * set EndTimestamp 下载内容截止时间
     *
     * @param endTimestamp
     */
    public void setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
    }


    /**
     * get 文件大小，单位:KB
     *
     * @return
     */
    public Double getFileSize() {
        return fileSize;
    }

    /**
     * set 文件大小，单位:KB
     *
     * @param fileSize
     */
    public void setFileSize(Double fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * get FileSort 文件排序，0：正序，1：倒序
     *
     * @return
     */
    public Integer getFileSort() {
        return fileSort;
    }

    /**
     * set FileSort 文件排序，0：正序，1：倒序
     *
     * @param fileSort
     */
    public void setFileSort(Integer fileSort) {
        this.fileSort = fileSort;
    }


    /**
     * get Format 文件格式：0: CSV, 1:JSON
     *
     * @return
     */
    public Integer getFormat() {
        return format;
    }

    /**
     * set Format 文件格式：0: CSV, 1:JSON
     *
     * @param format
     */
    public void setFormat(Integer format) {
        this.format = format;
    }


    /**
     * get Id 主键Id
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set Id 主键Id
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * get 查询关键字
     *
     * @return
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * set 查询关键字
     *
     * @param keyword
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }


    /**
     * get 日志条数
     *
     * @return
     */
    public Long getLogCount() {
        return logCount;
    }

    /**
     * set 日志条数
     *
     * @param logCount
     */
    public void setLogCount(Long logCount) {
        this.logCount = logCount;
    }


    /**
     * get LogsetUID 日志集uid
     *
     * @return
     */
    public String getLogsetUID() {
        return logsetUID;
    }

    /**
     * set LogsetUID 日志集uid
     *
     * @param logsetUID
     */
    public void setLogsetUID(String logsetUID) {
        this.logsetUID = logsetUID;
    }


    /**
     * get LogtopicUID 日志topic uid
     *
     * @return
     */
    public String getLogtopicUID() {
        return logtopicUID;
    }

    /**
     * set LogtopicUID 日志topic uid
     *
     * @param logtopicUID
     */
    public void setLogtopicUID(String logtopicUID) {
        this.logtopicUID = logtopicUID;
    }


    /**
     * get Name 任务名
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set Name 任务名
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get Pin 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set Pin 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get Quote quote：0：双引号；1：单引号
     *
     * @return
     */
    public Integer getQuote() {
        return quote;
    }

    /**
     * set Quote quote：0：双引号；1：单引号
     *
     * @param quote
     */
    public void setQuote(Integer quote) {
        this.quote = quote;
    }


    /**
     * get 任务执行重试次数
     *
     * @return
     */
    public Integer getRetry() {
        return retry;
    }

    /**
     * set 任务执行重试次数
     *
     * @param retry
     */
    public void setRetry(Integer retry) {
        this.retry = retry;
    }


    /**
     * get StartTimestamp 下载内容开始时间
     *
     * @return
     */
    public Long getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * set StartTimestamp 下载内容开始时间
     *
     * @param startTimestamp
     */
    public void setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
    }


    /**
     * get Status 任务状态：0：失败；1：待执行；2：进行中；3：已完成,4: 已取消
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set Status 任务状态：0：失败；1：待执行；2：进行中；3：已完成,4: 已取消
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }


    /**
     * get 任务更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 任务更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }



    /**
     * set UID 全局唯一ID
     *
     * @param uID
     */
    public LogDownloadTask uID(String uID) {
        this.uID = uID;
        return this;
    }


    /**
     * set Compress 压缩方式：0：不压缩，1：gzip，2：snappy
     *
     * @param compress
     */
    public LogDownloadTask compress(Integer compress) {
        this.compress = compress;
        return this;
    }


    /**
     * set 任务执行耗时，单位:s
     *
     * @param consumeTime
     */
    public LogDownloadTask consumeTime(Double consumeTime) {
        this.consumeTime = consumeTime;
        return this;
    }


    /**
     * set 记录创时间
     *
     * @param createTime
     */
    public LogDownloadTask createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set DownloadPath 下载文件路径
     *
     * @param downloadPath
     */
    public LogDownloadTask downloadPath(String downloadPath) {
        this.downloadPath = downloadPath;
        return this;
    }


    /**
     * set EndTimestamp 下载内容截止时间
     *
     * @param endTimestamp
     */
    public LogDownloadTask endTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }


    /**
     * set 文件大小，单位:KB
     *
     * @param fileSize
     */
    public LogDownloadTask fileSize(Double fileSize) {
        this.fileSize = fileSize;
        return this;
    }


    /**
     * set FileSort 文件排序，0：正序，1：倒序
     *
     * @param fileSort
     */
    public LogDownloadTask fileSort(Integer fileSort) {
        this.fileSort = fileSort;
        return this;
    }


    /**
     * set Format 文件格式：0: CSV, 1:JSON
     *
     * @param format
     */
    public LogDownloadTask format(Integer format) {
        this.format = format;
        return this;
    }


    /**
     * set Id 主键Id
     *
     * @param id
     */
    public LogDownloadTask id(Long id) {
        this.id = id;
        return this;
    }


    /**
     * set 查询关键字
     *
     * @param keyword
     */
    public LogDownloadTask keyword(String keyword) {
        this.keyword = keyword;
        return this;
    }


    /**
     * set 日志条数
     *
     * @param logCount
     */
    public LogDownloadTask logCount(Long logCount) {
        this.logCount = logCount;
        return this;
    }


    /**
     * set LogsetUID 日志集uid
     *
     * @param logsetUID
     */
    public LogDownloadTask logsetUID(String logsetUID) {
        this.logsetUID = logsetUID;
        return this;
    }


    /**
     * set LogtopicUID 日志topic uid
     *
     * @param logtopicUID
     */
    public LogDownloadTask logtopicUID(String logtopicUID) {
        this.logtopicUID = logtopicUID;
        return this;
    }


    /**
     * set Name 任务名
     *
     * @param name
     */
    public LogDownloadTask name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set Pin 用户pin
     *
     * @param pin
     */
    public LogDownloadTask pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set Quote quote：0：双引号；1：单引号
     *
     * @param quote
     */
    public LogDownloadTask quote(Integer quote) {
        this.quote = quote;
        return this;
    }


    /**
     * set 任务执行重试次数
     *
     * @param retry
     */
    public LogDownloadTask retry(Integer retry) {
        this.retry = retry;
        return this;
    }


    /**
     * set StartTimestamp 下载内容开始时间
     *
     * @param startTimestamp
     */
    public LogDownloadTask startTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }


    /**
     * set Status 任务状态：0：失败；1：待执行；2：进行中；3：已完成,4: 已取消
     *
     * @param status
     */
    public LogDownloadTask status(Integer status) {
        this.status = status;
        return this;
    }


    /**
     * set 任务更新时间
     *
     * @param updateTime
     */
    public LogDownloadTask updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}