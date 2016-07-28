package com.wetts.base.database.dynamicsource;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Chenz
 * @version V1.0
 * @Description: 多数据源上下文处理类
 * @date Nov 13, 2014 1:03:21 PM
 */
public class DatabaseContextHolder {

    protected static final Logger LOG = LoggerFactory.getLogger(DatabaseContextHolder.class);

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setCustomerType(String customerType) {
        LOG.debug("switch datasource:-------------------{}", customerType);
        String currentCustomerType = getCustomerType();
        LOG.debug("current datasource:-------------------{}", currentCustomerType);
        if (currentCustomerType == null || StringUtils.isNotBlank(currentCustomerType) && !customerType.equals(currentCustomerType)) {
            LOG.debug("had switch datasource!!!");
            contextHolder.set(customerType);
        }
    }

    public static String getCustomerType() {
        return contextHolder.get();
    }

    public static void clearCustomerType() {
        contextHolder.remove();
    }
}
