package com.wetts.base.aspect;

import com.wetts.base.database.dynamicsource.DatabaseContextHolder;
import com.wetts.base.database.dynamicsource.DynamicDatabasePool;
import com.wetts.base.database.dynamicsource.annotation.DataSourceName;
import com.wetts.base.database.dynamicsource.annotation.DataSourcePolicy;
import com.wetts.base.database.dynamicsource.exception.NoDatabaseRouteException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;

/**
 * @author wetts
 * @Description 数据源切换切面
 * @date 2016/07/26
 */
@Component
@Aspect
public class DynamicDataSourceAspect {

    protected static final Logger LOG = LoggerFactory.getLogger(DynamicDataSourceAspect.class);

    @Autowired
    private DynamicDatabasePool dynamicDatabasePool;

    @Before("execution(* com.wetts.application.service..*.*(..))")
    public void before(JoinPoint point) {
        Class clazz = point.getTarget().getClass();

        try {
            Method method = clazz.getMethod(point.getSignature().getName());
            DataSourcePolicy dsp = method.getAnnotation(DataSourcePolicy.class);

            String dbName = "";
            switch (dsp.dataSourceSelectPolicy()) {
                case AUTO:
                    try {
                        dbName = dynamicDatabasePool.getRandomDataSourceName(dsp.type());
                    } catch (NoDatabaseRouteException e) {
                        LOG.error("数据库自动切换出错");
                        e.printStackTrace();
                        return;
                    }
                    break;
                case MANUAL:
                    DataSourceName dsn = method.getAnnotation(DataSourceName.class);
                    if(dsn == null || StringUtils.isEmpty(dsn.value())) {
                        LOG.error("数据源名称注入错误");
                        throw new RuntimeException("数据源名称注入错误");
                    }
                    break;
            }
            DatabaseContextHolder.setCustomerType(dbName);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
