package com.wetts.designpattern.flyweight.normal;

public abstract class Flyweight {
	
	// 内部状态
	private String intrinsic;
	
	// 外部状态
	protected final String Extrinsic;
	
	public Flyweight(String Extrinsic) {
		this.Extrinsic = Extrinsic;
	}
	
	public abstract void operate();

	public String getIntrinsic() {
		return intrinsic;
	}

	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}
}
