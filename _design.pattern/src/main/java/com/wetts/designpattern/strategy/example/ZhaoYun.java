package com.wetts.designpattern.strategy.example;

public class ZhaoYun {

	public static void main(String[] args) {
		Context context;
		
		context = new Context(new BackDoor());
		context.operate();
		
		context = new Context(new GivenGreenLight());
		context.operate();
		
		context = new Context(new BlockEnemy());
		context.operate();
	}
}
