package com.wetts.designpattern.abstract_factory.common.human;

public abstract class AbstractYellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("Yellow human, yellow color");
	}

	@Override
	public void talk() {
		System.out.println("Yellow human, talking..");
	}

}
