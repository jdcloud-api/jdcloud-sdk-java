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

package com.jdcloud.sdk.service.redis.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * 备份文件下载信息
 */
public class DownloadUrl  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * 下载链接
     * Required:true
     */
    @Required
    private String link;



    /**
     * get 名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 下载链接
     *
     * @return
     */
    public String getLink() {
        return link;
    }

    /**
     * set 下载链接
     *
     * @param link
     */
    public void setLink(String link) {
        this.link = link;
    }



    /**
     * set 名称
     *
     * @param name
     */
    public DownloadUrl name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 下载链接
     *
     * @param link
     */
    public DownloadUrl link(String link) {
        this.link = link;
        return this;
    }


}