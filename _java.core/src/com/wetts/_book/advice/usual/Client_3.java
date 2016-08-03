package com.wetts._book.advice.usual;

/**
 * 三元操作符的类型务必一致
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_3 {

	public static void main(String[] args) {
		int i = 80;
		String s1 = String.valueOf(i < 100 ? 90 : 100);
		String s2 = String.valueOf(i < 100 ? 90 : 100.0);
		// 该处会返回false
		// s1 = 90 
		// s2 = 90.0
		System.out.println(s1.equals(s2));
	}
}
