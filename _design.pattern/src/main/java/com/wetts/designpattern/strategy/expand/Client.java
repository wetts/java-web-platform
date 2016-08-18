package com.wetts.designpattern.strategy.expand;

public class Client {

	public static void main(String[] args) {
		int a = 1;
		String symbol = "+";
		int b = 2;
		Context context = null;
		if("+".equals(symbol)) {
			context = new Context(new Add());
		} else if("-".equals(symbol)) {
			context = new Context(new Sub());
		}
		System.out.println("The result is: " + a + symbol + b + "=" +context.exec(a, b, symbol));
	}
}
