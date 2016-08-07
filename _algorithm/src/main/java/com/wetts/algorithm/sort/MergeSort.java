package com.wetts.algorithm.sort;

import java.util.Arrays;

/**
 * 归并排序
 * 
 * @author wetts
 * @create 2015年12月2日
 *
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] a = new int[] { 4, 3, 6, 1, 2, 5, 8 };
		sort(a, 0, 1);
		System.out.println(Arrays.toString(a));
	}

	public static void sort(int[] a, int s, int len) {
		int size = a.length;
		int mid = size / (len << 1);
		int c = size & ((len << 1) - 1);
		// -------归并到只剩一个有序集合的时候结束算法-------//
		if (mid == 0)
			return;
		// ------进行一趟归并排序-------//
		for (int i = 0; i < mid; ++i) {
			s = i * 2 * len;
			merge(a, s, s + len, (len << 1) + s - 1);
		}
		// -------将剩下的数和倒数一个有序集合归并-------//
		if (c != 0)
			merge(a, size - c - 2 * len, size - c, size - 1);
		// -------递归执行下一趟归并排序------//
		sort(a, 0, 2 * len);
	}

	/**
	 * 二路归并 原理：将两个有序表合并和一个有序表
	 * 
	 * @param a
	 * @param s
	 *            第一个有序表的起始下标
	 * @param m
	 *            第二个有序表的起始下标
	 * @param t
	 *            第二个有序表的结束下标
	 * 
	 */
	private static void merge(int[] a, int s, int m, int t) {
		int[] tmp = new int[t - s + 1];
		int i = s, j = m, k = 0;
		while (i < m && j <= t) {
			if (a[i] <= a[j]) {
				tmp[k] = a[i];
				k++;
				i++;
			} else {
				tmp[k] = a[j];
				j++;
				k++;
			}
		}
		while (i < m) {
			tmp[k] = a[i];
			i++;
			k++;
		}
		while (j <= t) {
			tmp[k] = a[j];
			j++;
			k++;
		}
		System.arraycopy(tmp, 0, a, s, tmp.length);
	}

}