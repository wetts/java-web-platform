package com.wetts._util;

/**
 * 数字相关工具类
 *
 * @author wetts
 * @date 2016/08/03
 */
public class NumberUtil {

    /**
     * 整数的递归相加
     *
     * @param start
     * @param end
     * @return
     */
    public static int addRecursion(int start, int end) {
        if(start > end)
            throw new RuntimeException("起始数字应应不大于结束数字");

        return start == end ? end : (start + addRecursion(start + 1, end));
    }

}
