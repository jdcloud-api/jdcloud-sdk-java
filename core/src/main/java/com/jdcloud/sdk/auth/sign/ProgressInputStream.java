package com.jdcloud.sdk.auth.sign;

import java.io.InputStream;

/**
 * Author xumanyi1
 * 2017/7/18
 * 14:07
 * function
 */
public class ProgressInputStream extends SdkFilterInputStream {

    public ProgressInputStream(InputStream is){
        super(is);
    }
    public final InputStream getWrappedInputStream() {
        return in;
    }


}
