package com.wetts._book.advice.usual;

/**
 * 别让null值和空值威胁到变长方法
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_5 {

	public void methodA(String str, Integer... integers) {
		System.out.println("methodA(String str, Integer... integers)");
	}
	
	public void methodA(String str, String... strs) {
		System.out.println("methodA(String str, String... strs)");
	}
	
	public static void main(String[] args) {
		Client_5 client = new Client_5();
		client.methodA("China", 0);
		client.methodA("China", "People");
//		client.methodA("China");
//		client.methodA("China", null);
	}
}
