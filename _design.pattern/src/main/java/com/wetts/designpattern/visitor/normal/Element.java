package com.wetts.designpattern.visitor.normal;

public abstract class Element {

	public abstract void doSomething();
	
	public abstract void accept(IVisitor visitor);
}
