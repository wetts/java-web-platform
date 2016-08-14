package com.wetts.designpattern.proxy.normal;

public class Proxy implements Subject {

	private Subject subject = null;
	
	public Proxy() {
		this.subject = new Proxy();
	}
	
	public Proxy(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}
	
	private void before() {
		System.out.println("before..");
	}
	
	private void after() {
		System.out.println("after..");
	}

}
