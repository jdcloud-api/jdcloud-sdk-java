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
 * OSS Signature Service
 * OSS Signature Service
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ossopenapi.model;

import java.util.Map;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * signatureResult
 */
public class SignatureResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 签名的endpoint, 例如 http://s3.cn-east-1.jcloudcs.com
     */
    private String endpoint;

    /**
     * http method
     */
    private String httpMethod;

    /**
     * 资源路径
     */
    private String resourcePath;

    /**
     * 时间, 由openapi返回
     */
    private String xAmzDate;

    /**
     * content hash
     */
    private String xAmzContentSha256;

    /**
     * 用户pin
     */
    private String xAmzMetaRequesterPin;

    /**
     * 用户userId
     */
    private String xAmzMetaRequesterId;

    /**
     * 附加的签名header
     */
    private Map<String, String> additionalSignatureHeaders;

    /**
     * 签名的参数，query string
     */
    private Map<String, String> signatureParameters;

    /**
     * authorization信息, 由openapi计算返回
     */
    private String authorization;



    /**
     * get 签名的endpoint, 例如 http://s3.cn-east-1.jcloudcs.com
     *
     * @return
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * set 签名的endpoint, 例如 http://s3.cn-east-1.jcloudcs.com
     *
     * @param endpoint
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }


    /**
     * get http method
     *
     * @return
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    /**
     * set http method
     *
     * @param httpMethod
     */
    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }


    /**
     * get 资源路径
     *
     * @return
     */
    public String getResourcePath() {
        return resourcePath;
    }

    /**
     * set 资源路径
     *
     * @param resourcePath
     */
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }


    /**
     * get 时间, 由openapi返回
     *
     * @return
     */
    public String getXAmzDate() {
        return xAmzDate;
    }

    /**
     * set 时间, 由openapi返回
     *
     * @param xAmzDate
     */
    public void setXAmzDate(String xAmzDate) {
        this.xAmzDate = xAmzDate;
    }


    /**
     * get content hash
     *
     * @return
     */
    public String getXAmzContentSha256() {
        return xAmzContentSha256;
    }

    /**
     * set content hash
     *
     * @param xAmzContentSha256
     */
    public void setXAmzContentSha256(String xAmzContentSha256) {
        this.xAmzContentSha256 = xAmzContentSha256;
    }


    /**
     * get 用户pin
     *
     * @return
     */
    public String getXAmzMetaRequesterPin() {
        return xAmzMetaRequesterPin;
    }

    /**
     * set 用户pin
     *
     * @param xAmzMetaRequesterPin
     */
    public void setXAmzMetaRequesterPin(String xAmzMetaRequesterPin) {
        this.xAmzMetaRequesterPin = xAmzMetaRequesterPin;
    }


    /**
     * get 用户userId
     *
     * @return
     */
    public String getXAmzMetaRequesterId() {
        return xAmzMetaRequesterId;
    }

    /**
     * set 用户userId
     *
     * @param xAmzMetaRequesterId
     */
    public void setXAmzMetaRequesterId(String xAmzMetaRequesterId) {
        this.xAmzMetaRequesterId = xAmzMetaRequesterId;
    }


    /**
     * get 附加的签名header
     *
     * @return
     */
    public Map<String, String> getAdditionalSignatureHeaders() {
        return additionalSignatureHeaders;
    }

    /**
     * set 附加的签名header
     *
     * @param additionalSignatureHeaders
     */
    public void setAdditionalSignatureHeaders(Map<String, String> additionalSignatureHeaders) {
        this.additionalSignatureHeaders = additionalSignatureHeaders;
    }


    /**
     * get 签名的参数，query string
     *
     * @return
     */
    public Map<String, String> getSignatureParameters() {
        return signatureParameters;
    }

    /**
     * set 签名的参数，query string
     *
     * @param signatureParameters
     */
    public void setSignatureParameters(Map<String, String> signatureParameters) {
        this.signatureParameters = signatureParameters;
    }


    /**
     * get authorization信息, 由openapi计算返回
     *
     * @return
     */
    public String getAuthorization() {
        return authorization;
    }

    /**
     * set authorization信息, 由openapi计算返回
     *
     * @param authorization
     */
    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }



    /**
     * set 签名的endpoint, 例如 http://s3.cn-east-1.jcloudcs.com
     *
     * @param endpoint
     */
    public SignatureResult endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }


    /**
     * set http method
     *
     * @param httpMethod
     */
    public SignatureResult httpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }


    /**
     * set 资源路径
     *
     * @param resourcePath
     */
    public SignatureResult resourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
        return this;
    }


    /**
     * set 时间, 由openapi返回
     *
     * @param xAmzDate
     */
    public SignatureResult xAmzDate(String xAmzDate) {
        this.xAmzDate = xAmzDate;
        return this;
    }


    /**
     * set content hash
     *
     * @param xAmzContentSha256
     */
    public SignatureResult xAmzContentSha256(String xAmzContentSha256) {
        this.xAmzContentSha256 = xAmzContentSha256;
        return this;
    }


    /**
     * set 用户pin
     *
     * @param xAmzMetaRequesterPin
     */
    public SignatureResult xAmzMetaRequesterPin(String xAmzMetaRequesterPin) {
        this.xAmzMetaRequesterPin = xAmzMetaRequesterPin;
        return this;
    }


    /**
     * set 用户userId
     *
     * @param xAmzMetaRequesterId
     */
    public SignatureResult xAmzMetaRequesterId(String xAmzMetaRequesterId) {
        this.xAmzMetaRequesterId = xAmzMetaRequesterId;
        return this;
    }


    /**
     * set 附加的签名header
     *
     * @param additionalSignatureHeaders
     */
    public SignatureResult additionalSignatureHeaders(Map<String, String> additionalSignatureHeaders) {
        this.additionalSignatureHeaders = additionalSignatureHeaders;
        return this;
    }


    /**
     * set 签名的参数，query string
     *
     * @param signatureParameters
     */
    public SignatureResult signatureParameters(Map<String, String> signatureParameters) {
        this.signatureParameters = signatureParameters;
        return this;
    }


    /**
     * set authorization信息, 由openapi计算返回
     *
     * @param authorization
     */
    public SignatureResult authorization(String authorization) {
        this.authorization = authorization;
        return this;
    }


}