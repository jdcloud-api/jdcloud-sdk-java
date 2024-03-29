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
 * Instance APIs
 * Anti DDoS Protection Package Instance APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.antipro.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询已防护 IP 列表
 */
public class DescribeProtectedIpListRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码
     */
    private Integer pageNumber;

    /**
     * 分页大小
     */
    private Integer pageSize;

    /**
     * 实例 Id, 缺省时查询用户所有已防护 IP
     */
    private String instanceId;

    /**
     * 被防护 IP类型. &lt;br&gt;- 0: 全部&lt;br&gt;- 1: 弹性公网 IP&lt;br&gt;- 2: 云物理服务器公网 IP&lt;br&gt;- 3: Web应用防护墙公网 IP&lt;br&gt;- 4: 托管区公网 IP
     * Required:true
     */
    @Required
    private Integer type;

    /**
     * 被防护 IP, 支持模糊查询
     */
    private String ip;


    /**
     * get 页码
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 实例 Id, 缺省时查询用户所有已防护 IP
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例 Id, 缺省时查询用户所有已防护 IP
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 被防护 IP类型. &lt;br&gt;- 0: 全部&lt;br&gt;- 1: 弹性公网 IP&lt;br&gt;- 2: 云物理服务器公网 IP&lt;br&gt;- 3: Web应用防护墙公网 IP&lt;br&gt;- 4: 托管区公网 IP
     *
     * @return
     */
    public Integer getType() {
        return type;
    }

    /**
     * set 被防护 IP类型. &lt;br&gt;- 0: 全部&lt;br&gt;- 1: 弹性公网 IP&lt;br&gt;- 2: 云物理服务器公网 IP&lt;br&gt;- 3: Web应用防护墙公网 IP&lt;br&gt;- 4: 托管区公网 IP
     *
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * get 被防护 IP, 支持模糊查询
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set 被防护 IP, 支持模糊查询
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }


    /**
     * set 页码
     *
     * @param pageNumber
     */
    public DescribeProtectedIpListRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public DescribeProtectedIpListRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 实例 Id, 缺省时查询用户所有已防护 IP
     *
     * @param instanceId
     */
    public DescribeProtectedIpListRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 被防护 IP类型. &lt;br&gt;- 0: 全部&lt;br&gt;- 1: 弹性公网 IP&lt;br&gt;- 2: 云物理服务器公网 IP&lt;br&gt;- 3: Web应用防护墙公网 IP&lt;br&gt;- 4: 托管区公网 IP
     *
     * @param type
     */
    public DescribeProtectedIpListRequest type(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * set 被防护 IP, 支持模糊查询
     *
     * @param ip
     */
    public DescribeProtectedIpListRequest ip(String ip) {
        this.ip = ip;
        return this;
    }


}