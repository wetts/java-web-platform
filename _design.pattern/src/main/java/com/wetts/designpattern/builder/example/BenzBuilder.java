package com.wetts.designpattern.builder.example;

import com.wetts.designpattern.builder.common.car.BMWModel;
import com.wetts.designpattern.builder.common.car.CarModel;

import java.util.List;

public class BenzBuilder extends CarBuilder {

	private BMWModel BMW = new BMWModel();
	
	@Override
	public void setSequence(List<String> sequence) {
		BMW.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return BMW;
	}

}
