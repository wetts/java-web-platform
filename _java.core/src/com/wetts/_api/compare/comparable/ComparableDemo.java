package com.wetts._api.compare.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wetts._api.io._common.Emp;

/**
 * Comparable演示
 * 
 * @author wetts
 * @version 1.0, 2014/07/25
 */
public class ComparableDemo {

	public static void main(String[] args) {
		List<EmpTest> emps = new ArrayList<EmpTest>();
		emps.add(new EmpTest("Terry", 24, 'm', 6000));
		emps.add(new EmpTest("Allen", 21, 'f', 4000));
		emps.add(new EmpTest("Smith", 23, 'm', 2000));
		Collections.sort(emps);
		System.out.println(emps);
	}
}

class EmpTest extends Emp implements Comparable<EmpTest> {

	public EmpTest(String name, int age, char sex, double salary) {
		super(name, age, sex, salary);
	}

	@Override
	public int compareTo(EmpTest o) {
		return (int) (this.getSalary() - o.getSalary());
	}
}
