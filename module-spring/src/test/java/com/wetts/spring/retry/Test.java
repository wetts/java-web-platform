package com.wetts.spring.retry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wetts on 2016/8/11.
 */
public class Test {

    @org.junit.Test
    public void testRetry() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("retry-context.xml");
        Service service = ac.getBean("service", Service.class);
        service.service();
    }

}
