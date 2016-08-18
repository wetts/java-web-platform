package com.wetts.designpattern.decorator.normal;

public class ConcreteDecorator1 extends Decorator {

	public ConcreteDecorator1(Component component) {
		super(component);
	}

	private void method1() {
		System.out.println("method1 decorator");
	}
	
	public void operate() {
		this.method1();
		super.operate();
	}
	
}
