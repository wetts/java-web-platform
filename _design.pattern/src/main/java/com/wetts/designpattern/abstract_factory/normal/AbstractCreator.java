package com.wetts.designpattern.abstract_factory.normal;

import com.wetts.designpattern.abstract_factory.common.product.AbstractProductA;
import com.wetts.designpattern.abstract_factory.common.product.AbstractProductB;

public abstract class AbstractCreator {

	public abstract AbstractProductA createProductA();
	
	public abstract AbstractProductB createProductB();
}
