package com.wetts._book.advice.usual;

/**
 * 警惕自增的陷阱
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_7 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			count = count++;
		}
		System.out.println(count);
	}
}
