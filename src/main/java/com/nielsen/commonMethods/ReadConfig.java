package com.nielsen.commonMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.Assert;

public class ReadConfig {

	public static Properties configProperties;

	public static Properties loadConfigFile() {
		try {
			configProperties = new Properties();
			configProperties.load(getFileInputStream("config.properties"));
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.assertTrue(false);
		}
		return configProperties;
	}

	private static InputStream getFileInputStream(String filePath) {
		try {
			return new FileInputStream(System.getProperty("user.dir") + File.separator + filePath);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.assertTrue(false);
			return null;
		}
	}

	public static String readConfigFile(String propertyName) {
		Object configFileValue = configProperties.getProperty(propertyName);
		return String.valueOf((configFileValue != null) ? configFileValue
				: (new NullPointerException("Undefined Property in 'config.properties' file - " + propertyName)));
	}

}
