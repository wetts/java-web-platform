package com.wetts.designpattern.builder.example;

import com.wetts.designpattern.builder.common.car.BenzModel;
import com.wetts.designpattern.builder.common.car.CarModel;

import java.util.List;

public class BMWBuilder extends CarBuilder {

	private BenzModel benz = new BenzModel();
	
	@Override
	public void setSequence(List<String> sequence) {
		benz.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return benz;
	}

}
