package com.wetts._book.advice.usual;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

/**
 * 慎用动态编译
 * 
 * @author wetts
 * @created 2015/06/07 
 *
 */
public class Client_17 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// Java 源代码
		String sourceStr = "public class Hello {public String sayHello(String name) {return \"hello, \" + name + \"!\";}}";
		// 类名以及文件名
		String className = "Hello";
		// 方法名
		String methodName = "sayHello";
		// 当前编译器
		JavaCompiler cmp = ToolProvider.getSystemJavaCompiler();
		// Java标准文件管理器
		StandardJavaFileManager fm = cmp.getStandardFileManager(null, null, null);
		// Java文件对象
		JavaFileObject jfo = new StringJavaObject(className, sourceStr); 
		// 编译参数，类似于javac <options> 中的options
		List<String> optionList = new ArrayList<String>();
		// 编译文件的存放地方，注意，此处是为Eclipse工具特设的
		optionList.addAll(Arrays.asList("-d", "./bin"));
		// 要编译的单元
		List<JavaFileObject> jfos = Arrays.asList(jfo);
		// 设置编译环境
		JavaCompiler.CompilationTask task = cmp.getTask(null, fm, null, optionList, null, jfos);
		// 编译成功
		if(task.call()) {
			// 生成对象
			Object obj = Class.forName(className).newInstance();
			Class<? extends Object> cls = obj.getClass();
			Method m = cls.getMethod(methodName, String.class);
			String str = (String) m.invoke(cls, "hehe");
			System.out.println(str);
		}
	}
	
}

class StringJavaObject extends SimpleJavaFileObject {
	
	private String content = "";
	
	public StringJavaObject(String javaFileName, String content) {
		super(_createStringJavaObjectUri(javaFileName), Kind.SOURCE);
	}
	
	private static URI _createStringJavaObjectUri(String name) {
		return URI.create("String:///" + name + Kind.SOURCE.extension);
	}
	
	@Override
	public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
		return content;
	}
	
}
