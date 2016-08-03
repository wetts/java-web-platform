package com.wetts._book.advice.enumAnnotation;

/**
 * 用枚举实现工厂方法模式更简洁
 * 
 * @author wetts
 * @created 2015/06/13
 *
 */
public class Client_6 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Car car = CarFactory_6_1.FordCar.create();
		
		Car car2 = CarFactory_6_2.FordCar.create();
	}
}
