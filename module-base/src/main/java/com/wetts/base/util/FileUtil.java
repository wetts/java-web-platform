package com.wetts.base.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.wetts.init.article.constant.ComputerSystem;

/**
 * 文件相关的工具方法
 * 
 * @author wetts
 * @create 2016-1-29
 *
 */
public class FileUtil {

	private static SimpleDateFormat dataFormat;

	static {
		dataFormat = new SimpleDateFormat("yyyy-MM-dd  HH:mm");
	}

	// 私有化构造函数，不让工具类被实例化
	private FileUtil() {}

	/**
	 * 获取文件的创建时间
	 * 
	 * 只有 Windows 系统中的，文件路径不带空格的文件去创建时间，其他的情况取文件的最后修改时间
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static Date getFileCreateTime(File file) {
		String osName = System.getProperties().getProperty("os.name");
		Date strTime = null;
		if(file.exists() && file.isFile()) {
			String fileName = file.getName();
			// Windows 系统，并且文件名中不带空格
			if(osName.toUpperCase().indexOf(ComputerSystem.WINDOWS.toString()) != -1 && fileName.indexOf(" ") == -1) {
				// 如果文件路径中有空格，该方法不适用
				try {
					Process p = Runtime.getRuntime().exec("cmd /C dir " + file.getAbsolutePath() + "/tc");
					BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
					String line;
					while((line = br.readLine()) != null) {
						if(line.endsWith(fileName.substring(fileName.lastIndexOf("."), fileName.length()))) {
							strTime = dataFormat.parse(line.substring(0, 17));
							break;
						}
					}
				} catch(IOException e) {
					e.printStackTrace();
				} catch(ParseException e) {
					e.printStackTrace();
				}
			} else {
				strTime = new Date(file.lastModified());
			}
		} else {
			throw new RuntimeException("File 文件不存在 或者 为目录");
		}
		return strTime;
	}

}
