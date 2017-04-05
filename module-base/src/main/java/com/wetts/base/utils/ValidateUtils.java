package com.wetts.base.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 验证工具类
 */
public class ValidateUtils {

    /**
     * 手机号码格式
     */
    public static final String MOBILE_REGEX = "^1[34578]\\d{9}$";
    /**
     * 密码格式
     */
    public static final String PASSWORD_REGEX = "^[a-zA-Z0-9]{6,15}$";

    private static final Pattern emailRegex = Pattern.compile("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");

    public static Boolean isMobile(String mobile) {
        Boolean flag = false;
        if (StringUtils.isBlank(mobile)) {
            return flag;
        }
        flag = mobile.matches(MOBILE_REGEX);
        return flag;
    }

    public static Boolean isPassword(String password) {
        Boolean flag = false;
        if (StringUtils.isBlank(password)) {
            return flag;
        }
        flag = password.matches(PASSWORD_REGEX);
        return flag;
    }

    public static Boolean isEmail(String email) {
        Boolean flag = false;
        if (StringUtils.isBlank(email)) {
            return flag;
        }

        Matcher matcher = emailRegex.matcher(email);
        flag = matcher.matches();
        return flag;
    }
}
