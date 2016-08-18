package com.wetts.designpattern.factory_method.common.human;

public class YellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("Yellow human, yellow color");
	}

	@Override
	public void talk() {
		System.out.println("Yellow human, talking");
	}

}
