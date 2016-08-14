package com.wetts.designpattern.observer.example.case1;

import com.wetts.designpattern.observer.common.IHanFeiZi;

public class HanFeiZi implements IHanFeiZi {

	private boolean isHavingBreakfast = false;
	
	private boolean isHavingFun = false;
	
	@Override
	public void haveBreakfast() {
		System.out.println("HanFeiZi hava breakfast..");
		this.isHavingBreakfast = true;
	}

	@Override
	public void haveFun() {
		System.out.println("HanFeiZi have fun..");
		this.isHavingFun = true;
	}

	public boolean isHavingBreakfast() {
		return isHavingBreakfast;
	}

	public void setHavingBreakfast(boolean isHavingBreakfast) {
		this.isHavingBreakfast = isHavingBreakfast;
	}

	public boolean isHavingFun() {
		return isHavingFun;
	}

	public void setHavingFun(boolean isHavingFun) {
		this.isHavingFun = isHavingFun;
	}
	
}
