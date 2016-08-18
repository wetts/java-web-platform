package com.wetts.designpattern.strategy.expand;

public class Add implements Calculator {

	@Override
	public int exec(int a, int b) {
		return a + b;
	}

}
