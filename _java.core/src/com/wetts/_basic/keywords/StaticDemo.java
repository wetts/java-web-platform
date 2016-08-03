package com.wetts._basic.keywords;

/**
 * 静态变量、静态方法、静态代码快演示
 * 
 * @author wetts
 * @version 1.0, 2014/07/21
 * @since JDK1.5
 */
public class StaticDemo {

	public static void main(String[] args) {
		/*
		 * 不会加载static代码块
		 */
		System.out.println(StaticTest.str);
		/*
		 * 会加载static代码块
		 */
		StaticTest.test();
		
		new StaticTest().test1();
	}
}

class StaticTest {

	static {
		System.out.println("StaticTest loading");
	}

	public static final String str = "string";

	public static void test() {
		System.out.println("StaticMethod running");
	}

	public void test1() {
		int a = 5;
		System.out.println(a);
	}
}
