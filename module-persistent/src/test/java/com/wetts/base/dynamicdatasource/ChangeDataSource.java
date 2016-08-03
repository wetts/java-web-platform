package com.wetts.base.dynamicdatasource;

import com.wetts.base.database.dynamicsource.DatabaseContextHolder;
import com.wetts.base.database.dynamicsource.annotation.DataSourceName;
import com.wetts.base.database.dynamicsource.annotation.DataSourcePolicy;
import com.wetts.base.database.dynamicsource.annotation.DataSourceType;
import com.wetts.base.pagehelper.CountryMapper;
import com.wetts.base.pagehelper.TestTable;
import com.wetts.base.pagehelper.TestTableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.activation.DataContentHandler;

/**
 * @author wetts
 * @date 2016/07/27
 */
@Component
public class ChangeDataSource {

    @Autowired
    private CountryMapper countryMapper;

    @Autowired
    private TestTableMapper testTableMapper;

    @DataSourcePolicy(type = DataSourceType.WRITE_DATASOURCE)
    @DataSourceName(value="aaa")
    @Transactional
    public void chooseOne() {
        System.out.println(countryMapper.selectByPage());
        DatabaseContextHolder.setCustomerType("mkyongList1");
        System.out.println(testTableMapper.selectAll());
    }

    @DataSourcePolicy(type = DataSourceType.WRITE_DATASOURCE)
    public void chooseTwo() {
        System.out.println("one");
    }

}
