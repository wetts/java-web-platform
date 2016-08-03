package com.wetts._util;

/**
 * 日期相关工具类
 *
 * @author wetts
 * @date 2016/08/03
 */
public class DateUtil {

    /**
     * 判断年份是否为闰年
     *
     * @param year
     * @return
     */
    public static boolean isLeepYear(int year) {
        if(year <= 0)
            throw new RuntimeException("年份应该为正整数");

        return  (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

}
