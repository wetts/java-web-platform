package com.wetts._api.containter.list;

import java.util.Arrays;
import java.util.List;

import com.wetts._api.containter._common.Emp;

/**
 * 数组转换成集合
 * 
 * ps:通过Arrays.asList方法转换的集合是一个只读的
 * 
 * @author wetts
 * @version 1.0, 2014/07/25
 */
public class ArrayToListDemo {

	public static void main(String[] args) {
		Emp[] empArray = new Emp[]{
				new Emp("Terry", 24, 'm', 6000),
				new Emp("Allen", 21, 'f', 4000),
				new Emp("Smith", 23, 'm', 2000)
		};
		List<Emp> emps = Arrays.asList(empArray);
		System.out.println(emps);
		/*
		 * 通过Arrays.asList方法转换的集合是一个只读的
		 */
//		emps.add(new Emp("Mary", 24, 'm', 3000));
//		System.out.println(emps);
	}
}
