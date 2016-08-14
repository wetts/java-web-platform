package com.wetts.designpattern.memento.expand.clone;

public class Client {

	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("happy");
		System.out.println(originator.getState());
		originator.createMemento();
		originator.setState("bad");
		System.out.println(originator.getState());
		originator.restoreMemento();
		System.out.println(originator.getState());
	}
}
