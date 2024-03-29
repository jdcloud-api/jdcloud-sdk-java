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

package com.jdcloud.sdk.service.dbs.model;


/**
 * agent
 */
public class Agent  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * agent的ID
     */
    private String agentId;

    /**
     * agent的名字
     */
    private String agentName;

    /**
     * agent的IP
     */
    private String ip;

    /**
     * agent的hostname
     */
    private String hostName;


    /**
     * get agent的ID
     *
     * @return
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * set agent的ID
     *
     * @param agentId
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * get agent的名字
     *
     * @return
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * set agent的名字
     *
     * @param agentName
     */
    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    /**
     * get agent的IP
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set agent的IP
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * get agent的hostname
     *
     * @return
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * set agent的hostname
     *
     * @param hostName
     */
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }


    /**
     * set agent的ID
     *
     * @param agentId
     */
    public Agent agentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * set agent的名字
     *
     * @param agentName
     */
    public Agent agentName(String agentName) {
        this.agentName = agentName;
        return this;
    }

    /**
     * set agent的IP
     *
     * @param ip
     */
    public Agent ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set agent的hostname
     *
     * @param hostName
     */
    public Agent hostName(String hostName) {
        this.hostName = hostName;
        return this;
    }


}