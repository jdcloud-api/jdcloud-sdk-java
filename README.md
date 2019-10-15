
# 简介 #

[![Build Status](https://travis-ci.com/jdcloud-api/jdcloud-sdk-java.svg?branch=master)](https://travis-ci.com/jdcloud-api/jdcloud-sdk-java)

  欢迎使用京东云开发者Java工具套件（Java SDK）。使用京东云Java SDK，您无需复杂编程就可以访问京东云提供的各种服务。 

  为了方便您理解SDK中的一些概念和参数的含义，使用SDK前建议您先查看[OpenAPI使用入门](http://www.jdcloud.com/help/detail/355/isCatalog/0)。要了解每个API的具体参数和含义，请参考程序注释或参考OpenAPI&SDK下具体产品线的API文档。

# 环境准备 #
1. 京东云Java SDK适用于jdk7及以上版本。
2. 在开始调用京东云open API之前，需提前在京东云用户中心账户管理下的[AccessKey管理页面](https://uc.jdcloud.com/accesskey/index)申请accesskey和secretKey密钥对（简称AK/SK）。AK/SK信息请妥善保管，如果遗失可能会造成非法用户使用此信息操作您在云上的资源，给你造成数据和财产损失。

# SDK使用方法 #
如果您使用Apache Maven来管理Java项目，只需在项目的pom.xml文件加入相应的依赖项即可，如下所示：
 
```xml
<!-- 对应产品线的SDK -->
<dependency>
	<groupId>com.jdcloud.sdk</groupId>
	<artifactId>vm</artifactId>
	<version>1.2.0</version>
</dependency>
```
 
您还可以下载sdk源代码自行使用。
 
SDK使用中的任何问题，欢迎您在Issues页面交流。

**注意：**

- 京东云并没有提供其他下载方式，请务必使用上述官方下载方式！

- version 的版本号需要使用京东云产品提供的最新版本号。例如：示例中VM所使用的最新版本号可到官方提供的API  [更新历史](https://docs.jdcloud.com/cn/virtual-machines/api/changelog)  中查询到。

- 每支云产品都有自己的Client，当调用该产品API时，需使用该产品的Client。例如：使用云主机的VmClient只能调用云主机（Vm）的接口；使用高可用组的AgClient只能调用高可用组（Ag）的接口。

# 调用SDK #
Java SDK的调用主要分为4步：

1. 设置accessKey和secretKey
2. 创建Client
3. 设置请求参数
4. 执行请求得到响应

以下是查询单个云主机实例详情的调用示例

```java
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.auth.StaticCredentialsProvider;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.http.Protocol;
import com.jdcloud.sdk.service.vm.client.VmClient;
import com.jdcloud.sdk.service.vm.model.*;

public class VmClientExample {

    public static void main(String[] args) {
        //1. 设置accessKey和secretKey
        String accessKeyId = "{accessKey}";
        String secretAccessKey = "{secretKey}";
        CredentialsProvider credentialsProvider = new StaticCredentialsProvider(accessKeyId, secretAccessKey);

        //2. 创建XXXClient
        VmClient vmClient = VmClient.builder()
                .credentialsProvider(credentialsProvider)
                .httpRequestConfig(new HttpRequestConfig.Builder().protocol(Protocol.HTTPS).build()) //默认为HTTPS
                .build();

        //3. 设置请求参数
        DescribeInstanceRequest request = new DescribeInstanceRequest();
        request.regionId("cn-north-1");
        request.instanceId("i-c0se9uju");

        //4. 执行请求
        DescribeInstanceResponse response = vmClient.describeInstance(request);

        //5. 处理响应
        System.out.println(new Gson().toJson(response));

    }
}
```

如果需要设置额外的header，例如要调用开启了MFA操作保护的接口，需要传递x-jdcloud-security-token，则按照如下方式：
```
vmClient.setCustomHeader("x-jdcloud-security-token", "xxxx");
```

如果需要设置访问点，配置超时等，请参考如下更复杂的例子：
```
        Environment env = new Environment.Builder().endpoint("nativecontainer.internal.cn-north-1.jdcloud-api.com").build(); //指定非默认Endpoint Step1

        //2. 创建ncClient
        NativecontainerClient ncClient = NativecontainerClient.builder()
                .credentialsProvider(credentialsProvider)
                .httpRequestConfig(new HttpRequestConfig.Builder()
                        .connectionTimeout(10000) //设置连接超时为10s
                        .socketTimeout(10000) //设置读响应超时为10s
                        .protocol(Protocol.HTTP) //设置使用HTTP而不是HTTPS，vpc专用域名不支持HTTPS
                        .build()) //默认为HTTPS
                .environment(env)  //指定非默认Endpoint Step2
                .build();
```

如果需要读取请求response的各种信息（例如某个header的值），可按照如下方式：
```
HttpHeaders headers = response.getJdcloudHttpResponse().getHeaders();
List<String> headerValue = headers.getHeaderStringValues("headerKey");
```

更多调用示例参考  [SDK使用Demo](https://github.com/jdcloud-api/jdcloud-sdk-java/tree/master/demo)
