package com.wetts._api.containter.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.wetts._api.containter._common.Emp;

/**
 * 集合转换成数组
 * 
 * @author wetts
 * @version 1.0, 2014/07/25
 */
public class ListToArrayDemo {

	public static void main(String[] args) {
		List<Emp> emps = new ArrayList<Emp>();
		emps.add(new Emp("Terry", 24, 'm', 6000));
		emps.add(new Emp("Allen", 21, 'f', 4000));
		Emp[] empArray = emps.toArray(new Emp[emps.size()]);
		System.out.println(Arrays.toString(empArray));
		emps.add(new Emp("Smith", 23, 'm', 2000));
	}
}
