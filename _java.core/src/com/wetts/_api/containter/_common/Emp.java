package com.wetts._api.containter._common;

/**
 * Emp类 公共测试使用
 * 
 * @author wetts
 * @since 1.0, 2014/07/31
 */
public class Emp {

	private String name;
	private int age;
	private char sex;
	private double salary;

	public Emp(String name, int age, char sex, double salary) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getSex() {
		return sex;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Emp [age=" + age + ", name=" + name + ", salary=" + salary + ", sex=" + sex + "]";
	}

	public boolean equals(Emp emp) {
		return this.salary == emp.salary;
	}
}
