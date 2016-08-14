package com.wetts.designpattern.memento.expand.lotsState;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class BeanUtils {

	public static Map<String, Object> backupProp(Object bean) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			for(PropertyDescriptor des : descriptors) {
				String fieldName = des.getName();
				Method getter = des.getReadMethod();
				Object fieldValue = getter.invoke(bean, new Object[]{});
				if(!fieldName.equalsIgnoreCase("class")) {
					result.put(fieldName, fieldValue);
				}
			}
		} catch (IntrospectionException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void restoreProp(Object bean, Map<String, Object> propMap) {
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			for(PropertyDescriptor des : descriptors) {
				String fieldName = des.getName();
				if(propMap.containsKey(fieldName)) {
					Method setter = des.getWriteMethod();
					setter.invoke(bean, new Object[] {propMap.get(fieldName)});
				}
			}
		} catch (IntrospectionException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
}
