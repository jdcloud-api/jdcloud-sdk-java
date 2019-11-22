package statistics;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LiveReqMethod {

    INGEST("ingest"),//回源
    PLAY("play"),
    PUBLISH("publish");

    private String reqMethod;
}
