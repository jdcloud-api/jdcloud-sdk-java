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

package com.jdcloud.sdk.service.user.model;


/**
 * contactGroupVo
 */
public class ContactGroupVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 联系组ID
     */
    private Long groupId;

    /**
     * 用户pin(创建人)
     */
    private String pin;

    /**
     * 组名
     */
    private String groupName;



    /**
     * get 联系组ID
     *
     * @return
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * set 联系组ID
     *
     * @param groupId
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }


    /**
     * get 用户pin(创建人)
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin(创建人)
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 组名
     *
     * @return
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * set 组名
     *
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }



    /**
     * set 联系组ID
     *
     * @param groupId
     */
    public ContactGroupVo groupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }


    /**
     * set 用户pin(创建人)
     *
     * @param pin
     */
    public ContactGroupVo pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 组名
     *
     * @param groupName
     */
    public ContactGroupVo groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }


}