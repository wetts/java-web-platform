package com.wetts.designpattern.visitor.expand.lotsVisitor;

import com.wetts.designpattern.visitor.common.CommonEmployee;
import com.wetts.designpattern.visitor.common.Employee;
import com.wetts.designpattern.visitor.common.Manager;

public class TotalVisitor implements ITotalVisitor {

private final static int MANAGER_COEFFICIENT = 5;
	
	private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
	
	private int commonTotalSalary = 0;
	
	private int managerTotalSalary = 0;
	
	private void calManagerSalary(int salary) {
		this.managerTotalSalary += salary * MANAGER_COEFFICIENT;
	}
	
	private void calCommonSalary(int salary) {
		this.commonTotalSalary += salary * COMMONEMPLOYEE_COEFFICIENT;
	}
	
	public void totalSalary() {
		System.out.println("Salary: " + (this.commonTotalSalary + this.managerTotalSalary));
	}
	
	@Override
	public void visit(CommonEmployee commonEmployee) {
		this.calCommonSalary(commonEmployee.getSalary());
		System.out.println(this.getCommonEmployee(commonEmployee));
	}
	
	@Override
	public void visit(Manager manager) {
		this.calManagerSalary(manager.getSalary());
		System.out.println(this.getManagerInfo(manager));
	}
	
	private String getBasicInfo(Employee employee) {
		String info = "姓名：" + employee.getName();
		info = info + "\t性别：" + employee.getSex();
		info = info + "\t薪水：" + employee.getSalary();
		return info;
	}
	
	private String getManagerInfo(Manager manager) {
		String basicInfo = this.getBasicInfo(manager);
		String otherInfo = "业绩：" + manager.getPerformance();
		return basicInfo + otherInfo;
	}
	
	private String getCommonEmployee(CommonEmployee commonEmployee) {
		String basicInfo = this.getBasicInfo(commonEmployee);
		String otherInfo = "工作：" + commonEmployee.getJob();
		return basicInfo + otherInfo;
	}

}
