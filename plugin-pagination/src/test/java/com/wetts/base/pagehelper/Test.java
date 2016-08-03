package com.wetts.base.pagehelper;

import com.wetts.base.database.pagination.Page;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wetts on 2016/8/1.
 */
public class Test {

    @org.junit.Test
    public void pageTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CountryMapper cm = ac.getBean(CountryMapper.class, "countryMapper");
        System.out.println(cm.selectByPrimaryKey(1));

        Map map = new HashMap();
        Page page = new Page();
        page.setPageNo(1);
        page.setPageSize(15);
        map.put("page", page);
        List<Country> list = cm.selectByPage(map);

        page.setList(list);

        System.out.println(list);
        System.out.println(page);
    }

}
