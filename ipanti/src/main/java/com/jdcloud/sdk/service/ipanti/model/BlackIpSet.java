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

package com.jdcloud.sdk.service.ipanti.model;

import java.util.List;
import java.util.ArrayList;

/**
 * blackIpSet
 */
public class BlackIpSet  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * IP 黑名单 Id
     */
    private String id;

    /**
     * IP 黑名单的名称
     */
    private String name;

    /**
     * IP 或 IP 段的数组
     */
    private List<String> ip;

    /**
     * 是否打开
     */
    private Boolean enable;


    /**
     * get IP 黑名单 Id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set IP 黑名单 Id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get IP 黑名单的名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set IP 黑名单的名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get IP 或 IP 段的数组
     *
     * @return
     */
    public List<String> getIp() {
        return ip;
    }

    /**
     * set IP 或 IP 段的数组
     *
     * @param ip
     */
    public void setIp(List<String> ip) {
        this.ip = ip;
    }

    /**
     * get 是否打开
     *
     * @return
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * set 是否打开
     *
     * @param enable
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }


    /**
     * set IP 黑名单 Id
     *
     * @param id
     */
    public BlackIpSet id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set IP 黑名单的名称
     *
     * @param name
     */
    public BlackIpSet name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set IP 或 IP 段的数组
     *
     * @param ip
     */
    public BlackIpSet ip(List<String> ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set 是否打开
     *
     * @param enable
     */
    public BlackIpSet enable(Boolean enable) {
        this.enable = enable;
        return this;
    }


    /**
     * add item to IP 或 IP 段的数组
     *
     * @param ip
     */
    public void addIp(String ip) {
        if (this.ip == null) {
            this.ip = new ArrayList<>();
        }
        this.ip.add(ip);
    }

}