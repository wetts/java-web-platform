package com.wetts.designpattern.visitor.common;

public class Visitor implements IVisitor {

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

}
