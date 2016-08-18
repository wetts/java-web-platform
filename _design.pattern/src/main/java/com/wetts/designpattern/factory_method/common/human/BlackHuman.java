package com.wetts.designpattern.factory_method.common.human;

public class BlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("Black Human, black color");
	}

	@Override
	public void talk() {
		System.out.println("Black human, talking");
	}

}
