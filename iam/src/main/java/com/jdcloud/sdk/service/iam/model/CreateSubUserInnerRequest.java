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
 * SubUser Management
 * SubUser Management API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iam.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.iam.model.CreateSubUserInfoInner;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建子用户, &lt;br&gt;
请访问&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/iam/subuser-management&quot;&gt;子用户管理&lt;/a&gt;了解更多 &lt;br&gt;

 */
public class CreateSubUserInnerRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 子用户信息
     * Required:true
     */
    @Required
    private CreateSubUserInfoInner createSubUserInfo;



    /**
     * get 子用户信息
     *
     * @return
     */
    public CreateSubUserInfoInner getCreateSubUserInfo() {
        return createSubUserInfo;
    }

    /**
     * set 子用户信息
     *
     * @param createSubUserInfo
     */
    public void setCreateSubUserInfo(CreateSubUserInfoInner createSubUserInfo) {
        this.createSubUserInfo = createSubUserInfo;
    }



    /**
     * set 子用户信息
     *
     * @param createSubUserInfo
     */
    public CreateSubUserInnerRequest createSubUserInfo(CreateSubUserInfoInner createSubUserInfo) {
        this.createSubUserInfo = createSubUserInfo;
        return this;
    }


}