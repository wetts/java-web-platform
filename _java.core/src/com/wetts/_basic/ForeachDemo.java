package com.wetts._basic;

import java.util.ArrayList;
import java.util.List;

/**
 * foreach演示
 * 
 * @author wetts
 * @version 1.0, 2014/07/25
 */
public class ForeachDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		/*
		 * foreach
		 */
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
