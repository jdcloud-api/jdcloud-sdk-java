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
 * redis类型属性
 */
public class RedisType  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * type名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * 当前type的key个数
     * Required:true
     */
    @Required
    private Long keyNumber;

    /**
     * 当前type的key的内存大小，单位：字节，redis2.8无此项
     * Required:true
     */
    @Required
    private Long keySize;

    /**
     * type占比
     * Required:true
     */
    @Required
    private Float ratio;



    /**
     * get type名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set type名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 当前type的key个数
     *
     * @return
     */
    public Long getKeyNumber() {
        return keyNumber;
    }

    /**
     * set 当前type的key个数
     *
     * @param keyNumber
     */
    public void setKeyNumber(Long keyNumber) {
        this.keyNumber = keyNumber;
    }


    /**
     * get 当前type的key的内存大小，单位：字节，redis2.8无此项
     *
     * @return
     */
    public Long getKeySize() {
        return keySize;
    }

    /**
     * set 当前type的key的内存大小，单位：字节，redis2.8无此项
     *
     * @param keySize
     */
    public void setKeySize(Long keySize) {
        this.keySize = keySize;
    }


    /**
     * get type占比
     *
     * @return
     */
    public Float getRatio() {
        return ratio;
    }

    /**
     * set type占比
     *
     * @param ratio
     */
    public void setRatio(Float ratio) {
        this.ratio = ratio;
    }



    /**
     * set type名称
     *
     * @param name
     */
    public RedisType name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 当前type的key个数
     *
     * @param keyNumber
     */
    public RedisType keyNumber(Long keyNumber) {
        this.keyNumber = keyNumber;
        return this;
    }


    /**
     * set 当前type的key的内存大小，单位：字节，redis2.8无此项
     *
     * @param keySize
     */
    public RedisType keySize(Long keySize) {
        this.keySize = keySize;
        return this;
    }


    /**
     * set type占比
     *
     * @param ratio
     */
    public RedisType ratio(Float ratio) {
        this.ratio = ratio;
        return this;
    }


}