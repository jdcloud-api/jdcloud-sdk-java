package com.jdcloud.sdk.auth.sign;

import java.io.FilterInputStream;
import java.io.InputStream;

/**
 * Author xumanyi1
 * 2017/7/18
 * 14:09
 * function
 */
public class SdkFilterInputStream extends FilterInputStream {

    protected SdkFilterInputStream(InputStream in) {
        super(in);
    }


}
