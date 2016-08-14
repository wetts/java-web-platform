package com.wetts.designpattern.adapter.normal;

public class ConcreteTarget implements Target {

	@Override
	public void request() {
		System.out.println("If you ask me, I ask who..");
	}

}
