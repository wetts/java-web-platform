package com.wetts._book.advice.primitiveDataTypes;

/**
 * 优先使用基本类型
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_9 {

	public static void main(String[] args) {
		int i = 140;
		Integer in = Integer.valueOf(i);
		
		Client_9 client = new Client_9();
		client.f(i);
		client.f(in);
		// 接下来注释掉void f(Integer i)
	}
	
	public void f(Long l) {
		System.out.println("void f(Long l)");
	}
	
	public void f(long l) {
		System.out.println("void f(long l)");
	}
	
	public void f(Integer i) {
		System.out.println("void f(Integer i)");
	}
}
