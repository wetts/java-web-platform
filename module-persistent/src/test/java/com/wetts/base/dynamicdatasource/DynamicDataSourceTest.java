package com.wetts.base.dynamicdatasource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wetts
 * @date 2016/07/27
 */
public class DynamicDataSourceTest {

    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("persistent-context-test.xml");
        ChangeDataSource cd = ac.getBean("changeDataSource", ChangeDataSource.class);
        cd.chooseOne();
        cd.chooseTwo();


    }

}
