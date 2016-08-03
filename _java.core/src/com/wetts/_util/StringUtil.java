package com.wetts._util;

import java.util.Arrays;
import java.util.Random;

/**
 * 字符串工具类
 *
 * @author wetts
 * @date 2016/08/03
 */
public class StringUtil {

    /**
     * 可以随机得出任意长度的字符串(数字、大小写任选)
     *
     * @param hasUpperChar 是否包含大写
     * @param hasLowerChar 是否包含小写
     * @param hasNumber 是否包含数字
     * @param strLength 生成的字符串长度
     * @return
     */
    public static String randomString(boolean hasUpperChar, boolean hasLowerChar, boolean hasNumber, int strLength) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] c = new char[0];
        if (hasNumber) {
            c = Arrays.copyOf(c, c.length + StringConstant.NUMBER.length);
            System.arraycopy(StringConstant.NUMBER, 0, c, c.length - StringConstant.NUMBER.length, StringConstant.NUMBER.length);
        }
        if (hasUpperChar) {
            c = Arrays.copyOf(c, c.length + StringConstant.UPPER_CHAR.length);
            System.arraycopy(StringConstant.UPPER_CHAR, 0, c, c.length - StringConstant.UPPER_CHAR.length, StringConstant.UPPER_CHAR.length);
        }
        if (hasLowerChar) {
            c = Arrays.copyOf(c, c.length + StringConstant.LOWER_CHAR.length);
            System.arraycopy(StringConstant.LOWER_CHAR, 0, c, c.length - StringConstant.LOWER_CHAR.length, StringConstant.LOWER_CHAR.length);
        }
        Random r = new Random();
        for (int i = 0; i < strLength; i++) {
            stringBuilder.append(c[r.nextInt(c.length)]);
        }
        return stringBuilder.toString();
    }

}
