package com.wetts.designpattern.proxy.expand.force;

public class GamePlayer implements IGamePlayer {

	private String name = "";
	
	private IGamePlayer proxy = null;
	
	public GamePlayer(String name) {
		this.name = name;
	}
	
	@Override
	public void login(String user, String password) {
		if(this.isProxy()) {
			System.out.println("user: " + user + ", password: " + password);
		} else {
			System.out.println("please use proxy");
		}
	}

	@Override
	public void killBoss() {
		if(this.isProxy()) {
			System.out.println("kill boss..");
		} else {
			System.out.println("please use proxy");
		}
	}

	@Override
	public void upgrade() {
		if(this.isProxy()) {
			System.out.println("upgrade..");
		} else {
			System.out.println("please use proxy");
		}
	}

	@Override
	public IGamePlayer getProxy() {
		this.proxy = new GamePlayerProxy(this);
		return this.proxy;
	}

	private boolean isProxy() {
		if(this.proxy == null) {
			return false;
		} else {
			return true;
		}
	}
}
