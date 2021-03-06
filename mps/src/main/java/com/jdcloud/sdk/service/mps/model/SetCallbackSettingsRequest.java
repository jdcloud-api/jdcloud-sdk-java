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
 * Callback
 * 回调配置相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设置回调配置
 */
public class SetCallbackSettingsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 回调事件列表。取值范围：
- snapshot_complete 截图完成，包括成功和失败

     * Required:true
     */
    @Required
    private List<String> callbackEvents;

    /**
     * 回调方式，目前只支持 http
     * Required:true
     */
    @Required
    private String callbackType;

    /**
     * 回调方式为 http 时，此为必须参数
     */
    private String httpUrl;

    /**
     * 是否禁用回调，默认值为 false，即开启回调
     */
    private String disabled;


    /**
     * get 回调事件列表。取值范围：
- snapshot_complete 截图完成，包括成功和失败

     *
     * @return
     */
    public List<String> getCallbackEvents() {
        return callbackEvents;
    }

    /**
     * set 回调事件列表。取值范围：
- snapshot_complete 截图完成，包括成功和失败

     *
     * @param callbackEvents
     */
    public void setCallbackEvents(List<String> callbackEvents) {
        this.callbackEvents = callbackEvents;
    }

    /**
     * get 回调方式，目前只支持 http
     *
     * @return
     */
    public String getCallbackType() {
        return callbackType;
    }

    /**
     * set 回调方式，目前只支持 http
     *
     * @param callbackType
     */
    public void setCallbackType(String callbackType) {
        this.callbackType = callbackType;
    }

    /**
     * get 回调方式为 http 时，此为必须参数
     *
     * @return
     */
    public String getHttpUrl() {
        return httpUrl;
    }

    /**
     * set 回调方式为 http 时，此为必须参数
     *
     * @param httpUrl
     */
    public void setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
    }

    /**
     * get 是否禁用回调，默认值为 false，即开启回调
     *
     * @return
     */
    public String getDisabled() {
        return disabled;
    }

    /**
     * set 是否禁用回调，默认值为 false，即开启回调
     *
     * @param disabled
     */
    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }


    /**
     * set 回调事件列表。取值范围：
- snapshot_complete 截图完成，包括成功和失败

     *
     * @param callbackEvents
     */
    public SetCallbackSettingsRequest callbackEvents(List<String> callbackEvents) {
        this.callbackEvents = callbackEvents;
        return this;
    }

    /**
     * set 回调方式，目前只支持 http
     *
     * @param callbackType
     */
    public SetCallbackSettingsRequest callbackType(String callbackType) {
        this.callbackType = callbackType;
        return this;
    }

    /**
     * set 回调方式为 http 时，此为必须参数
     *
     * @param httpUrl
     */
    public SetCallbackSettingsRequest httpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
        return this;
    }

    /**
     * set 是否禁用回调，默认值为 false，即开启回调
     *
     * @param disabled
     */
    public SetCallbackSettingsRequest disabled(String disabled) {
        this.disabled = disabled;
        return this;
    }


    /**
     * add item to 回调事件列表。取值范围：
- snapshot_complete 截图完成，包括成功和失败

     *
     * @param callbackEvent
     */
    public void addCallbackEvent(String callbackEvent) {
        if (this.callbackEvents == null) {
            this.callbackEvents = new ArrayList<>();
        }
        this.callbackEvents.add(callbackEvent);
    }

}