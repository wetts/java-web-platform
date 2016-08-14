package com.wetts.designpattern.factory_method.expand.singleton;

/**
 * 该类不能通过正常方式获取实例
 * 
 * @author wetts
 * @since 1.0 2015/05/26
 */
public class Singleton {

	private Singleton() {};
	
	public void doSomething() {
		System.out.println("Singleton doSomething...");
	}
}
