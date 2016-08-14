package com.wetts.designpattern.abstract_factory.common.human;

public class MaleWhiteHuman extends AbstractYellowHuman {

	@Override
	public void getSex() {
		System.out.println("White male human");
	}

}
