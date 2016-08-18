package com.wetts.designpattern.abstract_factory.common.human;

public abstract class AbstractBlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("Black human, black color");
	}

	@Override
	public void talk() {
		System.out.println("Black human, talking..");
	}

}
