package com.wetts.designpattern.proxy.expand.force;

/**
 * 强制代理
 * 
 * @author wetts
 * @since 2015/05/27
 */
public class Client {

	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("momo");
		player.login("momo", "112233");
		IGamePlayer proxy = player.getProxy();
		player.killBoss();
		proxy.upgrade();
	}
}
