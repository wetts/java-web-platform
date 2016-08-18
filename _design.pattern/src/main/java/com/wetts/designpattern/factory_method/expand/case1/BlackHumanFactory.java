package com.wetts.designpattern.factory_method.expand.case1;

import com.wetts.designpattern.factory_method.common.human.BlackHuman;
import com.wetts.designpattern.factory_method.common.human.Human;

public class BlackHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new BlackHuman();
	}

}
