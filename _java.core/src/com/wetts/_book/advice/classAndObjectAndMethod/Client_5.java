package com.wetts._book.advice.classAndObjectAndMethod;

/**
 * 避免在构造函数中初始化其他类
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_5 {

	public static void main(String[] args) {
		Son s = new Son();
		s.doSomething();
	}
}

class Father {
	public Father() {
		new Other();
	}
}

class Son extends Father {
	public void doSomething() {
		System.out.println("Hi, show me something");
	}
}

class Other {
	public Other() {
		new Son();
	}
}
