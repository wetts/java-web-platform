package com.wetts.designpattern.factory_method.example;

import com.wetts.designpattern.factory_method.common.human.Human;

public abstract class AbstractHumanFactory {

	public abstract <T extends Human> T createHuman(Class<T> c);
}
