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


/**
 * riskConfDefaultCfg
 */
public class RiskConfDefaultCfg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规则id
     */
    private Integer id;

    /**
     * 配置键
     */
    private String key;

    /**
     * 配置值
     */
    private String value;

    /**
     * 更新时间，s
     */
    private Integer updateTime;



    /**
     * get 规则id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 规则id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * get 配置键
     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * set 配置键
     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }


    /**
     * get 配置值
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set 配置值
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * get 更新时间，s
     *
     * @return
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间，s
     *
     * @param updateTime
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }



    /**
     * set 规则id
     *
     * @param id
     */
    public RiskConfDefaultCfg id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set 配置键
     *
     * @param key
     */
    public RiskConfDefaultCfg key(String key) {
        this.key = key;
        return this;
    }


    /**
     * set 配置值
     *
     * @param value
     */
    public RiskConfDefaultCfg value(String value) {
        this.value = value;
        return this;
    }


    /**
     * set 更新时间，s
     *
     * @param updateTime
     */
    public RiskConfDefaultCfg updateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}