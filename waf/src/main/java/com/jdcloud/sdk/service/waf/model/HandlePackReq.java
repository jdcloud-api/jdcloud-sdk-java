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

package com.jdcloud.sdk.service.waf.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * handlePackReq
 */
public class HandlePackReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 操作，expireDisable：停止；renew：启动；expireDelete：过期删除
     * Required:true
     */
    @Required
    private String operation;



    /**
     * get 操作，expireDisable：停止；renew：启动；expireDelete：过期删除
     *
     * @return
     */
    public String getOperation() {
        return operation;
    }

    /**
     * set 操作，expireDisable：停止；renew：启动；expireDelete：过期删除
     *
     * @param operation
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }



    /**
     * set 操作，expireDisable：停止；renew：启动；expireDelete：过期删除
     *
     * @param operation
     */
    public HandlePackReq operation(String operation) {
        this.operation = operation;
        return this;
    }


}