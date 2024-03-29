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

package com.jdcloud.sdk.service.pod.model;


/**
 * 容器日志配置信息。
 */
public class LogConfig  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日志Driver名称。
     */
    private String logDriver;



    /**
     * get 日志Driver名称。
     *
     * @return
     */
    public String getLogDriver() {
        return logDriver;
    }

    /**
     * set 日志Driver名称。
     *
     * @param logDriver
     */
    public void setLogDriver(String logDriver) {
        this.logDriver = logDriver;
    }



    /**
     * set 日志Driver名称。
     *
     * @param logDriver
     */
    public LogConfig logDriver(String logDriver) {
        this.logDriver = logDriver;
        return this;
    }


}