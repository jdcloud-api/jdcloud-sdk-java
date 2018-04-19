/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.jdcloud.sdk.auth.sign;

import com.jdcloud.sdk.client.SdkClientException;
import com.jdcloud.sdk.model.SignRequest;

public interface ISignatureComposer {

    /**
     * 方法描述：签名
     * @param signRequest
     * @throws SdkClientException 
     * @author lixuenan3
     * @date 2018年3月22日 下午4:43:01
     */
    public void sign(SignRequest signRequest) throws SdkClientException;
}
