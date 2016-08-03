package com.wetts._api.copy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.SerializationUtils;

/**
 * apache拷贝工具包，默认深拷贝
 * 
 * @author wetts
 * @created 2015/06/22
 *
 */
public class ApacheCloneUtil {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		Coo coo = new Coo();
		coo.setList(list);
		Coo coo2 = SerializationUtils.clone(coo);
		
		list.add(3);
		
		System.out.println(coo.getList());
		System.out.println(coo2.getList());
	}
}

class Coo implements Serializable {

	private static final long serialVersionUID = 9185152847806520253L;
	
	private List<Integer> list;

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

}
