package com.wetts.designpattern.factory_method.common.human;

public class WhiteHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("White human, white color");
	}

	@Override
	public void talk() {
		System.out.println("White human, talking");
	}

}
