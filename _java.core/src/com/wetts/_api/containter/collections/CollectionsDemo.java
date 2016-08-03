package com.wetts._api.containter.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wetts._api.containter._common.Emp;

/**
 * Collections方法演示
 * 
 * @author wetts
 * @version 1.0, 2014/07/25
 */
public class CollectionsDemo {

	public static void main(String[] args) {
		List<Emp> emps = new ArrayList<Emp>();
		emps.add(new Emp("Terry", 24, 'm', 6000));
		emps.add(new Emp("Allen", 21, 'f', 4000));
		emps.add(new Emp("Smith", 23, 'm', 2000));
		Collections.sort(emps, new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
		});
		System.out.println(emps);
	}
}
