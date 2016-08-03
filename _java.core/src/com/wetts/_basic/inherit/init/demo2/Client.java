package com.wetts._basic.inherit.init.demo2;

public class Client {
	
	public static void main(String[] args) {
		new A();

	}
}

class B {
	
	private int i = 777;
	
	{
		System.out.println("--------");
		i = 555;
	}

	public B() {
		this.dis();
	}

	public void dis() {
		System.out.println(i);
	}
}

class A extends B {
	
	private int i = 666;

	public A() {
		System.out.println(222);
		i = 3333;
		dis();
	}

	public void dis() {
		System.out.println("+" + i);
	}
}
