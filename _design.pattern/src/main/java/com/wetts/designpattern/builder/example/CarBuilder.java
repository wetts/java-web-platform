package com.wetts.designpattern.builder.example;

import com.wetts.designpattern.builder.common.car.CarModel;

import java.util.List;

public abstract class CarBuilder {

	public abstract void setSequence(List<String> sequence);
	
	public abstract CarModel getCarModel();
}
