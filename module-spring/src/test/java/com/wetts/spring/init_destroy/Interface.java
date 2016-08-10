package com.wetts.spring.init_destroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by wetts on 2016/8/10.
 */
public class Interface implements InitializingBean, DisposableBean {

    public Interface() {
        System.out.println("Interface Construt....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Interface I'm destory method using @PreDestroy.....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Interface I'm init method using @PostConstrut....");
    }
}
