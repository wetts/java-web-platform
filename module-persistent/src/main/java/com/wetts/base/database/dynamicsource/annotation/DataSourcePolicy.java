package com.wetts.base.database.dynamicsource.annotation;

import java.lang.annotation.*;

/**
 * @author wetts
 * @Description 数据源切换注解
 * @date 2016/07/26
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSourcePolicy {

    DataSourceSelectPolicy dataSourceSelectPolicy() default DataSourceSelectPolicy.AUTO;

    DataSourceType type() default DataSourceType.READ_WRITE_DATASOURCE;

}
