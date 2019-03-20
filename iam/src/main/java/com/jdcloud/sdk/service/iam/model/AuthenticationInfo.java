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
 * authenticationInfo
 */
public class AuthenticationInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主账号pin
     */
    private String account;

    /**
     * 子账号pin
     */
    private String subUser;

    /**
     * 操作类型,格式：serviceName:operationId
     * Required:true
     */
    @Required
    private String action;

    /**
     * 资源信息,格式：jrn:service:region:accountId:resourceType/resourceId/subresourceType/subresourceId
     * Required:true
     */
    @Required
    private String resource;


    /**
     * get 主账号pin
     *
     * @return
     */
    public String getAccount() {
        return account;
    }

    /**
     * set 主账号pin
     *
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * get 子账号pin
     *
     * @return
     */
    public String getSubUser() {
        return subUser;
    }

    /**
     * set 子账号pin
     *
     * @param subUser
     */
    public void setSubUser(String subUser) {
        this.subUser = subUser;
    }

    /**
     * get 操作类型,格式：serviceName:operationId
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 操作类型,格式：serviceName:operationId
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * get 资源信息,格式：jrn:service:region:accountId:resourceType/resourceId/subresourceType/subresourceId
     *
     * @return
     */
    public String getResource() {
        return resource;
    }

    /**
     * set 资源信息,格式：jrn:service:region:accountId:resourceType/resourceId/subresourceType/subresourceId
     *
     * @param resource
     */
    public void setResource(String resource) {
        this.resource = resource;
    }


    /**
     * set 主账号pin
     *
     * @param account
     */
    public AuthenticationInfo account(String account) {
        this.account = account;
        return this;
    }

    /**
     * set 子账号pin
     *
     * @param subUser
     */
    public AuthenticationInfo subUser(String subUser) {
        this.subUser = subUser;
        return this;
    }

    /**
     * set 操作类型,格式：serviceName:operationId
     *
     * @param action
     */
    public AuthenticationInfo action(String action) {
        this.action = action;
        return this;
    }

    /**
     * set 资源信息,格式：jrn:service:region:accountId:resourceType/resourceId/subresourceType/subresourceId
     *
     * @param resource
     */
    public AuthenticationInfo resource(String resource) {
        this.resource = resource;
        return this;
    }


}