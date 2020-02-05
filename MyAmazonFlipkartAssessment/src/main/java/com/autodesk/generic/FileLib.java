package com.autodesk.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author HenTryRAj
 *
 */
public class FileLib {
	/**
	 * This method is used to get the data from Property file
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String path = "./src/test/resources/TestData/commonData.properties";

	public String getDataFromProperties(String key) throws IOException {
		FileInputStream fileObj = new FileInputStream(path);
		Properties pObj = new Properties();
		pObj.load(fileObj);
		String value = pObj.getProperty(key);
		return value;
	}

}