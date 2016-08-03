package com.wetts._api.io.inputStream.objectInputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.wetts._api.io._common.Person;

public class ObjectInputStreamDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person person = (Person)ois.readObject();
		fis = new FileInputStream("person.obj");
		ois = new ObjectInputStream(fis);
		Person person2 = (Person)ois.readObject();
		System.out.println(person);
		System.out.println(person.equals(person2));
		System.out.println(person == person2);
		fis.close();
	}
}
