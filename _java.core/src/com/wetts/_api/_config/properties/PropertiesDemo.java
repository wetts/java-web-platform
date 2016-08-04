package com.wetts._api._config.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		/*
		 * ??????????
		 * clientconfig.properties
		 */
		Properties properties = new Properties();
		/*
		 * load(InputStream in)
		 * ?÷????????????????ж???????????????
		 */
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("src/core/config/properties/cfg.properties");
			properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ???????????
		String host = properties.getProperty("server_host");
		String port = properties.getProperty("server_port");
		System.out.println("????????ip??" + host);
		System.out.println("???????????" + port);
	}
}
