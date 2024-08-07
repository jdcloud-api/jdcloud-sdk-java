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
 * 实名认证-服务管理接口
 * 实名认证-服务管理接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cloudauth.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * H5活体检测结果新版
 */
public class GetAliveResultNewRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 检测token
     * Required:true
     */
    @Required
    private String token;



    /**
     * get 检测token
     *
     * @return
     */
    public String getToken() {
        return token;
    }

    /**
     * set 检测token
     *
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }



    /**
     * set 检测token
     *
     * @param token
     */
    public GetAliveResultNewRequest token(String token) {
        this.token = token;
        return this;
    }


}