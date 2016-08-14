package com.wetts.designpattern.factory_method.example;

import com.wetts.designpattern.factory_method.common.human.Human;

public class HumanFactory extends AbstractHumanFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (Human)Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (T)human;
	}

}
