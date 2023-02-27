package com.hbu.myblog.util;

import java.security.MessageDigest;

/**
 * MD5加密工具类
 *
 * @author vigilr
 * @since 2021/02/25
 */
public class MD5Util {

    /**
     * 将byte数组转为十六进制字符串
     *
     * @param b byte数组
     * @return java.lang.String
     */
    private static String byteArrayToHexString(byte b[]) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            resultSb.append(byteToHexString(b[i]));
        }

        return resultSb.toString();
    }

    /**
     * 将byte的值转为十六进制字符串
     *
     * @param b 要转换的byte值
     * @return java.lang.String
     */
    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0) {
            n += 256;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return HEX_DIGITS[d1] + HEX_DIGITS[d2];
    }

    /**
     * 加密
     *
     * @param origin  原始字符串
     * @param charset 编码方式
     * @return java.lang.String
     */
    public static String MD5Encode(String origin, String charset) {
        String resultString = null;
        try {
            resultString = new String(origin);
            MessageDigest md = MessageDigest.getInstance("MD5");
            if (charset == null || "".equals(charset)) {
                resultString = byteArrayToHexString(md.digest(resultString
                        .getBytes()));
            } else {
                resultString = byteArrayToHexString(md.digest(resultString
                        .getBytes(charset)));
            }
        } catch (Exception exception) {
        }
        return resultString;
    }

    private static final String HEX_DIGITS[] = {"0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
}
