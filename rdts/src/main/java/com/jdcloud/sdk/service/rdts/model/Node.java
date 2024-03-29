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

import com.jdcloud.sdk.annotation.Required;

/**
 * 节点信息
 */
public class Node  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * host，可以是ip或域名
     * Required:true
     */
    @Required
    private String host;

    /**
     * 端口
     * Required:true
     */
    @Required
    private Integer port;

    /**
     * 访问密码
     * Required:true
     */
    @Required
    private String password;


    /**
     * get host，可以是ip或域名
     *
     * @return
     */
    public String getHost() {
        return host;
    }

    /**
     * set host，可以是ip或域名
     *
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * get 端口
     *
     * @return
     */
    public Integer getPort() {
        return port;
    }

    /**
     * set 端口
     *
     * @param port
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * get 访问密码
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set 访问密码
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * set host，可以是ip或域名
     *
     * @param host
     */
    public Node host(String host) {
        this.host = host;
        return this;
    }

    /**
     * set 端口
     *
     * @param port
     */
    public Node port(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * set 访问密码
     *
     * @param password
     */
    public Node password(String password) {
        this.password = password;
        return this;
    }


}