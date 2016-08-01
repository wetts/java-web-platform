package com.wetts.base.database.dynamicsource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author wetts
 * @Description: 动态数据源路由实现类
 * @date 2016/07/26
 */
public class DynamicDataSourceRouting extends AbstractRoutingDataSource {

    private static final Logger logger = LoggerFactory.getLogger(DynamicDataSourceRouting.class);

    public DynamicDataSourceRouting(DynamicDatabasePool dynamicDatabasePool) {
        if (dynamicDatabasePool == null || dynamicDatabasePool.getAllSources() == null) {
            logger.error("数据源注入失败");
            throw new RuntimeException("数据源注入失败");
        }
        super.setTargetDataSources(dynamicDatabasePool.getAllSources());
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return DatabaseContextHolder.getCustomerType();
    }

}
