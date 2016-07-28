package com.wetts.base.database.dynamicsource.exception;

/**
 * @author wetts
 * @Description: 没有数据库路由错误
 * @date 2016/07/26
 */
public class NoDatabaseRouteException extends Exception  {

    public NoDatabaseRouteException() {
        super("选择的数据库路由没有被发现");
    }

}
