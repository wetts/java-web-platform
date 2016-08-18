package com.wetts.designpattern.proxy.example;

import com.wetts.designpattern.proxy.common.player.IGamePlayer;

public class GamePlayer implements IGamePlayer {

	@SuppressWarnings("unused")
	private String name = "";
	
	public GamePlayer(String name) {
		this.name = name;
	}
	
	@Override
	public void login(String user, String password) {
		System.out.println("user: " + user + ", password: " + password);
	}

	@Override
	public void killBoss() {
		System.out.println("kill boss..");
	}

	@Override
	public void upgrade() {
		System.out.println("upgrade..");
	}

}
