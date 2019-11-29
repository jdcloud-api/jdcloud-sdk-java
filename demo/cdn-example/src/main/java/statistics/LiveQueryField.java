package statistics;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 直播统计查询字段
 */
@AllArgsConstructor
@Getter
public enum LiveQueryField {

    AVGBANDWIDTH("avgbandwidth"),
    MAXAVGBANDWIDTHTIME("maxavgbandwidthtime"),
    PV("pv"),
    AVGORIBANDWIDTH("avgoribandwidth"),
    PLAYERCOUNT("playercount"),
    FLOW("flow"),
    UPFLOW("upflow"),
    AVGUPBANDWIDTH("avgupbandwidth"),
    MAXAVGUPBANDWIDTHTIME("maxavgupbandwidthtime"),
    LIVEAVGSPEED("liveavgspeed"),
    AVGUPSPEED("avgupspeed"),
    AVGFRAMERATE("avgframerate"),
    AVGUPFRAMERATE("avgupframerate");
    private String field;
}
