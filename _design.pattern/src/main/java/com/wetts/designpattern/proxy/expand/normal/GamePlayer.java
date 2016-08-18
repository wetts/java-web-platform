package com.wetts.designpattern.proxy.expand.normal;

import com.wetts.designpattern.proxy.common.player.IGamePlayer;

public class GamePlayer implements IGamePlayer {

	@SuppressWarnings("unused")
	private String name = "";
	
	public GamePlayer(IGamePlayer gamePlayer, String name) {
		if(gamePlayer == null) {
			throw new RuntimeException("不能创建真实角色！");
		} else {
			this.name = name;
		}
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
