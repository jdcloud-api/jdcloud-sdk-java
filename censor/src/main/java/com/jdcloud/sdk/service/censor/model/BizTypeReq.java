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

package com.jdcloud.sdk.service.censor.model;


/**
 * bizTypeReq
 */
public class BizTypeReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 机审策略id
     */
    private String bizTypeId;

    /**
     * 业务名称，英文名称，不能超过32个字符
     */
    private String name;

    /**
     * 规则描述
     */
    private String description;

    /**
     * 行业分类，可选政府、新闻、电商、社交、视频直播、金融
     */
    private String industryInfo;

    /**
     * 内容安全类型，可选api/oss/website，默认为api
     */
    private String censorType;

    /**
     * 设置文本检测场景和阈值
     */
    private BizTypeSetting textSetting;

    /**
     * 设置图片检测场景和阈值
     */
    private BizTypeSetting imageSetting;

    /**
     * 设置音频检测场景和阈值
     */
    private BizTypeSetting audioSetting;

    /**
     * 设置视频检测场景和阈值
     */
    private BizTypeSetting videoSetting;


    /**
     * get 机审策略id
     *
     * @return
     */
    public String getBizTypeId() {
        return bizTypeId;
    }

    /**
     * set 机审策略id
     *
     * @param bizTypeId
     */
    public void setBizTypeId(String bizTypeId) {
        this.bizTypeId = bizTypeId;
    }

    /**
     * get 业务名称，英文名称，不能超过32个字符
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 业务名称，英文名称，不能超过32个字符
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 规则描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 规则描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 行业分类，可选政府、新闻、电商、社交、视频直播、金融
     *
     * @return
     */
    public String getIndustryInfo() {
        return industryInfo;
    }

    /**
     * set 行业分类，可选政府、新闻、电商、社交、视频直播、金融
     *
     * @param industryInfo
     */
    public void setIndustryInfo(String industryInfo) {
        this.industryInfo = industryInfo;
    }

    /**
     * get 内容安全类型，可选api/oss/website，默认为api
     *
     * @return
     */
    public String getCensorType() {
        return censorType;
    }

    /**
     * set 内容安全类型，可选api/oss/website，默认为api
     *
     * @param censorType
     */
    public void setCensorType(String censorType) {
        this.censorType = censorType;
    }

    /**
     * get 设置文本检测场景和阈值
     *
     * @return
     */
    public BizTypeSetting getTextSetting() {
        return textSetting;
    }

    /**
     * set 设置文本检测场景和阈值
     *
     * @param textSetting
     */
    public void setTextSetting(BizTypeSetting textSetting) {
        this.textSetting = textSetting;
    }

    /**
     * get 设置图片检测场景和阈值
     *
     * @return
     */
    public BizTypeSetting getImageSetting() {
        return imageSetting;
    }

    /**
     * set 设置图片检测场景和阈值
     *
     * @param imageSetting
     */
    public void setImageSetting(BizTypeSetting imageSetting) {
        this.imageSetting = imageSetting;
    }

    /**
     * get 设置音频检测场景和阈值
     *
     * @return
     */
    public BizTypeSetting getAudioSetting() {
        return audioSetting;
    }

    /**
     * set 设置音频检测场景和阈值
     *
     * @param audioSetting
     */
    public void setAudioSetting(BizTypeSetting audioSetting) {
        this.audioSetting = audioSetting;
    }

    /**
     * get 设置视频检测场景和阈值
     *
     * @return
     */
    public BizTypeSetting getVideoSetting() {
        return videoSetting;
    }

    /**
     * set 设置视频检测场景和阈值
     *
     * @param videoSetting
     */
    public void setVideoSetting(BizTypeSetting videoSetting) {
        this.videoSetting = videoSetting;
    }


    /**
     * set 机审策略id
     *
     * @param bizTypeId
     */
    public BizTypeReq bizTypeId(String bizTypeId) {
        this.bizTypeId = bizTypeId;
        return this;
    }

    /**
     * set 业务名称，英文名称，不能超过32个字符
     *
     * @param name
     */
    public BizTypeReq name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 规则描述
     *
     * @param description
     */
    public BizTypeReq description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 行业分类，可选政府、新闻、电商、社交、视频直播、金融
     *
     * @param industryInfo
     */
    public BizTypeReq industryInfo(String industryInfo) {
        this.industryInfo = industryInfo;
        return this;
    }

    /**
     * set 内容安全类型，可选api/oss/website，默认为api
     *
     * @param censorType
     */
    public BizTypeReq censorType(String censorType) {
        this.censorType = censorType;
        return this;
    }

    /**
     * set 设置文本检测场景和阈值
     *
     * @param textSetting
     */
    public BizTypeReq textSetting(BizTypeSetting textSetting) {
        this.textSetting = textSetting;
        return this;
    }

    /**
     * set 设置图片检测场景和阈值
     *
     * @param imageSetting
     */
    public BizTypeReq imageSetting(BizTypeSetting imageSetting) {
        this.imageSetting = imageSetting;
        return this;
    }

    /**
     * set 设置音频检测场景和阈值
     *
     * @param audioSetting
     */
    public BizTypeReq audioSetting(BizTypeSetting audioSetting) {
        this.audioSetting = audioSetting;
        return this;
    }

    /**
     * set 设置视频检测场景和阈值
     *
     * @param videoSetting
     */
    public BizTypeReq videoSetting(BizTypeSetting videoSetting) {
        this.videoSetting = videoSetting;
        return this;
    }


}