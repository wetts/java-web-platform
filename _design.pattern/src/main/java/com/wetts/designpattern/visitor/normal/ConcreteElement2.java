package com.wetts.designpattern.visitor.normal;

public class ConcreteElement2 extends Element {

	@Override
	public void doSomething() {
		System.out.println("ConcreteElement2 doSomething..");
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
