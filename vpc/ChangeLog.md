# 更新历史 #
API版本：1.0.0

|发布时间|版本号|更新|说明|
|---|---|---|---|
|2022-06-29|1.0.1|扩展支持|* 支持natgw2.0|
|2022-04-14|1.0.1|扩展支持|* 修改共享带宽包，对外发布|
|2022-02-10|1.0.0|扩展支持|* 支持ip接入资源组；支持共享带宽包接入tag和资源组|
|2021-05-17|1.0.0|增加新接口|* 支持根据私有唯一ip修改natgw子网acl|
|2021-03-30|1.0.0|增加新接口|* 支持共享带宽包|
|2020-11-10|0.9.5|增加新接口|* 对接dns,提供接口给dns支持dns针对vpcId解析|
|2020-08-05|0.9.4|增加新接口|* 对接统一选购,支持port绑定cidr|
|2020-04-19|0.9.3|增加新接口|* 增加DescribeSpecialIpPool|
|2020-04-13|0.9.2|扩展支持|* 支持边缘计算|
|2019-11-04|0.9.1|增加新接口|* 增加SetEipTag<br>* 增加GetStatus|
|2019-09-12|0.9.0|增加新接口|* 增加AddRoutePropagation<br>* 增加ModifyRoutePropagation<br>* 增加RemoveRoutePropagation<br>* 修改AddRouteTableRules，增加description属性<br>* 修改ModifyRouteTableRules，增加description属性<br>* 修改DescribeRouteTable/DescribeRouteTables返回信息增加路由传播列表（routePropagations）、路由信息增加路由类型、description属性<br>* 查询和修改配额接口支持传播路由|
|2019-07-23|0.8.0|增加新接口|* 增加createNetworkInterfacePermission<br>* 增加describeNetworkInterfacePermissions<br>* 增加deleteNetworkInterfacePermission<br>* 弹性网卡列表增加attachmentStatus和networkInterfaceStatus<br>* 弹性网卡增加enableNetworkInterface、disableNetworkInterface<br>* 增加describeAuthorizedNetworkInterface和describeAuthorizedNetworkInterfaces|
|2019-06-06|0.7.0|增加新接口|* 增加CreateNatGateway<br>* 增加DescribeNatGateways<br>* 增加DescribeNatGateway<br>* 增加DeleteNatGateway<br>* 增加ModifyNatGateway<br>* 增加StartNatGateway<br>* 增加StopNatGateway<br>* 增加OpModifyNatGateway|
|2018-12-06|0.5.1|增加新接口|* 增加修改弹性IP接口|
|2018-09-04|0.5.0|增加新接口|* 增加修改私有网络接口<br>* 增加创建、删除、修改子网接口<br>* 增加创建、删除、修改networkAcl接口<br>* 增加查询ACL列表和详情接口<br>* 增加给子网绑定/解绑networkAcl接口<br>* 增加添加、移除、修改networkAcl规则接口<br>* 增加创建、删除、修改路由表接口<br>* 增加查询路由表列表和详情接口<br>* 增加路由表绑定/解绑子网接口<br>* 增加添加、移除、修改路由表规则接口|
|2018-08-20|0.4.1|扩展支持|* Java SDK新增对Android系统的支持|
|2018-08-16|0.4.0|增加新接口|* 增加创建私有网络接口<br>* 增加删除私有网络接口|
|2018-07-26|0.3.0|增加新接口|* 增加查询弹性网卡列表接口<br>* 增加创建网卡接口，只能创建辅助网卡接口<br>* 增加查询弹性网卡信息详情接口<br>* 增加删除弹性网卡接口<br>* 增加修改弹性网卡接口|
|2017-11-31|0.1.0|初始版本|* VPC基本操作接口|
