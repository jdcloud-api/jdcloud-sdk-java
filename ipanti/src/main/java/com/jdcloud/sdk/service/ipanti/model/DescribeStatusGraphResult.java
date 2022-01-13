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
 * Anti DDoS Pro Flow APIs
 * Anti DDoS Pro Flow APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 高防返回客户端状态码报表
 */
public class DescribeStatusGraphResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * status500
     */
    private List<Long> status500;

    /**
     * status502
     */
    private List<Long> status502;

    /**
     * status504
     */
    private List<Long> status504;

    /**
     * status590
     */
    private List<Long> status590;

    /**
     * status592
     */
    private List<Long> status592;

    /**
     * status594
     */
    private List<Long> status594;

    /**
     * status5xx
     */
    private List<Long> status5xx;

    /**
     * time
     */
    private List<String> time;


    /**
     * get status500
     *
     * @return
     */
    public List<Long> getStatus500() {
        return status500;
    }

    /**
     * set status500
     *
     * @param status500
     */
    public void setStatus500(List<Long> status500) {
        this.status500 = status500;
    }

    /**
     * get status502
     *
     * @return
     */
    public List<Long> getStatus502() {
        return status502;
    }

    /**
     * set status502
     *
     * @param status502
     */
    public void setStatus502(List<Long> status502) {
        this.status502 = status502;
    }

    /**
     * get status504
     *
     * @return
     */
    public List<Long> getStatus504() {
        return status504;
    }

    /**
     * set status504
     *
     * @param status504
     */
    public void setStatus504(List<Long> status504) {
        this.status504 = status504;
    }

    /**
     * get status590
     *
     * @return
     */
    public List<Long> getStatus590() {
        return status590;
    }

    /**
     * set status590
     *
     * @param status590
     */
    public void setStatus590(List<Long> status590) {
        this.status590 = status590;
    }

    /**
     * get status592
     *
     * @return
     */
    public List<Long> getStatus592() {
        return status592;
    }

    /**
     * set status592
     *
     * @param status592
     */
    public void setStatus592(List<Long> status592) {
        this.status592 = status592;
    }

    /**
     * get status594
     *
     * @return
     */
    public List<Long> getStatus594() {
        return status594;
    }

    /**
     * set status594
     *
     * @param status594
     */
    public void setStatus594(List<Long> status594) {
        this.status594 = status594;
    }

    /**
     * get status5xx
     *
     * @return
     */
    public List<Long> getStatus5xx() {
        return status5xx;
    }

    /**
     * set status5xx
     *
     * @param status5xx
     */
    public void setStatus5xx(List<Long> status5xx) {
        this.status5xx = status5xx;
    }

    /**
     * get time
     *
     * @return
     */
    public List<String> getTime() {
        return time;
    }

    /**
     * set time
     *
     * @param time
     */
    public void setTime(List<String> time) {
        this.time = time;
    }


    /**
     * set status500
     *
     * @param status500
     */
    public DescribeStatusGraphResult status500(List<Long> status500) {
        this.status500 = status500;
        return this;
    }

    /**
     * set status502
     *
     * @param status502
     */
    public DescribeStatusGraphResult status502(List<Long> status502) {
        this.status502 = status502;
        return this;
    }

    /**
     * set status504
     *
     * @param status504
     */
    public DescribeStatusGraphResult status504(List<Long> status504) {
        this.status504 = status504;
        return this;
    }

    /**
     * set status590
     *
     * @param status590
     */
    public DescribeStatusGraphResult status590(List<Long> status590) {
        this.status590 = status590;
        return this;
    }

    /**
     * set status592
     *
     * @param status592
     */
    public DescribeStatusGraphResult status592(List<Long> status592) {
        this.status592 = status592;
        return this;
    }

    /**
     * set status594
     *
     * @param status594
     */
    public DescribeStatusGraphResult status594(List<Long> status594) {
        this.status594 = status594;
        return this;
    }

    /**
     * set status5xx
     *
     * @param status5xx
     */
    public DescribeStatusGraphResult status5xx(List<Long> status5xx) {
        this.status5xx = status5xx;
        return this;
    }

    /**
     * set time
     *
     * @param time
     */
    public DescribeStatusGraphResult time(List<String> time) {
        this.time = time;
        return this;
    }


    /**
     * add item to status500
     *
     * @param status500
     */
    public void addStatus500(Long status500) {
        if (this.status500 == null) {
            this.status500 = new ArrayList<>();
        }
        this.status500.add(status500);
    }

    /**
     * add item to status502
     *
     * @param status502
     */
    public void addStatus502(Long status502) {
        if (this.status502 == null) {
            this.status502 = new ArrayList<>();
        }
        this.status502.add(status502);
    }

    /**
     * add item to status504
     *
     * @param status504
     */
    public void addStatus504(Long status504) {
        if (this.status504 == null) {
            this.status504 = new ArrayList<>();
        }
        this.status504.add(status504);
    }

    /**
     * add item to status590
     *
     * @param status590
     */
    public void addStatus590(Long status590) {
        if (this.status590 == null) {
            this.status590 = new ArrayList<>();
        }
        this.status590.add(status590);
    }

    /**
     * add item to status592
     *
     * @param status592
     */
    public void addStatus592(Long status592) {
        if (this.status592 == null) {
            this.status592 = new ArrayList<>();
        }
        this.status592.add(status592);
    }

    /**
     * add item to status594
     *
     * @param status594
     */
    public void addStatus594(Long status594) {
        if (this.status594 == null) {
            this.status594 = new ArrayList<>();
        }
        this.status594.add(status594);
    }

    /**
     * add item to status5xx
     *
     * @param status5xx
     */
    public void addStatus5xx(Long status5xx) {
        if (this.status5xx == null) {
            this.status5xx = new ArrayList<>();
        }
        this.status5xx.add(status5xx);
    }

    /**
     * add item to time
     *
     * @param time
     */
    public void addTime(String time) {
        if (this.time == null) {
            this.time = new ArrayList<>();
        }
        this.time.add(time);
    }

}