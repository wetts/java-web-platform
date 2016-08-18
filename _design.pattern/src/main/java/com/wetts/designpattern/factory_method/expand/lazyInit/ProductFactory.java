package com.wetts.designpattern.factory_method.expand.lazyInit;

import com.wetts.designpattern.factory_method.common.product.ConcreteProduct1;
import com.wetts.designpattern.factory_method.common.product.ConcreteProduct2;
import com.wetts.designpattern.factory_method.common.product.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {

	private static final Map<String, Product> prMap = new HashMap<String, Product>();
	
	public static synchronized Product createProduct(String type) {
		Product product = null;
		if(prMap.containsKey(type)) {
			product = prMap.get(type);
		} else {
			if("Product1".equals(type)) {
				product = new ConcreteProduct1();
			} else {
				product = new ConcreteProduct2();
			}
		}
		return product;
	}
}
