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

package com.jdcloud.sdk.service.cloudsign.model;


/**
 * agentInfo
 */
public class AgentInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 授权信息ID
     */
    private String id;

    /**
     * 授权企业
     */
    private String companyName;

    /**
     * 被授权人
     */
    private String agentName;

    /**
     * 被授权人手机号
     */
    private String agentPhone;

    /**
     * 被授权人身份证号
     */
    private String agentIdCardNum;

    /**
     * 授权书名称
     */
    private String agentFileName;

    /**
     * 授权时间
     */
    private String createTime;

    /**
     * 备注
     */
    private String note;



    /**
     * get 授权信息ID
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 授权信息ID
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * get 授权企业
     *
     * @return
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * set 授权企业
     *
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    /**
     * get 被授权人
     *
     * @return
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * set 被授权人
     *
     * @param agentName
     */
    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }


    /**
     * get 被授权人手机号
     *
     * @return
     */
    public String getAgentPhone() {
        return agentPhone;
    }

    /**
     * set 被授权人手机号
     *
     * @param agentPhone
     */
    public void setAgentPhone(String agentPhone) {
        this.agentPhone = agentPhone;
    }


    /**
     * get 被授权人身份证号
     *
     * @return
     */
    public String getAgentIdCardNum() {
        return agentIdCardNum;
    }

    /**
     * set 被授权人身份证号
     *
     * @param agentIdCardNum
     */
    public void setAgentIdCardNum(String agentIdCardNum) {
        this.agentIdCardNum = agentIdCardNum;
    }


    /**
     * get 授权书名称
     *
     * @return
     */
    public String getAgentFileName() {
        return agentFileName;
    }

    /**
     * set 授权书名称
     *
     * @param agentFileName
     */
    public void setAgentFileName(String agentFileName) {
        this.agentFileName = agentFileName;
    }


    /**
     * get 授权时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 授权时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 备注
     *
     * @return
     */
    public String getNote() {
        return note;
    }

    /**
     * set 备注
     *
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }



    /**
     * set 授权信息ID
     *
     * @param id
     */
    public AgentInfo id(String id) {
        this.id = id;
        return this;
    }


    /**
     * set 授权企业
     *
     * @param companyName
     */
    public AgentInfo companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }


    /**
     * set 被授权人
     *
     * @param agentName
     */
    public AgentInfo agentName(String agentName) {
        this.agentName = agentName;
        return this;
    }


    /**
     * set 被授权人手机号
     *
     * @param agentPhone
     */
    public AgentInfo agentPhone(String agentPhone) {
        this.agentPhone = agentPhone;
        return this;
    }


    /**
     * set 被授权人身份证号
     *
     * @param agentIdCardNum
     */
    public AgentInfo agentIdCardNum(String agentIdCardNum) {
        this.agentIdCardNum = agentIdCardNum;
        return this;
    }


    /**
     * set 授权书名称
     *
     * @param agentFileName
     */
    public AgentInfo agentFileName(String agentFileName) {
        this.agentFileName = agentFileName;
        return this;
    }


    /**
     * set 授权时间
     *
     * @param createTime
     */
    public AgentInfo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 备注
     *
     * @param note
     */
    public AgentInfo note(String note) {
        this.note = note;
        return this;
    }


}