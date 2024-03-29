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

package com.jdcloud.sdk.service.bgw.model;


/**
 * bfd
 */
public class Bfd  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * BFD报文的最小发送间隔
     */
    private Integer minTxInterval;

    /**
     * BFD报文的最小接受间隔
     */
    private Integer minRxInterval;

    /**
     * 接收方允许发送方发送BFD控制报文的最大连续丢包数
     */
    private Integer detectMultiplier;



    /**
     * get BFD报文的最小发送间隔
     *
     * @return
     */
    public Integer getMinTxInterval() {
        return minTxInterval;
    }

    /**
     * set BFD报文的最小发送间隔
     *
     * @param minTxInterval
     */
    public void setMinTxInterval(Integer minTxInterval) {
        this.minTxInterval = minTxInterval;
    }


    /**
     * get BFD报文的最小接受间隔
     *
     * @return
     */
    public Integer getMinRxInterval() {
        return minRxInterval;
    }

    /**
     * set BFD报文的最小接受间隔
     *
     * @param minRxInterval
     */
    public void setMinRxInterval(Integer minRxInterval) {
        this.minRxInterval = minRxInterval;
    }


    /**
     * get 接收方允许发送方发送BFD控制报文的最大连续丢包数
     *
     * @return
     */
    public Integer getDetectMultiplier() {
        return detectMultiplier;
    }

    /**
     * set 接收方允许发送方发送BFD控制报文的最大连续丢包数
     *
     * @param detectMultiplier
     */
    public void setDetectMultiplier(Integer detectMultiplier) {
        this.detectMultiplier = detectMultiplier;
    }



    /**
     * set BFD报文的最小发送间隔
     *
     * @param minTxInterval
     */
    public Bfd minTxInterval(Integer minTxInterval) {
        this.minTxInterval = minTxInterval;
        return this;
    }


    /**
     * set BFD报文的最小接受间隔
     *
     * @param minRxInterval
     */
    public Bfd minRxInterval(Integer minRxInterval) {
        this.minRxInterval = minRxInterval;
        return this;
    }


    /**
     * set 接收方允许发送方发送BFD控制报文的最大连续丢包数
     *
     * @param detectMultiplier
     */
    public Bfd detectMultiplier(Integer detectMultiplier) {
        this.detectMultiplier = detectMultiplier;
        return this;
    }


}