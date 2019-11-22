package statistics;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StatisticsGroupBy {

    DOMAIN("domain"),
    AREA("area"),
    ISP("isp");

    private String groupBy;
}
