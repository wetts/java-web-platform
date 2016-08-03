package com.wetts._basic.inherit.demo;

/**
 * 继承与instanceof
 * 
 * @author wetts
 * @created 2015/06/22
 *
 */
public class Client {

	public static void main(String[] args) {
		Aoo a1 = new Boo();
		System.out.println(a1 instanceof Aoo);
		System.out.println(a1 instanceof Boo);
		
		Aoo a2 = new Aoo();
		System.out.println(a2 instanceof Aoo);
		System.out.println(a2 instanceof Boo);
	}
}

class Aoo {
	
}

class Boo extends Aoo {
	
}
