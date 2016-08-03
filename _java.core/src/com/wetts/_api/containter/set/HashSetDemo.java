package com.wetts._api.containter.set;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet 需要 hashCode和equals 都相同才算是相同
 * 
 * @author wetts
 * @since 1.0, 2014/07/31
 */
public class HashSetDemo {

	public static void main(String[] args) {
		 Set<Aoo> set = new HashSet<Aoo>();
		 set.add(new Aoo(1));
		 set.add(new Aoo(2));
		 for (Aoo aoo : set) {
		 System.out.println(aoo.a);
		
			// Map<Aoo, Integer> map = new HashMap<Aoo, Integer>();
			// map.put(new Aoo(1), 1);
			// map.put(new Aoo(2), 2);
			// Set<Entry<Aoo, Integer>> set = map.entrySet();
			// for (Entry<Aoo, Integer> entry : set) {
			//	System.out.println(entry.getKey());
		}
	}
}

class Aoo {

	int a;

	public Aoo(int a) {
		this.a = a;
	}

	@Override
	public int hashCode() {
		return a;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}
}
