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

package com.jdcloud.sdk.service.rdts.model;


/**
 * 分片的槽信息
 */
public class Buckets  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 槽范围起始
     */
    private Integer from;

    /**
     * 槽范围终止
     */
    private Integer to;


    /**
     * get 槽范围起始
     *
     * @return
     */
    public Integer getFrom() {
        return from;
    }

    /**
     * set 槽范围起始
     *
     * @param from
     */
    public void setFrom(Integer from) {
        this.from = from;
    }

    /**
     * get 槽范围终止
     *
     * @return
     */
    public Integer getTo() {
        return to;
    }

    /**
     * set 槽范围终止
     *
     * @param to
     */
    public void setTo(Integer to) {
        this.to = to;
    }


    /**
     * set 槽范围起始
     *
     * @param from
     */
    public Buckets from(Integer from) {
        this.from = from;
        return this;
    }

    /**
     * set 槽范围终止
     *
     * @param to
     */
    public Buckets to(Integer to) {
        this.to = to;
        return this;
    }


}