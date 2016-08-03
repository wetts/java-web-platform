package com.wetts._api.throwable.exception;

/**
 * 
 * @author wetts
 * @created 2015/06/06
 *
 */
public class ExceptionDemo2 {
	
	public static void main(String[] args) {
		try {
			dosome();
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
	}

	public static void dosome() throws Exception {
		try {
			throw new RuntimeException("真实原因");
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}
