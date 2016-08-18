package com.wetts.designpattern.factory_method.normal;

import com.wetts.designpattern.factory_method.common.product.Product;

/**
 * 创建的抽象类
 * 
 * @author wetts
 * @since 1.0 2015/05/26
 */
public abstract class Creator {

	public abstract <T extends Product> T createProduct(Class<T> c);
}
