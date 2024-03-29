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

package com.jdcloud.sdk.service.iam.model;


/**
 * subUserAuditRecord
 */
public class SubUserAuditRecord  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 最近一次使用AK访问时间
     */
    private String lastVisitTime;

    /**
     * 最近一次使用AK访问事件
     */
    private String lastVisitEvent;



    /**
     * get 最近一次使用AK访问时间
     *
     * @return
     */
    public String getLastVisitTime() {
        return lastVisitTime;
    }

    /**
     * set 最近一次使用AK访问时间
     *
     * @param lastVisitTime
     */
    public void setLastVisitTime(String lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
    }


    /**
     * get 最近一次使用AK访问事件
     *
     * @return
     */
    public String getLastVisitEvent() {
        return lastVisitEvent;
    }

    /**
     * set 最近一次使用AK访问事件
     *
     * @param lastVisitEvent
     */
    public void setLastVisitEvent(String lastVisitEvent) {
        this.lastVisitEvent = lastVisitEvent;
    }



    /**
     * set 最近一次使用AK访问时间
     *
     * @param lastVisitTime
     */
    public SubUserAuditRecord lastVisitTime(String lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
        return this;
    }


    /**
     * set 最近一次使用AK访问事件
     *
     * @param lastVisitEvent
     */
    public SubUserAuditRecord lastVisitEvent(String lastVisitEvent) {
        this.lastVisitEvent = lastVisitEvent;
        return this;
    }


}