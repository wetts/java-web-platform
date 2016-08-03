package com.wetts._api.io.file;

import java.io.File;

/**
 * 删除含有内容的目录
 */
public class DeleteDemo {

	public static void main(String[] args) {
		File dir = new File("1" + File.separator + "2");
		if (dir.exists()) {
			/*
			 * 若想删除目录，前提条件，该目录必须是一个空目录（不含有任何子项）
			 */
			dir.delete();
			System.out.println("删除完毕");
		}
	}
}
