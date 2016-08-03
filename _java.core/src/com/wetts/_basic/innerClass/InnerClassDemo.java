package com.wetts._basic.innerClass;

/**
 * 内部类演示
 * 
 * @author wetts
 * @version 1.0, 2014/07/21
 * @version JDK1.5
 */
public class InnerClassDemo {

	public static void main(String[] args) {

	}
}

class Outer {

	static int a = 5;

	static class Inner {

		public static final int c = 6;

		public void testIn() {
			System.out.println(a);
		}
	}

	public void test() {
		final int b = 6;
		
		@SuppressWarnings("hiding")
		class Inner {

			public static final int d = 9;

			public void testTestIn() {
				System.out.println(b);
			}
		}
		System.out.println(Inner.d);
		
		new Inner().testTestIn();
	}
}
