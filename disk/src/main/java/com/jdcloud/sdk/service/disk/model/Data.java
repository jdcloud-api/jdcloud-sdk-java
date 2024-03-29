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

package com.jdcloud.sdk.service.disk.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 云硬盘资源列表
 */
public class Data  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云硬盘ID
     */
    private String resourceId;

    /**
     * 云硬盘名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     */
    private String resourceName;

    /**
     * 云硬盘状态，取值为 creating、available、in-use、extending、restoring、deleting、deleted、error_create、error_delete、error_restore、error_extend 之一
     */
    private String status;

    /**
     * 绑定资源列表
     */
    
    private List<Bind> bind;


    /**
     * get 云硬盘ID
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 云硬盘ID
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * get 云硬盘名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @return
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * set 云硬盘名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }


    /**
     * get 云硬盘状态，取值为 creating、available、in-use、extending、restoring、deleting、deleted、error_create、error_delete、error_restore、error_extend 之一
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 云硬盘状态，取值为 creating、available、in-use、extending、restoring、deleting、deleted、error_create、error_delete、error_restore、error_extend 之一
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
    * get 绑定资源列表
    *
    * @return
    */
    public List<Bind> getBind() {
        return bind;
    }

    /**
    * set 绑定资源列表
    *
    * @param bind
    */
    public void setBind(List<Bind> bind) {
        this.bind = bind;
    }



    /**
     * set 云硬盘ID
     *
     * @param resourceId
     */
    public Data resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    /**
     * set 云硬盘名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param resourceName
     */
    public Data resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }


    /**
     * set 云硬盘状态，取值为 creating、available、in-use、extending、restoring、deleting、deleted、error_create、error_delete、error_restore、error_extend 之一
     *
     * @param status
     */
    public Data status(String status) {
        this.status = status;
        return this;
    }


    /**
    * set 绑定资源列表
    *
    * @param bind
    */
    public Data bind(List<Bind> bind) {
        this.bind = bind;
        return this;
    }



    /**
     * add item to 绑定资源列表
     *
     * @param bind
     */
    public void addBind(Bind bind) {
        if (this.bind == null) {
            this.bind = new ArrayList<>();
        }
        this.bind.add(bind);
    }
}