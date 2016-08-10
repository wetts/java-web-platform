package com.wetts.base.valid.annotation;

import com.wetts.base.valid.MoneyValidator;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author wetts
 * @Description 金钱校验注解
 * @date 2016/08/10
 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MoneyValidator.class)
public @interface Money {

    String message() default "不是金额形式";

    Class[] groups() default {};

    Class[] payload() default {};

}