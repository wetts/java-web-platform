package com.wetts._api.throwable.exception;

/**
 * Exception API介绍
 */
public class ExceptionDemo1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("程序结束了");
	}
}
