package com.wetts._api.string.regex;

/**
 * 验证邮箱格式的正确性
 * 
 * @author wetts
 * @since 1.0, 2014/07/31
 */
public class CheckEmailDemo {

	public static void main(String[] args) {
		String regex = "^[\\w.]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+$";
		String mail = "zhang.wetts@163.com";
		System.out.println(mail.matches(regex));
	}
}
