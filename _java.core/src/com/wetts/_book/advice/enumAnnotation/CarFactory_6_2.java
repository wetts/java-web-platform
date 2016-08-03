package com.wetts._book.advice.enumAnnotation;

/**
 * 抽象方法工厂
 * 
 * @author wetts
 * @created 2015/06/13
 *
 */
public enum CarFactory_6_2 {

	FordCar {

		@Override
		public Car create() {
			return new FordCar();
		}

	}, 
	BuickCar {

		@Override
		public Car create() {
			return new BuickCar();
		}
		
	};
	
	public abstract Car create();
}
