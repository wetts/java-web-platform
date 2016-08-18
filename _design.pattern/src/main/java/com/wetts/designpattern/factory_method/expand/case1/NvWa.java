package com.wetts.designpattern.factory_method.expand.case1;

import com.wetts.designpattern.factory_method.common.human.Human;

public class NvWa {

	public static void main(String[] args) {
		Human blackHuman = (new BlackHumanFactory()).createHuman();
		blackHuman.getColor();
		blackHuman.talk();
		Human whiteHuman = (new WhiteHumanFactory()).createHuman();
		whiteHuman.getColor();
		whiteHuman.talk();
		Human yellowHuman = (new YellowHumanFactory()).createHuman();
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}
