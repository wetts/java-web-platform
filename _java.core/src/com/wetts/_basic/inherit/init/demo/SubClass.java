package com.wetts._basic.inherit.init.demo;

public class SubClass extends SuperClass {
	
	static {
		System.out.println("sub static block");
	}
	
	{
		System.out.println("sub block");
	}
	
	public SubClass() {
		super(5);
		System.out.println("sub constructor");
	}
	
	public void test() {
		System.out.println("sub");
	}
}
