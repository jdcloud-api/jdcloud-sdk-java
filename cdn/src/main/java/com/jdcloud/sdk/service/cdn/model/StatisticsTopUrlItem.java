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

package com.jdcloud.sdk.service.cdn.model;


/**
 * statisticsTopUrlItem
 */
public class StatisticsTopUrlItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * url
     */
    private String url;

    /**
     * rank
     */
    private Integer rank;

    /**
     * value
     */
    private Integer value;

    /**
     * 查询结果,类型为HashMap&lt;String, Object&gt;
     */
    private Object fullValue;



    /**
     * get url
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set url
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }


    /**
     * get rank
     *
     * @return
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * set rank
     *
     * @param rank
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }


    /**
     * get value
     *
     * @return
     */
    public Integer getValue() {
        return value;
    }

    /**
     * set value
     *
     * @param value
     */
    public void setValue(Integer value) {
        this.value = value;
    }


    /**
     * get 查询结果,类型为HashMap&lt;String, Object&gt;
     *
     * @return
     */
    public Object getFullValue() {
        return fullValue;
    }

    /**
     * set 查询结果,类型为HashMap&lt;String, Object&gt;
     *
     * @param fullValue
     */
    public void setFullValue(Object fullValue) {
        this.fullValue = fullValue;
    }



    /**
     * set url
     *
     * @param url
     */
    public StatisticsTopUrlItem url(String url) {
        this.url = url;
        return this;
    }


    /**
     * set rank
     *
     * @param rank
     */
    public StatisticsTopUrlItem rank(Integer rank) {
        this.rank = rank;
        return this;
    }


    /**
     * set value
     *
     * @param value
     */
    public StatisticsTopUrlItem value(Integer value) {
        this.value = value;
        return this;
    }


    /**
     * set 查询结果,类型为HashMap&lt;String, Object&gt;
     *
     * @param fullValue
     */
    public StatisticsTopUrlItem fullValue(Object fullValue) {
        this.fullValue = fullValue;
        return this;
    }


}