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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除域名的翻译模板配置
- 删除域名级别翻译模板配置,重新推流后生效

 */
public class DeleteLiveStreamDomainTranslateRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 推流域名
     * Required:true
     */
    @Required
    private String publishDomain;

    /**
     * 翻译模板
     * Required:true
     */
    @Required
    private String template;


    /**
     * get 推流域名
     *
     * @return
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    /**
     * set 推流域名
     *
     * @param publishDomain
     */
    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    /**
     * get 翻译模板
     *
     * @return
     */
    public String getTemplate() {
        return template;
    }

    /**
     * set 翻译模板
     *
     * @param template
     */
    public void setTemplate(String template) {
        this.template = template;
    }


    /**
     * set 推流域名
     *
     * @param publishDomain
     */
    public DeleteLiveStreamDomainTranslateRequest publishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * set 翻译模板
     *
     * @param template
     */
    public DeleteLiveStreamDomainTranslateRequest template(String template) {
        this.template = template;
        return this;
    }


}