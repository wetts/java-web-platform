package com.wetts.spring.init_destroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wetts on 2016/8/10.
 */
public class Test {

    @org.junit.Test
    public void testAnnotation() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("init-destroy-context.xml");
        Annotation annotation = ac.getBean("annotation", Annotation.class);

        XML xml = ac.getBean("xml", XML.class);

        Interface anInterface = ac.getBean("interface", Interface.class);
    }

}
