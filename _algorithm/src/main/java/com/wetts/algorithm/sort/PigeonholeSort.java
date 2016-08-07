package com.wetts.algorithm.sort;

import java.util.Arrays;

/**
 * 鸽排序
 * 
 * @author wetts
 * @create 2015年12月2日
 *
 */
public class PigeonholeSort {
	
	public static void main(String[] args) {
		// 排序的数组
		int a[] = { 100, 93, 97, 92, 96, 99, 92, 89, 93, 97, 90, 94, 92, 95 };
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void sort(int[] arr) {
		int min = arr[0], max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		int[] basket = new int[max - min + 1]; 
		for(int i = 0; i < arr.length; i++) {
			basket[arr[i] - min] += 1;
		}
		int k = 0;
		for(int i = 0; i < basket.length; i++) {
			for(int j = 0; j < basket[i]; j++) {
				arr[k] = i + min;
				k++;
			}
		}
	}

}
