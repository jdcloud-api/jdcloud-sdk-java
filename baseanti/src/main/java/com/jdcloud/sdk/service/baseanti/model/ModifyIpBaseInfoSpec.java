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

package com.jdcloud.sdk.service.baseanti.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * modifyIpBaseInfoSpec
 */
public class ModifyIpBaseInfoSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公网 IP 地址, 支持 IPv4 或 IPv6. 
&lt;br&gt;如果是IPv4, 应使用点分10进制格式
&lt;br&gt;如果是IPv6, 应使用\&quot;:\&quot;分隔的8组十六进制格式(字母使用小写格式), 其中连续的 0 以及每组的前导的 0 均应省略, 例如 2001:&lt;b&gt;0&lt;/b&gt;db8:&lt;b&gt;0&lt;/b&gt;2de:&lt;b&gt;0000&lt;/b&gt;:&lt;b&gt;0000&lt;/b&gt;:&lt;b&gt;0000&lt;/b&gt;:&lt;b&gt;0000&lt;/b&gt;:&lt;b&gt;0&lt;/b&gt;e13 应表示为 2001:db8:2de::e13&quot;

     * Required:true
     */
    @Required
    private String ip;

    /**
     * 公网 IP 类型或绑定资源类型. 
&lt;br&gt;- 2: 云物理服务器公网 IP
&lt;br&gt;- 3: Web应用防火墙 IP
&lt;br&gt;- 4: 托管区公网 IP
&lt;br&gt;- 5: 京舰公网 IP

     * Required:true
     */
    @Required
    private Integer resourceType;

    /**
     * 带宽上限, 单位 Mbps
     * Required:true
     */
    @Required
    private Long bandwidth;

    /**
     * 每秒请求流量清洗阈值, 单位 bps. 用户有特殊需求时传该字段, 否则不传
     */
    private Long cleanThresholdBps;

    /**
     * 每秒报文请求数清洗阈值, 单位 pps. 用户有特殊需求时传该字段, 否则不传
     */
    private Long cleanThresholdPps;

    /**
     * 黑洞阈值, 单位 bps. 用户有特殊需求时传该字段, 否则不传
     */
    private Long blackHoleThresholdBps;


    /**
     * get 公网 IP 地址, 支持 IPv4 或 IPv6. 
&lt;br&gt;如果是IPv4, 应使用点分10进制格式
&lt;br&gt;如果是IPv6, 应使用\&quot;:\&quot;分隔的8组十六进制格式(字母使用小写格式), 其中连续的 0 以及每组的前导的 0 均应省略, 例如 2001:&lt;b&gt;0&lt;/b&gt;db8:&lt;b&gt;0&lt;/b&gt;2de:&lt;b&gt;0000&lt;/b&gt;:&lt;b&gt;0000&lt;/b&gt;:&lt;b&gt;0000&lt;/b&gt;:&lt;b&gt;0000&lt;/b&gt;:&lt;b&gt;0&lt;/b&gt;e13 应表示为 2001:db8:2de::e13&quot;

     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set 公网 IP 地址, 支持 IPv4 或 IPv6. 
&lt;br&gt;如果是IPv4, 应使用点分10进制格式
&lt;br&gt;如果是IPv6, 应使用\&quot;:\&quot;分隔的8组十六进制格式(字母使用小写格式), 其中连续的 0 以及每组的前导的 0 均应省略, 例如 2001:&lt;b&gt;0&lt;/b&gt;db8:&lt;b&gt;0&lt;/b&gt;2de:&lt;b&gt;0000&lt;/b&gt;:&lt;b&gt;0000&lt;/b&gt;:&lt;b&gt;0000&lt;/b&gt;:&lt;b&gt;0000&lt;/b&gt;:&lt;b&gt;0&lt;/b&gt;e13 应表示为 2001:db8:2de::e13&quot;

     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * get 公网 IP 类型或绑定资源类型. 
&lt;br&gt;- 2: 云物理服务器公网 IP
&lt;br&gt;- 3: Web应用防火墙 IP
&lt;br&gt;- 4: 托管区公网 IP
&lt;br&gt;- 5: 京舰公网 IP

     *
     * @return
     */
    public Integer getResourceType() {
        return resourceType;
    }

    /**
     * set 公网 IP 类型或绑定资源类型. 
&lt;br&gt;- 2: 云物理服务器公网 IP
&lt;br&gt;- 3: Web应用防火墙 IP
&lt;br&gt;- 4: 托管区公网 IP
&lt;br&gt;- 5: 京舰公网 IP

     *
     * @param resourceType
     */
    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * get 带宽上限, 单位 Mbps
     *
     * @return
     */
    public Long getBandwidth() {
        return bandwidth;
    }

    /**
     * set 带宽上限, 单位 Mbps
     *
     * @param bandwidth
     */
    public void setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * get 每秒请求流量清洗阈值, 单位 bps. 用户有特殊需求时传该字段, 否则不传
     *
     * @return
     */
    public Long getCleanThresholdBps() {
        return cleanThresholdBps;
    }

    /**
     * set 每秒请求流量清洗阈值, 单位 bps. 用户有特殊需求时传该字段, 否则不传
     *
     * @param cleanThresholdBps
     */
    public void setCleanThresholdBps(Long cleanThresholdBps) {
        this.cleanThresholdBps = cleanThresholdBps;
    }

    /**
     * get 每秒报文请求数清洗阈值, 单位 pps. 用户有特殊需求时传该字段, 否则不传
     *
     * @return
     */
    public Long getCleanThresholdPps() {
        return cleanThresholdPps;
    }

    /**
     * set 每秒报文请求数清洗阈值, 单位 pps. 用户有特殊需求时传该字段, 否则不传
     *
     * @param cleanThresholdPps
     */
    public void setCleanThresholdPps(Long cleanThresholdPps) {
        this.cleanThresholdPps = cleanThresholdPps;
    }

    /**
     * get 黑洞阈值, 单位 bps. 用户有特殊需求时传该字段, 否则不传
     *
     * @return
     */
    public Long getBlackHoleThresholdBps() {
        return blackHoleThresholdBps;
    }

    /**
     * set 黑洞阈值, 单位 bps. 用户有特殊需求时传该字段, 否则不传
     *
     * @param blackHoleThresholdBps
     */
    public void setBlackHoleThresholdBps(Long blackHoleThresholdBps) {
        this.blackHoleThresholdBps = blackHoleThresholdBps;
    }


    /**
     * set 公网 IP 地址, 支持 IPv4 或 IPv6. 
&lt;br&gt;如果是IPv4, 应使用点分10进制格式
&lt;br&gt;如果是IPv6, 应使用\&quot;:\&quot;分隔的8组十六进制格式(字母使用小写格式), 其中连续的 0 以及每组的前导的 0 均应省略, 例如 2001:&lt;b&gt;0&lt;/b&gt;db8:&lt;b&gt;0&lt;/b&gt;2de:&lt;b&gt;0000&lt;/b&gt;:&lt;b&gt;0000&lt;/b&gt;:&lt;b&gt;0000&lt;/b&gt;:&lt;b&gt;0000&lt;/b&gt;:&lt;b&gt;0&lt;/b&gt;e13 应表示为 2001:db8:2de::e13&quot;

     *
     * @param ip
     */
    public ModifyIpBaseInfoSpec ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set 公网 IP 类型或绑定资源类型. 
&lt;br&gt;- 2: 云物理服务器公网 IP
&lt;br&gt;- 3: Web应用防火墙 IP
&lt;br&gt;- 4: 托管区公网 IP
&lt;br&gt;- 5: 京舰公网 IP

     *
     * @param resourceType
     */
    public ModifyIpBaseInfoSpec resourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set 带宽上限, 单位 Mbps
     *
     * @param bandwidth
     */
    public ModifyIpBaseInfoSpec bandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set 每秒请求流量清洗阈值, 单位 bps. 用户有特殊需求时传该字段, 否则不传
     *
     * @param cleanThresholdBps
     */
    public ModifyIpBaseInfoSpec cleanThresholdBps(Long cleanThresholdBps) {
        this.cleanThresholdBps = cleanThresholdBps;
        return this;
    }

    /**
     * set 每秒报文请求数清洗阈值, 单位 pps. 用户有特殊需求时传该字段, 否则不传
     *
     * @param cleanThresholdPps
     */
    public ModifyIpBaseInfoSpec cleanThresholdPps(Long cleanThresholdPps) {
        this.cleanThresholdPps = cleanThresholdPps;
        return this;
    }

    /**
     * set 黑洞阈值, 单位 bps. 用户有特殊需求时传该字段, 否则不传
     *
     * @param blackHoleThresholdBps
     */
    public ModifyIpBaseInfoSpec blackHoleThresholdBps(Long blackHoleThresholdBps) {
        this.blackHoleThresholdBps = blackHoleThresholdBps;
        return this;
    }


}