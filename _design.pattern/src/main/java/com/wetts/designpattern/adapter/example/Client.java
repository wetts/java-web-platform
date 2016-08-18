package com.wetts.designpattern.adapter.example;

import com.wetts.designpattern.adapter.common.user.IUserInfo;

public class Client {

	public static void main(String[] args) {
		IUserInfo youngGirl = new OuterUserInfo();
		for(int i = 0; i < 100; i++) {
			youngGirl.getHomeAddress();
		}
	}
}
