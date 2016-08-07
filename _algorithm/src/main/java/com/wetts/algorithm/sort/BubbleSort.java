package com.wetts.algorithm.sort;

/**
 * 冒泡排序
 * 
 * @author wetts
 * @created 2015/11/30
 *
 */
public class BubbleSort {

	public static int[] bubbleSort(int[] input) {
		int temp;
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 0; j < input.length - 1 - i; j++) {
				if (input[j] > input[j + 1]) {
					temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		return input;
	}

}
