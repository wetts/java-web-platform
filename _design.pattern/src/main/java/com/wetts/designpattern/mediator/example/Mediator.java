package com.wetts.designpattern.mediator.example;

public class Mediator extends AbstractMediator {

	@Override
	public void execute(String str, Object... objects) {
		if("purchase.buy".equals(str)) {
			this.buyComputer((Integer)objects[0]);
		} else if("sale.sell".equals(str)) {
			this.sellComputer((Integer)objects[0]);
		} else if("sale.offsell".equals(str)) {
			this.offSell();
		} else if("stock.clear".equals(str)) {
			this.clearStock();
		}
	}
	
	private void buyComputer(int number) {
		int saleStatues = super.sale.getSaleStatus();
		if(saleStatues > 80) {
			System.out.println("buy IBM " + number);
			super.stock.increase(number);
		} else {
			int buyNumber = number / 2;
			System.out.println("buy IBM " + buyNumber);
		}
	}
	
	private void sellComputer(int number) {
		if(super.stock.getStockNumber() < number) {
			super.purchase.buyIBMcomputor(number);
		}
		super.stock.decrease(number);
	}
	
	private void offSell() {
		System.out.println("off sell IBM");
	}
	
	private void clearStock() {
		super.sale.offSale();
		super.purchase.refuseBuyIBM();
	}

}
