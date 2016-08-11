package com.wetts.spring.factorybean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wetts on 2016/8/11.
 */
@Configuration
public class SpringConfig {

    @Bean(name = "car")
    public CarFactoryBean piano(){
        CarFactoryBean carFactoryBean = new CarFactoryBean();
        carFactoryBean.setCarInfo("超级跑车,400,2000000");
        return carFactoryBean;
    }

}
