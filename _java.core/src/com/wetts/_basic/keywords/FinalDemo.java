package com.wetts._basic.keywords;


/**
 * fianl修饰类、方法、变量
 *
 * @author wetts
 * @version 1.0 2014/07/21
 * @since JDK1.5
 */
public class FinalDemo {

	public static void main(String[] args) {
		/*
		 * final修饰的引用类型，只是引用地址不变
		 */
		final Faoo f = new Faoo();
		System.out.println(f.a);
		f.a++;
		System.out.println(f.a);
	}
}

/*
 * final修饰的class不能被继承
 */
final class Faoo {

	int a = 10;
}

// class Fboo extends Faoo {
//
// }

class Fcoo {

	/*
	 * final修饰的method不能被重写
	 */
	public final void test() {
		@SuppressWarnings("unused")
		final int a = 5;
	}
}

class Fdoo extends Fcoo {

	// public final void test() {
	//
	// }
}
