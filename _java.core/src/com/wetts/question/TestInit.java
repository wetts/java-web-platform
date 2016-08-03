package com.wetts.question;

public class TestInit {
	private static TestInit testInit = new TestInit();
	@SuppressWarnings("unused")
	private String name;

	public static void main(String[] args) {
		System.out.println(TestInit.getInit());
	}

	private TestInit() {
		this.init();
	}

	private void init() {
		TestInit.testInit.name = "张三";
	}

	public static TestInit getInit() {
		return testInit;
	}
}
