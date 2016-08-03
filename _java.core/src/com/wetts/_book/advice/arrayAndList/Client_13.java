package com.wetts._book.advice.arrayAndList;

import java.util.ArrayList;
import java.util.List;

/**
 * 生成子列表后不要在操作原列表
 * 
 * @author wetts
 * @created 2015/06/09
 *
 */
public class Client_13 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		List<String> subList = list.subList(0, 2);
		list.add("d");
		
		System.out.println(list.size());
		System.out.println(subList.size());
	}
}
