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

package com.jdcloud.sdk.service.mongodb.model;


/**
 * quota
 */
public class Quota  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 总配额
     */
    private Integer total;

    /**
     * 已用
     */
    private Integer use;


    /**
     * get 总配额
     *
     * @return
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * set 总配额
     *
     * @param total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * get 已用
     *
     * @return
     */
    public Integer getUse() {
        return use;
    }

    /**
     * set 已用
     *
     * @param use
     */
    public void setUse(Integer use) {
        this.use = use;
    }


    /**
     * set 总配额
     *
     * @param total
     */
    public Quota total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * set 已用
     *
     * @param use
     */
    public Quota use(Integer use) {
        this.use = use;
        return this;
    }


}