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
 * 云主机
 * 与主机操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 
删除一台云主机实例。

详细操作说明请参考帮助文档：[删除实例](https://docs.jdcloud.com/cn/virtual-machines/delete-instance)

## 接口说明
- 不可以删除包年包月未到期的云主机。如果云主机为包年包月已到期的，并且用户处于白名单中，也不允许删除。
- 不可以删除没有计费信息的云主机，该情况只限于创建过程中出现了异常。
- 云主机状态必须为运行 &#x60;running&#x60;、停止 &#x60;stopped&#x60;、错误 &#x60;error&#x60;、状态，同时云主机没有正在进行中的任务才可以删除。
- 如果云主机中挂载的数据盘为按配置计费的云硬盘且 &#x60;AutoDelete&#x60; 属性为 &#x60;true&#x60;，那么数据盘会随云主机一起删除。
- 云主机中绑定的弹性公网IP可以选择是否随云主机一起删除。
- 如出现不能删除的情况请 [提交工单](https://ticket.jdcloud.com/applyorder/submit) 或联系京东云客服。
 [MFA enabled]
 */
public class DeleteInstanceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否删除主机的主网卡绑定的所有弹性公网IP，默认为否。可选值：&#x60;true&#x60;，&#x60;false&#x60;。
当回收站功能关闭的时候，此参数生效。
当回收站功能开启的时候，且参数 &#x60;destroy&#x60; 为 &#x60;true&#x60; 的时候，此参数生效。
当回收站功能开启的时候，且参数 &#x60;destroy&#x60; 为 &#x60;false&#x60; 的时候，此参数不生效。

     */
    private Boolean deletePrimaryNetworkInterfaceAllElasticIp;

    /**
     * 地域ID。
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 云主机ID。
     * Required:true
     */
    @Required
    private String instanceId;



    /**
     * get 是否删除主机的主网卡绑定的所有弹性公网IP，默认为否。可选值：&#x60;true&#x60;，&#x60;false&#x60;。
当回收站功能关闭的时候，此参数生效。
当回收站功能开启的时候，且参数 &#x60;destroy&#x60; 为 &#x60;true&#x60; 的时候，此参数生效。
当回收站功能开启的时候，且参数 &#x60;destroy&#x60; 为 &#x60;false&#x60; 的时候，此参数不生效。

     *
     * @return
     */
    public Boolean getDeletePrimaryNetworkInterfaceAllElasticIp() {
        return deletePrimaryNetworkInterfaceAllElasticIp;
    }

    /**
     * set 是否删除主机的主网卡绑定的所有弹性公网IP，默认为否。可选值：&#x60;true&#x60;，&#x60;false&#x60;。
当回收站功能关闭的时候，此参数生效。
当回收站功能开启的时候，且参数 &#x60;destroy&#x60; 为 &#x60;true&#x60; 的时候，此参数生效。
当回收站功能开启的时候，且参数 &#x60;destroy&#x60; 为 &#x60;false&#x60; 的时候，此参数不生效。

     *
     * @param deletePrimaryNetworkInterfaceAllElasticIp
     */
    public void setDeletePrimaryNetworkInterfaceAllElasticIp(Boolean deletePrimaryNetworkInterfaceAllElasticIp) {
        this.deletePrimaryNetworkInterfaceAllElasticIp = deletePrimaryNetworkInterfaceAllElasticIp;
    }


    /**
     * get 地域ID。
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 云主机ID。
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云主机ID。
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }



    /**
     * set 是否删除主机的主网卡绑定的所有弹性公网IP，默认为否。可选值：&#x60;true&#x60;，&#x60;false&#x60;。
当回收站功能关闭的时候，此参数生效。
当回收站功能开启的时候，且参数 &#x60;destroy&#x60; 为 &#x60;true&#x60; 的时候，此参数生效。
当回收站功能开启的时候，且参数 &#x60;destroy&#x60; 为 &#x60;false&#x60; 的时候，此参数不生效。

     *
     * @param deletePrimaryNetworkInterfaceAllElasticIp
     */
    public DeleteInstanceRequest deletePrimaryNetworkInterfaceAllElasticIp(Boolean deletePrimaryNetworkInterfaceAllElasticIp) {
        this.deletePrimaryNetworkInterfaceAllElasticIp = deletePrimaryNetworkInterfaceAllElasticIp;
        return this;
    }


    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public DeleteInstanceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 云主机ID。
     *
     * @param instanceId
     */
    public DeleteInstanceRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}