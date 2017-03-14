package com.wetts.application;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wetts.application.dao.TestTableMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * Created by wetts on 2016/8/1.
 */
public class PageTest {

    @org.junit.Test
    public void pageTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-context-db.xml");
        TestTableMapper cm = ac.getBean(TestTableMapper.class, "testTableMapper");
        System.out.println(cm.selectAll());

        PageHelper.startPage(3, 10);
        List<Map> list = cm.selectAll();

        PageInfo<Map> page = new PageInfo(list);
        System.out.println(page);
    }

}
