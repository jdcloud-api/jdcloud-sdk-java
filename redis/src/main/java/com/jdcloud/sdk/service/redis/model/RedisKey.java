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
 * redis键属性
 */
public class RedisKey  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * key名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * key所在的db号
     * Required:true
     */
    @Required
    private Integer db;

    /**
     * string类型的key表示字节数，list类型的key表示列表长度，set或zset类型的key表示集合或有序集合的大小、hash类型的key表示字典的大小等等
     * Required:true
     */
    @Required
    private Integer size;

    /**
     * string、list、set、zset、hash五种类型
     * Required:true
     */
    @Required
    private String keyType;

    /**
     * key访问的频度
     */
    private Integer frequency;



    /**
     * get key名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set key名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get key所在的db号
     *
     * @return
     */
    public Integer getDb() {
        return db;
    }

    /**
     * set key所在的db号
     *
     * @param db
     */
    public void setDb(Integer db) {
        this.db = db;
    }


    /**
     * get string类型的key表示字节数，list类型的key表示列表长度，set或zset类型的key表示集合或有序集合的大小、hash类型的key表示字典的大小等等
     *
     * @return
     */
    public Integer getSize() {
        return size;
    }

    /**
     * set string类型的key表示字节数，list类型的key表示列表长度，set或zset类型的key表示集合或有序集合的大小、hash类型的key表示字典的大小等等
     *
     * @param size
     */
    public void setSize(Integer size) {
        this.size = size;
    }


    /**
     * get string、list、set、zset、hash五种类型
     *
     * @return
     */
    public String getKeyType() {
        return keyType;
    }

    /**
     * set string、list、set、zset、hash五种类型
     *
     * @param keyType
     */
    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }


    /**
     * get key访问的频度
     *
     * @return
     */
    public Integer getFrequency() {
        return frequency;
    }

    /**
     * set key访问的频度
     *
     * @param frequency
     */
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }



    /**
     * set key名称
     *
     * @param name
     */
    public RedisKey name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set key所在的db号
     *
     * @param db
     */
    public RedisKey db(Integer db) {
        this.db = db;
        return this;
    }


    /**
     * set string类型的key表示字节数，list类型的key表示列表长度，set或zset类型的key表示集合或有序集合的大小、hash类型的key表示字典的大小等等
     *
     * @param size
     */
    public RedisKey size(Integer size) {
        this.size = size;
        return this;
    }


    /**
     * set string、list、set、zset、hash五种类型
     *
     * @param keyType
     */
    public RedisKey keyType(String keyType) {
        this.keyType = keyType;
        return this;
    }


    /**
     * set key访问的频度
     *
     * @param frequency
     */
    public RedisKey frequency(Integer frequency) {
        this.frequency = frequency;
        return this;
    }


}