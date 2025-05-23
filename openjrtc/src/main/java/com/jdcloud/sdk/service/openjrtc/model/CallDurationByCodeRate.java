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

package com.jdcloud.sdk.service.openjrtc.model;


/**
 * 区分码率通讯时长
 */
public class CallDurationByCodeRate  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 时间戳毫秒
     */
    private Long date;

    /**
     * 音频通讯时长-分钟
     */
    private Long audio;

    /**
     * (0,480p]通讯时长-分钟
     */
    private Long lte_480;

    /**
     * (480p,720p]通讯时长-分钟
     */
    private Long gt_480_lte_720;

    /**
     * (720p,1080p]通讯时长-分钟
     */
    private Long gte_720;



    /**
     * get 时间戳毫秒
     *
     * @return
     */
    public Long getDate() {
        return date;
    }

    /**
     * set 时间戳毫秒
     *
     * @param date
     */
    public void setDate(Long date) {
        this.date = date;
    }


    /**
     * get 音频通讯时长-分钟
     *
     * @return
     */
    public Long getAudio() {
        return audio;
    }

    /**
     * set 音频通讯时长-分钟
     *
     * @param audio
     */
    public void setAudio(Long audio) {
        this.audio = audio;
    }


    /**
     * get (0,480p]通讯时长-分钟
     *
     * @return
     */
    public Long getLte_480() {
        return lte_480;
    }

    /**
     * set (0,480p]通讯时长-分钟
     *
     * @param lte_480
     */
    public void setLte_480(Long lte_480) {
        this.lte_480 = lte_480;
    }


    /**
     * get (480p,720p]通讯时长-分钟
     *
     * @return
     */
    public Long getGt_480_lte_720() {
        return gt_480_lte_720;
    }

    /**
     * set (480p,720p]通讯时长-分钟
     *
     * @param gt_480_lte_720
     */
    public void setGt_480_lte_720(Long gt_480_lte_720) {
        this.gt_480_lte_720 = gt_480_lte_720;
    }


    /**
     * get (720p,1080p]通讯时长-分钟
     *
     * @return
     */
    public Long getGte_720() {
        return gte_720;
    }

    /**
     * set (720p,1080p]通讯时长-分钟
     *
     * @param gte_720
     */
    public void setGte_720(Long gte_720) {
        this.gte_720 = gte_720;
    }



    /**
     * set 时间戳毫秒
     *
     * @param date
     */
    public CallDurationByCodeRate date(Long date) {
        this.date = date;
        return this;
    }


    /**
     * set 音频通讯时长-分钟
     *
     * @param audio
     */
    public CallDurationByCodeRate audio(Long audio) {
        this.audio = audio;
        return this;
    }


    /**
     * set (0,480p]通讯时长-分钟
     *
     * @param lte_480
     */
    public CallDurationByCodeRate lte_480(Long lte_480) {
        this.lte_480 = lte_480;
        return this;
    }


    /**
     * set (480p,720p]通讯时长-分钟
     *
     * @param gt_480_lte_720
     */
    public CallDurationByCodeRate gt_480_lte_720(Long gt_480_lte_720) {
        this.gt_480_lte_720 = gt_480_lte_720;
        return this;
    }


    /**
     * set (720p,1080p]通讯时长-分钟
     *
     * @param gte_720
     */
    public CallDurationByCodeRate gte_720(Long gte_720) {
        this.gte_720 = gte_720;
        return this;
    }


}