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

package com.jdcloud.sdk.service.cloudsign.model;


/**
 * paddingInfo
 */
public class PaddingInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 填充关键字
     */
    private String key;

    /**
     * 填充数据
     */
    private String value;

    /**
     * 页码
     */
    private Integer page;



    /**
     * get 填充关键字
     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * set 填充关键字
     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }


    /**
     * get 填充数据
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set 填充数据
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * get 页码
     *
     * @return
     */
    public Integer getPage() {
        return page;
    }

    /**
     * set 页码
     *
     * @param page
     */
    public void setPage(Integer page) {
        this.page = page;
    }



    /**
     * set 填充关键字
     *
     * @param key
     */
    public PaddingInfo key(String key) {
        this.key = key;
        return this;
    }


    /**
     * set 填充数据
     *
     * @param value
     */
    public PaddingInfo value(String value) {
        this.value = value;
        return this;
    }


    /**
     * set 页码
     *
     * @param page
     */
    public PaddingInfo page(Integer page) {
        this.page = page;
        return this;
    }


}