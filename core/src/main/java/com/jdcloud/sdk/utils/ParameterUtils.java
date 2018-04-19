package com.jdcloud.sdk.utils;

import java.lang.reflect.Field;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.api.client.util.Maps;
import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.service.JdcloudRequest;
import com.jdcloud.sdk.service.JdcloudResponse;

public class ParameterUtils {

    private static Logger logger = LoggerFactory.getLogger(ParameterUtils.class);

    private static Map<String, Boolean> JAVA_TYPE = Maps.newHashMap();
    
    static {
        JAVA_TYPE.put("java.lang.String", true);
        JAVA_TYPE.put("java.lang.Byte", true);
        JAVA_TYPE.put("java.lang.Boolean", true);
        JAVA_TYPE.put("java.lang.Character", true);
        JAVA_TYPE.put("java.lang.Double", true);
        JAVA_TYPE.put("java.lang.Enum", true);
        JAVA_TYPE.put("java.lang.Float", true);
        JAVA_TYPE.put("java.lang.Integer", true);
        JAVA_TYPE.put("java.lang.Long", true);
        JAVA_TYPE.put("java.lang.Short", true);
        JAVA_TYPE.put("java.util.Date", true);
        JAVA_TYPE.put("java.util.List", true);
        JAVA_TYPE.put("java.util.Map", true);
    }

    /**
     * 方法描述：校验request中的必选参数是否为空
     * @param request 
     * @author lixuenan3
     * @date 2018年3月23日 上午10:59:47
     */
    public static void checkRequest(Object request) {
        Field[] array = request.getClass().getDeclaredFields();
        if(array != null) {
            try {
                for(Field field: array) {
                    if (field.isAnnotationPresent(Required.class)) {
                        field.setAccessible(true);
                        Object value = field.get(request);
                        if (value == null) {
                            logger.info("字段{}不能为null", field.getName());
                            throw new JdcloudSdkException("字段" + field.getName() + "不能为null");
                        }
                        if(!JAVA_TYPE.containsKey(field.getType().getName())) {
                            checkRequest(value);
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
    }
}
