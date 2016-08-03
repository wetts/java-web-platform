package com.wetts._book.advice.arrayAndList;

import java.util.List;

/**
 * 推荐使用subList处理局部列表
 * 
 * 一个列表有100个元素，现在要删除位置为20-30的元素
 * 
 * @author wetts
 * @created 2015/06/09
 *
 */
public class Client_12 {

	public static void remove1(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if(i >= 20 && i <=30) {
				list.remove(i);
			}
		}
	}

	public static void remove2(List<Integer> list) {
		list.subList(20, 31).clear();
	}

}
