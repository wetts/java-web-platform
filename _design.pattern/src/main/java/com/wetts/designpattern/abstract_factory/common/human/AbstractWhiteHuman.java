package com.wetts.designpattern.abstract_factory.common.human;

public abstract class AbstractWhiteHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("White human, white color");
	}
	
	@Override
	public void talk() {
		System.out.println("White human, talking..");
	}
}
