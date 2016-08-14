package com.wetts.designpattern.adapter.expand;

import com.wetts.designpattern.adapter.common.user.IUserInfo;

import java.util.Map;

public class OuterUserInfo implements IUserInfo {

	@SuppressWarnings("unused")
	private IOuterUserBaseInfo baseInfo = null;
	@SuppressWarnings("unused")
	private IOuterUserHomeInfo homeInfo = null;
	@SuppressWarnings("unused")
	private IOuterUserOfficeInfo officeInfo = null;
	
	private Map<String, String> baseMap = null;
	private Map<String, String> homeMap = null;
	private Map<String, String> officeMap = null;
	
	public OuterUserInfo(IOuterUserBaseInfo baseInfo,
			IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
		this.baseInfo = baseInfo;
		this.homeInfo = homeInfo;
		this.officeInfo = officeInfo;
		this.baseMap = baseInfo.getUserBaseInfo();
		this.homeMap = homeInfo.getUserHomeInfo();
		this.officeMap = officeInfo.getUserOfficeInfo();
	}

	@Override
	public String getUserName() {
		System.out.println(this.baseMap.get("username"));
		return null;
	}

	@Override
	public String getHomeAddress() {
		System.out.println(this.homeMap.get("homeAddress"));
		return null;
	}

	@Override
	public String getMobileNumber() {
		System.out.println(this.baseMap.get("mobile number"));
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		System.out.println(this.officeMap.get("officeTelNumber"));
		return null;
	}

	@Override
	public String getJobPosition() {
		System.out.println(this.officeMap.get("jobPosition"));
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		System.out.println(this.homeMap.get("homeTelNumber"));
		return null;
	}

}
