package com.wetts._book.advice.usual;

/**
 * 不要让旧语法困扰你
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_8 {

	public static void main(String[] args) {
		int fee = 20;
		saveDefault:save(fee);
	}
	
	static void saveDefault() {
		System.out.println("saveDefault");
	}
	
	static void save(int fee) {
		System.out.println("save");
	}
}
