package com.wetts.designpattern.builder.normal;

public class Director {

	private Builder builder = new ProductBuilder();
	
	public Product getAProduct() {
		builder.setPart();
		return builder.buildProduct();
	}
}
