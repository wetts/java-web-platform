package com.wetts.base.pagehelper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by wetts on 2016/8/1.
 */
public class Test {

    @org.junit.Test
    public void pageTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CountryMapper cm = ac.getBean(CountryMapper.class, "countryMapper");
        System.out.println(cm.selectByPrimaryKey(1));

        PageHelper.startPage(1, 10);
        List<Country> list = cm.selectByPage();

        PageInfo<Country> page = new PageInfo(list);
        System.out.println(page);
    }

}
