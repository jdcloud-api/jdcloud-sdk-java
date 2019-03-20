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

package com.jdcloud.sdk.service.kms.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * secretTimeCfg
 */
public class SecretTimeCfg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 激活时间，默认为当前时间，采用ISO8601标准，格式为: YYYY-MM-DDTHH:mm:ssZ
     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 到期时间，默认为永久不到期，采用ISO8601标准，格式为: YYYY-MM-DDTHH:mm:ssZ
     * Required:true
     */
    @Required
    private String expireTime;


    /**
     * get 激活时间，默认为当前时间，采用ISO8601标准，格式为: YYYY-MM-DDTHH:mm:ssZ
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 激活时间，默认为当前时间，采用ISO8601标准，格式为: YYYY-MM-DDTHH:mm:ssZ
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 到期时间，默认为永久不到期，采用ISO8601标准，格式为: YYYY-MM-DDTHH:mm:ssZ
     *
     * @return
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * set 到期时间，默认为永久不到期，采用ISO8601标准，格式为: YYYY-MM-DDTHH:mm:ssZ
     *
     * @param expireTime
     */
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }


    /**
     * set 激活时间，默认为当前时间，采用ISO8601标准，格式为: YYYY-MM-DDTHH:mm:ssZ
     *
     * @param startTime
     */
    public SecretTimeCfg startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 到期时间，默认为永久不到期，采用ISO8601标准，格式为: YYYY-MM-DDTHH:mm:ssZ
     *
     * @param expireTime
     */
    public SecretTimeCfg expireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }


}