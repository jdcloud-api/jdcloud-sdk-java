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
 * 直播刷新预热类接口
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
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建直播预热任务
 */
public class CreateLiveDomainPrefecthTaskRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 预热的URL
     */
    
    private List<String> urlList;
    /**
     * 预热时长
     */
    private Integer prefetchTime;

    /**
     * 操作类型只能是[start,stop]中的一种
     */
    private String action;



    /**
    * get 预热的URL
    *
    * @return
    */
    public List<String> getUrlList() {
        return urlList;
    }

    /**
    * set 预热的URL
    *
    * @param urlList
    */
    public void setUrlList(List<String> urlList) {
        this.urlList = urlList;
    }


    /**
     * get 预热时长
     *
     * @return
     */
    public Integer getPrefetchTime() {
        return prefetchTime;
    }

    /**
     * set 预热时长
     *
     * @param prefetchTime
     */
    public void setPrefetchTime(Integer prefetchTime) {
        this.prefetchTime = prefetchTime;
    }


    /**
     * get 操作类型只能是[start,stop]中的一种
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 操作类型只能是[start,stop]中的一种
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }



    /**
    * set 预热的URL
    *
    * @param urlList
    */
    public CreateLiveDomainPrefecthTaskRequest urlList(List<String> urlList) {
        this.urlList = urlList;
        return this;
    }


    /**
     * set 预热时长
     *
     * @param prefetchTime
     */
    public CreateLiveDomainPrefecthTaskRequest prefetchTime(Integer prefetchTime) {
        this.prefetchTime = prefetchTime;
        return this;
    }


    /**
     * set 操作类型只能是[start,stop]中的一种
     *
     * @param action
     */
    public CreateLiveDomainPrefecthTaskRequest action(String action) {
        this.action = action;
        return this;
    }



    /**
     * add item to 预热的URL
     *
     * @param urlList
     */
    public void addUrlList(String urlList) {
        if (this.urlList == null) {
            this.urlList = new ArrayList<>();
        }
        this.urlList.add(urlList);
    }
}