package com.wetts._api.number;

/**
 * Integer方法演示
 * 
 * @author wetts
 * @version 1.0, 2014/07/25
 */
public class IntegerDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * 自动装箱
		 */
		Integer in1 = 5;
		Integer in2 = new Integer(6);
		/*
		 * 自动拆箱
		 */
		
		int i1 = in2;
		String str = "123";
		/*
		 * parseInt
		 */
		int i2 = Integer.parseInt(str);
		/*
		 * valueOf
		 */
		Integer in3 = Integer.valueOf(str);
		/*
		 * intValue
		 */
		int i3 = in3.intValue();
	}
}
