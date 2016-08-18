package com.wetts.designpattern.observer.normal;

public class ConcreteObserver implements Observer {

	@Override
	public void update() {
		System.out.println("ConcreteObserver update..");
	}

}
