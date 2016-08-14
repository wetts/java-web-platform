package com.wetts.designpattern.visitor.example;

import com.wetts.designpattern.visitor.common.CommonEmployee;
import com.wetts.designpattern.visitor.common.Employee;
import com.wetts.designpattern.visitor.common.Manager;
import com.wetts.designpattern.visitor.common.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		for(Employee emp : mockEmployee()) {
			emp.accept(new Visitor());
		}
	}
	
	public static List<Employee> mockEmployee() {
		List<Employee> empList = new ArrayList<Employee>();
		CommonEmployee peter = new CommonEmployee();
		peter.setName("Peter");
		peter.setJob("Master");
		peter.setSex(1);
		peter.setSalary(10000);
		empList.add(peter);
		
		CommonEmployee ann = new CommonEmployee();
		ann.setName("Ann");
		ann.setJob("Master");
		ann.setSex(2);
		ann.setSalary(10000);
		empList.add(ann);
		
		Manager mo = new Manager();
		mo.setName("momo");
		mo.setPerformance("");
		mo.setSalary(50000);
		mo.setSex(2);
		empList.add(mo);
		
		return empList;
	}
}
