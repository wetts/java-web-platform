package com.wetts.algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序
 * 
 * @author wetts
 * @created 2015/12/02
 *
 */
public class InsertionSort {
	
	public static void main(String[] args) {
		int[] arr = { 2, 1, 3, 4 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					break;
				}
			}
		}
	}

}
