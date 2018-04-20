import com.google.gson.Gson;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.auth.StaticCredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.http.Protocol;
import com.jdcloud.sdk.service.nc.client.NcClient;
import com.jdcloud.sdk.service.nc.model.DescribeQuotaRequest;
import com.jdcloud.sdk.service.nc.model.DescribeQuotaResponse;
import org.junit.Assert;
import org.junit.Test;

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

        //2. 创建ncClient
        NcClient ncClient = NcClient.builder()
                .credentialsProvider(credentialsProvider)
                .httpRequestConfig(new HttpRequestConfig.Builder().protocol(Protocol.HTTP).build()) //默认为HTTPS
                .build();

        //3. 设置请求参数
        DescribeQuotaRequest request = new DescribeQuotaRequest();
        request.regionId("cn-north-1");
        request.setResourceType("container");

        //5. 执行请求
        DescribeQuotaResponse response = ncClient.describeQuota(request);

        //6. 处理响应
        String result = new Gson().toJson(response);
        System.out.println(result);
        Assert.assertFalse(result.contains("error"));
    }

}
