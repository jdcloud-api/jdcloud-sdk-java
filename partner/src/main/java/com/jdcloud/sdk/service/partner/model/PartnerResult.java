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
 * applyPartner
 * 合作伙伴管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.partner.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * partnerResult
 */
public class PartnerResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Number id;

    /**
     * 合作伙伴ID
     */
    private String partnerId;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 统一社会信用代码
     */
    private String creditCode;

    /**
     * 法定代表人
     */
    private String legalRepresentative;

    /**
     * 成立时间
     */
    private String establishedDate;

    /**
     * 注册地
     */
    private String registeredOffice;

    /**
     * 注册资本
     */
    private String registeredCapital;

    /**
     * 企业类型
     */
    private String companyType;

    /**
     * 所属行业
     */
    private String industry;

    /**
     * 营业期限
     */
    private String businessTerm;

    /**
     * 经营状态
     */
    private String managementForms;

    /**
     * 人员规模（1 0-50人 2 50-100人 3 100人以上）
     */
    private Integer companyScale;

    /**
     * 人员规模（1 0-50人 2 50-100人 3 100人以上）
     */
    private String companyScaleName;

    /**
     * 营业执照
     */
    private String businessLicensePic;

    /**
     * 法人身份证
     */
    private String identityCardPic;

    /**
     * 核心产品及业务
     */
    private String businessProduct;

    /**
     * 市场份额
     */
    private String marketShare;

    /**
     * 市场份额名称
     */
    private String marketShareName;

    /**
     * 官网网址
     */
    private String website;

    /**
     * 投资背景
     */
    private String investmentBackground;

    /**
     * 年营业额(万)
     */
    private String annualSalesVolume;

    /**
     * 信用风险
     */
    private String creditRisk;

    /**
     * 伙伴当前云服务厂商
     */
    private String serviceProvider;

    /**
     * 合作伙伴用户pin
     */
    private String pin;

    /**
     * 年云消耗规模（万）
     */
    private String consumptionScale;

    /**
     * 业务是否迁移至京东智联云
     */
    private Integer jdcloudFlag;

    /**
     * 业务是否迁移至京东智联云名称
     */
    private String jdcloudFlagName;

    /**
     * 伙伴标签
     */
    private String partnerTag;

    /**
     * 伙伴标签名称
     */
    private String partnerTagName;

    /**
     * 合作伙伴级别
     */
    private Integer partnerLevel;

    /**
     * 合作伙伴级别名称
     */
    private String partnerLevelName;

    /**
     * 伙伴来源
     */
    private Integer source;

    /**
     * 伙伴来源名称
     */
    private String sourceName;

    /**
     * 行业领域
     */
    private String industryField;

    /**
     * 行业领域名称
     */
    private String industryFieldName;

    /**
     * 活动ID
     */
    private Number activityId;

    /**
     * 线索ID
     */
    private Number applyId;

    /**
     * 联系人
     */
    private String contactor;

    /**
     * 联系电话
     */
    private String tel;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 职位
     */
    private String position;

    /**
     * 微信号
     */
    private String wechatNo;

    /**
     * 跟进人
     */
    private String followPerson;

    /**
     * 跟进备注
     */
    private String followRemark;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 状态备注
     */
    private String statusName;

    /**
     * 已合作数量
     */
    private Integer cooperatingCnt;

    /**
     * 审核中数量
     */
    private Integer cooperationCheckingCnt;

    /**
     * 合作产品数量
     */
    private Integer cooperationProductCnt;

    /**
     * 京东云负责人
     */
    private String erp;

    /**
     * 跟进记录列表
     */
    
    private List<FollowRecordDTO> followRecordList;
    /**
     * 状态变更列表
     */
    
    private List<PartnerStatus> partnerStatusList;
    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 是否删除0未删除,1已删除
     */
    private Integer yn;



    /**
     * get id
     *
     * @return
     */
    public Number getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Number id) {
        this.id = id;
    }


    /**
     * get 合作伙伴ID
     *
     * @return
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * set 合作伙伴ID
     *
     * @param partnerId
     */
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }


    /**
     * get 公司名称
     *
     * @return
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * set 公司名称
     *
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    /**
     * get 统一社会信用代码
     *
     * @return
     */
    public String getCreditCode() {
        return creditCode;
    }

    /**
     * set 统一社会信用代码
     *
     * @param creditCode
     */
    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }


    /**
     * get 法定代表人
     *
     * @return
     */
    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    /**
     * set 法定代表人
     *
     * @param legalRepresentative
     */
    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }


    /**
     * get 成立时间
     *
     * @return
     */
    public String getEstablishedDate() {
        return establishedDate;
    }

    /**
     * set 成立时间
     *
     * @param establishedDate
     */
    public void setEstablishedDate(String establishedDate) {
        this.establishedDate = establishedDate;
    }


    /**
     * get 注册地
     *
     * @return
     */
    public String getRegisteredOffice() {
        return registeredOffice;
    }

    /**
     * set 注册地
     *
     * @param registeredOffice
     */
    public void setRegisteredOffice(String registeredOffice) {
        this.registeredOffice = registeredOffice;
    }


    /**
     * get 注册资本
     *
     * @return
     */
    public String getRegisteredCapital() {
        return registeredCapital;
    }

    /**
     * set 注册资本
     *
     * @param registeredCapital
     */
    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }


    /**
     * get 企业类型
     *
     * @return
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * set 企业类型
     *
     * @param companyType
     */
    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }


    /**
     * get 所属行业
     *
     * @return
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * set 所属行业
     *
     * @param industry
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }


    /**
     * get 营业期限
     *
     * @return
     */
    public String getBusinessTerm() {
        return businessTerm;
    }

    /**
     * set 营业期限
     *
     * @param businessTerm
     */
    public void setBusinessTerm(String businessTerm) {
        this.businessTerm = businessTerm;
    }


    /**
     * get 经营状态
     *
     * @return
     */
    public String getManagementForms() {
        return managementForms;
    }

    /**
     * set 经营状态
     *
     * @param managementForms
     */
    public void setManagementForms(String managementForms) {
        this.managementForms = managementForms;
    }


    /**
     * get 人员规模（1 0-50人 2 50-100人 3 100人以上）
     *
     * @return
     */
    public Integer getCompanyScale() {
        return companyScale;
    }

    /**
     * set 人员规模（1 0-50人 2 50-100人 3 100人以上）
     *
     * @param companyScale
     */
    public void setCompanyScale(Integer companyScale) {
        this.companyScale = companyScale;
    }


    /**
     * get 人员规模（1 0-50人 2 50-100人 3 100人以上）
     *
     * @return
     */
    public String getCompanyScaleName() {
        return companyScaleName;
    }

    /**
     * set 人员规模（1 0-50人 2 50-100人 3 100人以上）
     *
     * @param companyScaleName
     */
    public void setCompanyScaleName(String companyScaleName) {
        this.companyScaleName = companyScaleName;
    }


    /**
     * get 营业执照
     *
     * @return
     */
    public String getBusinessLicensePic() {
        return businessLicensePic;
    }

    /**
     * set 营业执照
     *
     * @param businessLicensePic
     */
    public void setBusinessLicensePic(String businessLicensePic) {
        this.businessLicensePic = businessLicensePic;
    }


    /**
     * get 法人身份证
     *
     * @return
     */
    public String getIdentityCardPic() {
        return identityCardPic;
    }

    /**
     * set 法人身份证
     *
     * @param identityCardPic
     */
    public void setIdentityCardPic(String identityCardPic) {
        this.identityCardPic = identityCardPic;
    }


    /**
     * get 核心产品及业务
     *
     * @return
     */
    public String getBusinessProduct() {
        return businessProduct;
    }

    /**
     * set 核心产品及业务
     *
     * @param businessProduct
     */
    public void setBusinessProduct(String businessProduct) {
        this.businessProduct = businessProduct;
    }


    /**
     * get 市场份额
     *
     * @return
     */
    public String getMarketShare() {
        return marketShare;
    }

    /**
     * set 市场份额
     *
     * @param marketShare
     */
    public void setMarketShare(String marketShare) {
        this.marketShare = marketShare;
    }


    /**
     * get 市场份额名称
     *
     * @return
     */
    public String getMarketShareName() {
        return marketShareName;
    }

    /**
     * set 市场份额名称
     *
     * @param marketShareName
     */
    public void setMarketShareName(String marketShareName) {
        this.marketShareName = marketShareName;
    }


    /**
     * get 官网网址
     *
     * @return
     */
    public String getWebsite() {
        return website;
    }

    /**
     * set 官网网址
     *
     * @param website
     */
    public void setWebsite(String website) {
        this.website = website;
    }


    /**
     * get 投资背景
     *
     * @return
     */
    public String getInvestmentBackground() {
        return investmentBackground;
    }

    /**
     * set 投资背景
     *
     * @param investmentBackground
     */
    public void setInvestmentBackground(String investmentBackground) {
        this.investmentBackground = investmentBackground;
    }


    /**
     * get 年营业额(万)
     *
     * @return
     */
    public String getAnnualSalesVolume() {
        return annualSalesVolume;
    }

    /**
     * set 年营业额(万)
     *
     * @param annualSalesVolume
     */
    public void setAnnualSalesVolume(String annualSalesVolume) {
        this.annualSalesVolume = annualSalesVolume;
    }


    /**
     * get 信用风险
     *
     * @return
     */
    public String getCreditRisk() {
        return creditRisk;
    }

    /**
     * set 信用风险
     *
     * @param creditRisk
     */
    public void setCreditRisk(String creditRisk) {
        this.creditRisk = creditRisk;
    }


    /**
     * get 伙伴当前云服务厂商
     *
     * @return
     */
    public String getServiceProvider() {
        return serviceProvider;
    }

    /**
     * set 伙伴当前云服务厂商
     *
     * @param serviceProvider
     */
    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }


    /**
     * get 合作伙伴用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 合作伙伴用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 年云消耗规模（万）
     *
     * @return
     */
    public String getConsumptionScale() {
        return consumptionScale;
    }

    /**
     * set 年云消耗规模（万）
     *
     * @param consumptionScale
     */
    public void setConsumptionScale(String consumptionScale) {
        this.consumptionScale = consumptionScale;
    }


    /**
     * get 业务是否迁移至京东智联云
     *
     * @return
     */
    public Integer getJdcloudFlag() {
        return jdcloudFlag;
    }

    /**
     * set 业务是否迁移至京东智联云
     *
     * @param jdcloudFlag
     */
    public void setJdcloudFlag(Integer jdcloudFlag) {
        this.jdcloudFlag = jdcloudFlag;
    }


    /**
     * get 业务是否迁移至京东智联云名称
     *
     * @return
     */
    public String getJdcloudFlagName() {
        return jdcloudFlagName;
    }

    /**
     * set 业务是否迁移至京东智联云名称
     *
     * @param jdcloudFlagName
     */
    public void setJdcloudFlagName(String jdcloudFlagName) {
        this.jdcloudFlagName = jdcloudFlagName;
    }


    /**
     * get 伙伴标签
     *
     * @return
     */
    public String getPartnerTag() {
        return partnerTag;
    }

    /**
     * set 伙伴标签
     *
     * @param partnerTag
     */
    public void setPartnerTag(String partnerTag) {
        this.partnerTag = partnerTag;
    }


    /**
     * get 伙伴标签名称
     *
     * @return
     */
    public String getPartnerTagName() {
        return partnerTagName;
    }

    /**
     * set 伙伴标签名称
     *
     * @param partnerTagName
     */
    public void setPartnerTagName(String partnerTagName) {
        this.partnerTagName = partnerTagName;
    }


    /**
     * get 合作伙伴级别
     *
     * @return
     */
    public Integer getPartnerLevel() {
        return partnerLevel;
    }

    /**
     * set 合作伙伴级别
     *
     * @param partnerLevel
     */
    public void setPartnerLevel(Integer partnerLevel) {
        this.partnerLevel = partnerLevel;
    }


    /**
     * get 合作伙伴级别名称
     *
     * @return
     */
    public String getPartnerLevelName() {
        return partnerLevelName;
    }

    /**
     * set 合作伙伴级别名称
     *
     * @param partnerLevelName
     */
    public void setPartnerLevelName(String partnerLevelName) {
        this.partnerLevelName = partnerLevelName;
    }


    /**
     * get 伙伴来源
     *
     * @return
     */
    public Integer getSource() {
        return source;
    }

    /**
     * set 伙伴来源
     *
     * @param source
     */
    public void setSource(Integer source) {
        this.source = source;
    }


    /**
     * get 伙伴来源名称
     *
     * @return
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * set 伙伴来源名称
     *
     * @param sourceName
     */
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }


    /**
     * get 行业领域
     *
     * @return
     */
    public String getIndustryField() {
        return industryField;
    }

    /**
     * set 行业领域
     *
     * @param industryField
     */
    public void setIndustryField(String industryField) {
        this.industryField = industryField;
    }


    /**
     * get 行业领域名称
     *
     * @return
     */
    public String getIndustryFieldName() {
        return industryFieldName;
    }

    /**
     * set 行业领域名称
     *
     * @param industryFieldName
     */
    public void setIndustryFieldName(String industryFieldName) {
        this.industryFieldName = industryFieldName;
    }


    /**
     * get 活动ID
     *
     * @return
     */
    public Number getActivityId() {
        return activityId;
    }

    /**
     * set 活动ID
     *
     * @param activityId
     */
    public void setActivityId(Number activityId) {
        this.activityId = activityId;
    }


    /**
     * get 线索ID
     *
     * @return
     */
    public Number getApplyId() {
        return applyId;
    }

    /**
     * set 线索ID
     *
     * @param applyId
     */
    public void setApplyId(Number applyId) {
        this.applyId = applyId;
    }


    /**
     * get 联系人
     *
     * @return
     */
    public String getContactor() {
        return contactor;
    }

    /**
     * set 联系人
     *
     * @param contactor
     */
    public void setContactor(String contactor) {
        this.contactor = contactor;
    }


    /**
     * get 联系电话
     *
     * @return
     */
    public String getTel() {
        return tel;
    }

    /**
     * set 联系电话
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
     * get 职位
     *
     * @return
     */
    public String getPosition() {
        return position;
    }

    /**
     * set 职位
     *
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }


    /**
     * get 微信号
     *
     * @return
     */
    public String getWechatNo() {
        return wechatNo;
    }

    /**
     * set 微信号
     *
     * @param wechatNo
     */
    public void setWechatNo(String wechatNo) {
        this.wechatNo = wechatNo;
    }


    /**
     * get 跟进人
     *
     * @return
     */
    public String getFollowPerson() {
        return followPerson;
    }

    /**
     * set 跟进人
     *
     * @param followPerson
     */
    public void setFollowPerson(String followPerson) {
        this.followPerson = followPerson;
    }


    /**
     * get 跟进备注
     *
     * @return
     */
    public String getFollowRemark() {
        return followRemark;
    }

    /**
     * set 跟进备注
     *
     * @param followRemark
     */
    public void setFollowRemark(String followRemark) {
        this.followRemark = followRemark;
    }


    /**
     * get 状态
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 状态
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }


    /**
     * get 状态备注
     *
     * @return
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * set 状态备注
     *
     * @param statusName
     */
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }


    /**
     * get 已合作数量
     *
     * @return
     */
    public Integer getCooperatingCnt() {
        return cooperatingCnt;
    }

    /**
     * set 已合作数量
     *
     * @param cooperatingCnt
     */
    public void setCooperatingCnt(Integer cooperatingCnt) {
        this.cooperatingCnt = cooperatingCnt;
    }


    /**
     * get 审核中数量
     *
     * @return
     */
    public Integer getCooperationCheckingCnt() {
        return cooperationCheckingCnt;
    }

    /**
     * set 审核中数量
     *
     * @param cooperationCheckingCnt
     */
    public void setCooperationCheckingCnt(Integer cooperationCheckingCnt) {
        this.cooperationCheckingCnt = cooperationCheckingCnt;
    }


    /**
     * get 合作产品数量
     *
     * @return
     */
    public Integer getCooperationProductCnt() {
        return cooperationProductCnt;
    }

    /**
     * set 合作产品数量
     *
     * @param cooperationProductCnt
     */
    public void setCooperationProductCnt(Integer cooperationProductCnt) {
        this.cooperationProductCnt = cooperationProductCnt;
    }


    /**
     * get 京东云负责人
     *
     * @return
     */
    public String getErp() {
        return erp;
    }

    /**
     * set 京东云负责人
     *
     * @param erp
     */
    public void setErp(String erp) {
        this.erp = erp;
    }


    /**
    * get 跟进记录列表
    *
    * @return
    */
    public List<FollowRecordDTO> getFollowRecordList() {
        return followRecordList;
    }

    /**
    * set 跟进记录列表
    *
    * @param followRecordList
    */
    public void setFollowRecordList(List<FollowRecordDTO> followRecordList) {
        this.followRecordList = followRecordList;
    }


    /**
    * get 状态变更列表
    *
    * @return
    */
    public List<PartnerStatus> getPartnerStatusList() {
        return partnerStatusList;
    }

    /**
    * set 状态变更列表
    *
    * @param partnerStatusList
    */
    public void setPartnerStatusList(List<PartnerStatus> partnerStatusList) {
        this.partnerStatusList = partnerStatusList;
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
     * get 创建人
     *
     * @return
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * set 创建人
     *
     * @param createUser
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
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
     * get 修改人
     *
     * @return
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * set 修改人
     *
     * @param updateUser
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }


    /**
     * get 是否删除0未删除,1已删除
     *
     * @return
     */
    public Integer getYn() {
        return yn;
    }

    /**
     * set 是否删除0未删除,1已删除
     *
     * @param yn
     */
    public void setYn(Integer yn) {
        this.yn = yn;
    }



    /**
     * set id
     *
     * @param id
     */
    public PartnerResult id(Number id) {
        this.id = id;
        return this;
    }


    /**
     * set 合作伙伴ID
     *
     * @param partnerId
     */
    public PartnerResult partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }


    /**
     * set 公司名称
     *
     * @param companyName
     */
    public PartnerResult companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }


    /**
     * set 统一社会信用代码
     *
     * @param creditCode
     */
    public PartnerResult creditCode(String creditCode) {
        this.creditCode = creditCode;
        return this;
    }


    /**
     * set 法定代表人
     *
     * @param legalRepresentative
     */
    public PartnerResult legalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
        return this;
    }


    /**
     * set 成立时间
     *
     * @param establishedDate
     */
    public PartnerResult establishedDate(String establishedDate) {
        this.establishedDate = establishedDate;
        return this;
    }


    /**
     * set 注册地
     *
     * @param registeredOffice
     */
    public PartnerResult registeredOffice(String registeredOffice) {
        this.registeredOffice = registeredOffice;
        return this;
    }


    /**
     * set 注册资本
     *
     * @param registeredCapital
     */
    public PartnerResult registeredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
        return this;
    }


    /**
     * set 企业类型
     *
     * @param companyType
     */
    public PartnerResult companyType(String companyType) {
        this.companyType = companyType;
        return this;
    }


    /**
     * set 所属行业
     *
     * @param industry
     */
    public PartnerResult industry(String industry) {
        this.industry = industry;
        return this;
    }


    /**
     * set 营业期限
     *
     * @param businessTerm
     */
    public PartnerResult businessTerm(String businessTerm) {
        this.businessTerm = businessTerm;
        return this;
    }


    /**
     * set 经营状态
     *
     * @param managementForms
     */
    public PartnerResult managementForms(String managementForms) {
        this.managementForms = managementForms;
        return this;
    }


    /**
     * set 人员规模（1 0-50人 2 50-100人 3 100人以上）
     *
     * @param companyScale
     */
    public PartnerResult companyScale(Integer companyScale) {
        this.companyScale = companyScale;
        return this;
    }


    /**
     * set 人员规模（1 0-50人 2 50-100人 3 100人以上）
     *
     * @param companyScaleName
     */
    public PartnerResult companyScaleName(String companyScaleName) {
        this.companyScaleName = companyScaleName;
        return this;
    }


    /**
     * set 营业执照
     *
     * @param businessLicensePic
     */
    public PartnerResult businessLicensePic(String businessLicensePic) {
        this.businessLicensePic = businessLicensePic;
        return this;
    }


    /**
     * set 法人身份证
     *
     * @param identityCardPic
     */
    public PartnerResult identityCardPic(String identityCardPic) {
        this.identityCardPic = identityCardPic;
        return this;
    }


    /**
     * set 核心产品及业务
     *
     * @param businessProduct
     */
    public PartnerResult businessProduct(String businessProduct) {
        this.businessProduct = businessProduct;
        return this;
    }


    /**
     * set 市场份额
     *
     * @param marketShare
     */
    public PartnerResult marketShare(String marketShare) {
        this.marketShare = marketShare;
        return this;
    }


    /**
     * set 市场份额名称
     *
     * @param marketShareName
     */
    public PartnerResult marketShareName(String marketShareName) {
        this.marketShareName = marketShareName;
        return this;
    }


    /**
     * set 官网网址
     *
     * @param website
     */
    public PartnerResult website(String website) {
        this.website = website;
        return this;
    }


    /**
     * set 投资背景
     *
     * @param investmentBackground
     */
    public PartnerResult investmentBackground(String investmentBackground) {
        this.investmentBackground = investmentBackground;
        return this;
    }


    /**
     * set 年营业额(万)
     *
     * @param annualSalesVolume
     */
    public PartnerResult annualSalesVolume(String annualSalesVolume) {
        this.annualSalesVolume = annualSalesVolume;
        return this;
    }


    /**
     * set 信用风险
     *
     * @param creditRisk
     */
    public PartnerResult creditRisk(String creditRisk) {
        this.creditRisk = creditRisk;
        return this;
    }


    /**
     * set 伙伴当前云服务厂商
     *
     * @param serviceProvider
     */
    public PartnerResult serviceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
        return this;
    }


    /**
     * set 合作伙伴用户pin
     *
     * @param pin
     */
    public PartnerResult pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 年云消耗规模（万）
     *
     * @param consumptionScale
     */
    public PartnerResult consumptionScale(String consumptionScale) {
        this.consumptionScale = consumptionScale;
        return this;
    }


    /**
     * set 业务是否迁移至京东智联云
     *
     * @param jdcloudFlag
     */
    public PartnerResult jdcloudFlag(Integer jdcloudFlag) {
        this.jdcloudFlag = jdcloudFlag;
        return this;
    }


    /**
     * set 业务是否迁移至京东智联云名称
     *
     * @param jdcloudFlagName
     */
    public PartnerResult jdcloudFlagName(String jdcloudFlagName) {
        this.jdcloudFlagName = jdcloudFlagName;
        return this;
    }


    /**
     * set 伙伴标签
     *
     * @param partnerTag
     */
    public PartnerResult partnerTag(String partnerTag) {
        this.partnerTag = partnerTag;
        return this;
    }


    /**
     * set 伙伴标签名称
     *
     * @param partnerTagName
     */
    public PartnerResult partnerTagName(String partnerTagName) {
        this.partnerTagName = partnerTagName;
        return this;
    }


    /**
     * set 合作伙伴级别
     *
     * @param partnerLevel
     */
    public PartnerResult partnerLevel(Integer partnerLevel) {
        this.partnerLevel = partnerLevel;
        return this;
    }


    /**
     * set 合作伙伴级别名称
     *
     * @param partnerLevelName
     */
    public PartnerResult partnerLevelName(String partnerLevelName) {
        this.partnerLevelName = partnerLevelName;
        return this;
    }


    /**
     * set 伙伴来源
     *
     * @param source
     */
    public PartnerResult source(Integer source) {
        this.source = source;
        return this;
    }


    /**
     * set 伙伴来源名称
     *
     * @param sourceName
     */
    public PartnerResult sourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }


    /**
     * set 行业领域
     *
     * @param industryField
     */
    public PartnerResult industryField(String industryField) {
        this.industryField = industryField;
        return this;
    }


    /**
     * set 行业领域名称
     *
     * @param industryFieldName
     */
    public PartnerResult industryFieldName(String industryFieldName) {
        this.industryFieldName = industryFieldName;
        return this;
    }


    /**
     * set 活动ID
     *
     * @param activityId
     */
    public PartnerResult activityId(Number activityId) {
        this.activityId = activityId;
        return this;
    }


    /**
     * set 线索ID
     *
     * @param applyId
     */
    public PartnerResult applyId(Number applyId) {
        this.applyId = applyId;
        return this;
    }


    /**
     * set 联系人
     *
     * @param contactor
     */
    public PartnerResult contactor(String contactor) {
        this.contactor = contactor;
        return this;
    }


    /**
     * set 联系电话
     *
     * @param tel
     */
    public PartnerResult tel(String tel) {
        this.tel = tel;
        return this;
    }


    /**
     * set 邮箱
     *
     * @param email
     */
    public PartnerResult email(String email) {
        this.email = email;
        return this;
    }


    /**
     * set 职位
     *
     * @param position
     */
    public PartnerResult position(String position) {
        this.position = position;
        return this;
    }


    /**
     * set 微信号
     *
     * @param wechatNo
     */
    public PartnerResult wechatNo(String wechatNo) {
        this.wechatNo = wechatNo;
        return this;
    }


    /**
     * set 跟进人
     *
     * @param followPerson
     */
    public PartnerResult followPerson(String followPerson) {
        this.followPerson = followPerson;
        return this;
    }


    /**
     * set 跟进备注
     *
     * @param followRemark
     */
    public PartnerResult followRemark(String followRemark) {
        this.followRemark = followRemark;
        return this;
    }


    /**
     * set 状态
     *
     * @param status
     */
    public PartnerResult status(Integer status) {
        this.status = status;
        return this;
    }


    /**
     * set 状态备注
     *
     * @param statusName
     */
    public PartnerResult statusName(String statusName) {
        this.statusName = statusName;
        return this;
    }


    /**
     * set 已合作数量
     *
     * @param cooperatingCnt
     */
    public PartnerResult cooperatingCnt(Integer cooperatingCnt) {
        this.cooperatingCnt = cooperatingCnt;
        return this;
    }


    /**
     * set 审核中数量
     *
     * @param cooperationCheckingCnt
     */
    public PartnerResult cooperationCheckingCnt(Integer cooperationCheckingCnt) {
        this.cooperationCheckingCnt = cooperationCheckingCnt;
        return this;
    }


    /**
     * set 合作产品数量
     *
     * @param cooperationProductCnt
     */
    public PartnerResult cooperationProductCnt(Integer cooperationProductCnt) {
        this.cooperationProductCnt = cooperationProductCnt;
        return this;
    }


    /**
     * set 京东云负责人
     *
     * @param erp
     */
    public PartnerResult erp(String erp) {
        this.erp = erp;
        return this;
    }


    /**
    * set 跟进记录列表
    *
    * @param followRecordList
    */
    public PartnerResult followRecordList(List<FollowRecordDTO> followRecordList) {
        this.followRecordList = followRecordList;
        return this;
    }


    /**
    * set 状态变更列表
    *
    * @param partnerStatusList
    */
    public PartnerResult partnerStatusList(List<PartnerStatus> partnerStatusList) {
        this.partnerStatusList = partnerStatusList;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public PartnerResult createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 创建人
     *
     * @param createUser
     */
    public PartnerResult createUser(String createUser) {
        this.createUser = createUser;
        return this;
    }


    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public PartnerResult updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set 修改人
     *
     * @param updateUser
     */
    public PartnerResult updateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }


    /**
     * set 是否删除0未删除,1已删除
     *
     * @param yn
     */
    public PartnerResult yn(Integer yn) {
        this.yn = yn;
        return this;
    }



    /**
     * add item to 跟进记录列表
     *
     * @param followRecordList
     */
    public void addFollowRecordList(FollowRecordDTO followRecordList) {
        if (this.followRecordList == null) {
            this.followRecordList = new ArrayList<>();
        }
        this.followRecordList.add(followRecordList);
    }

    /**
     * add item to 状态变更列表
     *
     * @param partnerStatusList
     */
    public void addPartnerStatusList(PartnerStatus partnerStatusList) {
        if (this.partnerStatusList == null) {
            this.partnerStatusList = new ArrayList<>();
        }
        this.partnerStatusList.add(partnerStatusList);
    }
}