
# 简介 #
  欢迎使用京东云开发者Java工具套件（Java SDK）。使用京东云Java SDK，您无需复杂编程就可以访问京东云提供的各种服务。 

  为了方便您理解SDK中的一些概念和参数的含义，使用SDK前建议您先查看[OpenAPI使用入门](http://www.jdcloud.com/help/detail/355/isCatalog/0)。要了解每个API的具体参数和含义，请参考程序注释或参考OpenAPI&SDK下具体产品线的API文档。

# 环境准备 #
1.     京东云Java SDK适用于jdk7及以上版本。
2.     在开始调用京东云open API之前，需提前在京东云用户中心账户管理下的[AccessKey管理页面](https://uc.jdcloud.com/accesskey/index)申请accesskey和secretKey密钥对（简称AK/SK）。AK/SK信息请妥善保管，如果遗失可能会造成非法用户使用此信息操作您在云上的资源，给你造成数据和财产损失。

# SDK使用方法 #
如果您使用Apache Maven来管理Java项目，只需在项目的pom.xml文件加入相应的依赖项即可，如下所示：
 
	<dependency>
	    <groupId>com.jdcloud.sdk</groupId>
	    <artifactId>core</artifactId>
	    <version>1.0.0</version>
	</dependency>
	<!-- 对应产品线的SDK -->
	<dependency>
	    <groupId>com.jdcloud.sdk</groupId>
	    <artifactId>vm</artifactId>
	    <version>0.6.0</version>
	</dependency>
 
您还可以下载sdk源代码自行使用。
 
SDK使用中的任何问题，欢迎您在Issues页面交流。

**注意：京东云并没有提供其他下载方式，请务必使用上述官方下载方式！**
 
# 调用SDK #
Java SDK的调用主要分为4步：

1.     设置accessKey和secretKey
 
2.     创建Client
   
3.     设置请求参数
   
4.     执行请求得到响应

以下是查询单个云主机实例详情的调用示例
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
