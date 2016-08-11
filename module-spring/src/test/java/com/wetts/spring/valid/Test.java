package com.wetts.spring.valid;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * Created by wetts on 2016/8/10.
 */
public class Test {

    @org.junit.Test
    public void testValid() {
        TestBean testBean = new TestBean();
        testBean.setCustomer("@3f1");
        testBean.setEmail("fadf541@3123!!@#!");
        testBean.setaDouble(10.1467d);

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<TestBean>> violations = validator.validate(testBean);
    }

}
