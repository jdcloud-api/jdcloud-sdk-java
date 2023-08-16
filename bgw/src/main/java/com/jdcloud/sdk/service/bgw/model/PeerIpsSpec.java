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

package com.jdcloud.sdk.service.bgw.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * peerIpsSpec
 */
public class PeerIpsSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Peer用户侧地址，创建托管专线时，会将多条物理链路连接到不同的专线接入设备上，以保证服务的高可用性。需为每条物理链路明确指定业务通道两端的路由地址，例如：192.168.1.1/30和192.168.1.2/30，两个IP需在一个网段、不能相同且不能和其他Peer内IP重叠，客户侧使用第一个地址，京东云使用第二个地址
     * Required:true
     */
    @Required
    private String customerIp;

    /**
     * Peer京东云侧地址，创建托管专线时，会将多条物理链路连接到不同的专线接入设备上，以保证服务的高可用性。需为每条物理链路明确指定业务通道两端的路由地址，例如：192.168.1.1/30和192.168.1.2/30，两个IP需在一个网段、不能相同且不能其他Peer内IP重叠，客户侧使用第一个地址，京东云使用第二个地址
     * Required:true
     */
    @Required
    private String jdCloudIp;



    /**
     * get Peer用户侧地址，创建托管专线时，会将多条物理链路连接到不同的专线接入设备上，以保证服务的高可用性。需为每条物理链路明确指定业务通道两端的路由地址，例如：192.168.1.1/30和192.168.1.2/30，两个IP需在一个网段、不能相同且不能和其他Peer内IP重叠，客户侧使用第一个地址，京东云使用第二个地址
     *
     * @return
     */
    public String getCustomerIp() {
        return customerIp;
    }

    /**
     * set Peer用户侧地址，创建托管专线时，会将多条物理链路连接到不同的专线接入设备上，以保证服务的高可用性。需为每条物理链路明确指定业务通道两端的路由地址，例如：192.168.1.1/30和192.168.1.2/30，两个IP需在一个网段、不能相同且不能和其他Peer内IP重叠，客户侧使用第一个地址，京东云使用第二个地址
     *
     * @param customerIp
     */
    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }


    /**
     * get Peer京东云侧地址，创建托管专线时，会将多条物理链路连接到不同的专线接入设备上，以保证服务的高可用性。需为每条物理链路明确指定业务通道两端的路由地址，例如：192.168.1.1/30和192.168.1.2/30，两个IP需在一个网段、不能相同且不能其他Peer内IP重叠，客户侧使用第一个地址，京东云使用第二个地址
     *
     * @return
     */
    public String getJdCloudIp() {
        return jdCloudIp;
    }

    /**
     * set Peer京东云侧地址，创建托管专线时，会将多条物理链路连接到不同的专线接入设备上，以保证服务的高可用性。需为每条物理链路明确指定业务通道两端的路由地址，例如：192.168.1.1/30和192.168.1.2/30，两个IP需在一个网段、不能相同且不能其他Peer内IP重叠，客户侧使用第一个地址，京东云使用第二个地址
     *
     * @param jdCloudIp
     */
    public void setJdCloudIp(String jdCloudIp) {
        this.jdCloudIp = jdCloudIp;
    }



    /**
     * set Peer用户侧地址，创建托管专线时，会将多条物理链路连接到不同的专线接入设备上，以保证服务的高可用性。需为每条物理链路明确指定业务通道两端的路由地址，例如：192.168.1.1/30和192.168.1.2/30，两个IP需在一个网段、不能相同且不能和其他Peer内IP重叠，客户侧使用第一个地址，京东云使用第二个地址
     *
     * @param customerIp
     */
    public PeerIpsSpec customerIp(String customerIp) {
        this.customerIp = customerIp;
        return this;
    }


    /**
     * set Peer京东云侧地址，创建托管专线时，会将多条物理链路连接到不同的专线接入设备上，以保证服务的高可用性。需为每条物理链路明确指定业务通道两端的路由地址，例如：192.168.1.1/30和192.168.1.2/30，两个IP需在一个网段、不能相同且不能其他Peer内IP重叠，客户侧使用第一个地址，京东云使用第二个地址
     *
     * @param jdCloudIp
     */
    public PeerIpsSpec jdCloudIp(String jdCloudIp) {
        this.jdCloudIp = jdCloudIp;
        return this;
    }


}