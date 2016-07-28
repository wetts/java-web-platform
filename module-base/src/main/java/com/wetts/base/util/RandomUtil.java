package com.wetts.base.util;

import java.util.Random;

/**
 * @author wetts
 * @Description: 随机数工具类
 * @date 2016/07/26
 */
public class RandomUtil {

    private static Random random = new Random();

    public static int getRandomNum(int num) {
        return random.nextInt(num);
    }

}
