package com.wetts.application;

import com.wetts.application.dao.sys.UserDao;
import com.wetts.application.entity.sys.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wetts on 2017/3/16.
 */
public class MybatisTest {

    @org.junit.Test
    public void pageTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext( "spring-context-db.xml");
        UserDao cm = ac.getBean(UserDao.class, "userDao");
        System.out.println(cm.findAllList(new User()));
    }
}
