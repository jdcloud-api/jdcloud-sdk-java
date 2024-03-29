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

import com.jdcloud.sdk.annotation.Required;

/**
 * importIpsetReq
 */
public class ImportIpsetReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * WAF实例id
     * Required:true
     */
    @Required
    private String wafInstanceId;

    /**
     * ip集名称
     * Required:true
     */
    @Required
    private String policyName;

    /**
     * 导入的ip
     * Required:true
     */
    @Required
    private String ips;

    /**
     * 0表示新建，1表示修改更新
     */
    private Integer isUpdate;

    /**
     * 备注
     */
    private String tag;



    /**
     * get WAF实例id
     *
     * @return
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    /**
     * set WAF实例id
     *
     * @param wafInstanceId
     */
    public void setWafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
    }


    /**
     * get ip集名称
     *
     * @return
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * set ip集名称
     *
     * @param policyName
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }


    /**
     * get 导入的ip
     *
     * @return
     */
    public String getIps() {
        return ips;
    }

    /**
     * set 导入的ip
     *
     * @param ips
     */
    public void setIps(String ips) {
        this.ips = ips;
    }


    /**
     * get 0表示新建，1表示修改更新
     *
     * @return
     */
    public Integer getIsUpdate() {
        return isUpdate;
    }

    /**
     * set 0表示新建，1表示修改更新
     *
     * @param isUpdate
     */
    public void setIsUpdate(Integer isUpdate) {
        this.isUpdate = isUpdate;
    }


    /**
     * get 备注
     *
     * @return
     */
    public String getTag() {
        return tag;
    }

    /**
     * set 备注
     *
     * @param tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }



    /**
     * set WAF实例id
     *
     * @param wafInstanceId
     */
    public ImportIpsetReq wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }


    /**
     * set ip集名称
     *
     * @param policyName
     */
    public ImportIpsetReq policyName(String policyName) {
        this.policyName = policyName;
        return this;
    }


    /**
     * set 导入的ip
     *
     * @param ips
     */
    public ImportIpsetReq ips(String ips) {
        this.ips = ips;
        return this;
    }


    /**
     * set 0表示新建，1表示修改更新
     *
     * @param isUpdate
     */
    public ImportIpsetReq isUpdate(Integer isUpdate) {
        this.isUpdate = isUpdate;
        return this;
    }


    /**
     * set 备注
     *
     * @param tag
     */
    public ImportIpsetReq tag(String tag) {
        this.tag = tag;
        return this;
    }


}