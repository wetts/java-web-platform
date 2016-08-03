package com.wetts._book.thinking_in_java.chapter_02;

/**
 * 基本类型的默认值
 * 
 * @author wetts
 * @created 2015/06/22
 *
 */
public class Clinet_01 {

	public static void main(String[] args) {
		Aoo aoo = new Aoo();
		System.out.println(aoo.a);
		System.out.println(aoo.aoo);
		aoo.fun();
	}
}

class Aoo {
	
	int a;
	
	Aoo aoo;
	
	void fun() {
		// 必须设置初始值
		int b = 0;
		System.out.println(b);
	}
}
