package com.wetts._book.advice.classAndObjectAndMethod;

/**
 * 不要覆写静态方法
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_3 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Base base = new Sub();
		base.doAnything();
		base.doSomething();
	}
}

class Base {
	
	public static void doSomething() {
		System.out.println("Base doSomething");
	}
	
	public void doAnything() {
		System.out.println("Base doAnything");
	}
}

class Sub extends Base {
	
	public static void doSomething() {
		System.out.println("Sub doSomething");
	}
	
	public void doAnything() {
		System.out.println("Sub doAnything");
	}
}
