package com.wetts._book.advice.arrayAndList;

import java.util.Arrays;

/**
 * 若有必要，使用变长数组
 * 
 * @author wetts
 * @created 2015/06/08
 *
 */
public class Client_2 {

	public static void main(String[] args) {
		Object[] objs = new Object[60];
		objs = expandCapacity(objs, 100);
	}
	
	public static <T> T[] expandCapacity(T[] datas, int newLen) {
		newLen = newLen < 0 ? 0 : newLen;
		return Arrays.copyOf(datas, newLen);
	}
}
