package com.wetts._api.copy;

import java.util.ArrayList;
import java.util.List;

/**
 * 浅拷贝
 * 
 * @author wetts
 * @created 2015/06/22
 *
 */
public class ShalowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		Aoo aoo = new Aoo();
		aoo.setList(list);
		Aoo aoo2 = aoo.clone();
		
		list.add(3);
		
		System.out.println(aoo.getList());
		System.out.println(aoo2.getList());
	}
}

class Aoo implements Cloneable {

	private List<Integer> list;

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	@Override
	protected Aoo clone() throws CloneNotSupportedException {
		Aoo aoo = null;
		try {
			aoo = (Aoo) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return aoo;

	}
}
