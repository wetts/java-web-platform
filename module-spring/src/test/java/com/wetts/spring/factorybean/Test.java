package com.wetts.spring.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wetts on 2016/8/11.
 */
public class Test {

    @org.junit.Test
    public void testFactoryBean() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        Car car = ac.getBean("car", Car.class);
        System.out.println(car.getBrand());

        CarFactoryBean carFactoryBean = ac.getBean("&car", CarFactoryBean.class);
        System.out.println(carFactoryBean.getCarInfo());
    }

}
