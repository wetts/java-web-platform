package com.wetts._book.advice.primitiveDataTypes;

/**
 * 不要让类型默默转换
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_3 {

	public static final int LIGHT_SPEED = 30 * 10000 * 1000;
	
	public static void main(String[] args) {
		long dis1 = LIGHT_SPEED * 1;
		System.out.println(dis1);
		long dis2 = LIGHT_SPEED * 60 * 8;
		System.out.println(dis2);
	}
}
