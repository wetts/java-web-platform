package com.wetts._book.advice.classAndObjectAndMethod;

/**
 * 让工具类不可实例化
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_12 {

	public static void method() {
		
	}
	
	private Client_12() {
		throw new Error("不要实例化我");
	}
}
