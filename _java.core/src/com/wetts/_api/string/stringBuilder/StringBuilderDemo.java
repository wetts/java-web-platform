package com.wetts._api.string.stringBuilder;

/**
 * StringBuilder方法演示
 * 
 * @author wetts
 * @version 1.0, 2014/07/25
 */
public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder strB = new StringBuilder("abcdefg");
		System.out.println(strB);
		/*
		 * append
		 */
		strB.append(true);
		System.out.println(strB);
		/*
		 * delete
		 */
		strB.delete(strB.lastIndexOf("t"), strB.length());
		System.out.println(strB);
		/*
		 * insert
		 */
		strB.insert(1, 'z');
		System.out.println(strB);
		/*
		 * replace
		 */
		strB.replace(1, 2, "");
		System.out.println(strB);
	}
}
