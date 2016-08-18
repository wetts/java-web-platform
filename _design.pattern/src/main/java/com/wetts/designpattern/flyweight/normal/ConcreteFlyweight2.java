package com.wetts.designpattern.flyweight.normal;

public class ConcreteFlyweight2 extends Flyweight {

	public ConcreteFlyweight2(String Extrinsic) {
		super(Extrinsic);
	}

	@Override
	public void operate() {
		System.out.println("ConcreteFlyweight2 operate");
	}

}
