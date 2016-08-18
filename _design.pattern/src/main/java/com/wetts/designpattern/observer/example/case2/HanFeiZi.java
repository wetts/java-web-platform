package com.wetts.designpattern.observer.example.case2;

import com.wetts.designpattern.observer.common.IHanFeiZi;
import com.wetts.designpattern.observer.common.ILiSi;
import com.wetts.designpattern.observer.common.LiSi;

public class HanFeiZi implements IHanFeiZi {

	private ILiSi liSi = new LiSi();
	
	@Override
	public void haveBreakfast() {
		System.out.println("HanFeiZi have breakfast..");
		liSi.update("HanFeiZi have breakfast..");
	}

	@Override
	public void haveFun() {
		System.out.println("HanFeiZi have fun..");
		liSi.update("HanFeiZi have fun..");
	}

}
