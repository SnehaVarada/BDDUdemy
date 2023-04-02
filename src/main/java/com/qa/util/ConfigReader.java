package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties prop;
	
	//This method is used to load the properties from config.properties file
	//@returns its properties prop object
	
	public Properties init_prop() {
		
		prop = new Properties();
		try 
		{
			//FileInputStream ip = new FileInputStream("C:\\\\Users\\\\saisn\\\\eclipse-workspace\\\\BDDUdemy\\\\src\\\\test\\\\resources\\\\config\\\\Config.properties");
			FileInputStream ip = new FileInputStream("C:\\Users\\saisn\\eclipse-workspace\\BDDUdemy\\src\\test\\resources\\config\\Config.properties");
		prop.load(ip);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

}
