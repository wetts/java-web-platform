package com.wetts._book.advice.arrayAndList;

import java.util.Arrays;
import java.util.List;

/**
 * 避开基本类型数组转换陷阱
 * 
 * @author wetts
 * @created 2015/06/08
 *
 */
public class Client_6 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		int[] data = {1, 2, 3, 4, 5};
		List list = Arrays.asList(data);
		System.out.println(list.size());
	}
}
