package com.wetts.designpattern.adapter.common.user;

public class UserInfo implements IUserInfo {

	@Override
	public String getUserName() {
		System.out.println("UserName");
		return null;
	}

	@Override
	public String getHomeAddress() {
		System.out.println("HomeAddress");
		return null;
	}

	@Override
	public String getMobileNumber() {
		System.out.println("MobileNumber");
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		System.out.println("OfficeTelNumber");
		return null;
	}

	@Override
	public String getJobPosition() {
		System.out.println("JobPosition");
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		System.out.println("HomeTelNumber");
		return null;
	}

}
