package com.wetts.designpattern.abstract_factory.common.human;

public class MaleBlackHuman extends AbstractYellowHuman {

	@Override
	public void getSex() {
		System.out.println("Black male human");
	}

}
