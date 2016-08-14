package com.wetts.designpattern.proxy.expand.normal;

import com.wetts.designpattern.proxy.common.player.IGamePlayer;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		IGamePlayer proxy = new GamePlayerProxy("momo");
		System.out.println(new Date());
		proxy.login("momo", "123456");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println(new Date());
	}
}
