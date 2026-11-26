# 更新历史 #
API版本：1.6.1

| 发布时间      | 版本号   | 更新               | 说明                                                                                                            |
|-----------|-------|------------------|---------------------------------------------------------------------------------------------------------------|
| 2026-11-26 | 0.2.12 | 恢复运维事件查询弃盘标记 | describeMaintenanceEvents响应恢复discardLocalDataDisk字段，用于表示本次迁移是否允许丢弃本地数据盘。 |
| 2026-11-24 | 0.2.11 | 同步异构计算资源聚合状态过滤 | 查询接口新增nodeState和authorizationState资源聚合后过滤，totalCount调整为过滤后的资源总数；authorizationStatus更名为authorizationState，统一状态及处置建议枚举大小写；创建自定义事件明确支持VM和HPC资源，移除查询响应中的discardLocalDataDisk。 |
| 2026-11-18 | 0.2.10 | 调整异构计算资源运维事件摘要 | 资源摘要新增内网IP、故障来源、故障类型、关联故障数、节点状态和授权状态；处置建议调整为suggestDecision复合结构，移除activeState和totalFaultCount；Maintenance查询纳入实例异常的维修、重启和观察事件。 |
| 2026-11-12 | 0.2.9 | 补充自定义事件幂等、执行结果与目标状态 | 创建接口新增可选clientToken和targetState；运维事件查询新增可空executionSucceeded和hostChanged，分别表达底层资源执行结果和宿主机IP变化。 |
| 2026-11-10 | 0.2.8 | 调整异构计算实例运维事件接口 | 查询接口更名为describeInstanceMaintenanceEvents并固定按资源聚合分页；事件授权不再要求resourceId；新增按资源及最终处置建议授权的authorizeInstanceEvent接口。 |
| 2026-11-06 | 0.2.7 | 移除异构计算故障审核接口 | auditEvent为内部运维接口，不再通过CMP用户侧OpenAPI暴露。 |
| 2026-11-06 | 0.2.6 | 调整异构计算故障上报响应 | 异构计算故障上报接口响应不再返回handling，仅返回eventId。 |
| 2026-11-06 | 0.2.5 | 完善异构计算故障事件闭环接口 | 故障上报响应新增handling；查询接口支持资源摘要分页和指定资源后的事件分页，恢复order、sort参数；资源摘要、事件详情和审核日志补充故障闭环字段。 |
| 2026-11-04 | 0.2.4 | 新增异构计算故障事件闭环接口 | 新增HPC故障上报、按资源聚合并分页查询和管理员审核接口，查询接口的totalCount表示资源总数；授权接口新增resourceId；事件响应新增faultType、deviceType、deviceId。 |
| 2026-10-29 | 0.2.3 | 补充自定义运维事件弃盘迁移字段 | 创建接口新增discardLocalDataDisk、reproductionCommand、commandOutput，补充原因信息条件必填说明；查询响应新增弃盘标记和故障信息。 |
| 2024-11-15 | 0.1.0 | 新增云主机运维策略        |                                                                                        |
| 2025-8-6  | 0.2.0 | 新增云主机所在宿主机下线运维事件 | |
