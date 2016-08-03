package com.wetts._api.containter.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 遍历map的三种方法
 * 
 * @author wetts
 * @since 1.0, 2014/07/29
 */
public class IteratorMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("张三", 99);
		map.put("李四", 75);
		map.put("王五", 87);
		map.put("赵六", 79);
		map.put("钱七", 64);
		/*
		 * 遍历所有的key
		 */
		Set<String> keyset = map.keySet();
		Iterator<String> it = keyset.iterator();
		while (it.hasNext()) {
			System.out.println("key:" + it.next());
		}

		/*
		 * 遍历所有的键值对 key - value Map会将一组键值对保存在一个名为Entry的对象中。
		 * Entry的泛型要与Map的泛型保持一致， 因为Entry是用来保持Map中每一组键值对的
		 */
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ": " + value);
		}

		/*
		 * 遍历所有的value（不常用）
		 */
		Collection<Integer> value = map.values();
		for (Integer integer : value) {
			System.out.println(integer);
		}
	}
}
