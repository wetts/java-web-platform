package com.wetts._basic.inherit.init.demo;

public class SuperClass {

	static {
		System.out.println("sup static block");
	}

	{
		System.out.println("sup block");
	}

	public SuperClass(int x) {
		System.out.println("sup constructor");
		test();
	}

	public void test() {
		System.out.println("sup");
	}
}
