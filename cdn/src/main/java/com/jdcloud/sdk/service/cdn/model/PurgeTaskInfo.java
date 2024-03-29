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

package com.jdcloud.sdk.service.cdn.model;


/**
 * purgeTaskInfo
 */
public class PurgeTaskInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * url
     */
    private String url;

    /**
     * 文件id
     */
    private String fileId;

    /**
     * 原来总共的副本数
     */
    private Integer originNum;

    /**
     * 刷新后剩余的副本数
     */
    private Integer remainNum;

    /**
     * 剩余
     */
    private String curUnfinished;

    /**
     * 1:active，2:表示purge中暂时停止预热
     */
    private String status;

    /**
     * 失败预热的原因
     */
    private String errInfo;

    /**
     * 热度计算下发任务的过期时间
     */
    private Long expireAt;



    /**
     * get url
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set url
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }


    /**
     * get 文件id
     *
     * @return
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * set 文件id
     *
     * @param fileId
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }


    /**
     * get 原来总共的副本数
     *
     * @return
     */
    public Integer getOriginNum() {
        return originNum;
    }

    /**
     * set 原来总共的副本数
     *
     * @param originNum
     */
    public void setOriginNum(Integer originNum) {
        this.originNum = originNum;
    }


    /**
     * get 刷新后剩余的副本数
     *
     * @return
     */
    public Integer getRemainNum() {
        return remainNum;
    }

    /**
     * set 刷新后剩余的副本数
     *
     * @param remainNum
     */
    public void setRemainNum(Integer remainNum) {
        this.remainNum = remainNum;
    }


    /**
     * get 剩余
     *
     * @return
     */
    public String getCurUnfinished() {
        return curUnfinished;
    }

    /**
     * set 剩余
     *
     * @param curUnfinished
     */
    public void setCurUnfinished(String curUnfinished) {
        this.curUnfinished = curUnfinished;
    }


    /**
     * get 1:active，2:表示purge中暂时停止预热
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 1:active，2:表示purge中暂时停止预热
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get 失败预热的原因
     *
     * @return
     */
    public String getErrInfo() {
        return errInfo;
    }

    /**
     * set 失败预热的原因
     *
     * @param errInfo
     */
    public void setErrInfo(String errInfo) {
        this.errInfo = errInfo;
    }


    /**
     * get 热度计算下发任务的过期时间
     *
     * @return
     */
    public Long getExpireAt() {
        return expireAt;
    }

    /**
     * set 热度计算下发任务的过期时间
     *
     * @param expireAt
     */
    public void setExpireAt(Long expireAt) {
        this.expireAt = expireAt;
    }



    /**
     * set url
     *
     * @param url
     */
    public PurgeTaskInfo url(String url) {
        this.url = url;
        return this;
    }


    /**
     * set 文件id
     *
     * @param fileId
     */
    public PurgeTaskInfo fileId(String fileId) {
        this.fileId = fileId;
        return this;
    }


    /**
     * set 原来总共的副本数
     *
     * @param originNum
     */
    public PurgeTaskInfo originNum(Integer originNum) {
        this.originNum = originNum;
        return this;
    }


    /**
     * set 刷新后剩余的副本数
     *
     * @param remainNum
     */
    public PurgeTaskInfo remainNum(Integer remainNum) {
        this.remainNum = remainNum;
        return this;
    }


    /**
     * set 剩余
     *
     * @param curUnfinished
     */
    public PurgeTaskInfo curUnfinished(String curUnfinished) {
        this.curUnfinished = curUnfinished;
        return this;
    }


    /**
     * set 1:active，2:表示purge中暂时停止预热
     *
     * @param status
     */
    public PurgeTaskInfo status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set 失败预热的原因
     *
     * @param errInfo
     */
    public PurgeTaskInfo errInfo(String errInfo) {
        this.errInfo = errInfo;
        return this;
    }


    /**
     * set 热度计算下发任务的过期时间
     *
     * @param expireAt
     */
    public PurgeTaskInfo expireAt(Long expireAt) {
        this.expireAt = expireAt;
        return this;
    }


}