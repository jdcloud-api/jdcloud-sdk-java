package statistics;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum LiveStatGroupBy {
    APPNAME("appname"),
    STREAMNAME("streamname"),
    DOMAIN("domain"),
    AREA("area"),
    ISP("isp");

    private String groupBy;
}
