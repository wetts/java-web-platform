package com.wetts._book.advice.enumAnnotation;

/**
 * 使用valueOf前必须进行校验
 * 
 * @author wetts
 * @created 2015/06/13
 *
 */
public class Client_5 {

	public static void main(String[] args) {
		System.out.println(Season.valueOf("spring"));
	}
}
