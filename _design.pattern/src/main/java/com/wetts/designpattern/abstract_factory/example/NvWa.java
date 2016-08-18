package com.wetts.designpattern.abstract_factory.example;

public class NvWa {

	public static void main(String[] args) {
		HumanFactory maleHumanFactory = new MaleFactory();
		HumanFactory femaleHumanFactory = new FemaleFactory();
		maleHumanFactory.createBlackHuman().getSex();
		femaleHumanFactory.createYellowHuman().getColor();
	}
}
