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

package com.jdcloud.sdk.service.iam.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * sysPermissionMenuVo
 */
public class SysPermissionMenuVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * menuId
     * Required:true
     */
    @Required
    private String menuId;

    /**
     * autoMountChildMenu
     * Required:true
     */
    @Required
    private String autoMountChildMenu;



    /**
     * get menuId
     *
     * @return
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * set menuId
     *
     * @param menuId
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }


    /**
     * get autoMountChildMenu
     *
     * @return
     */
    public String getAutoMountChildMenu() {
        return autoMountChildMenu;
    }

    /**
     * set autoMountChildMenu
     *
     * @param autoMountChildMenu
     */
    public void setAutoMountChildMenu(String autoMountChildMenu) {
        this.autoMountChildMenu = autoMountChildMenu;
    }



    /**
     * set menuId
     *
     * @param menuId
     */
    public SysPermissionMenuVo menuId(String menuId) {
        this.menuId = menuId;
        return this;
    }


    /**
     * set autoMountChildMenu
     *
     * @param autoMountChildMenu
     */
    public SysPermissionMenuVo autoMountChildMenu(String autoMountChildMenu) {
        this.autoMountChildMenu = autoMountChildMenu;
        return this;
    }


}