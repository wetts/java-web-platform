package com.wetts.designpattern.adapter.normal;

public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		super.doSomething();
	}

}
