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

package com.jdcloud.sdk.service.monitor.model;


/**
 * dynamic
 */
public class Dynamic  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品动态创建时间
     */
    private String createTime;

    /**
     * 产品动态描述，前端展示用，自动中英文适配
     */
    private String dynamicDetail;

    /**
     * 产品动态中文描述
     */
    private String dynamicDetailCN;

    /**
     * 产品动态英文描述
     */
    private String dynamicDetailEN;

    /**
     * 产品动态状态 1-已上线 0-已下线
     */
    private Long dynamicStatus;

    /**
     * 产品动态类型 1-新产品 2-新功能 3-功能调整 4-其它
     */
    private Long dynamicType;

    /**
     * 产品动态链接地址
     */
    private String dynamicUrl;

    /**
     * 产品动态更新时间
     */
    private String updateTime;

    /**
     * 产品动态uuid
     */
    private String uuid;


    /**
     * get 产品动态创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 产品动态创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 产品动态描述，前端展示用，自动中英文适配
     *
     * @return
     */
    public String getDynamicDetail() {
        return dynamicDetail;
    }

    /**
     * set 产品动态描述，前端展示用，自动中英文适配
     *
     * @param dynamicDetail
     */
    public void setDynamicDetail(String dynamicDetail) {
        this.dynamicDetail = dynamicDetail;
    }

    /**
     * get 产品动态中文描述
     *
     * @return
     */
    public String getDynamicDetailCN() {
        return dynamicDetailCN;
    }

    /**
     * set 产品动态中文描述
     *
     * @param dynamicDetailCN
     */
    public void setDynamicDetailCN(String dynamicDetailCN) {
        this.dynamicDetailCN = dynamicDetailCN;
    }

    /**
     * get 产品动态英文描述
     *
     * @return
     */
    public String getDynamicDetailEN() {
        return dynamicDetailEN;
    }

    /**
     * set 产品动态英文描述
     *
     * @param dynamicDetailEN
     */
    public void setDynamicDetailEN(String dynamicDetailEN) {
        this.dynamicDetailEN = dynamicDetailEN;
    }

    /**
     * get 产品动态状态 1-已上线 0-已下线
     *
     * @return
     */
    public Long getDynamicStatus() {
        return dynamicStatus;
    }

    /**
     * set 产品动态状态 1-已上线 0-已下线
     *
     * @param dynamicStatus
     */
    public void setDynamicStatus(Long dynamicStatus) {
        this.dynamicStatus = dynamicStatus;
    }

    /**
     * get 产品动态类型 1-新产品 2-新功能 3-功能调整 4-其它
     *
     * @return
     */
    public Long getDynamicType() {
        return dynamicType;
    }

    /**
     * set 产品动态类型 1-新产品 2-新功能 3-功能调整 4-其它
     *
     * @param dynamicType
     */
    public void setDynamicType(Long dynamicType) {
        this.dynamicType = dynamicType;
    }

    /**
     * get 产品动态链接地址
     *
     * @return
     */
    public String getDynamicUrl() {
        return dynamicUrl;
    }

    /**
     * set 产品动态链接地址
     *
     * @param dynamicUrl
     */
    public void setDynamicUrl(String dynamicUrl) {
        this.dynamicUrl = dynamicUrl;
    }

    /**
     * get 产品动态更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 产品动态更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get 产品动态uuid
     *
     * @return
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * set 产品动态uuid
     *
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


    /**
     * set 产品动态创建时间
     *
     * @param createTime
     */
    public Dynamic createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 产品动态描述，前端展示用，自动中英文适配
     *
     * @param dynamicDetail
     */
    public Dynamic dynamicDetail(String dynamicDetail) {
        this.dynamicDetail = dynamicDetail;
        return this;
    }

    /**
     * set 产品动态中文描述
     *
     * @param dynamicDetailCN
     */
    public Dynamic dynamicDetailCN(String dynamicDetailCN) {
        this.dynamicDetailCN = dynamicDetailCN;
        return this;
    }

    /**
     * set 产品动态英文描述
     *
     * @param dynamicDetailEN
     */
    public Dynamic dynamicDetailEN(String dynamicDetailEN) {
        this.dynamicDetailEN = dynamicDetailEN;
        return this;
    }

    /**
     * set 产品动态状态 1-已上线 0-已下线
     *
     * @param dynamicStatus
     */
    public Dynamic dynamicStatus(Long dynamicStatus) {
        this.dynamicStatus = dynamicStatus;
        return this;
    }

    /**
     * set 产品动态类型 1-新产品 2-新功能 3-功能调整 4-其它
     *
     * @param dynamicType
     */
    public Dynamic dynamicType(Long dynamicType) {
        this.dynamicType = dynamicType;
        return this;
    }

    /**
     * set 产品动态链接地址
     *
     * @param dynamicUrl
     */
    public Dynamic dynamicUrl(String dynamicUrl) {
        this.dynamicUrl = dynamicUrl;
        return this;
    }

    /**
     * set 产品动态更新时间
     *
     * @param updateTime
     */
    public Dynamic updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set 产品动态uuid
     *
     * @param uuid
     */
    public Dynamic uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }


}