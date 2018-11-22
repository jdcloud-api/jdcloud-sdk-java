# 更新历史 #
API版本：0.3.6

|发布时间|版本号|更新|说明|
|---|---|---|---|
|2018-11-15|0.3.6|新增MySQL相关接口|* 新增备份同步服务相关接口<br>* 新增审计相关接口|
|2018-11-14|0.3.5|新增MySQL相关接口|* 续费欠费启停服务|
|2018-11-13|0.3.4|部分接口支持PG|* 实例相关接口和账号相关接口支持PG<br>* 新增查询用户配额接口|
|2018-10-17|0.3.3|数据类型改变|* 慢日志、Binlog返回的数据类型bug修复|
|2018-10-11|0.3.2|API接口名优化|* getBackupPolicy改为describeBackupPolicy，由post请求改为get请求<br>* setBackupPolicy改为modifyBackupPolicy<br>* getAuditDownloadURL改为describeAuditDownloadURL，由post请求改为get请求<br>* getAuditFiles改为describeAuditFiles，由post请求改为get请求<br>* getOptions改为describeAuditOptions，由post请求改为get请求<br>* setInstanceName改为modifyInstanceName<br>* describeIndexPerformance方法由post请求改为get请求<br>* describeQueryPerformance方法由post请求改为get请求|
|2018-09-05|0.3.1|新增MySQL相关接口|* 新增查询备份下载链接接口<br>* 新增binglog相关接口<br>* 新增慢日志统计及慢日志明细接口<br>* 新增修改连接模式接口|
|2018-08-30|0.3.0|新增MySQL相关接口|* 新增升级实例配置接口<br>* 新增根据时间点、备份创建实例接口<br>* 新增账号授权与取消授权接口<br>* 创建备份与查询备份列表接口支持MySQL<br>* 修改与获取备份策略接口支持MySQL<br>* 开放修改白名单功能|
|2018-08-24|0.2.9|官网国际化|* 优化接口描述|
|2018-08-20|0.2.8|支持Android系统|* Java SDK新增对Android系统的支持|
|2018-08-08|0.2.7|白名单|* 暂不开放修改白名单功能|
|2018-08-07|0.2.6|新增接口并部分接口支持MySQL|* 新增白名单相关接口<br>* 新增外网访问相关接口<br>* 开放获取备份策略接口<br>* 新增备份覆盖恢复实例接口<br>* 账号相关接口支持MySQL<br>* 部分数据库相关接口支持MySQL<br>* 删除备份接口支持MySQL|
|2018-07-25|0.2.5|新增接口|* 新增数据库相关接口<br>* 新增删除备份接口<br> * 新增错误日志相关接口<br>* 新增性能统计相关接口|
|2018-05-22|0.2.4|新增接口|* 新增实例相关接口<br>* 新增备份策略接口<br>* 新增单库上云模板共享接口|
|2018-04-12|0.2.3|完善描述及修改接口|* 完善接口描述<br>* 修改备份文件链接接口，fileName字段修改为非必传|
|2018-03-29|0.2.2|备份列表|* 备份列表接口新增筛选项|
|2018-03-28|0.2.1|修改单库恢复接口名|* restoreSingleDatabase改为restoreDatabaseFromBackup|
|2018-03-18|0.2.0|单库上云|* 增加单库上云文件列表接口<br>* 增加单库上云文件恢复数据库接口<br>* 备份文件链接新增超时参数|
|2018-01-31|0.1.0|初始版本|* API定义基础接口|
