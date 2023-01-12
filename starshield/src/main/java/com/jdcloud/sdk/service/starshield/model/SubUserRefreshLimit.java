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

package com.jdcloud.sdk.service.starshield.model;


/**
 * subUserRefreshLimit
 */
public class SubUserRefreshLimit  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 子账号名
     */
    private String user;

    /**
     * 子账号刷新个数
     */
    private Long refreshCount;

    /**
     * 子账号目录个数
     */
    private Long dirCount;

    /**
     * 子账号预热个数
     */
    private Long prefetchCount;



    /**
     * get 子账号名
     *
     * @return
     */
    public String getUser() {
        return user;
    }

    /**
     * set 子账号名
     *
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }


    /**
     * get 子账号刷新个数
     *
     * @return
     */
    public Long getRefreshCount() {
        return refreshCount;
    }

    /**
     * set 子账号刷新个数
     *
     * @param refreshCount
     */
    public void setRefreshCount(Long refreshCount) {
        this.refreshCount = refreshCount;
    }


    /**
     * get 子账号目录个数
     *
     * @return
     */
    public Long getDirCount() {
        return dirCount;
    }

    /**
     * set 子账号目录个数
     *
     * @param dirCount
     */
    public void setDirCount(Long dirCount) {
        this.dirCount = dirCount;
    }


    /**
     * get 子账号预热个数
     *
     * @return
     */
    public Long getPrefetchCount() {
        return prefetchCount;
    }

    /**
     * set 子账号预热个数
     *
     * @param prefetchCount
     */
    public void setPrefetchCount(Long prefetchCount) {
        this.prefetchCount = prefetchCount;
    }



    /**
     * set 子账号名
     *
     * @param user
     */
    public SubUserRefreshLimit user(String user) {
        this.user = user;
        return this;
    }


    /**
     * set 子账号刷新个数
     *
     * @param refreshCount
     */
    public SubUserRefreshLimit refreshCount(Long refreshCount) {
        this.refreshCount = refreshCount;
        return this;
    }


    /**
     * set 子账号目录个数
     *
     * @param dirCount
     */
    public SubUserRefreshLimit dirCount(Long dirCount) {
        this.dirCount = dirCount;
        return this;
    }


    /**
     * set 子账号预热个数
     *
     * @param prefetchCount
     */
    public SubUserRefreshLimit prefetchCount(Long prefetchCount) {
        this.prefetchCount = prefetchCount;
        return this;
    }


}