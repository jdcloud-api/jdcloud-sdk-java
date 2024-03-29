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

package com.jdcloud.sdk.service.live.model;


/**
 * liveTaskInfo
 */
public class LiveTaskInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务ID

     */
    private Integer id;

    /**
     * 执行方式
- 0  立即执行
- 1  定时执行，根据参数设定的时间

     */
    private Integer startMode;

    /**
     * 拉流转推地址

     */
    private String sourceUrl;

    /**
     * 推流地址

     */
    private String pushUrl;

    /**
     * 任务状态:
  - 0  任务启用
  - 1  任务运行中
  - 4  任务停止
  - 5  任务过期
  - 6  任务禁用

     */
    private Integer status;

    /**
     * 任务开始时间
- UTC时间， ISO8601示例：2021-07-26T08:08:08Z

     */
    private String startTime;

    /**
     * 任务结束时间
- UTC时间， ISO8601示例：2021-07-26T08:08:08Z

     */
    private String endTime;

    /**
     * 回调类型:
  - 0  当callbackUrl为空时，此值为0
  - 1  任务开始
  - 2  任务结束
  - 3  全部回调

     */
    private Integer callbackEvent;

    /**
     * 回调地址
     */
    private String callbackUrl;


    /**
     * get 任务ID

     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 任务ID

     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 执行方式
- 0  立即执行
- 1  定时执行，根据参数设定的时间

     *
     * @return
     */
    public Integer getStartMode() {
        return startMode;
    }

    /**
     * set 执行方式
- 0  立即执行
- 1  定时执行，根据参数设定的时间

     *
     * @param startMode
     */
    public void setStartMode(Integer startMode) {
        this.startMode = startMode;
    }

    /**
     * get 拉流转推地址

     *
     * @return
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    /**
     * set 拉流转推地址

     *
     * @param sourceUrl
     */
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    /**
     * get 推流地址

     *
     * @return
     */
    public String getPushUrl() {
        return pushUrl;
    }

    /**
     * set 推流地址

     *
     * @param pushUrl
     */
    public void setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl;
    }

    /**
     * get 任务状态:
  - 0  任务启用
  - 1  任务运行中
  - 4  任务停止
  - 5  任务过期
  - 6  任务禁用

     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 任务状态:
  - 0  任务启用
  - 1  任务运行中
  - 4  任务停止
  - 5  任务过期
  - 6  任务禁用

     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 任务开始时间
- UTC时间， ISO8601示例：2021-07-26T08:08:08Z

     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 任务开始时间
- UTC时间， ISO8601示例：2021-07-26T08:08:08Z

     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 任务结束时间
- UTC时间， ISO8601示例：2021-07-26T08:08:08Z

     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 任务结束时间
- UTC时间， ISO8601示例：2021-07-26T08:08:08Z

     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 回调类型:
  - 0  当callbackUrl为空时，此值为0
  - 1  任务开始
  - 2  任务结束
  - 3  全部回调

     *
     * @return
     */
    public Integer getCallbackEvent() {
        return callbackEvent;
    }

    /**
     * set 回调类型:
  - 0  当callbackUrl为空时，此值为0
  - 1  任务开始
  - 2  任务结束
  - 3  全部回调

     *
     * @param callbackEvent
     */
    public void setCallbackEvent(Integer callbackEvent) {
        this.callbackEvent = callbackEvent;
    }

    /**
     * get 回调地址
     *
     * @return
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    /**
     * set 回调地址
     *
     * @param callbackUrl
     */
    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }


    /**
     * set 任务ID

     *
     * @param id
     */
    public LiveTaskInfo id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 执行方式
- 0  立即执行
- 1  定时执行，根据参数设定的时间

     *
     * @param startMode
     */
    public LiveTaskInfo startMode(Integer startMode) {
        this.startMode = startMode;
        return this;
    }

    /**
     * set 拉流转推地址

     *
     * @param sourceUrl
     */
    public LiveTaskInfo sourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * set 推流地址

     *
     * @param pushUrl
     */
    public LiveTaskInfo pushUrl(String pushUrl) {
        this.pushUrl = pushUrl;
        return this;
    }

    /**
     * set 任务状态:
  - 0  任务启用
  - 1  任务运行中
  - 4  任务停止
  - 5  任务过期
  - 6  任务禁用

     *
     * @param status
     */
    public LiveTaskInfo status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 任务开始时间
- UTC时间， ISO8601示例：2021-07-26T08:08:08Z

     *
     * @param startTime
     */
    public LiveTaskInfo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 任务结束时间
- UTC时间， ISO8601示例：2021-07-26T08:08:08Z

     *
     * @param endTime
     */
    public LiveTaskInfo endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 回调类型:
  - 0  当callbackUrl为空时，此值为0
  - 1  任务开始
  - 2  任务结束
  - 3  全部回调

     *
     * @param callbackEvent
     */
    public LiveTaskInfo callbackEvent(Integer callbackEvent) {
        this.callbackEvent = callbackEvent;
        return this;
    }

    /**
     * set 回调地址
     *
     * @param callbackUrl
     */
    public LiveTaskInfo callbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }


}