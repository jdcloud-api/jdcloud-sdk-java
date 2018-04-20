package com.jdcloud.sdk.utils;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * Author xumanyi1
 * 2017/7/18
 * 13:05
 * function 二进制处理工具
 */
public class BinaryUtils {

    public static String toHex(byte[] data) {
        return Base16Lower.encodeAsString(data);
    }

    public static byte[] fromHex(String hexData) {
        return Base16Lower.decode(hexData);
    }

    public static String toBase64(byte[] data) {
        return Base64Utils.encodeAsString(data);
    }

    public static byte[] fromBase64(String b64Data) {
        return b64Data == null ? null : Base64Utils.decode(b64Data);
    }

    public static ByteArrayInputStream toStream(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return new ByteArrayInputStream(new byte[0]);
        }
        return new ByteArrayInputStream(copyBytesFrom(byteBuffer));
    }

    public static byte[] copyAllBytesFrom(ByteBuffer bb) {
        if (bb == null) {
            return null;
        }

        if (bb.hasArray()) {
            return Arrays.copyOfRange(
                    bb.array(),
                    bb.arrayOffset(),
                    bb.arrayOffset() + bb.limit());
        }

        ByteBuffer copy = bb.asReadOnlyBuffer();
        copy.rewind();

        byte[] dst = new byte[copy.remaining()];
        copy.get(dst);
        return dst;
    }

    public static byte[] copyBytesFrom(ByteBuffer bb) {
        if (bb == null) {
            return null;
        }

        if (bb.hasArray()) {
            return Arrays.copyOfRange(
                    bb.array(),
                    bb.arrayOffset() + bb.position(),
                    bb.arrayOffset() + bb.limit());
        }

        byte[] dst = new byte[bb.remaining()];
        bb.asReadOnlyBuffer().get(dst);
        return dst;
    }
}
