package com.wetts._api.reflection.demo.demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 
 * @author wetts
 * @version 1.0 2015/05/12
 */
public class ReflectTest {

	public static Car initByDefaultConst() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class<?> clazz = loader.loadClass("core.reflection.demo.demo1.Car");
		Constructor<?> cons = clazz.getDeclaredConstructor((Class[])null);
		Car car = (Car)cons.newInstance();
		Method setBrand = clazz.getMethod("setBrand", String.class);
		setBrand.invoke(car, "红旗");
		Method setColor = clazz.getMethod("setColor", String.class);
		setColor.invoke(car, "黑色");
		Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
		setMaxSpeed.invoke(car, 100);
		return car;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Car car = initByDefaultConst();
		car.introduce();
	}
	
}
