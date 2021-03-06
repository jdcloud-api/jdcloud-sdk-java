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
 * Cloud-Physical-Server
 * 云物理服务器操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 申请IPv6地址
 */
public class AssignIpv6AddressResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * IPv6地址
     */
    private String ipv6Address;


    /**
     * get IPv6地址
     *
     * @return
     */
    public String getIpv6Address() {
        return ipv6Address;
    }

    /**
     * set IPv6地址
     *
     * @param ipv6Address
     */
    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }


    /**
     * set IPv6地址
     *
     * @param ipv6Address
     */
    public AssignIpv6AddressResult ipv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }


}