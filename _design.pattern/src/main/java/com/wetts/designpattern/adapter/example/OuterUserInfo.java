package com.wetts.designpattern.adapter.example;

import com.wetts.designpattern.adapter.common.user.IUserInfo;
import com.wetts.designpattern.adapter.common.user.OuterUser;

public class OuterUserInfo extends OuterUser implements IUserInfo {

	@Override
	public String getUserName() {
		System.out.println(this.getUserBaseInfo().get("username"));
		return null;
	}

	@Override
	public String getHomeAddress() {
		System.out.println(this.getUserHomeInfo().get("homeAddress"));
		return null;
	}

	@Override
	public String getMobileNumber() {
		System.out.println(this.getUserBaseInfo().get("mobile number"));
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		System.out.println(this.getUserOfficeInfo().get("officeTelNumber"));
		return null;
	}

	@Override
	public String getJobPosition() {
		System.out.println(this.getUserOfficeInfo().get("jobPosition"));
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		System.out.println(this.getUserHomeInfo().get("homeTelNumber"));
		return null;
	}

}
