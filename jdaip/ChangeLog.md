# 更新历史 #

API版本：1.0.14

| 发布时间       | 版本号   | 更新           | 说明                                   |
|------------|-------|--------------|--------------------------------------|
| 2026-10-21 | 1.0.14 | 新增在线服务版本列表接口 | * 新增 describeServiceVersions 产品侧接口，支持按 `ownerUserPin` 精确过滤服务所有者，并在服务权限过滤后返回稳定分页的服务版本列表 |
| 2026-10-20 | 1.0.13 | advanced 扩缩信号系数可配 | * `autoScale` 新增 `scaleUpFactor` / `scaleDownFactor`（百分比整数，如 150/40；advanced 必填；服务端换算为 1.5/0.4 写入 HPA formula） |
| 2026-10-15 | 1.0.12 | 在线服务自动扩缩容支持双阈值 | * createInferenceScale / updateInferenceScale 的 `autoScale` 新增 `mode`、`scaleUpOperator`、`scaleDownOperator`、`metrics`（ScaleMetric 双阈值）、`roles`（预留）、`tokenUsageThreshold`、`decodeTransferQueueThreshold`；`scaleDownDelay` 创建/更新下限调整为 30；describeInferenceScale 读回时补全 mode / operator 缺省值 |
| 2026-10-13 | 1.0.11 | 训练任务支持科技数据集 | * CreateJob 新增 `techDatasets` 创建参数；DescribeJob 新增包含 `storage` 的 `techDatasets` 挂载信息，固定使用 OSS 并只读挂载 |
| 2026-10-08 | 1.0.10 | Notebook支持科技数据集 | * CreateNotebook、UpdateResourceProperties 的 `techDatasets` 由服务端查询存储信息；DescribeNotebook 固定返回 `storageType=oss`、只读且不暴露存储地址 |
| 2026-09-20 | 1.0.9 | 新增批量训练任务契约 | * 训练任务新增 `batch` 类型、`minAvailable`、`partial-success`、副本统计及实例尝试字段 |
| 2025-04-17 | 1.0.0 | 初始化          | * 初始化                                |
| 2026-03-25 | 1.0.1 | 更新在线服务的一些接口  | * 更新已有接口和对外发布descirbeInferencePods接口 |
| 2026-04-17 | 1.0.2 | 更新在线服务QPS能力  | * 新增更新服务QPS接口；推理服务列表/详情与服务详情新增qps字段  |
| 2026-04-29 | 1.0.3 | 资源队列增加调度策略属性 | *  aistack: 创建资源队列可指定调度策略；增加更新调度策略接口 |
| 2026-08-19 | 1.0.4 | AI训练支持共享资源池 | * 训练任务支持 `joybuilder-exclusive-queue`；共享池创建任务时 `taskPriority` 必填 |
| 2026-08-20 | 1.0.5 | 在线服务支持产品绑定 | * 创建服务支持指定产品；服务列表和详情返回产品信息；新增更新产品绑定接口 |
| 2026-08-28 | 1.0.6 | 新增节点、节点池、队列相关接口 | * 新增节点、节点池、队列的获取和列表接口 |
| 2026-08-31 | 1.0.7 | 在线服务支持智能路由与专属网关 | * 新增 serviceType、smartRouterConfig、EPP 规格及专属网关地址字段 |
| 2026-08-31 | 1.0.8 | 对外发布启动、停止节点接口 | * 对外发布启动、停止节点接口 |
| 2026-10-15 | 1.0.9 | 对外发布队列相关接口 | * 对外发布队列相关接口 |
| 2026-10-27 | 1.0.10 | 对外发布OSS的列表接口 | * 对外发布OSS的列表接口 |
