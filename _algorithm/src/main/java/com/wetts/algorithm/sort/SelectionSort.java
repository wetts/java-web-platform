package com.wetts.algorithm.sort;

import java.util.Arrays;

/**
 * 选择排序
 * 
 * @author wetts
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 3, 4 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int[] arr) {
		int minIndex = 0;
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			minIndex = i;// 无序区的最小数据数组下标
			for (int j = i + 1; j < arr.length; j++) {
				// 在无序区中找到最小数据并保存其数组下标
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				// 如果不是无序区的最小值位置不是默认的第一个数据，则交换之。
				temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}

}
