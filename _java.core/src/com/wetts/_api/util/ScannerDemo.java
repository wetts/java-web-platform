package com.wetts._api.util;

import java.util.Scanner;

/**
 * 
 * @author wetts
 * @since 1.0, 2014/07/31
 */
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		if (s.nextInt() == 1) {
			System.out.println("true");
		}
		s.close();
	}
}
