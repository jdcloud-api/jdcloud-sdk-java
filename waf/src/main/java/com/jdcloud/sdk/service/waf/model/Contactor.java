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

package com.jdcloud.sdk.service.waf.model;


/**
 * contactor
 */
public class Contactor  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 联系人/群组Id
     */
    private String contactId;

    /**
     * 是否选中，1-选中，0-未选中
     */
    private Integer selected;



    /**
     * get 联系人/群组Id
     *
     * @return
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * set 联系人/群组Id
     *
     * @param contactId
     */
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }


    /**
     * get 是否选中，1-选中，0-未选中
     *
     * @return
     */
    public Integer getSelected() {
        return selected;
    }

    /**
     * set 是否选中，1-选中，0-未选中
     *
     * @param selected
     */
    public void setSelected(Integer selected) {
        this.selected = selected;
    }



    /**
     * set 联系人/群组Id
     *
     * @param contactId
     */
    public Contactor contactId(String contactId) {
        this.contactId = contactId;
        return this;
    }


    /**
     * set 是否选中，1-选中，0-未选中
     *
     * @param selected
     */
    public Contactor selected(Integer selected) {
        this.selected = selected;
        return this;
    }


}