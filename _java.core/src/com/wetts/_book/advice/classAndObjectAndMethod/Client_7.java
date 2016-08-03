package com.wetts._book.advice.classAndObjectAndMethod;

public class Client_7 {

	public static void main(String[] args) {
		new Base_7();
		new Base_7("");
		new Base_7(0);
		System.out.println(Base_7.getNumOfObjects());
	}
}

class Base_7 {
	
	private static int numofObjects = 0;
	
	{
		numofObjects++;
	}
	
	public Base_7() {
		
	}
	
	public Base_7(String str) {
		this();
	}
	
	public Base_7(int i) {
		
	}
	
	public static int getNumOfObjects() {
		return numofObjects;
	}
}
