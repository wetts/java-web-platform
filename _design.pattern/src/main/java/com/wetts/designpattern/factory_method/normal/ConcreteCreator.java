package com.wetts.designpattern.factory_method.normal;

import com.wetts.designpattern.factory_method.common.product.Product;

public class ConcreteCreator extends Creator {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		Product product = null;
		try {
			product = (Product)Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (T)product;
	}

}
