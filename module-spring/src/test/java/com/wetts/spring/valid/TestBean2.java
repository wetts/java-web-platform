package com.wetts.spring.valid;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by wetts on 2016/8/11.
 */
public class TestBean2 {

    @NotEmpty
    private String productName;

}
