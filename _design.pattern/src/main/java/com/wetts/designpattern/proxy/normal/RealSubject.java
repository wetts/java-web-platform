package com.wetts.designpattern.proxy.normal;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("RealSubject request..");
	}

}
