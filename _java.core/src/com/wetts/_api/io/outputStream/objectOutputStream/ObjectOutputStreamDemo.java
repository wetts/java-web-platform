package com.wetts._api.io.outputStream.objectOutputStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.wetts._api.io._common.Person;

/**
 * ObjectOutputStream 用于对对象进行序列化的流
 * 
 * @author wetts
 * @since 1.0, 2014/07/30
 */
public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		Person person = new Person();
		person.setName("张三");
		person.setAge(15);
		person.setGender("男");
		person.setSalary(1000);
		List<String> list = new ArrayList<String>();
		list.add("住在北京");
		list.add("至今单身");
		person.setOtherInfo(list);
		System.out.println(person);
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(person);
		oos.close();
		System.out.println("序列化完毕");
	}
}
