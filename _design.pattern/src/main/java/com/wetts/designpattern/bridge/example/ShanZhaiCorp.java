package com.wetts.designpattern.bridge.example;

public class ShanZhaiCorp extends Corp {

	public ShanZhaiCorp(Product product) {
		super(product);
	}
	
	public void makeMoney() {
		super.makeMoney();
		System.out.println("ShanZhaiCorp make money..");
	}

}
