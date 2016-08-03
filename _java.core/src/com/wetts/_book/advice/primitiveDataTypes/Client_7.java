package com.wetts._book.advice.primitiveDataTypes;

/**
 * 警惕包装类型比较
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_7 {

	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1 == i2);
		System.out.println(i1 > i2);
		System.out.println(i1 < i2);
	}
}
