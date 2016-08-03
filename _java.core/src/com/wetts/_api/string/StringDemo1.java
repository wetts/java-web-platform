package com.wetts._api.string;

/**
 * 字符串演示
 * 字符串常池值特性 与 编译器的优化 
 * 
 * 字符串与变量连接，会产生新的字符串。
 * ps: 如果str2前用final修饰，则结果为true。 
 * 
 * @author wetts
 * @version 1.0, 2014/07/21
 * @since JDK1.5
 */
public class StringDemo1 {

	public static void main(String[] args) {
		String str1 = "123abc";
		//两个字面量运算会在编译时运算依次
		String str2 = "123" + "abc";
		String str3 = "12" + '3' + "abc";
		String str4 = 12 + "3abc";
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println("------------------------");
		//注意，数字和字符相加结果还是数字
		String str5 = 12 + '3' + "abc";
		String str6 = '1' + 2 + '3' + "abc";
		System.out.println(str1 == str5);
		System.out.println(str1 == str6);
		System.out.println("------------------------");
		//变量与字符串链接会产生新对象
		String str7 = "123";
		final String strTmp = "123";
		int int1 = 123;
		String str8 = str7 + "abc";
		String str9 = int1 + "abc";
		String str10 = strTmp + "abc";
		System.out.println(str1 == str8);
		System.out.println(str1 == str9);
		System.out.println(str1 == str10);
		System.out.println("------------------------");
	}
}
