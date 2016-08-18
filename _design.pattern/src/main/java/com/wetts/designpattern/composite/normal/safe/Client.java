package com.wetts.designpattern.composite.normal.safe;

public class Client {

	public static void main(String[] args) {
		Composite root = new Composite();
		root.doSomething();
		
		Composite branch = new Composite();
		
		Leaf leaf = new Leaf();
		root.add(branch);
		branch.add(leaf);
	}
	
	public static void display(Composite root) {
		for(Component component : root.getChildren()) {
			if (component instanceof Leaf) {
				component.doSomething();
			} else {
				display((Composite)component);
			}
		}
	}
}
