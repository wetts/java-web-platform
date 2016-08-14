package com.wetts.designpattern.composite.example;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		IRoot ceo = new Root("wetts", "总经理", 200000);
		IBranch developDep = new Branch("Any", "研发部门经理", 20000);
		IBranch salesDep = new Branch("Tom", "销售部门经理", 20000);
		IBranch financeDep = new Branch("Peter", "财务部门经理", 20000);
		IBranch firstDevGroup = new Branch("Mei", "开发一组组长", 15000);
		IBranch secondDevGroup = new Branch("Lee", "开发二组组长", 15000);
		ILeaf a = new Leaf("a", "开发人员", 10000);
		ILeaf b = new Leaf("b", "开发人员", 10000);
		ILeaf c = new Leaf("c", "开发人员", 10000);
		ILeaf d = new Leaf("d", "开发人员", 10000);
		ILeaf e = new Leaf("e", "开发人员", 10000);
		ILeaf f = new Leaf("f", "开发人员", 10000);
		ILeaf g = new Leaf("g", "开发人员", 10000);
		ILeaf h = new Leaf("h", "销售人员", 10000);
		ILeaf i = new Leaf("i", "销售人员", 10000);
		ILeaf j = new Leaf("j", "财务人员", 10000);
		ILeaf k = new Leaf("k", "CEO秘书", 10000);
		ILeaf mo = new Leaf("mo", "研发部副总", 180000);
		
		ceo.add(developDep);
		ceo.add(salesDep);
		ceo.add(financeDep);
		ceo.add(k);
		
		developDep.add(firstDevGroup);
		developDep.add(secondDevGroup);
		developDep.add(mo);
		
		firstDevGroup.add(a);
		firstDevGroup.add(b);
		firstDevGroup.add(c);
		
		secondDevGroup.add(d);
		secondDevGroup.add(e);
		secondDevGroup.add(f);
		secondDevGroup.add(g);
		
		salesDep.add(h);
		salesDep.add(i);
		
		financeDep.add(j);
		
		System.out.println(ceo.getInfo());
		
		getAllSuboradinateInfo(ceo.getSubordinateInfo());
	}
	
	private static void getAllSuboradinateInfo(List<Object> suboradinateList) {
		int length = suboradinateList.size();
		for (int i = 0; i < length; i++) {
			Object object = suboradinateList.get(i);
			if (object instanceof Leaf) {
				ILeaf employee = (ILeaf)object;
				System.out.println(employee.getInfo());
			} else {
				IBranch branch = (IBranch)object;
				System.out.println(branch.getInfo());
				getAllSuboradinateInfo(branch.getSubordinateInfo());
			}
		}
	}
}
