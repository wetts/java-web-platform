package com.wetts._book.advice.usual;

/**
 * 避免带有变长参数的方法重载
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_4 {

	public void calPrice(int price, int discount) {
		System.out.println("calPrice(int price, int discount)");
	}
	
	public void calPrice(int price, int... dicount) {
		System.out.println("calPrice(int price, int... dicount)");
	}
	
	public static void main(String[] args) {
		new Client_4().calPrice(4, 1);
	}
}
