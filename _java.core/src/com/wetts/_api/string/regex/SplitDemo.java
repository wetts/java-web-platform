package com.wetts._api.string.regex;

import java.util.Arrays;

/**
 * split的用法
 * 
 * @author wetts
 */
public class SplitDemo {

	public static void main(String[] args) {
		String regex = "\\d";
		String str = "abc1abc2abc3abc";
		String[] arr = str.split(regex);
		System.out.println(Arrays.toString(arr));
	}
}
