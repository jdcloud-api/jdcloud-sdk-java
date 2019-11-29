package statistics;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 统计查询周期
 */
@Getter
@AllArgsConstructor
public   enum QueryPeriod{

    ONEMIN("oneMin"),
    FIVEMIN("fiveMin"),
    HALFHOUR("halfHour"),
    HOUR("hour"),
    TWOHOUR("twoHour"),
    SIXHOUR("sixHour"),
    DAY("day"),
    FOLLOWTIME("followTime");//返回查询时间段的一个数据
    private String peirod;
}
