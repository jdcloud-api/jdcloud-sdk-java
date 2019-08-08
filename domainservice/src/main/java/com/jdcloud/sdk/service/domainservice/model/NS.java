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

package com.jdcloud.sdk.service.domainservice.model;


/**
 * nS
 */
public class NS  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 京东NS服务器:0，非京东服务器:1
     */
    private Integer tag;

    /**
     * NS记录的值
     */
    private String server;


    /**
     * get 京东NS服务器:0，非京东服务器:1
     *
     * @return
     */
    public Integer getTag() {
        return tag;
    }

    /**
     * set 京东NS服务器:0，非京东服务器:1
     *
     * @param tag
     */
    public void setTag(Integer tag) {
        this.tag = tag;
    }

    /**
     * get NS记录的值
     *
     * @return
     */
    public String getServer() {
        return server;
    }

    /**
     * set NS记录的值
     *
     * @param server
     */
    public void setServer(String server) {
        this.server = server;
    }


    /**
     * set 京东NS服务器:0，非京东服务器:1
     *
     * @param tag
     */
    public NS tag(Integer tag) {
        this.tag = tag;
        return this;
    }

    /**
     * set NS记录的值
     *
     * @param server
     */
    public NS server(String server) {
        this.server = server;
        return this;
    }


}