package com.wetts.designpattern.builder.example;

import com.wetts.designpattern.builder.common.car.CarModel;

public class Client {

	public static void main(String[] args) {
		Director director = new Director();
		CarModel benzA = director.getABenzModel();
		benzA.run();
	}
}
