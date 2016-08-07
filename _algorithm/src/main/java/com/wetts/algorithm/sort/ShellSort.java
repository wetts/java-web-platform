package com.wetts.algorithm.sort;

/**
 * 希尔排序
 * 
 * @author wetts
 * @create 2016年1月12日
 * 
 */
public class ShellSort {

	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		System.out.println("排序之前：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		// 希尔排序
		int d = a.length;
		while (true) {
			d = d / 2;
			for (int x = 0; x < d; x++) {
				for (int i = x + d; i < a.length; i = i + d) {
					int temp = a[i];
					int j;
					for (j = i - d; j >= 0 && a[j] > temp; j = j - d) {
						a[j + d] = a[j];
					}
					a[j + d] = temp;
				}
			}
			if (d == 1) {
				break;
			}
		}
//		while (true) {
//			for (int i = 0; i < d; i++) {
//				for (int j = i; j + d < a.length; j += d) {
//					int temp;
//					if (a[j] > a[j + d]) {
//						temp = a[j];
//						a[j] = a[j + d];
//						a[j + d] = temp;
//					}
//				}
//			}
//
//			if (d == 1) {
//				break;
//			}
//			d--;
//		}
		System.out.println();
		System.out.println("排序之后：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
