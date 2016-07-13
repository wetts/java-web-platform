/**
 * Copyright (c) 2014-2015 爱维宝贝web端团队   All rights reserved
 *
 * Base on awframework,powered by aiwei web team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.wetts.base.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件工具类
 * @author Chenz
 * @version 2014-10-15 10:30:30
 */
public class MyFileUtils {
	
	public static List<File> getFiles(File folder){
		List<File>files=new ArrayList<File>();
		iterateFolder(folder, files);
		return files;
	}
	
	private static void iterateFolder(File folder,List<File>files)  {
		  File flist[] = folder.listFiles();
		  files.add(folder);
		  if (flist == null || flist.length == 0) {
			  files.add(folder) ;
		  }else{
			  for (File f : flist) {
			      if (f.isDirectory()) {
			           iterateFolder(f,files);
			      } else {
			          files.add(f) ;
			      }
			 }
		 }
	}
}
