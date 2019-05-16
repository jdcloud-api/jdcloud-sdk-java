package com.jdcloud.sdk.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.google.api.client.http.ByteArrayContent;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.annotation.BodyParameter;
import com.jdcloud.sdk.http.ContentType;
import com.jdcloud.sdk.http.SdkHttpMethod;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * ConvertUtils
 * 
 * 转换工具类
 * 
 * 2018年7月24日下午2:38:56
 * 
 * @author lixuenan3
 */
public class ConvertUtils {

    private final static Gson GSON = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();

    public static <R extends JdcloudRequest> ByteArrayContent formatRequestBody(String contentType, R request,
            String method) throws JAXBException, IOException {
        ByteArrayContent bodyContent = null;
        Object body = content(request, method);
        if (body == null) {
            return bodyContent;
        }
        if (ContentType.APPLICATION_XML.toString().equals(contentType)) {
            bodyContent = new ByteArrayContent(contentType, beanToXmlByte(body));
        } else {
            String content = GSON.toJson(body);
            bodyContent = ByteArrayContent.fromString(contentType, content);
        }
        return bodyContent;
    }

    /**
     * 获得请求body
     *
     * @param request
     * @return
     */
    private static Object content(JdcloudRequest request, String method) {
        if (request == null) {
            return null;
        }
        if (SdkHttpMethod.DELETE.name().equalsIgnoreCase(method) || SdkHttpMethod.GET.name().equalsIgnoreCase(method)
                || SdkHttpMethod.HEAD.name().equalsIgnoreCase(method)) {
            return null;
        }
        // body
        return getBodyParameters(request);
    }

    /**
     * 方法描述：获取body参数
     * 
     * @param request
     * @author lixuenan3
     * @date 2018年3月23日 上午10:59:47
     */
    private static Object getBodyParameters(Object request) {
        Object bodyContent = null;
        try {
            Field[] array = request.getClass().getDeclaredFields();
            for (Field field : array) {
                if (field.isAnnotationPresent(BodyParameter.class)) {
                    field.setAccessible(true);
                    return field.get(request);
                }
            }
            if (bodyContent == null) {
                bodyContent = request;
            }
        } catch (IllegalArgumentException | IllegalAccessException e) {
            throw new JdcloudSdkException(e);
        }
        return bodyContent;
    }

    public static <R> String beanToXml(R request) throws JAXBException, UnsupportedEncodingException {
        return new String(beanToXmlByte(request),"UTF-8");
    }

    /**
     * xml文件配置转换为对象
     * 
     * @param is
     * @param load java对象.Class
     * @return java对象
     * @throws JAXBException
     * @throws IOException
     */
    public static Object xmlToBean(InputStream is, Class<?> load) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(load);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object object = unmarshaller.unmarshal(is);
        return object;
    }

    private static <R> byte[] beanToXmlByte(R request) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(request.getClass()); // 获取上下文对象
        Marshaller marshaller = context.createMarshaller(); // 根据上下文获取marshaller对象

        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8"); // 设置编码字符集
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // 格式化XML输出，有分行和缩进
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        marshaller.marshal(request, baos);
        return baos.toByteArray(); // 生成XML字符串
    }
}
