package com.wetts.designpattern.abstract_factory.example;

import com.wetts.designpattern.abstract_factory.common.human.FemaleBlackHuman;
import com.wetts.designpattern.abstract_factory.common.human.FemaleWhiteHuman;
import com.wetts.designpattern.abstract_factory.common.human.FemaleYellowHuman;
import com.wetts.designpattern.abstract_factory.common.human.Human;

public class FemaleFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}

	@Override
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

	@Override
	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}

}
