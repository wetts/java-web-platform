package com.wetts._api.containter.map;

import java.util.HashMap;
import java.util.Map;

import com.wetts._api.containter._common.Emp;

/**
 * map的基本操作
 * 
 * @author wetts
 * @since 1.0, 2014/07/29
 */
public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Emp> map = new HashMap<String, Emp>();

		/*
		 * V put(K k, V v) 用于将给定的key与value存入map
		 * 若使用重复的key存入元素，则是替换value操作，返回值是被替换的元素 第一次存入则返回值为null
		 */
		Emp e = map.put("张三", new Emp("张三", 22, '男', 5000));
		System.out.println(e);
		map.put("李四", new Emp("李四", 23, '女', 6000));
		e = map.put("张三", new Emp("王五", 33, '男', 4444));
		System.out.println(e);
		System.out.println(map);
	}
}
