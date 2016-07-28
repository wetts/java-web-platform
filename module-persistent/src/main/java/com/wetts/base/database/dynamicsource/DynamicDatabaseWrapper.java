package com.wetts.base.database.dynamicsource;

import javax.sql.DataSource;

/**
 * @author wetts
 * @Description: 动态数据源包装类
 * @date 2016/07/26
 */
public class DynamicDatabaseWrapper {

    /**
     * 数据源
     */
    private DataSource dateSource;

    /**
     * 权重
     */
    private int weight = 1;

    /**
     * 名称
     */
    private String name;

    public void setDateSource(DataSource dateSource) {
        this.dateSource = dateSource;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public DataSource getDateSource() {
        return dateSource;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
