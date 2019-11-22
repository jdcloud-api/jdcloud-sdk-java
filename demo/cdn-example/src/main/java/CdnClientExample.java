import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.auth.StaticCredentialsProvider;
import com.jdcloud.sdk.model.ServiceError;
import com.jdcloud.sdk.service.cdn.client.CdnClient;



import com.jdcloud.sdk.service.cdn.model.*;
import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import statistics.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public class CdnClientExample {

    //1. 设置accessKey和secretKey
    private static String accessKeyId = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
    private static String secretAccessKey = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
    private static CredentialsProvider credentialsProvider = new StaticCredentialsProvider(accessKeyId, secretAccessKey);

    //2. 创建cdnClient
    private static CdnClient cdnClient;
    static {
        cdnClient = CdnClient.builder()
                .credentialsProvider(credentialsProvider)
                //.httpRequestConfig(new HttpRequestConfig.Builder().protocol(Protocol.HTTP).build()) //默认为HTTPS
                .build();
    }

    private final String QUERY_FILED = "avgbandwidth,flow,pv";


    /**
     * 注意：
     * 统计查询接口，仅以点播为详细示例，其他类似
     */

    /**
     * 点播统计查询
     */
    @Test
    public  void queryStatisticsData(){
        QueryStatisticsDataRequest request = new QueryStatisticsDataRequest();
        request.setDomain("www.domain.com");
        request.setStartTime("2019-11-01T08:10:00Z");
        request.setEndTime("2019-11-01T08:15:00Z");
        request.setFields(QUERY_FILED);
        request.setPeriod(QueryPeriod.FIVEMIN.getPeirod());
        final QueryStatisticsDataResponse response = cdnClient.queryStatisticsData(request);
        String requestId = response.getRequestId();//请求唯一标识Id,供排查问题使用
        ServiceError error = response.getError();//发生异常时的异常信息
        //对响应数据获取
        QueryStatisticsDataResult result = response.getResult();
        if(!Optional.ofNullable(result).map(resultData ->resultData.getStatistics()).isPresent()){
            for (StatisticsDataItem statistic : result.getStatistics()) {
                String startTime = statistic.getStartTime();//data数据的起始时间
                String endTime = statistic.getEndTime();//data数据的结束时间
                Object data = statistic.getData();
                if(data != null){
                    Map<String,Object> queryDataMap = (Map<String, Object>) data;
                    Long avgbandwidth = Long.parseLong(queryDataMap.getOrDefault(VodQueryField.AVGBANDWIDTH.getField(), 0L).toString());
                    Long flow = Long.parseLong(queryDataMap.getOrDefault(VodQueryField.FLOW.getField(), 0L).toString());
                    Long pv = Long.parseLong(queryDataMap.getOrDefault(VodQueryField.PV.getField(), 0L).toString());
                }
            }
        }

    }

    /**
     * 点播分地域运营商查询
     */
    @Test
    public void queryStatisticsDataGroupByArea(){
        QueryStatisticsDataGroupByAreaRequest request = new QueryStatisticsDataGroupByAreaRequest();
        request.setDomain("www.domain.com");
        request.setStartTime("2019-01-16T16:00:00Z");
        request.setEndTime("2019-01-17T02:00:00Z");
        request.setFields(QUERY_FILED);
        request.setPeriod(QueryPeriod.FIVEMIN.getPeirod());
        QueryStatisticsDataGroupByAreaResponse response = cdnClient.queryStatisticsDataGroupByArea(request);
        if(Optional.ofNullable(response.getResult()).map(resultData ->resultData.getStatistics()).isPresent()){
            List<StatisticsWithAreaGroupDetail> statistics = response.getResult().getStatistics();
            for (StatisticsWithAreaGroupDetail statistic : statistics) {
                List<StatisticsWithAreaGroupDetailItem> data = statistic.getData();
                if(CollectionUtils.isNotEmpty(data)){
                    for (StatisticsWithAreaGroupDetailItem datum : data) {
                        String area = datum.getArea();
                        List<Object> ispStat = datum.getIspStat();
                        for (Object ispData : ispStat) {
                            if(ispData != null){
                                Map<String,Object> ispDataMap = (Map<String, Object>) ispData;
                                String isp = ispDataMap.getOrDefault("Isp","").toString();
                                Long avgbandwidth = Long.parseLong(ispDataMap.getOrDefault(VodQueryField.AVGBANDWIDTH.getField(),0L).toString());
                            }
                        }
                    }
                }

            }
        }
    }

    /**
     * 点播域名分组查询
     */
    @Test
    public  void queryStatisticsDataGroupSum(){
        QueryStatisticsDataGroupSumRequest request = new QueryStatisticsDataGroupSumRequest();
        request.setDomain("www.test1.com,www.test1.com");
        request.setStartTime("2019-01-16T16:00:00Z");
        request.setEndTime("2019-01-17T02:00:00Z");
        request.setGroupBy(StatisticsGroupBy.DOMAIN.getGroupBy());
        request.setFields(QUERY_FILED);
        request.setPeriod(QueryPeriod.FIVEMIN.getPeirod());
        QueryStatisticsDataGroupSumResponse response = cdnClient.queryStatisticsDataGroupSum(request);
        if(Optional.ofNullable(response.getResult()).map(result ->result.getStatistics()).isPresent()){
            List<StatisticsGroupSumDataItem> statistics = response.getResult().getStatistics();
            for (StatisticsGroupSumDataItem statistic : statistics) {
                Object data = statistic.getData();
                if(data != null){
                    Map<String,Object> dataMap = (Map<String, Object>) data;
                    for (String groupKey : dataMap.keySet()) {
                        Object groupKeyValue = dataMap.get(groupKey);
                        if(groupKeyValue != null){
                            Map<String,Object> groupKeyValueMap = (Map<String, Object>) groupKeyValue;
                            Long avgbandwidth = Long.parseLong(groupKeyValueMap.getOrDefault(VodQueryField.AVGBANDWIDTH.getField(),0L).toString());
                        }
                    }
                }
            }
        }
    }

    /**
     * 直播域名统计字段查询
     */
    @Test
    public void queryLiveStatisticsData(){
        QueryLiveStatisticsDataRequest request = new QueryLiveStatisticsDataRequest();
        request.setDomain("www.live.play.com");
        request.setStartTime("2019-09-21T05:15:00Z");
        request.setEndTime("2019-10-21T05:20:00Z");
        request.setFields(QUERY_FILED);
        request.setPeriod(QueryPeriod.FIVEMIN.getPeirod());
        request.setReqMethod(LiveReqMethod.PLAY.getReqMethod());
        request.setAppName("889847");
        QueryLiveStatisticsDataResponse response = cdnClient.queryLiveStatisticsData(request);

    }

    /*
    直播域名分地域运营商查询
     */
    @Test
    public  void queryLiveStatisticsAreaDataGroupBy(){
        QueryLiveStatisticsAreaDataGroupByRequest request = new QueryLiveStatisticsAreaDataGroupByRequest();
        request.setDomain("www.domain.com");
        request.setStartTime("2019-05-10T16:00:00Z");
        request.setEndTime("2019-05-16T06:44:36Z");
        request.setReqMethod(LiveReqMethod.PLAY.getReqMethod());
        request.setFields(QUERY_FILED);
        request.setPeriod(QueryPeriod.FIVEMIN.getPeirod());
        request.setArea("beijing");
        request.setGroupBy(LiveStatGroupBy.ISP.getGroupBy());
        QueryLiveStatisticsAreaDataGroupByResponse response = cdnClient.queryLiveStatisticsAreaDataGroupBy(request);

    }

    /*
    直播域名分组查询
     */
    @Test
    public  void queryLiveTrafficGroupSum(){
        QueryLiveTrafficGroupSumRequest   request = new QueryLiveTrafficGroupSumRequest();
        request.setDomain("www.live.com");
        request.setStartTime("2019-10-10T05:23:41Z");
        request.setEndTime("2019-10-10T05:29:44Z");
        request.setGroupBy(LiveStatGroupBy.STREAMNAME.getGroupBy());
        request.setReqMethod(LiveReqMethod.INGEST.getReqMethod());
        request.setFields(LiveQueryField.AVGUPBANDWIDTH.getField());//播放域名的回源带宽
        request.setPeriod(QueryPeriod.ONEMIN.getPeirod());
        QueryLiveTrafficGroupSumResponse response = cdnClient.queryLiveTrafficGroupSum(request);
    }


    /**
     * 直播点播域名常用字段查询
     */
    @Test
    public void queryMixStatisticsData(){
        QueryMixStatisticsDataRequest request = new QueryMixStatisticsDataRequest();
        request.setDomain("www.domain.com");
        request.setStartTime("2019-01-17T16:00:00Z");
        request.setEndTime("2019-01-18T02:00:00Z");
        request.setFields(QUERY_FILED);
        request.setPeriod(QueryPeriod.FIVEMIN.getPeirod());
        QueryMixStatisticsDataResponse response = cdnClient.queryMixStatisticsData(request);
    }

    @Test
    public void queryMixStatisticsWithAreaData(){
        QueryMixStatisticsWithAreaDataRequest request = new QueryMixStatisticsWithAreaDataRequest();
        request.setDomain("www.test1.com,www.live.com");
        request.setStartTime("2019-01-16T16:00:00Z");
        request.setEndTime("2019-01-17T02:00:00Z");
        request.setFields(QUERY_FILED);
        request.setPeriod(QueryPeriod.FOLLOWTIME.getPeirod());
        request.setArea("guangdong");
        QueryMixStatisticsWithAreaDataResponse response = cdnClient.queryMixStatisticsWithAreaData(request);
    }

    @Test
    public  void queryMixTrafficGroupSum(){
        QueryMixTrafficGroupSumRequest request = new QueryMixTrafficGroupSumRequest();
        request.setDomain("www.domain.com");
        request.setStartTime("2019-01-21T03:00:00Z");
        request.setEndTime("2019-01-21T03:05:00Z");
        request.setGroupBy(StatisticsGroupBy.DOMAIN.getGroupBy());
        request.setFields(QUERY_FILED);
        request.setPeriod(QueryPeriod.FIVEMIN.getPeirod());
        QueryMixTrafficGroupSumResponse response = cdnClient.queryMixTrafficGroupSum(request);
    }






}
