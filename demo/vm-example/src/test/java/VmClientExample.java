import com.google.gson.Gson;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.auth.StaticCredentialsProvider;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.http.Protocol;
import com.jdcloud.sdk.service.charge.model.ChargeSpec;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.service.disk.model.DiskSpec;
import com.jdcloud.sdk.service.vm.client.VmClient;
import com.jdcloud.sdk.service.vm.model.*;
import com.jdcloud.sdk.service.vpc.model.ElasticIpSpec;
import com.jdcloud.sdk.service.vpc.model.NetworkInterfaceSpec;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VmClientExample {

    //1. 设置accessKey和secretKey
    private static String accessKeyId = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
    private static String secretAccessKey = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
    private static CredentialsProvider credentialsProvider = new StaticCredentialsProvider(accessKeyId, secretAccessKey);

    //2. 创建vmClient
    private static VmClient vmClient;
    static {
        vmClient = VmClient.builder()
                .credentialsProvider(credentialsProvider)
                //.httpRequestConfig(new HttpRequestConfig.Builder().protocol(Protocol.HTTP).build()) //默认为HTTPS
                .build();
    }

    /**
     * 创建主机
     */
    @Test
    public void testCreateInstances() {

        InstanceSpec instanceSpec = new InstanceSpec();
        instanceSpec.setAz("cn-north-1a");
        instanceSpec.setInstanceType("g.s1.micro");
        instanceSpec.setImageId("98d44a0f-88c1-451a-8971-f1f769073b6c");
        instanceSpec.setName("sdk-test");
        instanceSpec.setDescription("sdk测试");

        // 主网卡
        NetworkInterfaceSpec networkInterfaceSpec = new NetworkInterfaceSpec();
        networkInterfaceSpec.setSubnetId("subnet-0rtcw49jl0");
        networkInterfaceSpec.setAz("cn-north-1a");
        InstanceNetworkInterfaceAttachmentSpec instanceNetworkInterfaceAttachmentSpec = new InstanceNetworkInterfaceAttachmentSpec();
        instanceNetworkInterfaceAttachmentSpec.setNetworkInterface(networkInterfaceSpec);
        instanceSpec.setPrimaryNetworkInterface(instanceNetworkInterfaceAttachmentSpec);

        // 系统盘
        InstanceDiskAttachmentSpec systemDisk = new InstanceDiskAttachmentSpec();
        systemDisk.setDiskCategory("local");
        instanceSpec.setSystemDisk(systemDisk);

        // 数据盘
        InstanceDiskAttachmentSpec dataDisk1 = new InstanceDiskAttachmentSpec();
        dataDisk1.setDiskCategory("cloud");
        dataDisk1.setAutoDelete(true);
        dataDisk1.setCloudDiskSpec(new DiskSpec());
        dataDisk1.getCloudDiskSpec().setName("sdk-test-disk1");
        dataDisk1.getCloudDiskSpec().setDiskSizeGB(50);
        dataDisk1.getCloudDiskSpec().setDiskType("premium-hdd");

        InstanceDiskAttachmentSpec dataDisk2 = new InstanceDiskAttachmentSpec();
        dataDisk2.setDiskCategory("cloud");
        dataDisk2.setAutoDelete(true);
        dataDisk2.setCloudDiskSpec(new DiskSpec());
        dataDisk2.getCloudDiskSpec().setName("sdk-test-disk2");
        dataDisk2.getCloudDiskSpec().setDiskSizeGB(40);
        dataDisk2.getCloudDiskSpec().setDiskType("ssd");

        List<InstanceDiskAttachmentSpec> dataDisks = new ArrayList<InstanceDiskAttachmentSpec>();
        dataDisks.add(dataDisk1);
        dataDisks.add(dataDisk2);
        instanceSpec.setDataDisks(dataDisks);

        // 公网IP
        ElasticIpSpec elasticIpSpec = new ElasticIpSpec();
        elasticIpSpec.setBandwidthMbps(2);
        elasticIpSpec.setProvider("NO_BGP");
        instanceSpec.setElasticIp(elasticIpSpec);

        // 计费方式
        ChargeSpec chargeSpec = new ChargeSpec();
        chargeSpec.setChargeMode("postpaid_by_duration");

        // 请求创建
        CreateInstancesRequest request = new CreateInstancesRequest();
        request.setRegionId("cn-north-1");
        request.setInstanceSpec(instanceSpec);
        request.setMaxCount(2);
        CreateInstancesResponse response = vmClient.createInstances(request);
        System.out.println(new Gson().toJson(response));
    }

    /**
     * 主机详情
     */
    @Test
    public void testDescribeInstance() {

        //3. 设置请求参数
        DescribeInstanceRequest request = new DescribeInstanceRequest();
        request.regionId("cn-north-1");
        request.instanceId("i-c0se9c2uju");

        //4. 执行请求
        DescribeInstanceResponse response = vmClient.describeInstance(request);

        //5. 处理响应
        System.out.println(new Gson().toJson(response));
    }

    /**
     * 主机列表
     */
    @Test
    public void testDescribeInstances() {

        //3. 设置请求参数
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        request.setPageNumber(1);
        request.setPageSize(10);
        request.regionId("cn-north-1");

        List<Filter> filters = new ArrayList<Filter>();
        Filter f1 = new Filter();
        f1.setName("instanceId");
        f1.setValues(Arrays.asList("i-c0se9c2uju", "i-2a1v2rtlrq"));
        filters.add(f1);
        request.setFilters(filters);

        //4. 执行请求
        DescribeInstancesResponse response = vmClient.describeInstances(request);

        //5. 处理响应
        System.out.println(new Gson().toJson(response));
    }

    /**
     * 查询镜像限制
     */
    @Test
    public void DescribeImageConstraints() {
        DescribeImageConstraintsRequest request = new DescribeImageConstraintsRequest();
        request.setRegionId("cn-north-1");
        request.setImageId("2bb91413-8064-46b7-be31-a56b9c6c3bba");
        DescribeImageConstraintsResponse response = vmClient.describeImageConstraints(request);
        System.out.println(new Gson().toJson(response));
    }

    /**
     * 镜像列表
     */
    @Test
    public void DescribeImages() {
        DescribeImagesRequest request = new DescribeImagesRequest();
        request.setRegionId("cn-north-1");
        request.setImageSource("public");
        DescribeImagesResponse response = vmClient.describeImages(request);
        System.out.println(new Gson().toJson(response));
    }

    /**
     * 镜像详情
     */
    @Test
    public void DescribeImage() {
        DescribeImageRequest request = new DescribeImageRequest();
        request.setRegionId("cn-north-1");
        request.setImageId("1922d294-ba95-4eb1-9269-2569c4f02a55");
        DescribeImageResponse response = vmClient.describeImage(request);
        System.out.println(new Gson().toJson(response));
    }

    /**
     * 规格列表
     */
    @Test
    public void DescribInstanceTypes() {
        Filter filter = new Filter();
        filter.setName("instanceTypes");
        filter.setValues(Arrays.asList("m.n1.14xlarge", "m.n1.2xlarge"));
        DescribeInstanceTypesRequest request = new DescribeInstanceTypesRequest();
        request.setRegionId("cn-south-1");
        request.setFilters(Arrays.asList(filter));
        DescribeInstanceTypesResponse response = vmClient.describeInstanceTypes(request);
        System.out.println(new Gson().toJson(response));
    }

    /**
     * 解绑公网IP
     */
    @Test
    public void DisassociateElasticIp() {
        DisassociateElasticIpRequest request = new DisassociateElasticIpRequest();
        request.setRegionId("cn-north-1");
        request.setInstanceId("i-2a1v2rtlrq");
        request.setElasticIpId("fip-bq9ho5scn1");
        DisassociateElasticIpResponse response = vmClient.disassociateElasticIp(request);
        System.out.println(new Gson().toJson(response));
    }

    /**
     * 绑定公网IP
     */
    @Test
    public void AssociateElasticIp() {
        AssociateElasticIpRequest request = new AssociateElasticIpRequest();
        request.setRegionId("cn-north-1");
        request.setInstanceId("i-2a1v2rtlrq");
        request.setElasticIpId("fip-bq9ho5scn1");
        AssociateElasticIpResponse response = vmClient.associateElasticIp(request);
        System.out.println(new Gson().toJson(response));
    }

    /**
     * 停止主机
     */
    @Test
    public void StopInstance() {
        StopInstanceRequest request = new StopInstanceRequest();
        request.setRegionId("cn-north-1");
        request.setInstanceId("i-2a1v2rtlrq");
        StopInstanceResponse response = vmClient.stopInstance(request);
        System.out.println(new Gson().toJson(response));
    }

    /**
     * 删除主机
     */
    @Test
    public void DeleteInstance() {
        DeleteInstanceRequest request = new DeleteInstanceRequest();
        request.setRegionId("cn-north-1");
        request.setInstanceId("i-2a1v2rtlrq");
        DeleteInstanceResponse response = vmClient.deleteInstance(request);
        System.out.println(new Gson().toJson(response));
    }

    /**
     * 启动主机
     */
    @Test
    public void StartInstance() {
        StartInstanceRequest request = new StartInstanceRequest();
        request.setRegionId("cn-north-1");
        request.setInstanceId("i-pb1abwvlrk");
        StartInstanceResponse response = vmClient.startInstance(request);
        System.out.println(new Gson().toJson(response));
    }

    /**
     * 重启主机
     */
    @Test
    public void RebootInstance() {
        RebootInstanceRequest request = new RebootInstanceRequest();
        request.setRegionId("cn-north-1");
        request.setInstanceId("i-pb1abwvlrk");
        RebootInstanceResponse response = vmClient.rebootInstance(request);
        System.out.println(new Gson().toJson(response));
    }

    /**
     * 创建私有镜像
     */
    @Test
    public void CreateImage() {
        CreateImageRequest request = new CreateImageRequest();
        request.setRegionId("cn-north-1");
        request.setInstanceId("i-pb1abwvlrk");
        request.setName("sdk1");
        request.setDescription("sdk-testing");
        CreateImageResponse response = vmClient.createImage(request);
        System.out.println(new Gson().toJson(response));
    }
}
