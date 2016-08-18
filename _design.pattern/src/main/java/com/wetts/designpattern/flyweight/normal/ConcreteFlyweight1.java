package com.wetts.designpattern.flyweight.normal;

public class ConcreteFlyweight1 extends Flyweight {

	public ConcreteFlyweight1(String Extrinsic) {
		super(Extrinsic);
	}

	@Override
	public void operate() {
		System.out.println("ConcreteFlyweight1 operate");
	}

}
