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

package com.jdcloud.sdk.service.eid.model;


/**
 * deviceDataRiskOverview
 */
public class DeviceDataRiskOverview  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备总量
     */
    private Integer allDevice;

    /**
     * 设备总量环比百分率
     */
    private String allDevicePercent;

    /**
     * 正常
     */
    private Integer normal;

    /**
     * 正常设备环比百分率
     */
    private String normalPercent;

    /**
     * 脱机挂
     */
    private Integer tuoJiGua;

    /**
     * 脱机挂设备环比百分率
     */
    private String tuoJiGuaPercent;

    /**
     * 伪造
     */
    private Integer forgery;

    /**
     * 伪造设备环比百分率
     */
    private String forgeryPercent;

    /**
     * 云手机
     */
    private Integer cloudPhone;

    /**
     * 云手机设备环比百分率
     */
    private String cloudPhonePercent;

    /**
     * root/越狱
     */
    private Integer root;

    /**
     * root/越狱设备环比百分率
     */
    private String rootPercent;

    /**
     * hook
     */
    private Integer hook;

    /**
     * hook设备环比百分率
     */
    private String hookPercent;

    /**
     * 多开
     */
    private Integer duoKai;

    /**
     * 多开设备环比百分率
     */
    private String duoKaiPercent;

    /**
     * 模拟器
     */
    private Integer moNi;

    /**
     * 模拟器设备环比百分率
     */
    private String moNiPercent;



    /**
     * get 设备总量
     *
     * @return
     */
    public Integer getAllDevice() {
        return allDevice;
    }

    /**
     * set 设备总量
     *
     * @param allDevice
     */
    public void setAllDevice(Integer allDevice) {
        this.allDevice = allDevice;
    }


    /**
     * get 设备总量环比百分率
     *
     * @return
     */
    public String getAllDevicePercent() {
        return allDevicePercent;
    }

    /**
     * set 设备总量环比百分率
     *
     * @param allDevicePercent
     */
    public void setAllDevicePercent(String allDevicePercent) {
        this.allDevicePercent = allDevicePercent;
    }


    /**
     * get 正常
     *
     * @return
     */
    public Integer getNormal() {
        return normal;
    }

    /**
     * set 正常
     *
     * @param normal
     */
    public void setNormal(Integer normal) {
        this.normal = normal;
    }


    /**
     * get 正常设备环比百分率
     *
     * @return
     */
    public String getNormalPercent() {
        return normalPercent;
    }

    /**
     * set 正常设备环比百分率
     *
     * @param normalPercent
     */
    public void setNormalPercent(String normalPercent) {
        this.normalPercent = normalPercent;
    }


    /**
     * get 脱机挂
     *
     * @return
     */
    public Integer getTuoJiGua() {
        return tuoJiGua;
    }

    /**
     * set 脱机挂
     *
     * @param tuoJiGua
     */
    public void setTuoJiGua(Integer tuoJiGua) {
        this.tuoJiGua = tuoJiGua;
    }


    /**
     * get 脱机挂设备环比百分率
     *
     * @return
     */
    public String getTuoJiGuaPercent() {
        return tuoJiGuaPercent;
    }

    /**
     * set 脱机挂设备环比百分率
     *
     * @param tuoJiGuaPercent
     */
    public void setTuoJiGuaPercent(String tuoJiGuaPercent) {
        this.tuoJiGuaPercent = tuoJiGuaPercent;
    }


    /**
     * get 伪造
     *
     * @return
     */
    public Integer getForgery() {
        return forgery;
    }

    /**
     * set 伪造
     *
     * @param forgery
     */
    public void setForgery(Integer forgery) {
        this.forgery = forgery;
    }


    /**
     * get 伪造设备环比百分率
     *
     * @return
     */
    public String getForgeryPercent() {
        return forgeryPercent;
    }

    /**
     * set 伪造设备环比百分率
     *
     * @param forgeryPercent
     */
    public void setForgeryPercent(String forgeryPercent) {
        this.forgeryPercent = forgeryPercent;
    }


    /**
     * get 云手机
     *
     * @return
     */
    public Integer getCloudPhone() {
        return cloudPhone;
    }

    /**
     * set 云手机
     *
     * @param cloudPhone
     */
    public void setCloudPhone(Integer cloudPhone) {
        this.cloudPhone = cloudPhone;
    }


    /**
     * get 云手机设备环比百分率
     *
     * @return
     */
    public String getCloudPhonePercent() {
        return cloudPhonePercent;
    }

    /**
     * set 云手机设备环比百分率
     *
     * @param cloudPhonePercent
     */
    public void setCloudPhonePercent(String cloudPhonePercent) {
        this.cloudPhonePercent = cloudPhonePercent;
    }


    /**
     * get root/越狱
     *
     * @return
     */
    public Integer getRoot() {
        return root;
    }

    /**
     * set root/越狱
     *
     * @param root
     */
    public void setRoot(Integer root) {
        this.root = root;
    }


    /**
     * get root/越狱设备环比百分率
     *
     * @return
     */
    public String getRootPercent() {
        return rootPercent;
    }

    /**
     * set root/越狱设备环比百分率
     *
     * @param rootPercent
     */
    public void setRootPercent(String rootPercent) {
        this.rootPercent = rootPercent;
    }


    /**
     * get hook
     *
     * @return
     */
    public Integer getHook() {
        return hook;
    }

    /**
     * set hook
     *
     * @param hook
     */
    public void setHook(Integer hook) {
        this.hook = hook;
    }


    /**
     * get hook设备环比百分率
     *
     * @return
     */
    public String getHookPercent() {
        return hookPercent;
    }

    /**
     * set hook设备环比百分率
     *
     * @param hookPercent
     */
    public void setHookPercent(String hookPercent) {
        this.hookPercent = hookPercent;
    }


    /**
     * get 多开
     *
     * @return
     */
    public Integer getDuoKai() {
        return duoKai;
    }

    /**
     * set 多开
     *
     * @param duoKai
     */
    public void setDuoKai(Integer duoKai) {
        this.duoKai = duoKai;
    }


    /**
     * get 多开设备环比百分率
     *
     * @return
     */
    public String getDuoKaiPercent() {
        return duoKaiPercent;
    }

    /**
     * set 多开设备环比百分率
     *
     * @param duoKaiPercent
     */
    public void setDuoKaiPercent(String duoKaiPercent) {
        this.duoKaiPercent = duoKaiPercent;
    }


    /**
     * get 模拟器
     *
     * @return
     */
    public Integer getMoNi() {
        return moNi;
    }

    /**
     * set 模拟器
     *
     * @param moNi
     */
    public void setMoNi(Integer moNi) {
        this.moNi = moNi;
    }


    /**
     * get 模拟器设备环比百分率
     *
     * @return
     */
    public String getMoNiPercent() {
        return moNiPercent;
    }

    /**
     * set 模拟器设备环比百分率
     *
     * @param moNiPercent
     */
    public void setMoNiPercent(String moNiPercent) {
        this.moNiPercent = moNiPercent;
    }



    /**
     * set 设备总量
     *
     * @param allDevice
     */
    public DeviceDataRiskOverview allDevice(Integer allDevice) {
        this.allDevice = allDevice;
        return this;
    }


    /**
     * set 设备总量环比百分率
     *
     * @param allDevicePercent
     */
    public DeviceDataRiskOverview allDevicePercent(String allDevicePercent) {
        this.allDevicePercent = allDevicePercent;
        return this;
    }


    /**
     * set 正常
     *
     * @param normal
     */
    public DeviceDataRiskOverview normal(Integer normal) {
        this.normal = normal;
        return this;
    }


    /**
     * set 正常设备环比百分率
     *
     * @param normalPercent
     */
    public DeviceDataRiskOverview normalPercent(String normalPercent) {
        this.normalPercent = normalPercent;
        return this;
    }


    /**
     * set 脱机挂
     *
     * @param tuoJiGua
     */
    public DeviceDataRiskOverview tuoJiGua(Integer tuoJiGua) {
        this.tuoJiGua = tuoJiGua;
        return this;
    }


    /**
     * set 脱机挂设备环比百分率
     *
     * @param tuoJiGuaPercent
     */
    public DeviceDataRiskOverview tuoJiGuaPercent(String tuoJiGuaPercent) {
        this.tuoJiGuaPercent = tuoJiGuaPercent;
        return this;
    }


    /**
     * set 伪造
     *
     * @param forgery
     */
    public DeviceDataRiskOverview forgery(Integer forgery) {
        this.forgery = forgery;
        return this;
    }


    /**
     * set 伪造设备环比百分率
     *
     * @param forgeryPercent
     */
    public DeviceDataRiskOverview forgeryPercent(String forgeryPercent) {
        this.forgeryPercent = forgeryPercent;
        return this;
    }


    /**
     * set 云手机
     *
     * @param cloudPhone
     */
    public DeviceDataRiskOverview cloudPhone(Integer cloudPhone) {
        this.cloudPhone = cloudPhone;
        return this;
    }


    /**
     * set 云手机设备环比百分率
     *
     * @param cloudPhonePercent
     */
    public DeviceDataRiskOverview cloudPhonePercent(String cloudPhonePercent) {
        this.cloudPhonePercent = cloudPhonePercent;
        return this;
    }


    /**
     * set root/越狱
     *
     * @param root
     */
    public DeviceDataRiskOverview root(Integer root) {
        this.root = root;
        return this;
    }


    /**
     * set root/越狱设备环比百分率
     *
     * @param rootPercent
     */
    public DeviceDataRiskOverview rootPercent(String rootPercent) {
        this.rootPercent = rootPercent;
        return this;
    }


    /**
     * set hook
     *
     * @param hook
     */
    public DeviceDataRiskOverview hook(Integer hook) {
        this.hook = hook;
        return this;
    }


    /**
     * set hook设备环比百分率
     *
     * @param hookPercent
     */
    public DeviceDataRiskOverview hookPercent(String hookPercent) {
        this.hookPercent = hookPercent;
        return this;
    }


    /**
     * set 多开
     *
     * @param duoKai
     */
    public DeviceDataRiskOverview duoKai(Integer duoKai) {
        this.duoKai = duoKai;
        return this;
    }


    /**
     * set 多开设备环比百分率
     *
     * @param duoKaiPercent
     */
    public DeviceDataRiskOverview duoKaiPercent(String duoKaiPercent) {
        this.duoKaiPercent = duoKaiPercent;
        return this;
    }


    /**
     * set 模拟器
     *
     * @param moNi
     */
    public DeviceDataRiskOverview moNi(Integer moNi) {
        this.moNi = moNi;
        return this;
    }


    /**
     * set 模拟器设备环比百分率
     *
     * @param moNiPercent
     */
    public DeviceDataRiskOverview moNiPercent(String moNiPercent) {
        this.moNiPercent = moNiPercent;
        return this;
    }


}