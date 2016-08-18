package com.wetts.designpattern.strategy.example;

public class GivenGreenLight implements IStrategy {

	@Override
	public void operate() {
		System.out.println("求吴国太绿灯，放行");
	}

}
