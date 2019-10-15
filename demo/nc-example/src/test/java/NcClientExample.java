import com.google.api.client.http.HttpHeaders;
import com.google.gson.Gson;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.auth.StaticCredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.http.Protocol;
import com.jdcloud.sdk.service.nativecontainer.client.NativecontainerClient;
import com.jdcloud.sdk.service.nativecontainer.model.DescribeQuotaRequest;
import com.jdcloud.sdk.service.nativecontainer.model.DescribeQuotaResponse;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Author xumanyi1
 * 2017/12/18
 * 08:20
 * function
 */
public class NcClientExample {
    @Test
    public void testDescribeQuota() {

        //1. 设置accessKey和secretKey
        String accessKeyId = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        String secretAccessKey = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        CredentialsProvider credentialsProvider = new StaticCredentialsProvider(accessKeyId, secretAccessKey);

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

        //3. 设置请求参数
        DescribeQuotaRequest request = new DescribeQuotaRequest();
        request.regionId("cn-north-1");
        request.setResourceType("container");

        //5. 执行请求
        DescribeQuotaResponse response = ncClient.describeQuota(request);

        HttpHeaders headers = response.getJdcloudHttpResponse().getHeaders();
        List<String> headerValue = headers.getHeaderStringValues("headerKey");

        //6. 处理响应
        String result = new Gson().toJson(response);
        System.out.println(result);
        Assert.assertFalse(result.contains("error"));
    }

}
