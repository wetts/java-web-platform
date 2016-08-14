package com.wetts.designpattern.factory_method.common.product;

/**
 * 抽象产品类
 * 
 * @author wetts
 * @since 1.0 2015/05/26
 */
public abstract class Product {

	public void method1() {
		System.out.println("Product method1");
	}
	
	public abstract void method2();
}
