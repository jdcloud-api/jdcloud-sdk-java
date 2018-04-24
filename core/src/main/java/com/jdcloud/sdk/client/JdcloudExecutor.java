package com.jdcloud.sdk.client;

import com.google.api.client.http.*;
import com.google.gson.*;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.auth.sign.SignatureComposer;
import com.jdcloud.sdk.http.SdkHttpMethod;
import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.model.SignRequest;
import com.jdcloud.sdk.service.JdcloudRequest;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.utils.Base64Utils;
import com.jdcloud.sdk.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * openapi请求封装
 */
@SuppressWarnings("rawtypes")
public abstract class JdcloudExecutor {

    private static Logger logger = LoggerFactory.getLogger(JdcloudExecutor.class);
    private static String dateFormat = "yyyy-MM-dd'T'HH:mm:ss";
    private static String charset = "UTF-8";
    private static Pattern pattern = Pattern.compile("\\{([a-zA-Z0-9-_]+)}");
    /**
     * jdcloud客户端
     */
    protected JdcloudClient jdcloudClient;

    public abstract String method();

    public abstract String url();

    public abstract Class<? extends JdcloudResponse> returnType();

    public JdcloudExecutor client(JdcloudClient client) {
        this.jdcloudClient = client;
        return this;
    }

    /**
     * 执行http请求
     *
     * @param request
     * @return
     */
    @SuppressWarnings("unchecked")
    public <R1 extends JdcloudResponse, R2 extends JdcloudRequest> R1 execute(R2 request) {

        // 处理关键参数
        String version = request.getVersion();
        version = checkImportantParams(version);
        checkRequest(request);

        HttpResponse httpResponse = null;
        try {

            // 请求地址中的路径参数替换
            String uri = replaceUrl(url(), request);

            // 请求Host
            StringBuilder host = new StringBuilder()
                    .append(jdcloudClient.getHttpRequestConfig().getProtocol().toString())
                    .append("://")
                    .append(jdcloudClient.getEndpoint());

            StringBuilder signingHost;
            if(StringUtils.isNotBlank(jdcloudClient.getRealEndPoints())) {
                signingHost = new StringBuilder()
                        .append(jdcloudClient.getHttpRequestConfig().getProtocol().toString())
                        .append("://")
                        .append(jdcloudClient.getRealEndPoints());
            }else {
                signingHost = host;
            }

            // 请求Path
            StringBuilder path = new StringBuilder()
                    .append("/")
                    .append(version)
                    .append(uri);

            // 请求参数
            StringBuilder params = new StringBuilder(getParams(request));

            logger.debug("http request url: {}{}{}", host, path, params);

            // 请求body
            ByteArrayContent bodyContent = null;
            String content = content(request);
            if (content != null && content.length() > 0) {
                bodyContent = ByteArrayContent.fromString(JdcloudClient.JSON, content);
            }

            // 构建request
            if (jdcloudClient.httpRequestFactory == null) {
                jdcloudClient.init();
            }
            HttpRequest httpRequest = jdcloudClient.buildRequest(method(), new GenericUrl(host.toString() + path.toString() + params.toString()), bodyContent);

            // 设置Headers
            httpRequest.getHeaders().setUserAgent(jdcloudClient.getUserAgent());
            httpRequest.getHeaders().setContentType(JdcloudClient.JSON);
            this.setCustomHeader(httpRequest.getHeaders());

            // 签名
            SignRequest signRequest = new SignRequest(signingHost.toString(), path.toString(), request.getRegionId(), jdcloudClient.getServiceName(), httpRequest, jdcloudClient.getCredentialsProvider().getCredentials());
            SignatureComposer signer = new SignatureComposer();
            signer.sign(signRequest);
            logger.debug("Authorization: {}", httpRequest.getHeaders().getAuthorization());

            // 请求及响应
            httpResponse = httpRequest.execute();
            return (R1)handlerHttpResponse(httpResponse);
        } catch (HttpResponseException e) {
            logger.error(e.getContent());
            if (e.getContent() == null) {
                throw new JdcloudSdkException(e);
            }
            JdcloudResponse response = jdcloudClient.readValue(e.getContent(), returnType());
            if (null == response){
                throw new JdcloudSdkException("Illegal Content");
            }
            return (R1) response;
        } catch (Exception e) {
            throw new JdcloudSdkException(e);
        }finally {
            if (httpResponse != null) {
                try {
                    httpResponse.disconnect();
                } catch (Exception e) {
                    logger.error(e.getMessage());
                }
            }
        }
    }

    /**
     * 替换url中变量
     *
     * @param httpUrl
     * @param request
     * @return
     */
    public String replaceUrl(String httpUrl, JdcloudRequest request) {
        if (httpUrl == null || httpUrl.length() == 0) {
            return "";
        }
        if (httpUrl.indexOf('{') < 0) {
            return httpUrl;
        }

        Matcher matcher = pattern.matcher(httpUrl);
        StringBuffer url = new StringBuffer();
        while (matcher.find()) {
            String fieldName = matcher.group(1);
            matcher.appendReplacement(url, getRequestValue(fieldName, request));
        }
        matcher.appendTail(url);
        return url.toString();
    }

    /**
     * 方法描述：校验必选参数是否为空
     * @param request
     * @author lixuenan3
     * @date 2018年3月23日 上午10:59:47
     */
    private void checkRequest(Object request) {
        Field[] array = request.getClass().getDeclaredFields();
            try {
                for(Field field: array) {
                    if (field.isAnnotationPresent(Required.class)) {
                        field.setAccessible(true);
                        Object value = field.get(request);
                        if (value == null) {
                            logger.info("字段{}不能为null", field.getName());
                            throw new JdcloudSdkException("字段" + field.getName() + "不能为null");
                        }
                    }
                }
            } catch (IllegalArgumentException e) {
                logger.error("IllegalArgumentException");
                throw new JdcloudSdkException(e);
            } catch (IllegalAccessException e) {
                logger.error("IllegalAccessException");
                throw new JdcloudSdkException(e);
            }
    }

    /**
     * 处理关键参数
     * @param v 版本
     */
    protected String checkImportantParams(String v){

        String version = v;
        if (version == null || version.length() == 0) {
            version = jdcloudClient.getVersion();
        }
        if (version == null || version.length() == 0) {
            throw new JdcloudSdkException("version not set.");
        }
        if (this.jdcloudClient == null) {
            throw new JdcloudSdkException("jdcloudClient not set.");
        }
        if (this.jdcloudClient.getEndpoint() == null || this.jdcloudClient.getEndpoint().length() == 0) {
            throw new JdcloudSdkException("endpoint not set.");
        }
        if (this.jdcloudClient.getServiceName() == null) {
            throw new JdcloudSdkException("serviceName not set.");
        }
        return version;
    }

    protected JdcloudResponse handlerHttpResponse(HttpResponse httpResponse) throws IOException,IllegalAccessException,InstantiationException{
        if(httpResponse.getContent() != null && httpResponse.getStatusCode() != 204  && httpResponse.getStatusCode() != 304) {
            JdcloudResponse response = jdcloudClient.readValue(httpResponse.getContent(), returnType());
            if (null == response){
                throw new JdcloudSdkException("Illegal Content");
            }
            return response;
        }
        Object o = httpResponse.getHeaders().get("x-jdcloud-request-id");
        if(o instanceof ArrayList) {
            String reqId = (String)((ArrayList) o).get(0);

            JdcloudResponse ret = returnType().newInstance();
            ret.setRequestId(reqId);
            return ret;
        }
        return returnType().newInstance();
    }

    /**
     * 根据字段名称获得字段值
     *
     * @param fieldName
     * @param request
     * @return
     */
    private String getRequestValue(String fieldName, JdcloudRequest request) {

        Field field = null;
        try {
            field = request.getClass().getDeclaredField(fieldName);
        } catch (NoSuchFieldException e){
            logger.info(fieldName," not fount");
        }
        try {
            if (field == null) {
                field = request.getClass().getSuperclass().getDeclaredField(fieldName);
            }
            field.setAccessible(true);
            Object value = field.get(request);
            if (value == null) {
                throw new JdcloudSdkException("field " + fieldName + " not set.");
            }
            return String.valueOf(value) ;
        }catch (Exception e) {
            throw new JdcloudSdkException("can not get value of request field '" + fieldName + "'.", e);
        }
    }

    /**
     * 接url参数
     */
    private String getParams(JdcloudRequest request) throws UnsupportedEncodingException {
        if (request == null) {
            return "";
        }
        if (SdkHttpMethod.DELETE.name().equalsIgnoreCase(method())
                || SdkHttpMethod.GET.name().equalsIgnoreCase(method())
                || SdkHttpMethod.HEAD.name().equalsIgnoreCase(method())) {
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .disableHtmlEscaping()
                    .setDateFormat(dateFormat)
                    .create();
            JsonElement jsonElement = gson.toJsonTree(request);
            String params = createParam(jsonElement, "");
            if (StringUtils.isNotBlank(params)) {
                return "?" + params.substring(1);
            } else {
                return "";
            }
        }
        return "";
    }

    // 拼接url参数
    String createParam(JsonElement jsonElement, String superName) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        if (jsonElement instanceof JsonObject) {
            objectParam(jsonElement,superName,sb);
        } else if (jsonElement instanceof JsonArray) {
            arrayParam(jsonElement,superName,sb);
        }
        return sb.toString();
    }

    private void arrayParam(JsonElement jsonElement, String superName, StringBuilder sb) throws UnsupportedEncodingException{
        Iterator<JsonElement> iterator = ((JsonArray) jsonElement).iterator();
        int i = 1;
        while (iterator.hasNext()) {
            JsonElement value = iterator.next();
            if (value instanceof JsonArray) {
                sb.append(createParam(value, superName + "." + (i++)));
            } else if (value instanceof JsonObject) {
                sb.append(createParam(value, superName + "." + (i++)));
            } else {
                sb.append("&");
                sb.append(superName);
                sb.append(".");
                sb.append(i++);
                sb.append("=");
                sb.append(URLEncoder.encode(value.toString().replaceAll("^\"|\"$", ""), charset));
            }
        }
    }

    private void objectParam(JsonElement jsonElement, String superName, StringBuilder sb) throws UnsupportedEncodingException{
        for (Map.Entry<String, JsonElement> e : ((JsonObject) jsonElement).entrySet()) {
            String name = e.getKey();
            //忽略url上的路径参数
            if (url().indexOf("{" + name + "}") > -1) {
                continue;
            }
            JsonElement value = e.getValue();
            String pname = createParamKey(superName, name);
            if (value instanceof JsonArray) {
                sb.append(createParam(value, pname));
            } else if (value instanceof JsonObject) {
                sb.append(createParam(value, pname));
            } else if (value != null) {
                sb.append("&");
                sb.append(pname);
                sb.append("=");
                sb.append(URLEncoder.encode(value.toString().replaceAll("^\"|\"$", ""), charset));
            }
        }
    }

    /**
     * 生成url param key
     *
     * @param superName
     * @param name
     * @return
     */
    private String createParamKey(String superName, String name) {
        if (StringUtils.isBlank(superName)) {
            return name;
        }
        return superName + "." + name;
    }

    /**
     * 获得请求body
     *
     * @param request
     * @return
     */
    private String content(JdcloudRequest request) {
        if (request == null) {
            return null;
        }
        if (SdkHttpMethod.DELETE.name().equalsIgnoreCase(method())
                || SdkHttpMethod.GET.name().equalsIgnoreCase(method())
                || SdkHttpMethod.HEAD.name().equalsIgnoreCase(method())) {
            return null;
        }
        Gson gson = new GsonBuilder().setDateFormat(dateFormat).create();
        return gson.toJson(request);
    }

    private void setCustomHeader(HttpHeaders headers) {
        Map<String, String> customHeaders = this.jdcloudClient.getCustomHeader();
        for (Map.Entry<String,String> entry  : customHeaders.entrySet()) {
            String key = entry.getKey();
            if(null == key){continue;}
            String value = entry.getValue();
            if (key.startsWith("x-jdcloud")) {
                try {
                    value = Base64Utils.encodeAsString(value.getBytes("UTF-8"));
                }catch (Exception e){
                    throw new JdcloudSdkException(e);
                }
            }
            headers.put(key, value);
        }
    }

}
