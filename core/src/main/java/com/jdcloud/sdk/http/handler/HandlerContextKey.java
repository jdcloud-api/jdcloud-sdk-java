package com.jdcloud.sdk.http.handler;

import com.jdcloud.sdk.utils.AttributeMap;

/**
 *
 * <pre class="brush: java">
 *     final HandlerContextKey&lt;String&gt; METRICS_KEY = new HandlerContextKey("METRICS_KEY");
 *
 *      new RequestHandler(){
 *
 *          {@literal @}Override
 *          public void beforeRequest(Request&lt;?&gt; request) {
 *              request.addHandlerContext(METRICS_KEY, AWSRequestMetrics.Field.HttpRequestTime.name());
 *          }
 *
 *          {@literal @}Override
 *          public void afterResponse(Request&lt;?&gt; request, Response&lt;?&gt; response) {
 *              String metricsKey = request.getHandlerContext(METRICS_KEY);
 *          }
 *
 *          {@literal @}Override
 *          public void afterError(Request&lt;?&gt; request, Response&lt;?&gt; response, Exception e) { }
 *      }
 * </pre>
 */
public class HandlerContextKey<T> extends AttributeMap.Key<T> {

    private final String name;

    public HandlerContextKey(Class<T> clzz, String name) {
        super(clzz);
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        HandlerContextKey<?> key = (HandlerContextKey<?>) o;

        return name.equals(key.getName());

    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
