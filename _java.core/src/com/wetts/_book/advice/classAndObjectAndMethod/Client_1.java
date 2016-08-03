package com.wetts._book.advice.classAndObjectAndMethod;

/**
 * 在接口中不要存在实现代码
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_1 {

	public static void main(String[] args) {
		B.s.doSomething();
	}
}

interface B {
	public static final S s = new S() {
		
		@Override
		public void doSomething() {
			System.out.println("B S doSomething");
		}
	}; 
}

interface S {
	public void doSomething();
}
