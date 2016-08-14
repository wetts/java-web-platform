package com.wetts.designpattern.factory_method.expand.case1;

import com.wetts.designpattern.factory_method.common.human.Human;
import com.wetts.designpattern.factory_method.common.human.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new YellowHuman();
	}

}
