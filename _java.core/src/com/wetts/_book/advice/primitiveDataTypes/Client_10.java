package com.wetts._book.advice.primitiveDataTypes;

import java.util.Random;

/**
 * 不要随意设置随机种子
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_10 {

	public static void main(String[] args) {
		Random r = new Random(100);
		for (int i = 0; i < 4; i++) {
			System.out.println(r.nextInt());
		}
		
		System.out.println(System.nanoTime());
		System.out.println(System.nanoTime());
	}
}
