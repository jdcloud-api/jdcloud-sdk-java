package statistics;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 点播统计查询字段
 */

@Getter
@AllArgsConstructor
public   enum VodQueryField{

    AVGBANDWIDTH("avgbandwidth"),
    AVGORIBANDWIDTH("avgoribandwidth"),
    MAXAVGBANDWIDTHTIME("maxavgbandwidthtime"),
    MAXAVGORIBANDWIDTHTIME("maxavgoribandwidthtime"),
    PV("pv"),
    HITPV("hitpv"),
    HITFLOW("hitflow"),
    FLOW("flow"),
    ORIPV("oripv"),
    ORIFLOW("oriflow");
    private String field;
}

