# 更新历史 #
API版本：1.1.17

| 发布时间       | 版本号    |更新|说明|
|------------|--------|---|---|
| 2026-10-29 | 1.1.17 |修改|* 集群扩容 clusterExpansion / 缩容 clusterReduction：修复 nodeType 参数未生效（此前 Task/Edge 扩容会按 Core 处理）；补充参数校验（新建节点组必填项、configGroupId 必填规则）与 clientToken 幂等（24 小时）；补充请求/响应示例与字段取值范围
| 2026-10-12 | 1.1.16 |新增|* 新增 Task 节点组弹性伸缩接口：伸缩组增删改查 describeScalingGroups/describeScalingGroup/createScalingGroup/modifyScalingGroup/copyScalingGroup/deleteScalingGroup；手工伸缩 executeScalingManually；可选节点组与指标字典 describeScalableNodeGroups/describeScalingMetrics；伸缩记录查询与导出 describeScalingActivities/exportScalingActivities/describeScalingActivityLog
| 2026-08-07 | 1.1.15 |新增|* 新增集群服务当前生效配置查询接口 describeClusterConfigs；新增库表元数据查询接口 listDatabases/getDatabase/listTables/getTable/listPartitions
| 2025-06-20 | 1.1.14 |修改|* 节点组名称的字段由configGroupId改为configGroupName；ClusterExpansion去掉参数configGroupName
| 2025-06-03 | 1.1.13 |修改|* 集群支持节点组功能，创建、扩容、释放集群增加节点组信息参数
| 2025-04-23 | 1.1.12 |修改|* 集群支持查看扩容缩容进度状态
| 2023-04-21 | 1.1.11 |修改|* 集群创建支持Task和Coord创建，增加相关字段
| 2023-03-29 | 1.1.10 |修改|* 集群创建支持密钥创建，增加sshKeyName字段；password改为非必需字段
| 2023-01-06 | 1.1.9  |修改|* 集群列表返回值修改createTime字段从String改为Long类型
| 2022-12-28 | 1.1.9  |修改|* 集群列表返回值增加controlMethod和nodeTypeSummary字段
| 2022-12-26 | 1.1.9  |修改|* 集群列表支持Filter和tagFilter参数
| 2022-12-02 | 1.1.8  |修改|* 集群创建增加userDefinedConf自定义参数；扩容增加expandServices选择的组件
| 2022-11-08 | 1.1.7  |修改|* 集群信息增加RDS实例ID信息
| 2022-10-19 | 1.1.7  |修改|* 创建增加RDS,Kerberos字段；扩容增加节点规格字段；缩容增加节点类型字段；增加Edge节点支持|
| 2021-10-12 | 1.1.6  |修改|* 增加Slave节点多数据盘接口接口参数。更新接口描述。|
| 2020-12-02 | 1.1.6  |修改|* 修改softwareInfo接口参数。|
| 2020-11-30 | 1.1.6  |修改|* 修改版本号为1.1.6。|
| 2020-11-26 | 1.1.5  |修改|* 修改softwareInfo和monitorLabelList接口。|
| 2020-11-24 | 1.1.5  |修改|* 增加描述文件，增加clusterReduction的缩容集群接口。增加云监控监控标签列表monitorLabelList接口。|
| 2020-10-16 | 1.1.5  |修改|* 增加描述文件，list和clusterDetail返回的数据和前端一致，保证IAM主子账号可以工作。|
| 2020-10-13 | 1.1.5  |修改|* 增加create接口的3个参数，兼容jmr agent版本。|
| 2020-09-27 | 1.1.4  |修改|* 增加describeClusters接口；去掉create的无用参数；增加cluster detail的详细节点信息。|
| 2020-09-21 | 1.1.3  |修改|* 标准化接口的url、参数及返回值的格式，并只提供JMR集群查询接口|
| 2018-10-24 | 1.1.2  |修改|* 标准化接口的url、参数及返回值的格式，并只提供JMR集群创建、释放和查询接口|
| 2018-08-16 | 1.1.1  |国际化文档|* 国际化预备工作，添加参数注释<br> * 修改返回数据参数较少情况统一类型为"object" <br>* 添加请求参数的描述并提示哪些为必传字段|
| 2018-08-14 | 1.1.0  |添加|* 添加了JMR 集群、作业、监控、审计等接口对接OpenAPI工作<br> * 修复上一版中的语法错误 <br>* 暂将搜索条件参数封装为"selectParams"|
| 2018-06-05 | 1.0.0  |初始版本|* 初始版本，添加了集群处理相关的接口|
