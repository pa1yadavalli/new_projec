package com.Project_TestCases;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.AppObjects.LoginpageObjects;
import com.Project_Utilities.Browserfactory;
import com.Project_Utilities.CaptureScreens;
import com.Project_Utilities.Propertyreader;
import com.testcases.Logintestcase;

import io.github.bonigarcia.wdm.WebDriverManager;
//@Listeners(com.app_Listeners.Base_Listeners.class)

public class LoginAppservice{
	
	static WebDriver driver;
	static Browserfactory browser;
	public static LoginpageObjects loginpage;
	public static Logintestcase logintest;
	static Propertyreader read;
	static CaptureScreens capture;
	
	
	//Implementing page object model frame work
	
	@BeforeSuite
	public void setupsuite() {
		browser = new Browserfactory() {
		};
		read = new Propertyreader();
		capture = new CaptureScreens();
		
	}
	
	@BeforeTest
	
	public void statbrowser() {
		
		//driver = Browser.start(read.getappname(),read.getappurl());
		driver = browser.startbrowser(read.getappname(), read.getappurl());
		System.out.println("start");
		 
	}
	@org.testng.annotations.Parameters({"username","password"})
	@Test()
	public void verify_validlogin(String username,String password) {
		
		logintest=PageFactory.initElements(driver, Logintestcase.class);
		logintest.insertusername(username).insertpasssword(password).clicksubmit().clicksignout();
		
		
		
}

	@AfterTest
	public void closetest() {
		
		driver.close();
		
		
	}


	@AfterMethod
	
	public void fail_step(ITestResult results) {
		
		
		try {
			
			if(ITestResult.FAILURE==results.getStatus()) {
				
				capture.screencapture(driver, "stepfail");
				
			}
		} catch (Exception e) {
System.out.println(e.getMessage());
}finally {
	System.out.println("fail screen captured");
	
}
		
		
		
	}


}

















