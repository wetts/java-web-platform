package com.wetts._book.advice.usual;

/**
 * 覆写变长方法也循规蹈矩
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_6 {

	public static void main(String[] args) {
//		Base base = new Sub();
//		Sub sub = new Sub();
//		sub.fun(50, 10);
	}
	
	class Base {
		void fun(int price, int... is) {
			System.out.println("Base fun");
		}
	}
	
	class Sub extends Base {
		@Override
		void fun(int price, int[] is) {
			System.out.println("Sub fun");
		}
	}
}
