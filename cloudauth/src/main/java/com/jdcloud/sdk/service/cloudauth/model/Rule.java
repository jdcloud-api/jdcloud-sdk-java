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

package com.jdcloud.sdk.service.cloudauth.model;


/**
 * rule
 */
public class Rule  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * is
     */
    private Integer id;

    /**
     * pin
     */
    private String pin;

    /**
     * 实名认证类型
     */
    private Integer type;

    /**
     * 供应商
     */
    private Integer vendor;



    /**
     * get is
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set is
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * get pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 实名认证类型
     *
     * @return
     */
    public Integer getType() {
        return type;
    }

    /**
     * set 实名认证类型
     *
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }


    /**
     * get 供应商
     *
     * @return
     */
    public Integer getVendor() {
        return vendor;
    }

    /**
     * set 供应商
     *
     * @param vendor
     */
    public void setVendor(Integer vendor) {
        this.vendor = vendor;
    }



    /**
     * set is
     *
     * @param id
     */
    public Rule id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set pin
     *
     * @param pin
     */
    public Rule pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 实名认证类型
     *
     * @param type
     */
    public Rule type(Integer type) {
        this.type = type;
        return this;
    }


    /**
     * set 供应商
     *
     * @param vendor
     */
    public Rule vendor(Integer vendor) {
        this.vendor = vendor;
        return this;
    }


}