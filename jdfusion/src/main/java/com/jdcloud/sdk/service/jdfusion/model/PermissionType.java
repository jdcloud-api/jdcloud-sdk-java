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

package com.jdcloud.sdk.service.jdfusion.model;


/**
 * 安全组规则类型
 */
public class PermissionType  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云注册信息ID
     */
    private String cloudID;

    /**
     * IP协议
     */
    private String ipProtocol;

    /**
     * 端口范围
     */
    private String portRange;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 源IP地址段，用于入方向授权
     */
    private String sourceCidrIp;

    /**
     * 源安全组，用于入方向授权
     */
    private String sourceGroupId;

    /**
     * 源安全组所属阿里云账户Id
     */
    private String sourceGroupOwnerAccount;

    /**
     * 目标IP地址段，用于出方向授权
     */
    private String destCidrIp;

    /**
     * 目标安全组，用于出方向授权
     */
    private String destGroupId;

    /**
     * 目标安全组所属阿里云账户Id
     */
    private String destGroupOwnerAccount;

    /**
     * 授权策略
     */
    private String policy;

    /**
     * 网络类型
     */
    private String nicType;

    /**
     * 规则优先级
     */
    private String priority;

    /**
     * 授权方向
     */
    private String direction;


    /**
     * get 云注册信息ID
     *
     * @return
     */
    public String getCloudID() {
        return cloudID;
    }

    /**
     * set 云注册信息ID
     *
     * @param cloudID
     */
    public void setCloudID(String cloudID) {
        this.cloudID = cloudID;
    }

    /**
     * get IP协议
     *
     * @return
     */
    public String getIpProtocol() {
        return ipProtocol;
    }

    /**
     * set IP协议
     *
     * @param ipProtocol
     */
    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    /**
     * get 端口范围
     *
     * @return
     */
    public String getPortRange() {
        return portRange;
    }

    /**
     * set 端口范围
     *
     * @param portRange
     */
    public void setPortRange(String portRange) {
        this.portRange = portRange;
    }

    /**
     * get 描述信息
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述信息
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 源IP地址段，用于入方向授权
     *
     * @return
     */
    public String getSourceCidrIp() {
        return sourceCidrIp;
    }

    /**
     * set 源IP地址段，用于入方向授权
     *
     * @param sourceCidrIp
     */
    public void setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
    }

    /**
     * get 源安全组，用于入方向授权
     *
     * @return
     */
    public String getSourceGroupId() {
        return sourceGroupId;
    }

    /**
     * set 源安全组，用于入方向授权
     *
     * @param sourceGroupId
     */
    public void setSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
    }

    /**
     * get 源安全组所属阿里云账户Id
     *
     * @return
     */
    public String getSourceGroupOwnerAccount() {
        return sourceGroupOwnerAccount;
    }

    /**
     * set 源安全组所属阿里云账户Id
     *
     * @param sourceGroupOwnerAccount
     */
    public void setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
        this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
    }

    /**
     * get 目标IP地址段，用于出方向授权
     *
     * @return
     */
    public String getDestCidrIp() {
        return destCidrIp;
    }

    /**
     * set 目标IP地址段，用于出方向授权
     *
     * @param destCidrIp
     */
    public void setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
    }

    /**
     * get 目标安全组，用于出方向授权
     *
     * @return
     */
    public String getDestGroupId() {
        return destGroupId;
    }

    /**
     * set 目标安全组，用于出方向授权
     *
     * @param destGroupId
     */
    public void setDestGroupId(String destGroupId) {
        this.destGroupId = destGroupId;
    }

    /**
     * get 目标安全组所属阿里云账户Id
     *
     * @return
     */
    public String getDestGroupOwnerAccount() {
        return destGroupOwnerAccount;
    }

    /**
     * set 目标安全组所属阿里云账户Id
     *
     * @param destGroupOwnerAccount
     */
    public void setDestGroupOwnerAccount(String destGroupOwnerAccount) {
        this.destGroupOwnerAccount = destGroupOwnerAccount;
    }

    /**
     * get 授权策略
     *
     * @return
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * set 授权策略
     *
     * @param policy
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * get 网络类型
     *
     * @return
     */
    public String getNicType() {
        return nicType;
    }

    /**
     * set 网络类型
     *
     * @param nicType
     */
    public void setNicType(String nicType) {
        this.nicType = nicType;
    }

    /**
     * get 规则优先级
     *
     * @return
     */
    public String getPriority() {
        return priority;
    }

    /**
     * set 规则优先级
     *
     * @param priority
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * get 授权方向
     *
     * @return
     */
    public String getDirection() {
        return direction;
    }

    /**
     * set 授权方向
     *
     * @param direction
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }


    /**
     * set 云注册信息ID
     *
     * @param cloudID
     */
    public PermissionType cloudID(String cloudID) {
        this.cloudID = cloudID;
        return this;
    }

    /**
     * set IP协议
     *
     * @param ipProtocol
     */
    public PermissionType ipProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }

    /**
     * set 端口范围
     *
     * @param portRange
     */
    public PermissionType portRange(String portRange) {
        this.portRange = portRange;
        return this;
    }

    /**
     * set 描述信息
     *
     * @param description
     */
    public PermissionType description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 源IP地址段，用于入方向授权
     *
     * @param sourceCidrIp
     */
    public PermissionType sourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }

    /**
     * set 源安全组，用于入方向授权
     *
     * @param sourceGroupId
     */
    public PermissionType sourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
        return this;
    }

    /**
     * set 源安全组所属阿里云账户Id
     *
     * @param sourceGroupOwnerAccount
     */
    public PermissionType sourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
        this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
        return this;
    }

    /**
     * set 目标IP地址段，用于出方向授权
     *
     * @param destCidrIp
     */
    public PermissionType destCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }

    /**
     * set 目标安全组，用于出方向授权
     *
     * @param destGroupId
     */
    public PermissionType destGroupId(String destGroupId) {
        this.destGroupId = destGroupId;
        return this;
    }

    /**
     * set 目标安全组所属阿里云账户Id
     *
     * @param destGroupOwnerAccount
     */
    public PermissionType destGroupOwnerAccount(String destGroupOwnerAccount) {
        this.destGroupOwnerAccount = destGroupOwnerAccount;
        return this;
    }

    /**
     * set 授权策略
     *
     * @param policy
     */
    public PermissionType policy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * set 网络类型
     *
     * @param nicType
     */
    public PermissionType nicType(String nicType) {
        this.nicType = nicType;
        return this;
    }

    /**
     * set 规则优先级
     *
     * @param priority
     */
    public PermissionType priority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * set 授权方向
     *
     * @param direction
     */
    public PermissionType direction(String direction) {
        this.direction = direction;
        return this;
    }


}