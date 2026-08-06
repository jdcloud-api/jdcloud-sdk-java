# ChangeLog

## 2026-07-14

- 新增开发机自动关机策略的查询、保存、删除和白名单候选分页接口。
- `MachineInfoVo`、`PodMachineDetailVO` 新增可选字段 `autoShutdown`，兼容旧客户端。
- 利用率边界统一为 `LTE`；默认运行超时为 1440 分钟；通知停机默认宽限期为 30 分钟，范围 1～1440 分钟。
- 闲置时长和运行时长阈值必须为正整数分钟。
- 通知对象固定为开发机负责人和空间管理员，不提供可编辑接收人类型字段。
- 镜像命名规则与 Pod 监控指标映射属于服务端上线配置，不进入 OpenAPI 契约。

## 2026-07-17

- `thresholdValue` 类型从 `number/double` 修正为 `integer/int64`，与 DDL `decimal(12,0)` 和后端整数校验一致。

## 2026-07-19

- 补充策略条件组、条件、通知渠道、队列、白名单及分页参数的数量与唯一性约束。
- `MachineInfoVo`、`PodMachineDetailVO` 的可选 `autoShutdown` 明确为 nullable，保持无策略场景语义。

## 2026-08-05

- 所有策略接口请求体新增 `workspaceCode` 字段（save/delete/listWhitelistCandidates 为 required，get 为 optional）。
- `getDevMachineShutdownPolicy` 请求体从空 object 改为 `GetDevMachineShutdownPolicyParam`，包含 `workspaceCode` 字段。
