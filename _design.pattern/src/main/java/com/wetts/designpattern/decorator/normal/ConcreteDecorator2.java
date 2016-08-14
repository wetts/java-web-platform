package com.wetts.designpattern.decorator.normal;

public class ConcreteDecorator2 extends Decorator {

	public ConcreteDecorator2(Component component) {
		super(component);
	}

	private void method2() {
		System.out.println("method2 decorator");
	}
	
	public void operate() {
		super.operate();
		this.method2();
	}
	
}
