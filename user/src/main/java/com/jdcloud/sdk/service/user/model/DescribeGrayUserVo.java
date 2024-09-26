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
 * describeGrayUserVo
 */
public class DescribeGrayUserVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 应用场景
     */
    private String applicationDesc;

    /**
     * 业务介绍
     */
    private String businessDesc;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 联系人
     */
    private Integer contactPerson;

    /**
     * 邮箱
     */
    private Integer email;

    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 待审核0，通过1，拒绝2
     */
    private String flag;

    /**
     * 旧产品线名称
     */
    private String oldProdName;

    /**
     * 操作人erp
     */
    private String operator;

    /**
     * pin
     */
    private Integer pin;

    /**
     * prodId
     */
    private Integer prodId;

    /**
     * serviceCode
     */
    private Integer serviceCode;

    /**
     * 来源
     */
    private Integer source;

    /**
     * 用户状态0灰度,1线上
     */
    private Integer status;

    /**
     * 手机号
     */
    private Integer telephone;



    /**
     * get id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * get 应用场景
     *
     * @return
     */
    public String getApplicationDesc() {
        return applicationDesc;
    }

    /**
     * set 应用场景
     *
     * @param applicationDesc
     */
    public void setApplicationDesc(String applicationDesc) {
        this.applicationDesc = applicationDesc;
    }


    /**
     * get 业务介绍
     *
     * @return
     */
    public String getBusinessDesc() {
        return businessDesc;
    }

    /**
     * set 业务介绍
     *
     * @param businessDesc
     */
    public void setBusinessDesc(String businessDesc) {
        this.businessDesc = businessDesc;
    }


    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 联系人
     *
     * @return
     */
    public Integer getContactPerson() {
        return contactPerson;
    }

    /**
     * set 联系人
     *
     * @param contactPerson
     */
    public void setContactPerson(Integer contactPerson) {
        this.contactPerson = contactPerson;
    }


    /**
     * get 邮箱
     *
     * @return
     */
    public Integer getEmail() {
        return email;
    }

    /**
     * set 邮箱
     *
     * @param email
     */
    public void setEmail(Integer email) {
        this.email = email;
    }


    /**
     * get 修改时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * get 待审核0，通过1，拒绝2
     *
     * @return
     */
    public String getFlag() {
        return flag;
    }

    /**
     * set 待审核0，通过1，拒绝2
     *
     * @param flag
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }


    /**
     * get 旧产品线名称
     *
     * @return
     */
    public String getOldProdName() {
        return oldProdName;
    }

    /**
     * set 旧产品线名称
     *
     * @param oldProdName
     */
    public void setOldProdName(String oldProdName) {
        this.oldProdName = oldProdName;
    }


    /**
     * get 操作人erp
     *
     * @return
     */
    public String getOperator() {
        return operator;
    }

    /**
     * set 操作人erp
     *
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }


    /**
     * get pin
     *
     * @return
     */
    public Integer getPin() {
        return pin;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public void setPin(Integer pin) {
        this.pin = pin;
    }


    /**
     * get prodId
     *
     * @return
     */
    public Integer getProdId() {
        return prodId;
    }

    /**
     * set prodId
     *
     * @param prodId
     */
    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }


    /**
     * get serviceCode
     *
     * @return
     */
    public Integer getServiceCode() {
        return serviceCode;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public void setServiceCode(Integer serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * get 来源
     *
     * @return
     */
    public Integer getSource() {
        return source;
    }

    /**
     * set 来源
     *
     * @param source
     */
    public void setSource(Integer source) {
        this.source = source;
    }


    /**
     * get 用户状态0灰度,1线上
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 用户状态0灰度,1线上
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }


    /**
     * get 手机号
     *
     * @return
     */
    public Integer getTelephone() {
        return telephone;
    }

    /**
     * set 手机号
     *
     * @param telephone
     */
    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }



    /**
     * set id
     *
     * @param id
     */
    public DescribeGrayUserVo id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set 应用场景
     *
     * @param applicationDesc
     */
    public DescribeGrayUserVo applicationDesc(String applicationDesc) {
        this.applicationDesc = applicationDesc;
        return this;
    }


    /**
     * set 业务介绍
     *
     * @param businessDesc
     */
    public DescribeGrayUserVo businessDesc(String businessDesc) {
        this.businessDesc = businessDesc;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public DescribeGrayUserVo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 联系人
     *
     * @param contactPerson
     */
    public DescribeGrayUserVo contactPerson(Integer contactPerson) {
        this.contactPerson = contactPerson;
        return this;
    }


    /**
     * set 邮箱
     *
     * @param email
     */
    public DescribeGrayUserVo email(Integer email) {
        this.email = email;
        return this;
    }


    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public DescribeGrayUserVo updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set 待审核0，通过1，拒绝2
     *
     * @param flag
     */
    public DescribeGrayUserVo flag(String flag) {
        this.flag = flag;
        return this;
    }


    /**
     * set 旧产品线名称
     *
     * @param oldProdName
     */
    public DescribeGrayUserVo oldProdName(String oldProdName) {
        this.oldProdName = oldProdName;
        return this;
    }


    /**
     * set 操作人erp
     *
     * @param operator
     */
    public DescribeGrayUserVo operator(String operator) {
        this.operator = operator;
        return this;
    }


    /**
     * set pin
     *
     * @param pin
     */
    public DescribeGrayUserVo pin(Integer pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set prodId
     *
     * @param prodId
     */
    public DescribeGrayUserVo prodId(Integer prodId) {
        this.prodId = prodId;
        return this;
    }


    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public DescribeGrayUserVo serviceCode(Integer serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 来源
     *
     * @param source
     */
    public DescribeGrayUserVo source(Integer source) {
        this.source = source;
        return this;
    }


    /**
     * set 用户状态0灰度,1线上
     *
     * @param status
     */
    public DescribeGrayUserVo status(Integer status) {
        this.status = status;
        return this;
    }


    /**
     * set 手机号
     *
     * @param telephone
     */
    public DescribeGrayUserVo telephone(Integer telephone) {
        this.telephone = telephone;
        return this;
    }


}