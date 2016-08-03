package com.wetts._api.containter.list;

import java.util.ArrayList;
import java.util.List;

/**
 * subList方法演示
 * 
 * subList方法用于获取List集合的子集
 * 
 * @author wetts
 * @version 1.0, 2014/07/25
 */
public class SubListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		/*
		 * 取子集3-7
		 */
		List<Integer> subList = list.subList(3, 8);
		System.out.println(subList);
		for (int i = 0; i < subList.size(); i++) {
			subList.set(i, subList.get(i) * 10);
		}
		/*
		 * 对自己元素的修改，会影响原集合
		 */
		System.out.println(subList);
		System.out.println(list);
	}
}
