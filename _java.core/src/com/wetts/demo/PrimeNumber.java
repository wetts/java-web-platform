package com.wetts.demo;

import java.util.Arrays;

/**
 * 得出指定范围内的质数
 * 
 * @author wetts
 * @since 1.0, 2014/08/28
 */
public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(primeNumber(2, 100)));
	}
	
	public static int[] primeNumber(int start, int end) {
		if (start <= 1 || end < start) {
			throw new RuntimeException("输入错误");
		}
		int[] arr = new int[0];
		for (int i = start; i <= end; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				arr = Arrays.copyOf(arr, arr.length + 1);
				arr[arr.length - 1] = i;
			}
		}
		return arr;
	}
}
