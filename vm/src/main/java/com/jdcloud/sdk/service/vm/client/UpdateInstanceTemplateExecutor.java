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
 * Instance-Template
 * 与启动模板相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.vm.model.UpdateInstanceTemplateResponse;

/**
 * 修改一个启动模板的信息，包括名称、描述

 */
class UpdateInstanceTemplateExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "PATCH";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/instanceTemplates/{instanceTemplateId}";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return UpdateInstanceTemplateResponse.class;
    }
}
