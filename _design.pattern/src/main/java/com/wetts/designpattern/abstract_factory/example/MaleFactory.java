package com.wetts.designpattern.abstract_factory.example;

import com.wetts.designpattern.abstract_factory.common.human.Human;
import com.wetts.designpattern.abstract_factory.common.human.MaleBlackHuman;
import com.wetts.designpattern.abstract_factory.common.human.MaleWhiteHuman;
import com.wetts.designpattern.abstract_factory.common.human.MaleYellowHuman;

public class MaleFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}

	@Override
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}

	@Override
	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}

}
