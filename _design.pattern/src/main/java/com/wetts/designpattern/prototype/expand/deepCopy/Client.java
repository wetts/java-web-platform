package com.wetts.designpattern.prototype.expand.deepCopy;

public class Client {

	public static void main(String[] args) {
		Thing thing = new Thing();
		thing.setValue("momo1");
		
		Thing cloneThing = thing.clone();
		cloneThing.setValue("momo2");
		
		System.out.println(thing.getList());
	}
}
