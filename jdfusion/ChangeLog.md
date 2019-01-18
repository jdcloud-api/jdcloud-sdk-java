# 更新历史 #
API版本：0.2.0

|发布时间|版本号|更新|说明|
|---|---|---|---|
|2019-01-05   |0.2.0   |新增接口,部分字段调整       | 增加RDS、OSS基本操作 <br> 增加Deployment基本操作 <br>所有需要在body中传数据的请求，body数据结构变更 <br> 创建虚拟机请求(createVmReq)中的字段vms改为vm <br> Vpc所有信息中的addressPrefix改为cidrBlock <br> Slb中的SlbInfo信息去除masterAZ和slaveAZ，用azs数据替换 |
|2018-12-18   |0.1.0   |新增接口       | 增加基本操作 |
