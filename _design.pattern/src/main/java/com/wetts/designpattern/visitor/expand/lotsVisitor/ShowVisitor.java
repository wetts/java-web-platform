package com.wetts.designpattern.visitor.expand.lotsVisitor;

import com.wetts.designpattern.visitor.common.CommonEmployee;
import com.wetts.designpattern.visitor.common.Employee;
import com.wetts.designpattern.visitor.common.Manager;

public class ShowVisitor implements IShowVisitor {

	private String info = "";
	
	@Override
	public void visit(CommonEmployee commonEmployee) {
		System.out.println(this.getCommonEmployee(commonEmployee));
	}

	@Override
	public void visit(Manager manager) {
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

	@Override
	public void report() {
		System.out.println(this.info);
	}

}
