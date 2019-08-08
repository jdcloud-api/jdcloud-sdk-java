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

package com.jdcloud.sdk.service.monitor.model;


/**
 * siteMonitorSmtpOption
 */
public class SiteMonitorSmtpOption  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * passwd
     */
    private String passwd;

    /**
     * protocol
     */
    private String protocol;

    /**
     * timeout
     */
    private Long timeout;

    /**
     * user
     */
    private String user;


    /**
     * get passwd
     *
     * @return
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * set passwd
     *
     * @param passwd
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * get protocol
     *
     * @return
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * set protocol
     *
     * @param protocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * get timeout
     *
     * @return
     */
    public Long getTimeout() {
        return timeout;
    }

    /**
     * set timeout
     *
     * @param timeout
     */
    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    /**
     * get user
     *
     * @return
     */
    public String getUser() {
        return user;
    }

    /**
     * set user
     *
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }


    /**
     * set passwd
     *
     * @param passwd
     */
    public SiteMonitorSmtpOption passwd(String passwd) {
        this.passwd = passwd;
        return this;
    }

    /**
     * set protocol
     *
     * @param protocol
     */
    public SiteMonitorSmtpOption protocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * set timeout
     *
     * @param timeout
     */
    public SiteMonitorSmtpOption timeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * set user
     *
     * @param user
     */
    public SiteMonitorSmtpOption user(String user) {
        this.user = user;
        return this;
    }


}