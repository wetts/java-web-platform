package com.wetts.algorithm.sort;

import java.util.Arrays;

/**
 * 快速排序
 * 
 * @author wetts
 * @created 2015/12/01
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 6, 3, 2, 8, 9, 1, 2, 0, 4 };
//		int[] arr = { 2, 1, 3, 4 };
		sort2(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] quickSort(int[] input) {

		return input;
	}

	public static void sort(int[] arr, int low, int high) {
		int l = low;
		int h = high;
		int povit = arr[low];
		while (l < h) {
			while (l < h && povit < arr[h]) {
				h--;
			}
			if (l < h) {
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				l++;
			}
			while (l < h && povit > arr[l]) {
				l++;
			}
			if (l < h) {
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				h--;
			}
		}
		if (l > low)
			sort(arr, low, l - 1);
		if (h < high)
			sort(arr, l + 1, high);
	}

	public static void sort2(int[] arr, int low, int high) {
		int l = low;
		int h = high;
		int povit = arr[low];
		while (l < h) {
			while (l < h && arr[h] >= povit) {
				h--;
			}
			if (l < h) {
				arr[l] = arr[h];
			}
			while (l < h && arr[l] <= povit) {
				l++;
			}
			if (l < h) {
				arr[h] = arr[l];
			}
		}
		arr[l] = povit;
		if (low < l - 1) {
			sort2(arr, low, l - 1);
		}
		if (l + 1 < high) {
			sort2(arr, l + 1, high);
		}
	}

}
