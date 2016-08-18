package com.wetts.designpattern.proxy.expand.add;

import com.wetts.designpattern.proxy.common.player.IGamePlayer;
import com.wetts.designpattern.proxy.common.proxy.IProxy;

public class GamePlayerProxy implements IGamePlayer, IProxy {

	private IGamePlayer gamePlayer = null;
	
	public GamePlayerProxy(IGamePlayer gamePlayer) {
		this.gamePlayer = gamePlayer;
	}
	
	@Override
	public void count() {
		System.out.println("expense is 150 dollars");
	}

	@Override
	public void login(String user, String password) {
		this.gamePlayer.login(user, password);;
	}

	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
		this.count();
	}

	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
	}

}
