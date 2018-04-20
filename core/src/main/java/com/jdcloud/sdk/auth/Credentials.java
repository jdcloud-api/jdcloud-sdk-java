package com.jdcloud.sdk.auth;


import com.jdcloud.sdk.utils.Validate;
import com.jdcloud.sdk.utils.StringUtils;

import java.util.Objects;

/**
 * Author xumanyi1
 * 2017/7/18
 * 11:04
 * function  信用凭据 ak sk
 */
public class Credentials implements com.jdcloud.sdk.auth.ICredentials {

    private final String accessKeyId;//访问秘钥
    private final String secretAccessKey;//验证秘钥

    public  Credentials(String accessKeyId, String secretAccessKey){
        this(accessKeyId, secretAccessKey, true);
    }

    private Credentials(String accessKeyId, String secretAccessKey, boolean validateCredentials){
        this.accessKeyId = StringUtils.trimToNull(accessKeyId);
        this.secretAccessKey = StringUtils.trimToNull(secretAccessKey);
        if (validateCredentials) {
            Validate.notNull(this.accessKeyId, "Access key ID cannot be blank.");
            Validate.notNull(this.secretAccessKey, "Secret access key cannot be blank.");
        }

    }

    @Override
    public final String accessKeyId() {
        return accessKeyId;
    }

    @Override
    public final String secretAccessKey() {
        return secretAccessKey;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + accessKeyId + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Credentials that = (Credentials) o;
        return Objects.equals(accessKeyId, that.accessKeyId) &&
                Objects.equals(secretAccessKey, that.secretAccessKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKeyId, secretAccessKey);
    }

}
