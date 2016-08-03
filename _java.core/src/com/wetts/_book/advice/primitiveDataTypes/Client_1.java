package com.wetts._book.advice.primitiveDataTypes;

/**
 * 用偶判断，不用奇判断
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println(1 % 2 == 1 ? "奇数" : "偶数" + ", 1");
		System.out.println(2 % 2 == 1 ? "奇数" : "偶数" + ", 2");
		System.out.println(0 % 2 == 1 ? "奇数" : "偶数" + ", 0");
		System.out.println(-1 % 2 == 1 ? "奇数" : "偶数" + ", -1");
		System.out.println(-2 % 2 == 1 ? "奇数" : "偶数" + ", -2");
		
		System.out.println(-1 % 2);
		System.out.println(-2 % 2);
		System.out.println(-1 / 2);
		
		System.out.println(Client_1.remainder(-1, 2));
	}
	
	/**
	 * 取余源码模拟
	 * 
	 * @param dividend
	 * @param divisor
	 * @return
	 */
	public static int remainder(int dividend, int divisor) {
		return dividend - dividend / divisor * divisor;
	}
}
