package com.wetts._book.advice.usual;

import java.util.Random;

/**
 * 莫让常量变成变量
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_2 {

	public static void main(String[] args) {
		System.out.println(Const.RAND_CONST);
	}
}

interface Const {
	
	public static final int RAND_CONST = new Random().nextInt();
}
