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
 * 弹性伸缩告警任务管理
 * 弹性伸缩告警任务管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ag.model;

import com.jdcloud.sdk.service.JdcloudResponse;

/**
 * 修改告警任务
- 所有参数取值为字符串类型的都严格区分大小写
- 所有告警任务不允许修改高可用组
- 所有告警任务不允许修改监控类型
- 目标跟踪规则生成的告警任务不允许修改任何内容
- 监控类型为自定义监控的告警任务不允许修改命名空间
- 步进规则绑定的告警任务不允许修改报警指标相关内容
- 所有参数都为非必传，但是至少需要传入一个参数，否则报错
- 伸缩功能开启或者关闭的情况下，都支持调用此接口

 */
public class UpdateAsAlarmResponse extends JdcloudResponse<UpdateAsAlarmResult> implements java.io.Serializable {

    private static final long serialVersionUID = 1L;




}