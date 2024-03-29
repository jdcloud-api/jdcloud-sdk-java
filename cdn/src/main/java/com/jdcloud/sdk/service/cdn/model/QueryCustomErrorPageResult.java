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
 * 域名操作类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.cdn.model.ErrorPageConfigs;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询自定义错误页面信息
 */
public class QueryCustomErrorPageResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名
     */
    private String domain;

    /**
     * 自定义错误页面开关(on:开启 off：关闭)
     */
    private String enable;

    /**
     * customErrorPageInfos
     */
    
    private List<ErrorPageConfigs> customErrorPageInfos;


    /**
     * get 域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * get 自定义错误页面开关(on:开启 off：关闭)
     *
     * @return
     */
    public String getEnable() {
        return enable;
    }

    /**
     * set 自定义错误页面开关(on:开启 off：关闭)
     *
     * @param enable
     */
    public void setEnable(String enable) {
        this.enable = enable;
    }


    /**
    * get customErrorPageInfos
    *
    * @return
    */
    public List<ErrorPageConfigs> getCustomErrorPageInfos() {
        return customErrorPageInfos;
    }

    /**
    * set customErrorPageInfos
    *
    * @param customErrorPageInfos
    */
    public void setCustomErrorPageInfos(List<ErrorPageConfigs> customErrorPageInfos) {
        this.customErrorPageInfos = customErrorPageInfos;
    }



    /**
     * set 域名
     *
     * @param domain
     */
    public QueryCustomErrorPageResult domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set 自定义错误页面开关(on:开启 off：关闭)
     *
     * @param enable
     */
    public QueryCustomErrorPageResult enable(String enable) {
        this.enable = enable;
        return this;
    }


    /**
    * set customErrorPageInfos
    *
    * @param customErrorPageInfos
    */
    public QueryCustomErrorPageResult customErrorPageInfos(List<ErrorPageConfigs> customErrorPageInfos) {
        this.customErrorPageInfos = customErrorPageInfos;
        return this;
    }



    /**
     * add item to customErrorPageInfos
     *
     * @param customErrorPageInfo
     */
    public void addCustomErrorPageInfo(ErrorPageConfigs customErrorPageInfo) {
        if (this.customErrorPageInfos == null) {
            this.customErrorPageInfos = new ArrayList<>();
        }
        this.customErrorPageInfos.add(customErrorPageInfo);
    }
}