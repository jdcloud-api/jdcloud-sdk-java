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
 * lastAttackReport
 */
public class LastAttackReport  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 最后攻击时间，时间戳
     */
    private Integer lastAttackTime;

    /**
     * 攻击个数
     */
    private Integer attackCount;



    /**
     * get 最后攻击时间，时间戳
     *
     * @return
     */
    public Integer getLastAttackTime() {
        return lastAttackTime;
    }

    /**
     * set 最后攻击时间，时间戳
     *
     * @param lastAttackTime
     */
    public void setLastAttackTime(Integer lastAttackTime) {
        this.lastAttackTime = lastAttackTime;
    }


    /**
     * get 攻击个数
     *
     * @return
     */
    public Integer getAttackCount() {
        return attackCount;
    }

    /**
     * set 攻击个数
     *
     * @param attackCount
     */
    public void setAttackCount(Integer attackCount) {
        this.attackCount = attackCount;
    }



    /**
     * set 最后攻击时间，时间戳
     *
     * @param lastAttackTime
     */
    public LastAttackReport lastAttackTime(Integer lastAttackTime) {
        this.lastAttackTime = lastAttackTime;
        return this;
    }


    /**
     * set 攻击个数
     *
     * @param attackCount
     */
    public LastAttackReport attackCount(Integer attackCount) {
        this.attackCount = attackCount;
        return this;
    }


}