package com.wetts._util;

/**
 * 字符串常量
 *
 * @author wetts
 * @date 2016/08/03
 */
public class StringConstant {

    public static final char[] UPPER_CHAR = new char[26];
    public static final char[] LOWER_CHAR = new char[26];
    public static final char[] NUMBER = new char[10];

    static {
        for (int i = 0; i < UPPER_CHAR.length; i++) {
            UPPER_CHAR[i] = (char)('A' + i);
        }
        for (int i = 0; i < LOWER_CHAR.length; i++) {
            LOWER_CHAR[i] = (char)('a' + i);
        }
        for (int i = 0; i < NUMBER.length; i++) {
            NUMBER[i] = (char)('0' + i);
        }
    }

}
