package com.wetts.designpattern.composite.normal.transparent;

import java.util.List;

public abstract class Component {

	public void doSomething() {
		System.out.println("Component doSomething..");
	}
	
	public abstract void add(Component component);
	
	public abstract void remove(Component component);
	
	public abstract List<Component> getChildren();
}
