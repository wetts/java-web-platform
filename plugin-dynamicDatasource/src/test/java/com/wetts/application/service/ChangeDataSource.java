package com.wetts.application.service;

import com.wetts.base.database.dynamicsource.DatabaseContextHolder;
import com.wetts.base.database.dynamicsource.annotation.DataSourceConverter;
import com.wetts.base.database.dynamicsource.constants.DataSourceType;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wetts
 * @date 2016/07/27
 */
@Component
public class ChangeDataSource {

    @DataSourceConverter(dbName = "aaa", type = DataSourceType.WRITE_DATASOURCE)
    @Transactional
    public void chooseOne() {
        DatabaseContextHolder.setCustomerType("mkyongList1");
    }

    @DataSourceConverter(type = DataSourceType.WRITE_DATASOURCE)
    public void chooseTwo() {
    }

    @DataSourceConverter(type = DataSourceType.READ_WRITE_DATASOURCE)
    public void chooseThree() {
    }

}
