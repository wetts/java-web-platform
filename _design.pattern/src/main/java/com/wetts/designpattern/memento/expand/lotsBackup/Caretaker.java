package com.wetts.designpattern.memento.expand.lotsBackup;

import com.wetts.designpattern.memento.common.Memento;

import java.util.HashMap;
import java.util.Map;

public class Caretaker {

	private Map<String, Memento> memMap = new HashMap<String, Memento>();

	public Map<String, Memento> getMemMap() {
		return memMap;
	}

	public void setMemMap(Map<String, Memento> memMap) {
		this.memMap = memMap;
	}
	
}
