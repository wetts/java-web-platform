package com.wetts.designpattern.abstract_factory.normal;

import com.wetts.designpattern.abstract_factory.common.product.AbstractProductA;
import com.wetts.designpattern.abstract_factory.common.product.AbstractProductB;
import com.wetts.designpattern.abstract_factory.common.product.ProductA1;
import com.wetts.designpattern.abstract_factory.common.product.ProductB1;

public class Creator1 extends AbstractCreator {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
