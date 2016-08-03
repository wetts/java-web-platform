package com.wetts._book.advice.arrayAndList;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合运算时使用更优雅的方式
 * 
 * @author wetts
 * @created 2015/06/09
 *
 */
public class Client_17 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		List<String> list2 = new ArrayList<String>();
		list2.add("c");
		list2.add("b");
		
		// 并集
		list1.addAll(list2);
		
		// 交集
		list1.retainAll(list2);
		
		// 差集
		list1.removeAll(list2);
		
		// 无重复的并集
		list2.removeAll(list1);
		list1.addAll(list2);
	}
}
