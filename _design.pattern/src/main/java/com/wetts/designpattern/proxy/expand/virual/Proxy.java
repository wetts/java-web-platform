package com.wetts.designpattern.proxy.expand.virual;

import com.wetts.designpattern.proxy.normal.RealSubject;
import com.wetts.designpattern.proxy.normal.Subject;

/**
 * 虚拟代理
 * 
 * @author wetts
 * @since 2015/05/27
 */
public class Proxy implements Subject {

	private Subject subject;
	
	@Override
	public void request() {
		if(subject == null) {
			subject = new RealSubject();
		}
		subject.request();
	}

}
