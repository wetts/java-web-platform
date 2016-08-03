package com.wetts._api.copy;

import java.util.ArrayList;
import java.util.List;

/**
 * 深拷贝
 * 
 * @author wetts
 * @created 2015/06/22
 *
 */
public class DeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		Boo boo = new Boo();
		boo.setList(list);
		Boo boo2 = boo.clone();
		
		list.add(3);
		
		System.out.println(boo.getList());
		System.out.println(boo2.getList());
	}
}

class Boo implements Cloneable {

	private List<Integer> list;

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Boo clone() throws CloneNotSupportedException {
		Boo boo = null;
		try {
			boo = (Boo) super.clone();
			boo.list = (List<Integer>) ((ArrayList<Integer>) (this.list)).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return boo;

	}
}
