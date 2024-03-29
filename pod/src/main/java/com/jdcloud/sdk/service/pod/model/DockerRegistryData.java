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

import com.jdcloud.sdk.annotation.Required;

/**
 * secret 的数据
 */
public class DockerRegistryData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * registry服务器地址
     * Required:true
     */
    @Required
    private String server;

    /**
     * 用户名
     * Required:true
     */
    @Required
    private String username;

    /**
     * 密码
     * Required:true
     */
    @Required
    private String password;

    /**
     * 邮件地址
     */
    private String email;



    /**
     * get registry服务器地址
     *
     * @return
     */
    public String getServer() {
        return server;
    }

    /**
     * set registry服务器地址
     *
     * @param server
     */
    public void setServer(String server) {
        this.server = server;
    }


    /**
     * get 用户名
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * set 用户名
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * get 密码
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set 密码
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * get 邮件地址
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set 邮件地址
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }



    /**
     * set registry服务器地址
     *
     * @param server
     */
    public DockerRegistryData server(String server) {
        this.server = server;
        return this;
    }


    /**
     * set 用户名
     *
     * @param username
     */
    public DockerRegistryData username(String username) {
        this.username = username;
        return this;
    }


    /**
     * set 密码
     *
     * @param password
     */
    public DockerRegistryData password(String password) {
        this.password = password;
        return this;
    }


    /**
     * set 邮件地址
     *
     * @param email
     */
    public DockerRegistryData email(String email) {
        this.email = email;
        return this;
    }


}