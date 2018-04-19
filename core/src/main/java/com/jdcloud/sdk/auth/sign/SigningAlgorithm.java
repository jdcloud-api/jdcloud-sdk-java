/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.jdcloud.sdk.auth.sign;

import javax.crypto.Mac;

import com.jdcloud.sdk.client.SdkClientException;

import java.security.NoSuchAlgorithmException;

/**
 * Mac使用的摘要算法
 * @author lixuenan3
 *
 */
public enum SigningAlgorithm {
    // 摘要算法名称
    HmacSHA256;
    // Mac实例对象
    private final ThreadLocal<Mac> macReference;

    SigningAlgorithm() {
        // HmacSHA256
        final String algorithmName = this.toString();
        macReference = new MacThreadLocal(algorithmName);
    }

    /**
     * Returns the thread local reference for the crypto algorithm
     */
    public Mac getMac() {
        return macReference.get();
    }

    /**
     * 实例化Mac
     * @author lixuenan3
     *
     */
    private static class MacThreadLocal extends ThreadLocal<Mac> {
        private final String algorithmName;

        MacThreadLocal(String algorithmName) {
            this.algorithmName = algorithmName;
        }

        @Override
        protected Mac initialValue() {
            try {
                return Mac.getInstance(algorithmName);
            } catch (NoSuchAlgorithmException e) {
                throw new SdkClientException("Unable to fetch Mac instance for Algorithm "
                        + algorithmName + e.getMessage(), e);

            }
        }
    }
}
