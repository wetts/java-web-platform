package com.wetts._book.advice.classAndObjectAndMethod;

/**
 * 静态变量一定要先声明后赋值
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_2 {

	static {
		i = 100;
	}
	
	public static int i = 1;
	
	public static void main(String[] args) {
		System.out.println(i);
	}
}
