package com.wetts.designpattern.proxy.example;

import com.wetts.designpattern.proxy.common.player.IGamePlayer;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("momo");
		IGamePlayer proxy = new GamePlayerProxy(player);
		System.out.println(new Date());
		proxy.login("momo", "123456");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println(new Date());
	}
}
