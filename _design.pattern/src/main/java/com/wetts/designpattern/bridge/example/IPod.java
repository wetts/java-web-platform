package com.wetts.designpattern.bridge.example;

public class IPod extends Product {

	@Override
	public void beProducted() {
		System.out.println("IPod be producted..");
	}

	@Override
	public void beSelled() {
		System.out.println("IPod be selled..");
	}

}
