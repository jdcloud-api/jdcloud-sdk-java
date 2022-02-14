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

package com.jdcloud.sdk.service.logs.model;


/**
 * updateSubscribeSpec
 */
public class UpdateSubscribeSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日志订阅状态，0表示未创建，1表示刚创建，2表示开启，3表示关闭
     */
    private Long status;


    /**
     * get 日志订阅状态，0表示未创建，1表示刚创建，2表示开启，3表示关闭
     *
     * @return
     */
    public Long getStatus() {
        return status;
    }

    /**
     * set 日志订阅状态，0表示未创建，1表示刚创建，2表示开启，3表示关闭
     *
     * @param status
     */
    public void setStatus(Long status) {
        this.status = status;
    }


    /**
     * set 日志订阅状态，0表示未创建，1表示刚创建，2表示开启，3表示关闭
     *
     * @param status
     */
    public UpdateSubscribeSpec status(Long status) {
        this.status = status;
        return this;
    }


}