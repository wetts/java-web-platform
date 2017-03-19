package com.wetts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wetts on 2017/3/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-context-mongodb.xml"})
public class SpringMongoDBTest {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void mongoDBTest() {
        System.out.println(mongoTemplate);
    }
}
