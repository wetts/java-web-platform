package com.wetts.designpattern.proxy.common.player;

public interface IGamePlayer {

	public void login(String user, String password);
	
	public void killBoss();
	
	public void upgrade();
}
