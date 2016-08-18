package com.wetts.designpattern.builder.normal;

public class ProductBuilder extends Builder {

	private Product product = new Product();
	
	@Override
	public void setPart() {
		// TODO Auto-generated method stub

	}

	@Override
	public Product buildProduct() {
		return product;
	}

}
