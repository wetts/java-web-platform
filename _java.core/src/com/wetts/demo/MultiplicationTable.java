package com.wetts.demo;

/**
 * 99乘法表
 * 
 * @author wetts
 * @since 1.0, 2014/08/28
 */
public class MultiplicationTable {

	public static void main(String[] args) {
		for (int row = 1; row < 10; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + "*" + row + "=" + row * col + "\t");
			}
			System.out.println();
		}
	}
}
