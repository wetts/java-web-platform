package com.wetts.designpattern.mediator.example;

import java.util.Random;

public class Sale extends AbstractColleague {

	public Sale(AbstractMediator mediator) {
		super(mediator);
	}

	public void sellIBMComputer(int number) {
		super.mediator.execute("sale.sell", number);
		System.out.println("sell IBM " + number);
	}
	
	public int getSaleStatus() {
		Random rand = new Random(System.currentTimeMillis());
		int saleStatus = rand.nextInt(100);
		System.out.println("IBM sale status is " + saleStatus);
		return saleStatus;
	}
	
	public void offSale() {
		super.mediator.execute("sale.offsell");
	}
	
}
