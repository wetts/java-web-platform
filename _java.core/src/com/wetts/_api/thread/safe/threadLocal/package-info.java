/**
 * 本包主要讨论ThreadLocal的用法
 * 
 *******************************************
 * ThreadLocal
 * 	它是在每个线程中有一个map，而将ThreadLocal实例作为key，这样每个map中的项数很少
 * 	而且当线程销毁时相应的东西也一起销毁了，还有一个很重要的好处：速度快了很多
 * 
 * ThreadLocal会为每一个线程提供一个独立的变量副本，从而隔离了多个线程对数据的访问冲突
 * 
 */
/**
 * @author wetts
 * @created 
 *
 */
package com.wetts._api.thread.safe.threadLocal;
