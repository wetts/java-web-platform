package com.wetts._api.enumeration;

public class Test {
	
	@org.junit.Test
	public void testColor() throws Exception {
		System.out.println(Color.BLACK);
		
		System.out.println(Color.RED.ordinal());
		
		System.out.println(Color.BLACK.equals(Color.BLACK));
		
		System.out.println(Color.RED.isRed());
		System.out.println(Color.BLACK.isRed());
	}

}
