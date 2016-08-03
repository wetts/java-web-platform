package com.wetts._book.advice.arrayAndList;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * 多种最值算法，适时选择
 * 
 * @author wetts
 * @created 2015/06/08
 *
 */
public class Client_5 {

	public static int max1(int[] data) {
		int max = data[0];
		for(int i : data) {
			max = max > i ? max : i;
		}
		return max;
	}
	
	public static int max2(int[] data) {
		Arrays.sort(data);
		return data[data.length - 1];
	}
	
	public static int getSecond(Integer[] data) {
		List<Integer> dataList = Arrays.asList(data);
		TreeSet<Integer> ts = new TreeSet<Integer>(dataList);
		return ts.lower(ts.last());
	}
}
