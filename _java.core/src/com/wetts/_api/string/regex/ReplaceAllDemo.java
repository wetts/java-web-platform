package com.wetts._api.string.regex;

/**
 * replaceAll的用法
 * 
 * @author wetts
 */
public class ReplaceAllDemo {

	public static void main(String[] args) {
		String regex = "\\d+";
		String str = "5zxcv0asdf";
		str.replaceAll(regex, "数字");
	}
}
