package com.wetts.base.database.dynamicsource;

import com.wetts.base.database.dynamicsource.constants.DataSourceType;
import com.wetts.base.database.dynamicsource.exception.NoDatabaseRouteException;
import com.wetts.base.utils.weight.WeightHelper;
import com.wetts.base.utils.weight.WeightMeta;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.wetts.base.database.dynamicsource.constants.DataSourceType.*;

/**
 * @author wetts
 * @Description: 数据源管理池
 * @date 2016/07/26
 */
public class DynamicDatabasePool {

    private static final Logger logger = LoggerFactory.getLogger(DynamicDatabasePool.class);

    private String defaultDataSourceName;

    private WeightMeta<String> readDatasourceRoute;

    private WeightMeta<String> readWriteDatasourceRoute;

    private WeightMeta<String> writeDatasourceRoute;

    private Map<Object, Object> allDataSources = new HashMap<Object, Object>();

    public Map<Object, Object> getAllSources() {
        return allDataSources;
    }

    // required 设置为 false，则可以注入null值
    @Autowired(required = false)
    @Qualifier("writeDataSources")
    public void setWriteDataSources(List<DynamicDatabaseWrapper> writeDataSources) {
        if(defaultDataSourceName == null && !writeDataSources.isEmpty())
            defaultDataSourceName = writeDataSources.get(0).getName();

        this.resolveDataSources(WRITE_DATASOURCE, writeDataSources);
    }

    @Autowired(required = false)
    @Qualifier("readWriteDataSources")
    public void setReadWriteDataSources(List<DynamicDatabaseWrapper> readWriteDataSources) {
        if(defaultDataSourceName == null && !readWriteDataSources.isEmpty())
            defaultDataSourceName = readWriteDataSources.get(0).getName();

        this.resolveDataSources(READ_WRITE_DATASOURCE, readWriteDataSources);
    }

    @Autowired(required = false)
    @Qualifier("readDataSources")
    public void setReadDataSources(List<DynamicDatabaseWrapper> readDataSources) {
        if(defaultDataSourceName == null && !readDataSources.isEmpty())
            defaultDataSourceName = readDataSources.get(0).getName();

        this.resolveDataSources(READ_DATASOURCE, readDataSources);
    }

    /**
     * 获取随机数据源
     * @param dataSourceType 数据源类型
     * @return
     */
    public String getRandomDataSourceName(DataSourceType dataSourceType) throws NoDatabaseRouteException {
        switch (dataSourceType) {
            case READ_DATASOURCE:
                if(readDatasourceRoute == null) {
                    throw new NoDatabaseRouteException();
                }
                return readDatasourceRoute.random();
            case WRITE_DATASOURCE:
                if(writeDatasourceRoute == null) {
                    throw new NoDatabaseRouteException();
                }
                return writeDatasourceRoute.random();
            case READ_WRITE_DATASOURCE:
                if(readWriteDatasourceRoute == null) {
                    throw new NoDatabaseRouteException();
                }
                return readWriteDatasourceRoute.random();
            default:
                logger.error("数据源类型出错");
                throw new RuntimeException("数据源类型出错");
        }
    }

    /**
     * 获取默认数据源（第一个注入的为默认）
     * @return
     */
    public String getDefaultDataSourceName() {
        return defaultDataSourceName;
    }

    private void resolveDataSources(DataSourceType dataSourceType, List<DynamicDatabaseWrapper> dynamicDatabaseWrapper) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(DynamicDatabaseWrapper databaseWrapper : dynamicDatabaseWrapper) {
            if(databaseWrapper.getDateSource() == null) {
                logger.error("数据连接注入为空");
                throw new RuntimeException("数据连接注入为空");
            }
            allDataSources.put(databaseWrapper.getName(), databaseWrapper.getDateSource());
            map.put(databaseWrapper.getName(), databaseWrapper.getWeight());
        }
        switch (dataSourceType) {
            case READ_DATASOURCE:
                readDatasourceRoute = WeightHelper.buildWeightMeta(map);
                break;
            case WRITE_DATASOURCE:
                writeDatasourceRoute = WeightHelper.buildWeightMeta(map);
                break;
            case READ_WRITE_DATASOURCE:
                readWriteDatasourceRoute = WeightHelper.buildWeightMeta(map);
                break;
        }
    }
}