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
 * order
 * 云堡垒机实例相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.bastion.model;

import com.jdcloud.sdk.service.bastion.model.Bastion;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询一个堡垒机的信息
 */
public class DescribeSourceIdResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * bastion
     */
    private Bastion bastion;



    /**
     * get bastion
     *
     * @return
     */
    public Bastion getBastion() {
        return bastion;
    }

    /**
     * set bastion
     *
     * @param bastion
     */
    public void setBastion(Bastion bastion) {
        this.bastion = bastion;
    }



    /**
     * set bastion
     *
     * @param bastion
     */
    public DescribeSourceIdResult bastion(Bastion bastion) {
        this.bastion = bastion;
        return this;
    }


}