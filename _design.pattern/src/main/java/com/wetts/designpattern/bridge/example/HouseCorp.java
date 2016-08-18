package com.wetts.designpattern.bridge.example;

public class HouseCorp extends Corp {

	public HouseCorp(Product product) {
		super(product);
	}
	
	public void makeMoney() {
		super.makeMoney();
		System.out.println("HouseCorp make money..");
	}

}
