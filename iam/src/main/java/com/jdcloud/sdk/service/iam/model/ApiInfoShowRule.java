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
 * apiInfoShowRule
 */
public class ApiInfoShowRule  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * showCreateByPolicy
     * Required:true
     */
    @Required
    private Boolean showCreateByPolicy;

    /**
     * showCreateByTag
     * Required:true
     */
    @Required
    private Boolean showCreateByTag;

    /**
     * showCreateByBusiness
     * Required:true
     */
    @Required
    private Boolean showCreateByBusiness;



    /**
     * get showCreateByPolicy
     *
     * @return
     */
    public Boolean getShowCreateByPolicy() {
        return showCreateByPolicy;
    }

    /**
     * set showCreateByPolicy
     *
     * @param showCreateByPolicy
     */
    public void setShowCreateByPolicy(Boolean showCreateByPolicy) {
        this.showCreateByPolicy = showCreateByPolicy;
    }


    /**
     * get showCreateByTag
     *
     * @return
     */
    public Boolean getShowCreateByTag() {
        return showCreateByTag;
    }

    /**
     * set showCreateByTag
     *
     * @param showCreateByTag
     */
    public void setShowCreateByTag(Boolean showCreateByTag) {
        this.showCreateByTag = showCreateByTag;
    }


    /**
     * get showCreateByBusiness
     *
     * @return
     */
    public Boolean getShowCreateByBusiness() {
        return showCreateByBusiness;
    }

    /**
     * set showCreateByBusiness
     *
     * @param showCreateByBusiness
     */
    public void setShowCreateByBusiness(Boolean showCreateByBusiness) {
        this.showCreateByBusiness = showCreateByBusiness;
    }



    /**
     * set showCreateByPolicy
     *
     * @param showCreateByPolicy
     */
    public ApiInfoShowRule showCreateByPolicy(Boolean showCreateByPolicy) {
        this.showCreateByPolicy = showCreateByPolicy;
        return this;
    }


    /**
     * set showCreateByTag
     *
     * @param showCreateByTag
     */
    public ApiInfoShowRule showCreateByTag(Boolean showCreateByTag) {
        this.showCreateByTag = showCreateByTag;
        return this;
    }


    /**
     * set showCreateByBusiness
     *
     * @param showCreateByBusiness
     */
    public ApiInfoShowRule showCreateByBusiness(Boolean showCreateByBusiness) {
        this.showCreateByBusiness = showCreateByBusiness;
        return this;
    }


}