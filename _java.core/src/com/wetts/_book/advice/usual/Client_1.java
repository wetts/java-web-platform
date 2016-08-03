package com.wetts._book.advice.usual;

/**
 * 不要在常量中出现易混淆的字母
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_1 {

	public static void main(String[] args) {
		// l应该大写
		long i = 1l;
		System.out.println(i + i);
	}
}
