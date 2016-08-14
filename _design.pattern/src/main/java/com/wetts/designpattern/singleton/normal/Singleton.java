package com.wetts.designpattern.singleton.normal;

/**
 * 单例模板
 * 
 * @author wetts
 * @since 1.0 2015/05/26
 */
public class Singleton {

	public static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	public Singleton getSingleton() {
		return singleton;
	}
}
