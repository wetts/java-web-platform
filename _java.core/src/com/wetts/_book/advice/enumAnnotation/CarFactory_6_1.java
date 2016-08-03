package com.wetts._book.advice.enumAnnotation;

/**
 * 工厂方法模式
 * 
 * @author wetts
 * @created 2015/06/13
 *
 */
public enum CarFactory_6_1 {

	FordCar, BuickCar;
	
	public Car create() {
		switch (this) {
		case FordCar:
			return new FordCar();
		case BuickCar:
			return new BuickCar();
		default:
			throw new AssertionError();
		}
	}
}
