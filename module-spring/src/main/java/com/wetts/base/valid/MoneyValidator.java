package com.wetts.base.valid;

import com.wetts.base.valid.annotation.Money;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * @author wetts
 * @Description 金钱校验
 * @date 2016/08/10
 */
public class MoneyValidator implements ConstraintValidator<Money, Double> {

    private String moneyReg = "^\\d+(\\.\\d{1,2})?$";//表示金额的正则表达式
    private Pattern moneyPattern = Pattern.compile(moneyReg);

    @Override
    public void initialize(Money money) {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean isValid(Double value, ConstraintValidatorContext arg1) {
        // TODO Auto-generated method stub
        if (value == null)
            return true;
        return moneyPattern.matcher(value.toString()).matches();
    }
}