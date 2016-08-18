package com.wetts.designpattern.mediator.example;

public class Client {

	public static void main(String[] args) {
		AbstractMediator mediator = new Mediator();
		
		Purchase purchase = new Purchase(mediator);
		purchase.buyIBMcomputor(10);
		
		Sale sale = new Sale(mediator);
		sale.sellIBMComputer(1);
		
		Stock stock = new Stock(mediator);
		stock.clearStock();
	}
}
