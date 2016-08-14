package com.wetts.designpattern.factory_method.expand.simpleFactory;

import com.wetts.designpattern.factory_method.common.human.BlackHuman;
import com.wetts.designpattern.factory_method.common.human.Human;
import com.wetts.designpattern.factory_method.common.human.WhiteHuman;
import com.wetts.designpattern.factory_method.common.human.YellowHuman;

public class NvWa {

	public static void main(String[] args) {
		Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}
