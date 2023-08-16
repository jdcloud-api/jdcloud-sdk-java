# 更新历史 #
API版本：1.3.1

|发布时间|版本号|更新|说明|
|---|---|---|---|
|2022-11-30|1.3.1|增加新参数|* 修改vif创建接口和更新接口，支持healthcheck|
|2020-03-10|1.3.0|增加新街口|* 修改createConnection接口，上行参数添加locationPortSpecId、locationISPId字段<br>* 修改describeConnections和describeConnection接口，返回locationPortSpec和locationISP信息<br>* 增加describeLocationPortSpecs和describeLocationPortSpec接口，查询locationPortSpec信息<br>* 增加describeLocationISPs和describeLocationISP接口，返回locationISP信息<br>* 修改modifyConnection接口,添加新计费项，端口占用费和流量使用费|
|2019-09-20|1.2.0|增加新接口|* 增加createVpnConnection<br>* 增加describeVpnConnections<br>* 增加describeVpnConnection<br>* 增加modifyVpnConnection<br>* 增加deleteVpnConnection<br>* 增加createVpnTunnel<br>* 增加describeVpnTunnels<br>* 增加describeVpnTunnel<br>* 增加modifyVpnTunnel<br>* 增加deleteVpnTunnel<br>* 增加修改VPN隧道管理状态modifyAdminStatus<br>* 增加createCustomerGateway<br>* 增加describeCustomerGateways<br>* 增加describeCustomerGateway<br>* 增加modifyCustomerGateway<br>* 增加deleteCustomerGateway|
|2019-08-17|1.1.0|增加新接口|* 增加CreateVpcAttachment<br>* 增加DeleteVpcAttachment<br>* 增加DescribeVpcAttachment和DescribeVpcAttachments接口<br>* 增加ModifyVpcAttachment<br>* 修改DescribeBgws和DescribeBgw接口，返回 Bgw上vpc接口Id列表<br>* 修改CreateBgwRoutes接口，增加、修改bgwRouteType、origin、description等信息<br>* 修改ModifyBgwRoutes接口，增加、修改bgwRouteType、description等信息<br>* 修改DescribeBgwRoutes接口，传播路由只展示优选路由，增加查询过滤条件，返回静态、动态、未生效路由数及新增routes属性等<br>* 查询和修改配额接口支持vpcAttachment、bgwRouter(传播)|
|2018-11-26|1.0.0|增加新接口|* 增加边界网关的创建、修改、删除、查询列表、查询详情接口<br>* 增加边界网关路由的创建、修改、删除、查询列表接口<br>* 增加私有虚拟连接的创建、修改、删除、查询列表、查询详情接口<br>* 增加连接的创建、修改、删除、查询列表、查询详情接口<br>* 增加合作伙伴查询连接资源列表接口<br>* 增加合作伙伴修改连接状态接口<br>* 增加查询Location列表、详情接口<br>* 增加查询合作伙伴列表、详情接口<br>* 增加查询配额接口|
