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
 * vpnTunnelAdminStatus
 */
public class VpnTunnelAdminStatus  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 隧道管理状态, UP, DOWN
     * Required:true
     */
    @Required
    private String adminStatus;



    /**
     * get 隧道管理状态, UP, DOWN
     *
     * @return
     */
    public String getAdminStatus() {
        return adminStatus;
    }

    /**
     * set 隧道管理状态, UP, DOWN
     *
     * @param adminStatus
     */
    public void setAdminStatus(String adminStatus) {
        this.adminStatus = adminStatus;
    }



    /**
     * set 隧道管理状态, UP, DOWN
     *
     * @param adminStatus
     */
    public VpnTunnelAdminStatus adminStatus(String adminStatus) {
        this.adminStatus = adminStatus;
        return this;
    }


}