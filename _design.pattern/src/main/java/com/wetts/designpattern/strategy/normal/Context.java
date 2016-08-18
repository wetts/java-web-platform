package com.wetts.designpattern.strategy.normal;

public class Context {

	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void doAnything() {
		this.strategy.doSomething();
	}
}
