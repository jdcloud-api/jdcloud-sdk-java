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

package com.jdcloud.sdk.service.partner.model;


/**
 * broker
 */
public class Broker  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 对接人名称
     */
    private String name;

    /**
     * 对接人身份
     */
    private Integer identity;

    /**
     * 对接人身份说明
     */
    private String identityDesc;

    /**
     * 岗位
     */
    private String position;

    /**
     * 电话
     */
    private String tel;

    /**
     * 邮箱
     */
    private String email;



    /**
     * get 对接人名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 对接人名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 对接人身份
     *
     * @return
     */
    public Integer getIdentity() {
        return identity;
    }

    /**
     * set 对接人身份
     *
     * @param identity
     */
    public void setIdentity(Integer identity) {
        this.identity = identity;
    }


    /**
     * get 对接人身份说明
     *
     * @return
     */
    public String getIdentityDesc() {
        return identityDesc;
    }

    /**
     * set 对接人身份说明
     *
     * @param identityDesc
     */
    public void setIdentityDesc(String identityDesc) {
        this.identityDesc = identityDesc;
    }


    /**
     * get 岗位
     *
     * @return
     */
    public String getPosition() {
        return position;
    }

    /**
     * set 岗位
     *
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }


    /**
     * get 电话
     *
     * @return
     */
    public String getTel() {
        return tel;
    }

    /**
     * set 电话
     *
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }


    /**
     * get 邮箱
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set 邮箱
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }



    /**
     * set 对接人名称
     *
     * @param name
     */
    public Broker name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 对接人身份
     *
     * @param identity
     */
    public Broker identity(Integer identity) {
        this.identity = identity;
        return this;
    }


    /**
     * set 对接人身份说明
     *
     * @param identityDesc
     */
    public Broker identityDesc(String identityDesc) {
        this.identityDesc = identityDesc;
        return this;
    }


    /**
     * set 岗位
     *
     * @param position
     */
    public Broker position(String position) {
        this.position = position;
        return this;
    }


    /**
     * set 电话
     *
     * @param tel
     */
    public Broker tel(String tel) {
        this.tel = tel;
        return this;
    }


    /**
     * set 邮箱
     *
     * @param email
     */
    public Broker email(String email) {
        this.email = email;
        return this;
    }


}