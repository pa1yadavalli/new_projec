package com.Project_Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class Browserfactory {
	
	
	
	static WebDriver driver=null;
	
	public  WebDriver startbrowser(String appname,String appurl) {

		if(appname.equals("chrome")) {
			
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
			else if(appname.equals("firefox")){
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				
				
			}
			else if(appname.equals("edge")){
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			
			driver.get(appurl);
			driver.manage().window().maximize();
			
			//types of waiting methods in selenium webdriver
			//implicit wait(pages), explicit wait(elements), Fluent wait(pooling objects)
			
			
		
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			}
		
		
	return driver;

		
	
			}

	
	
		
		

	
	
	
}
