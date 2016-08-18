package com.wetts.designpattern.mediator.example;

public class Purchase extends AbstractColleague {

	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}
	
	public void buyIBMcomputor(int number) {
		super.mediator.execute("purchase.buy", number);
	}
	
	public void refuseBuyIBM() {
		System.out.println("refuse buy IBM..");
	}

}
