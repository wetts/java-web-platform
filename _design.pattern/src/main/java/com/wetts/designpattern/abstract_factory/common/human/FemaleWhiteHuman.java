package com.wetts.designpattern.abstract_factory.common.human;

public class FemaleWhiteHuman extends AbstractYellowHuman {

	@Override
	public void getSex() {
		System.out.println("White female human");
	}

}
