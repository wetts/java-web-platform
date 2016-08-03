package com.wetts._api.io.fileFilter;

import java.io.File;
import java.io.FileFilter;

/**
 * 使用匿名内部类，获取一个目录下所有满足条件的子项。
 * 
 * 回调模式
 * 
 * @author wetts
 * @since 1.0, 2014/07/29
 */
public class FileFilterDemo {

	public static void main(String[] args) {
		File file = new File(".");
		if (file.isDirectory()) {
			File[] files = file.listFiles(new FileFilter() {

				@Override
				public boolean accept(File pathname) {
					return pathname.getName().startsWith(".");
				}
			});
			for (File f : files) {
				System.out.println(f.getName());
			}
		}
	}
}
