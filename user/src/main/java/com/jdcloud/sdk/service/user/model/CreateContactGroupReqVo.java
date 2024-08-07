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

import com.jdcloud.sdk.annotation.Required;

/**
 * createContactGroupReqVo
 */
public class CreateContactGroupReqVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 联系组名称
     * Required:true
     */
    @Required
    private String groupName;



    /**
     * get 联系组名称
     *
     * @return
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * set 联系组名称
     *
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }



    /**
     * set 联系组名称
     *
     * @param groupName
     */
    public CreateContactGroupReqVo groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }


}