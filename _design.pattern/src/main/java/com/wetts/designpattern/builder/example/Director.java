package com.wetts.designpattern.builder.example;

import com.wetts.designpattern.builder.common.car.CarModel;

import java.util.ArrayList;
import java.util.List;

public class Director {

	private List<String> sequence = new ArrayList<String>();
	
	private CarBuilder benzBuilder = new BenzBuilder();
	
	private CarBuilder BMWBuilder = new BMWBuilder();
	
	public CarModel getABenzModel() {
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");
		benzBuilder.setSequence(sequence);
		return benzBuilder.getCarModel();
	}
	
	public CarModel getBBenzModel() {
		this.sequence.clear();
		this.sequence.add("engineBoom");
		this.sequence.add("start");
		this.sequence.add("stop");
		benzBuilder.setSequence(sequence);
		return benzBuilder.getCarModel();
	}
	
	public CarModel getABMWModel() {
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");
		BMWBuilder.setSequence(sequence);
		return BMWBuilder.getCarModel();
	}
	
	public CarModel getBBMWModel() {
		this.sequence.clear();
		this.sequence.add("engineBoom");
		this.sequence.add("start");
		this.sequence.add("stop");
		BMWBuilder.setSequence(sequence);
		return BMWBuilder.getCarModel();
	}
}
