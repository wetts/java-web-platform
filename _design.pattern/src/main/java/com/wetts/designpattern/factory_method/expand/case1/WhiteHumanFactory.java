package com.wetts.designpattern.factory_method.expand.case1;

import com.wetts.designpattern.factory_method.common.human.Human;
import com.wetts.designpattern.factory_method.common.human.WhiteHuman;

public class WhiteHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new WhiteHuman();
	}

}
