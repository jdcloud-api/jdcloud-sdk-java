2018-11-19 version: 0.7.8
1. 查询域名列表返回审核状态
2. 修改审核状态为字符串格式

2018-11-19 version: 0.7.7
1. 增加域名启动和停止的接口

2018-11-19 version: 0.7.6
1. 统计接口增加回源参数

2018-11-19 version: 0.7.5
1. 增加统计接口
2. 增加查询域名详情的接口

2018-4-17 version: 0.7.4
1.增加列举域名的接口

2018-4-17 version: 0.7.2
1.修改接口的请求方式。
2.修改modifySource的请求参数。

2018-04-16 version: 0.7.1
1.修改modifySource的请求参数，去掉status,cname,

2018-04-16 version: 0.7.0
1.修改createDomain的请求参数，去掉status参数。
2.修改accessKeyConfig,keyKeep和keyKey的返回值条件
3.修改modifySource的请求参数，去掉status,cname,

2018-04-11 version: 0.6.0
1.添加CdnAccessKeyConfig为必要条件。
2.修改CdnDomain.yaml中的serviceType为必要条件，已经添加相关描述。
3.去掉CdnHttpType中content和status参数

2018-04-09 version: 0.5.0
1.添加DownloadUrl返回值描述类。
2.修改删除域名请求的url

2018-04-08 version: 0.4.0
4.添加cdnDomain auditStatus字段，cdnCache configId字段。

2018-04-08 version: 0.3.0
1.3.修改model中的type参数与go语言关键字冲突问题。

2018-04-03 version: 0.2.0
1.修改CdnCache中传参都为必要的，添加设置URL鉴权返回参数。

2018-01-31 version: 0.1.0
1. 初始版本
2.修改CdnCache中传参都为必要的，添加设置URL鉴权返回参数。
