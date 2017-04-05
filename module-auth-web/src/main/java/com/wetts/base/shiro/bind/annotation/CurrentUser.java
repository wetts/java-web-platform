package com.wetts.base.shiro.bind.annotation;

import com.wetts.base.shiro.Constants;

import java.lang.annotation.*;

/**
 * 绑定当前登录的用户
 *
 * @author wetts
 * @date 2016/08/07
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CurrentUser {

    /**
     * 当前用户在request中的名字
     *
     * @return
     */
    String value() default Constants.CURRENT_USER;

}