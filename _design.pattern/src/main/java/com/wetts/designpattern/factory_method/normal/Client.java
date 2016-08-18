package com.wetts.designpattern.factory_method.normal;

import com.wetts.designpattern.factory_method.common.product.ConcreteProduct1;
import com.wetts.designpattern.factory_method.common.product.Product;

public class Client {

	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		Product product = creator.createProduct(ConcreteProduct1.class);
		product.method1();
		product.method2();
	}
}
