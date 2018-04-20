import com.google.gson.Gson;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.auth.StaticCredentialsProvider;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.service.vpc.client.VpcClient;
import com.jdcloud.sdk.service.vpc.model.*;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;
import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VpcClientExample {
    private VpcClient vpcClient;
    private static String region = "cn-north-1";
    private static String elasticIpId = "fip-mglttui2eo";
    private static String networkInterfaceId = "port-sn39xqz6bb";
    private static String computPortId = "port-hmrm9xkvdv";
    private static String localVpcId = "vpc-l4bln7b9sj";
    private static String remoteVpcId = "vpc-qgq9t2pf5c";
    private static String vpcPeeringName = "vpc_peering_test";
    private static String subnetId = "subnet-62yh6pq4wl";
    private static String securityGroupId = "sg-ss9eubpivb";

    @Before
    public void init() {
        String accessKeyId = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        String secretAccessKey = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        CredentialsProvider credentialsProvider = new StaticCredentialsProvider(accessKeyId, secretAccessKey);
        this.vpcClient = VpcClient.builder()
                .credentialsProvider(credentialsProvider)
                .build();
    }

    @Test
    public void testADescribeElasticIps() {
        System.out.println("========DescribeElasticIps=======");
        DescribeElasticIpsRequest request = new DescribeElasticIpsRequest();
        request.regionId(region);
        request.setPageNumber(1);
        request.setPageSize(100);
        Filter ipAddressFilter = new Filter();
        request.addFilter(ipAddressFilter);
        DescribeElasticIpsResponse response = vpcClient.describeElasticIps(request);
        System.out.println(new Gson().toJson(response));
        System.out.println();
    }

    @Test
    public void testBDescribeElasticIp() {
        System.out.println("========DescribeElasticIp=======");
        DescribeElasticIpRequest request = new DescribeElasticIpRequest();
        request.regionId(region);
        request.setElasticIpId(elasticIpId);
        DescribeElasticIpResponse response = vpcClient.describeElasticIp(request);
        System.out.println(new Gson().toJson(response));
        System.out.println();
    }

    @Test
    public void testCDescribeVpcs() {
        System.out.println("=========DescribeVpcs=========");
        DescribeVpcsRequest request = new DescribeVpcsRequest();
        request.regionId(region);
        request.setPageNumber(1);
        request.setPageSize(100);

        Filter filter = new Filter();
        request.addFilter(filter);
        DescribeVpcsResponse response = vpcClient.describeVpcs(request);
        System.out.println(new Gson().toJson(response));
        System.out.println();
    }


    @Test
    public void testDDescribeVpc() {
        System.out.println("=========DescribeVpc=======");
        DescribeVpcRequest request = new DescribeVpcRequest();
        request.regionId(region);
        request.vpcId(localVpcId);
        DescribeVpcResponse response = vpcClient.describeVpc(request);
        System.out.println(new Gson().toJson(response));
        System.out.println();
    }


    @Test
    public void testEDescribeSubnets() {
        System.out.println("=========DescribeSubnets========");
        DescribeSubnetsRequest request = new DescribeSubnetsRequest();
        request.regionId(region);
        request.setPageNumber(1);
        request.setPageSize(100);

        Filter filter = new Filter();
        request.addFilter(filter);
        DescribeSubnetsResponse response = vpcClient.describeSubnets(request);
        System.out.println(new Gson().toJson(response));
        System.out.println();
    }

    @Test
    public void testFDescribeSubnet() {
        System.out.println("==========DescribeSubnet========");
        DescribeSubnetRequest request = new DescribeSubnetRequest();
        request.regionId(region);
        request.subnetId(subnetId);
        DescribeSubnetResponse response = vpcClient.describeSubnet(request);
        System.out.println(new Gson().toJson(response));
        System.out.println();
    }

    @Test
    public void testJDescribeSecurityGroup() {
        DescribeNetworkSecurityGroupRequest request = new DescribeNetworkSecurityGroupRequest();
        request.regionId(region);
        request.networkSecurityGroupId(securityGroupId);
        DescribeNetworkSecurityGroupResponse response = vpcClient.describeNetworkSecurityGroup(request);
        System.out.println(new Gson().toJson(response));
    }


    @Test
    public void testJDisAssociateElasticIps() {
        System.out.println("=========AssociateElasticIps=========");
        DisassociateElasticIpRequest disassociateEipRequest = new DisassociateElasticIpRequest();
        disassociateEipRequest.regionId(region);
        disassociateEipRequest.networkInterfaceId(networkInterfaceId);
        disassociateEipRequest.elasticIpId(elasticIpId);
        DisassociateElasticIpResponse response = vpcClient.disassociateElasticIp(disassociateEipRequest);
        System.out.println(new Gson().toJson(response));
        System.out.println();
    }

    @Test
    public void testKAssociateElasticIps() {
        System.out.println("=========AssociateElasticIps=========");
        AssociateElasticIpRequest associateEipRequest = new AssociateElasticIpRequest();
        associateEipRequest.regionId(region);
        associateEipRequest.networkInterfaceId(this.networkInterfaceId);
        associateEipRequest.elasticIpId(this.elasticIpId);
        AssociateElasticIpResponse response = vpcClient.associateElasticIp(associateEipRequest);
        System.out.println(new Gson().toJson(response));
        System.out.println();
    }


    @Test
    public void testLUnAssignSecondaryIps() {
        System.out.println("=========UnAssignSecondaryIps=========");
        UnassignSecondaryIpsRequest unassignSecondaryIpsRequest = new UnassignSecondaryIpsRequest();
        unassignSecondaryIpsRequest.regionId(region);
        unassignSecondaryIpsRequest.networkInterfaceId(computPortId);
        List<String> secondaryIps = new ArrayList();
        secondaryIps.add("169.254.169.253");
        secondaryIps.add("169.254.169.252");
        unassignSecondaryIpsRequest.secondaryIps(secondaryIps);
        UnassignSecondaryIpsResponse response = vpcClient.unassignSecondaryIps(unassignSecondaryIpsRequest);
        System.out.println(new Gson().toJson(response));
        System.out.println();
    }

    @Test
    public void testMAssignSecondaryIps() {
        System.out.println("=========AssignSecondaryIps=========");
        AssignSecondaryIpsRequest assignSecondaryIpsRequest = new AssignSecondaryIpsRequest();
        assignSecondaryIpsRequest.regionId(region);
        assignSecondaryIpsRequest.networkInterfaceId(computPortId);
        List<String> secondaryIps = new ArrayList();
        secondaryIps.add("169.254.169.253");
        secondaryIps.add("169.254.169.252");
        assignSecondaryIpsRequest.secondaryIps(secondaryIps);
        AssignSecondaryIpsResponse response = vpcClient.assignSecondaryIps(assignSecondaryIpsRequest);
        System.out.println(new Gson().toJson(response));
        System.out.println();
    }

    @Test
    public void testNCreateVpcPeering() {
        System.out.println("==========CreateVpcPeering========");
        CreateVpcPeeringRequest request = new CreateVpcPeeringRequest();
        request.regionId(region);
        request.vpcPeeringName(vpcPeeringName);
        request.vpcId(localVpcId);
        request.remoteVpcId(remoteVpcId);
        CreateVpcPeeringResponse response = vpcClient.createVpcPeering(request);
        System.out.println(new Gson().toJson(response));
        System.out.println();
    }

    @Test
    public void testODescribeVpcPeerings() {
        System.out.println("========DescribeVpcPeerings=======");
        DescribeVpcPeeringsRequest request = new DescribeVpcPeeringsRequest();
        request.regionId(region);
        request.setPageNumber(1);
        request.setPageSize(100);
        Filter filter = new Filter();
        request.addFilter(filter);
        DescribeVpcPeeringsResponse response = vpcClient.describeVpcPeerings(request);
        System.out.println(new Gson().toJson(response));
        System.out.println();
    }

    @Test
    public void testPDescribeVpcPeering() {
        System.out.println("======DescribeVpcPeering=======");
        DescribeVpcPeeringsRequest request = new DescribeVpcPeeringsRequest();
        request.regionId(region);
        request.setPageNumber(1);
        request.setPageSize(100);
        Filter filter = new Filter();
        filter.setName("vpcPeeringNames");
        List names = new ArrayList();
        names.add(vpcPeeringName);
        filter.setValues(names);
        request.addFilter(filter);
        DescribeVpcPeeringsResponse response = vpcClient.describeVpcPeerings(request);

        List<VpcPeering> vpcPeerings = response.getResult().getVpcPeerings();
        if (vpcPeerings.size() > 0) {
            String vpcPeeringId = vpcPeerings.get(0).getVpcPeeringId();
            DescribeVpcPeeringRequest request2 = new DescribeVpcPeeringRequest();
            request2.regionId(region);
            request2.vpcPeeringId(vpcPeeringId);
            DescribeVpcPeeringResponse response2 = vpcClient.describeVpcPeering(request2);
            System.out.println(new Gson().toJson(response2));
        }
        System.out.println();
    }

    @Test
    public void testQDeleteVpcPeerings() {
        System.out.println("======DeleteVpcPeerings========");
        DescribeVpcPeeringsRequest request = new DescribeVpcPeeringsRequest();
        request.regionId(region);
        request.setPageNumber(1);
        request.setPageSize(100);
        Filter filter = new Filter();
        filter.setName("vpcPeeringNames");
        List names = new ArrayList();
        names.add(vpcPeeringName);
        filter.setValues(names);
        request.addFilter(filter);
        DescribeVpcPeeringsResponse response = vpcClient.describeVpcPeerings(request);
        List<VpcPeering> vpcPeerings = response.getResult().getVpcPeerings();
        if (vpcPeerings.size() > 0) {
            String vpcPeeringId = vpcPeerings.get(0).getVpcPeeringId();
            DeleteVpcPeeringRequest deleteRequest = new DeleteVpcPeeringRequest();
            deleteRequest.regionId(region);
            deleteRequest.vpcPeeringId(vpcPeeringId);

            DeleteVpcPeeringResponse deleteResponse = vpcClient.deleteVpcPeering(deleteRequest);
            System.out.println(new Gson().toJson(deleteResponse));
        }
        System.out.println();
    }

}
