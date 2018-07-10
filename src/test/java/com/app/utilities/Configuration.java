package com.app.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	static Properties properties;
	static {
		String filePath = "src/test/resources/TestData/test.properties";

		FileInputStream input;
		try {
			input = new FileInputStream(filePath);
			properties = new Properties();
			properties.load(input);
			input.close();
		} catch (IOException e) {
			System.out.println("File not found");
		}
	}

	public static String getPropVal(String key) {
		return properties.getProperty(key);

	}

}
