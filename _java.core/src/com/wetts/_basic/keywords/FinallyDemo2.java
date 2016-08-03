package com.wetts._basic.keywords;

/**
 * 
 * @author wetts
 * @since 1.0, 2014/07/31
 */
public class FinallyDemo2 {

	public static void main(String[] args) {
		System.out.println(test(null) + "," + test("") + "," + test("0"));
	}

	@SuppressWarnings("finally")
	public static int test(String str) {
		try {
			return str.charAt(0) - '0';
		} catch (NullPointerException e) {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}
}
