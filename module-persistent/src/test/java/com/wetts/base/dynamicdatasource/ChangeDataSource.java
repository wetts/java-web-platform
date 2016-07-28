package com.wetts.base.dynamicdatasource;

import com.wetts.base.database.dynamicsource.annotation.DataSourceName;
import com.wetts.base.database.dynamicsource.annotation.DataSourcePolicy;
import com.wetts.base.database.dynamicsource.annotation.DataSourceType;
import org.springframework.stereotype.Component;

/**
 * @author wetts
 * @date 2016/07/27
 */
@Component
public class ChangeDataSource {

    @DataSourcePolicy
    @DataSourceName(value="aaa")
    public void chooseOne() {
        System.out.println("one");
    }

    @DataSourcePolicy(type = DataSourceType.WRITE_DATASOURCE)
    public void chooseTwo() {
        System.out.println("one");
    }

}
