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

package com.jdcloud.sdk.service.dts.model;

import java.util.List;
import java.util.ArrayList;

/**
 * alarm
 */
public class Alarm  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否设置任务报警。开启：enable、关闭：disable
     */
    private String status;

    /**
     * 是否设置任务异常报警，当任务传输异常时，触发告警。开启：enable、关闭：disable
     */
    private String errorAlarmStatus;

    /**
     * 是否设置任务延迟报警，当任务传输出现延迟，并超过延迟阈值时，触发告警。开启：enable、关闭：disable
     */
    private String delayAlarmStatus;

    /**
     * 任务延迟阈值，超过该阈值时，触发报警
     */
    private Integer delayPeriod;

    /**
     * 接受告警人电话
     */
    
    private List<String> phone;


    /**
     * get 是否设置任务报警。开启：enable、关闭：disable
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 是否设置任务报警。开启：enable、关闭：disable
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get 是否设置任务异常报警，当任务传输异常时，触发告警。开启：enable、关闭：disable
     *
     * @return
     */
    public String getErrorAlarmStatus() {
        return errorAlarmStatus;
    }

    /**
     * set 是否设置任务异常报警，当任务传输异常时，触发告警。开启：enable、关闭：disable
     *
     * @param errorAlarmStatus
     */
    public void setErrorAlarmStatus(String errorAlarmStatus) {
        this.errorAlarmStatus = errorAlarmStatus;
    }


    /**
     * get 是否设置任务延迟报警，当任务传输出现延迟，并超过延迟阈值时，触发告警。开启：enable、关闭：disable
     *
     * @return
     */
    public String getDelayAlarmStatus() {
        return delayAlarmStatus;
    }

    /**
     * set 是否设置任务延迟报警，当任务传输出现延迟，并超过延迟阈值时，触发告警。开启：enable、关闭：disable
     *
     * @param delayAlarmStatus
     */
    public void setDelayAlarmStatus(String delayAlarmStatus) {
        this.delayAlarmStatus = delayAlarmStatus;
    }


    /**
     * get 任务延迟阈值，超过该阈值时，触发报警
     *
     * @return
     */
    public Integer getDelayPeriod() {
        return delayPeriod;
    }

    /**
     * set 任务延迟阈值，超过该阈值时，触发报警
     *
     * @param delayPeriod
     */
    public void setDelayPeriod(Integer delayPeriod) {
        this.delayPeriod = delayPeriod;
    }


    /**
    * get 接受告警人电话
    *
    * @return
    */
    public List<String> getPhone() {
        return phone;
    }

    /**
    * set 接受告警人电话
    *
    * @param phone
    */
    public void setPhone(List<String> phone) {
        this.phone = phone;
    }



    /**
     * set 是否设置任务报警。开启：enable、关闭：disable
     *
     * @param status
     */
    public Alarm status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set 是否设置任务异常报警，当任务传输异常时，触发告警。开启：enable、关闭：disable
     *
     * @param errorAlarmStatus
     */
    public Alarm errorAlarmStatus(String errorAlarmStatus) {
        this.errorAlarmStatus = errorAlarmStatus;
        return this;
    }


    /**
     * set 是否设置任务延迟报警，当任务传输出现延迟，并超过延迟阈值时，触发告警。开启：enable、关闭：disable
     *
     * @param delayAlarmStatus
     */
    public Alarm delayAlarmStatus(String delayAlarmStatus) {
        this.delayAlarmStatus = delayAlarmStatus;
        return this;
    }


    /**
     * set 任务延迟阈值，超过该阈值时，触发报警
     *
     * @param delayPeriod
     */
    public Alarm delayPeriod(Integer delayPeriod) {
        this.delayPeriod = delayPeriod;
        return this;
    }


    /**
    * set 接受告警人电话
    *
    * @param phone
    */
    public Alarm phone(List<String> phone) {
        this.phone = phone;
        return this;
    }



    /**
     * add item to 接受告警人电话
     *
     * @param phone
     */
    public void addPhone(String phone) {
        if (this.phone == null) {
            this.phone = new ArrayList<>();
        }
        this.phone.add(phone);
    }
}