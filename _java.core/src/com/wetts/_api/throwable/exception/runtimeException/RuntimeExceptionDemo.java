package com.wetts._api.throwable.exception.runtimeException;

import java.util.Date;

public class RuntimeExceptionDemo {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String str = null;
		// 空指针
		System.out.println(str.length());
		// 下标越界
		System.out.println(args[0]);
		// 数学异常
		int i = 5 / 0;
		System.out.println(i);
		Object o = new String("abc");
		// 造型异常
		@SuppressWarnings("unused")
		Date date = (Date)o;
		// 数学格式异常
		@SuppressWarnings("unused")
		int j = Integer.parseInt("a");
	}
}
