package com.framework.datautils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {
	/* Set the Configuration setUp path */
	File src;
	FileInputStream fis;
	Properties prop;

	/**
	 * Method for Loading property file
	 * 
	 * @param configFileName
	 * @throws Exception
	 */
	public void loadPropertyFile(String configFileName) throws Exception {
		src = new File(System.getProperty("user.dir") + File.separator + "resources" + File.separator + "testData"
				+ File.separator + configFileName);
		fis = new FileInputStream(src);
		prop = new Properties();
		prop.load(fis);
	}

	/**
	 * Method for Get the key value
	 * 
	 * @param propKey
	 * @return
	 */
	public String getProperty(String propKey) {
		return prop.getProperty(propKey);
	}


}
