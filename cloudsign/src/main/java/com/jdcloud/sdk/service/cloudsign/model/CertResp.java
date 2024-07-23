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
 * certResp
 */
public class CertResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 证书序列号
     */
    private String certSerialNumber;

    /**
     * 证书过期时间
     */
    private Long certNotafter;

    /**
     * 证书有效期开始
     */
    private Long certNotbefore;

    /**
     * 证书颁发者DN
     */
    private String certIssueDn;

    /**
     * 证书使用者DN
     */
    private String certSubjectDn;

    /**
     * 证书信息
     */
    private String certSignBuf;

    /**
     * 证书使用者信息
     */
    private String certCn;

    /**
     * 加密证书序列号
     */
    private String certSerialnumberKmc;

    /**
     * KMC协议响应1
     */
    private String certKmcRep1;

    /**
     * 用户加密证书
     */
    private String certSignBufKmc;

    /**
     * 父证书序列号
     */
    private String parentCertSerialNumber;



    /**
     * get 证书序列号
     *
     * @return
     */
    public String getCertSerialNumber() {
        return certSerialNumber;
    }

    /**
     * set 证书序列号
     *
     * @param certSerialNumber
     */
    public void setCertSerialNumber(String certSerialNumber) {
        this.certSerialNumber = certSerialNumber;
    }


    /**
     * get 证书过期时间
     *
     * @return
     */
    public Long getCertNotafter() {
        return certNotafter;
    }

    /**
     * set 证书过期时间
     *
     * @param certNotafter
     */
    public void setCertNotafter(Long certNotafter) {
        this.certNotafter = certNotafter;
    }


    /**
     * get 证书有效期开始
     *
     * @return
     */
    public Long getCertNotbefore() {
        return certNotbefore;
    }

    /**
     * set 证书有效期开始
     *
     * @param certNotbefore
     */
    public void setCertNotbefore(Long certNotbefore) {
        this.certNotbefore = certNotbefore;
    }


    /**
     * get 证书颁发者DN
     *
     * @return
     */
    public String getCertIssueDn() {
        return certIssueDn;
    }

    /**
     * set 证书颁发者DN
     *
     * @param certIssueDn
     */
    public void setCertIssueDn(String certIssueDn) {
        this.certIssueDn = certIssueDn;
    }


    /**
     * get 证书使用者DN
     *
     * @return
     */
    public String getCertSubjectDn() {
        return certSubjectDn;
    }

    /**
     * set 证书使用者DN
     *
     * @param certSubjectDn
     */
    public void setCertSubjectDn(String certSubjectDn) {
        this.certSubjectDn = certSubjectDn;
    }


    /**
     * get 证书信息
     *
     * @return
     */
    public String getCertSignBuf() {
        return certSignBuf;
    }

    /**
     * set 证书信息
     *
     * @param certSignBuf
     */
    public void setCertSignBuf(String certSignBuf) {
        this.certSignBuf = certSignBuf;
    }


    /**
     * get 证书使用者信息
     *
     * @return
     */
    public String getCertCn() {
        return certCn;
    }

    /**
     * set 证书使用者信息
     *
     * @param certCn
     */
    public void setCertCn(String certCn) {
        this.certCn = certCn;
    }


    /**
     * get 加密证书序列号
     *
     * @return
     */
    public String getCertSerialnumberKmc() {
        return certSerialnumberKmc;
    }

    /**
     * set 加密证书序列号
     *
     * @param certSerialnumberKmc
     */
    public void setCertSerialnumberKmc(String certSerialnumberKmc) {
        this.certSerialnumberKmc = certSerialnumberKmc;
    }


    /**
     * get KMC协议响应1
     *
     * @return
     */
    public String getCertKmcRep1() {
        return certKmcRep1;
    }

    /**
     * set KMC协议响应1
     *
     * @param certKmcRep1
     */
    public void setCertKmcRep1(String certKmcRep1) {
        this.certKmcRep1 = certKmcRep1;
    }


    /**
     * get 用户加密证书
     *
     * @return
     */
    public String getCertSignBufKmc() {
        return certSignBufKmc;
    }

    /**
     * set 用户加密证书
     *
     * @param certSignBufKmc
     */
    public void setCertSignBufKmc(String certSignBufKmc) {
        this.certSignBufKmc = certSignBufKmc;
    }


    /**
     * get 父证书序列号
     *
     * @return
     */
    public String getParentCertSerialNumber() {
        return parentCertSerialNumber;
    }

    /**
     * set 父证书序列号
     *
     * @param parentCertSerialNumber
     */
    public void setParentCertSerialNumber(String parentCertSerialNumber) {
        this.parentCertSerialNumber = parentCertSerialNumber;
    }



    /**
     * set 证书序列号
     *
     * @param certSerialNumber
     */
    public CertResp certSerialNumber(String certSerialNumber) {
        this.certSerialNumber = certSerialNumber;
        return this;
    }


    /**
     * set 证书过期时间
     *
     * @param certNotafter
     */
    public CertResp certNotafter(Long certNotafter) {
        this.certNotafter = certNotafter;
        return this;
    }


    /**
     * set 证书有效期开始
     *
     * @param certNotbefore
     */
    public CertResp certNotbefore(Long certNotbefore) {
        this.certNotbefore = certNotbefore;
        return this;
    }


    /**
     * set 证书颁发者DN
     *
     * @param certIssueDn
     */
    public CertResp certIssueDn(String certIssueDn) {
        this.certIssueDn = certIssueDn;
        return this;
    }


    /**
     * set 证书使用者DN
     *
     * @param certSubjectDn
     */
    public CertResp certSubjectDn(String certSubjectDn) {
        this.certSubjectDn = certSubjectDn;
        return this;
    }


    /**
     * set 证书信息
     *
     * @param certSignBuf
     */
    public CertResp certSignBuf(String certSignBuf) {
        this.certSignBuf = certSignBuf;
        return this;
    }


    /**
     * set 证书使用者信息
     *
     * @param certCn
     */
    public CertResp certCn(String certCn) {
        this.certCn = certCn;
        return this;
    }


    /**
     * set 加密证书序列号
     *
     * @param certSerialnumberKmc
     */
    public CertResp certSerialnumberKmc(String certSerialnumberKmc) {
        this.certSerialnumberKmc = certSerialnumberKmc;
        return this;
    }


    /**
     * set KMC协议响应1
     *
     * @param certKmcRep1
     */
    public CertResp certKmcRep1(String certKmcRep1) {
        this.certKmcRep1 = certKmcRep1;
        return this;
    }


    /**
     * set 用户加密证书
     *
     * @param certSignBufKmc
     */
    public CertResp certSignBufKmc(String certSignBufKmc) {
        this.certSignBufKmc = certSignBufKmc;
        return this;
    }


    /**
     * set 父证书序列号
     *
     * @param parentCertSerialNumber
     */
    public CertResp parentCertSerialNumber(String parentCertSerialNumber) {
        this.parentCertSerialNumber = parentCertSerialNumber;
        return this;
    }


}