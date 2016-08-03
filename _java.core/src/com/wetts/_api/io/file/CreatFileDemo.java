package com.wetts._api.io.file;

import java.io.File;
import java.io.IOException;

/**
 * 在当前目录下的
 * 1/2创建demo.txt
 * 
 * @author wetts
 * @since 1.0, 2014/07/28
 */
public class CreatFileDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("1" + File.separator + "2" + File.separator + "demo.txt");
		File dir = file.getParentFile();
		if (!dir.exists()) {
			dir.mkdirs();
		}
		if (!file.exists()) {
			file.createNewFile();
		}
	}
}
