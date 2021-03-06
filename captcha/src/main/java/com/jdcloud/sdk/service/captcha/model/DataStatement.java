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

package com.jdcloud.sdk.service.captcha.model;


/**
 * dataStatement
 */
public class DataStatement  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 时间, yyyy-mm-dd hh:mm:ss格式
     */
    private String timeStr;

    /**
     * 总体请求量
     */
    private Integer requestCount;

    /**
     * 静默验证请求量
     */
    private Integer silentCount;

    /**
     * 静默验证通过量
     */
    private Integer silentPassCount;

    /**
     * 静默验证防御量
     */
    private Integer silentBlockCount;

    /**
     * 验证码请求量
     */
    private Integer captchaCount;

    /**
     * 验证码通过量
     */
    private Integer captchaPassCount;

    /**
     * 验证码防御量
     */
    private Integer captchaBlockCount;

    /**
     * 总通过率
     */
    private Number passRate;

    /**
     * 静默通过率
     */
    private Number silentPassRate;

    /**
     * 验证码通过率
     */
    private Number captchaPassRate;


    /**
     * get 时间, yyyy-mm-dd hh:mm:ss格式
     *
     * @return
     */
    public String getTimeStr() {
        return timeStr;
    }

    /**
     * set 时间, yyyy-mm-dd hh:mm:ss格式
     *
     * @param timeStr
     */
    public void setTimeStr(String timeStr) {
        this.timeStr = timeStr;
    }

    /**
     * get 总体请求量
     *
     * @return
     */
    public Integer getRequestCount() {
        return requestCount;
    }

    /**
     * set 总体请求量
     *
     * @param requestCount
     */
    public void setRequestCount(Integer requestCount) {
        this.requestCount = requestCount;
    }

    /**
     * get 静默验证请求量
     *
     * @return
     */
    public Integer getSilentCount() {
        return silentCount;
    }

    /**
     * set 静默验证请求量
     *
     * @param silentCount
     */
    public void setSilentCount(Integer silentCount) {
        this.silentCount = silentCount;
    }

    /**
     * get 静默验证通过量
     *
     * @return
     */
    public Integer getSilentPassCount() {
        return silentPassCount;
    }

    /**
     * set 静默验证通过量
     *
     * @param silentPassCount
     */
    public void setSilentPassCount(Integer silentPassCount) {
        this.silentPassCount = silentPassCount;
    }

    /**
     * get 静默验证防御量
     *
     * @return
     */
    public Integer getSilentBlockCount() {
        return silentBlockCount;
    }

    /**
     * set 静默验证防御量
     *
     * @param silentBlockCount
     */
    public void setSilentBlockCount(Integer silentBlockCount) {
        this.silentBlockCount = silentBlockCount;
    }

    /**
     * get 验证码请求量
     *
     * @return
     */
    public Integer getCaptchaCount() {
        return captchaCount;
    }

    /**
     * set 验证码请求量
     *
     * @param captchaCount
     */
    public void setCaptchaCount(Integer captchaCount) {
        this.captchaCount = captchaCount;
    }

    /**
     * get 验证码通过量
     *
     * @return
     */
    public Integer getCaptchaPassCount() {
        return captchaPassCount;
    }

    /**
     * set 验证码通过量
     *
     * @param captchaPassCount
     */
    public void setCaptchaPassCount(Integer captchaPassCount) {
        this.captchaPassCount = captchaPassCount;
    }

    /**
     * get 验证码防御量
     *
     * @return
     */
    public Integer getCaptchaBlockCount() {
        return captchaBlockCount;
    }

    /**
     * set 验证码防御量
     *
     * @param captchaBlockCount
     */
    public void setCaptchaBlockCount(Integer captchaBlockCount) {
        this.captchaBlockCount = captchaBlockCount;
    }

    /**
     * get 总通过率
     *
     * @return
     */
    public Number getPassRate() {
        return passRate;
    }

    /**
     * set 总通过率
     *
     * @param passRate
     */
    public void setPassRate(Number passRate) {
        this.passRate = passRate;
    }

    /**
     * get 静默通过率
     *
     * @return
     */
    public Number getSilentPassRate() {
        return silentPassRate;
    }

    /**
     * set 静默通过率
     *
     * @param silentPassRate
     */
    public void setSilentPassRate(Number silentPassRate) {
        this.silentPassRate = silentPassRate;
    }

    /**
     * get 验证码通过率
     *
     * @return
     */
    public Number getCaptchaPassRate() {
        return captchaPassRate;
    }

    /**
     * set 验证码通过率
     *
     * @param captchaPassRate
     */
    public void setCaptchaPassRate(Number captchaPassRate) {
        this.captchaPassRate = captchaPassRate;
    }


    /**
     * set 时间, yyyy-mm-dd hh:mm:ss格式
     *
     * @param timeStr
     */
    public DataStatement timeStr(String timeStr) {
        this.timeStr = timeStr;
        return this;
    }

    /**
     * set 总体请求量
     *
     * @param requestCount
     */
    public DataStatement requestCount(Integer requestCount) {
        this.requestCount = requestCount;
        return this;
    }

    /**
     * set 静默验证请求量
     *
     * @param silentCount
     */
    public DataStatement silentCount(Integer silentCount) {
        this.silentCount = silentCount;
        return this;
    }

    /**
     * set 静默验证通过量
     *
     * @param silentPassCount
     */
    public DataStatement silentPassCount(Integer silentPassCount) {
        this.silentPassCount = silentPassCount;
        return this;
    }

    /**
     * set 静默验证防御量
     *
     * @param silentBlockCount
     */
    public DataStatement silentBlockCount(Integer silentBlockCount) {
        this.silentBlockCount = silentBlockCount;
        return this;
    }

    /**
     * set 验证码请求量
     *
     * @param captchaCount
     */
    public DataStatement captchaCount(Integer captchaCount) {
        this.captchaCount = captchaCount;
        return this;
    }

    /**
     * set 验证码通过量
     *
     * @param captchaPassCount
     */
    public DataStatement captchaPassCount(Integer captchaPassCount) {
        this.captchaPassCount = captchaPassCount;
        return this;
    }

    /**
     * set 验证码防御量
     *
     * @param captchaBlockCount
     */
    public DataStatement captchaBlockCount(Integer captchaBlockCount) {
        this.captchaBlockCount = captchaBlockCount;
        return this;
    }

    /**
     * set 总通过率
     *
     * @param passRate
     */
    public DataStatement passRate(Number passRate) {
        this.passRate = passRate;
        return this;
    }

    /**
     * set 静默通过率
     *
     * @param silentPassRate
     */
    public DataStatement silentPassRate(Number silentPassRate) {
        this.silentPassRate = silentPassRate;
        return this;
    }

    /**
     * set 验证码通过率
     *
     * @param captchaPassRate
     */
    public DataStatement captchaPassRate(Number captchaPassRate) {
        this.captchaPassRate = captchaPassRate;
        return this;
    }


}