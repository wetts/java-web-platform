package com.wetts.designpattern.abstract_factory.example;

import com.wetts.designpattern.abstract_factory.common.human.Human;

public interface HumanFactory {

	public Human createYellowHuman();
	
	public Human createBlackHuman();
	
	public Human createWhiteHuman();
}
