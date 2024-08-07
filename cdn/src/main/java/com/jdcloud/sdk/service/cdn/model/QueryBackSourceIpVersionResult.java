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
 * 域名操作类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询回源IP类型
 */
public class QueryBackSourceIpVersionResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 回源IP类型，取值ipv4/ipv6/ipv46。ipv4：回源IP为ipv4；ipv6：ipv6优先；ipv46：ipv4/ipv6负载均衡
     */
    private String backSourceIpVersion;



    /**
     * get 回源IP类型，取值ipv4/ipv6/ipv46。ipv4：回源IP为ipv4；ipv6：ipv6优先；ipv46：ipv4/ipv6负载均衡
     *
     * @return
     */
    public String getBackSourceIpVersion() {
        return backSourceIpVersion;
    }

    /**
     * set 回源IP类型，取值ipv4/ipv6/ipv46。ipv4：回源IP为ipv4；ipv6：ipv6优先；ipv46：ipv4/ipv6负载均衡
     *
     * @param backSourceIpVersion
     */
    public void setBackSourceIpVersion(String backSourceIpVersion) {
        this.backSourceIpVersion = backSourceIpVersion;
    }



    /**
     * set 回源IP类型，取值ipv4/ipv6/ipv46。ipv4：回源IP为ipv4；ipv6：ipv6优先；ipv46：ipv4/ipv6负载均衡
     *
     * @param backSourceIpVersion
     */
    public QueryBackSourceIpVersionResult backSourceIpVersion(String backSourceIpVersion) {
        this.backSourceIpVersion = backSourceIpVersion;
        return this;
    }


}