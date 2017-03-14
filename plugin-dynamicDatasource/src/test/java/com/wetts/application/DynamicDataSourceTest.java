package com.wetts.application;

import com.wetts.application.service.ChangeDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wetts
 * @date 2016/07/27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:dynamic-datasource.xml"})
public class DynamicDataSourceTest {

    @Autowired
    private ChangeDataSource changeDataSource;

    @Test
    public void test() {
//        changeDataSource.chooseOne();
        changeDataSource.chooseTwo();
        changeDataSource.chooseTwo();
        changeDataSource.chooseTwo();
        changeDataSource.chooseTwo();
        changeDataSource.chooseTwo();
        changeDataSource.chooseTwo();
        changeDataSource.chooseTwo();
        changeDataSource.chooseTwo();
        changeDataSource.chooseTwo();
        changeDataSource.chooseTwo();
        changeDataSource.chooseTwo();
        changeDataSource.chooseTwo();
//        changeDataSource.chooseThree();
    }

}
