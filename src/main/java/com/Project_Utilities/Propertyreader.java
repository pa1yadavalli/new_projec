package com.Project_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyreader {

	public static Properties prop;
	public static File file;
	
	public Propertyreader() {
		
		
		try {
			
			file = new File("./Appfiles/login.properties");
			FileInputStream fis = new FileInputStream(file);
			
			 prop =new Properties();
			prop.load(fis);
			
			
		} catch (IOException e) {
		System.out.println(e.getMessage());
		}finally {
			if(file.exists()) {
				
				System.out.println("file loaded successfully");
			}
			else {
				System.out.println("does not loaded");
			}
			
			
				}
		
			
	}	 
		
		
		
	
	
	public String getappname() {
		
		return prop.getProperty("appname");
		
	}
	
	
	public String getappurl() {
		
		return prop.getProperty("appurl");
		
	}
	
	
	
}


