package com.wetts._api.reflection.demo;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassDemo implements Serializable {

	private static final long serialVersionUID = 5131893869705814644L;

	@SuppressWarnings("unused")
	private String test;
	
	public ClassDemo() {
	}

	public ClassDemo(String str) {
	}

	public void test() throws Exception {
		System.out.println("Test ...");
	}

	public void test(String str) throws Exception {
		System.out.println("Test str ...");
	}

	public static void main(String[] args) throws Exception {
		Class<?> cls1 = Class.forName("com.wetts._api.reflection.demo.ClassDemo");
		Class<?> cls2 = ClassDemo.class;
		Class<?> cls3 = new ClassDemo().getClass();

		System.out.println("Class1 name : " + cls1.getName());
		System.out.println("Class2 name : " + cls2.getName());
		System.out.println("Class3 name : " + cls3.getName());

		// 以无参的方式构造
		ClassDemo cd = (ClassDemo) cls1.newInstance();
		cd.test();

		// //////////////////////////////
		// 类相关
		// 父类的构造器
		Constructor<?>[] c = cls1.getConstructors();
		System.out.println("constuctor's number : " + c.length);
		// 自己的构造器
		Constructor<?>[] dC = cls1.getDeclaredConstructors();
		System.out.println("d constuctor's number : " + dC.length);

		Class<?>[] i = cls1.getInterfaces();
		System.out.println("interface's number : " + i.length);

		System.out.println("是否为synthetic class : " + cls1.isSynthetic());

		Class<?> superClass = cls1.getSuperclass();
		System.out.println("父类 : " + superClass.getName());

		System.out.println("权限 : " + Modifier.toString(cls1.getModifiers()));
		
		System.out.println("//////////////////////////////////");
		// /////////////////////////////////
		// 类的方法
		// 父类的方法
		Method[] methods = cls1.getMethods();
		System.out.println("method's number : " + methods.length);
		// 自己的方法
		Method[] dMethods = cls1.getDeclaredMethods();
		System.out.println("d method's number : " + dMethods.length);

		Method testMethod = cls1.getMethod("test");
		System.out.println("方法名 : " + testMethod.getName());
		Class<?> returnClass = testMethod.getReturnType();
		System.out.println("方法返回值类型 : " + returnClass.getName());
		Class<?>[] para = testMethod.getParameterTypes();
		System.out.println("para's number : " + para.length);
		Class<?>[] exce = testMethod.getExceptionTypes();
		System.out.println("exce's number : " + exce.length);

		testMethod.invoke(cls1.newInstance());
		cls1.getMethod("test", String.class).invoke(cls1.newInstance(), "test");

		System.out.println("//////////////////////////////////");
		// ////////////////////////////////
		// 类的属性
		// 父类的属性
		Field[] fields = cls1.getFields();
		System.out.println("field's number : " + fields.length);
		// 自己的属性
		Field[] dFields = cls1.getDeclaredFields();
		System.out.println("d field's number : " + dFields.length);

		Field testField = cls1.getDeclaredField("test");
		// 设置可不可访问
		testField.setAccessible(true);
		testField.set(cd, "AAA");
		System.out.println(testField.get(cd));

		System.out.println("//////////////////////////////////");
		// ////////////////////////////////
		int[] arr = { 1, 2, 3, 4, 5 };
		// 返回数组对象类
		Class<?> arrClass = arr.getClass().getComponentType();
		System.out.println("数组类型： " + arrClass.getName());
		System.out.println("数组长度  " + Array.getLength(arr));
		System.out.println("数组的第一个元素: " + Array.get(arr, 0));
		Array.set(arr, 0, 100);
		System.out.println("修改之后数组第一个元素为： " + Array.get(arr, 0));
	}

}
