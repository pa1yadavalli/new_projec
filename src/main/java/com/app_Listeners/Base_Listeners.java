package com.app_Listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.Project_Utilities.CaptureScreens;


public class Base_Listeners extends TestListenerAdapter{

	static WebDriver driver;
	
	
	public void onTestStart(ITestResult itr) {
		
		log("test started...");
		log("test strt"+itr.getName());
		
		}
	public void onTestSuccess(ITestResult itr) {

		log("test"+itr.getName()+"passed");
		
		log("property of method is" + itr.getMethod().getPriority());
	}

	public void onTestFailure(ITestResult itr) {

		log("test"+itr.getName()+"failed");
		
		log("property of method is" + itr.getMethod().getPriority());
		

        
	     
	        
}
	
	public void onTestSkipped(ITestResult itr) {

		log("test"+itr.getName()+"skipped");
	
	}
	
	
	public void onFinish(ITestContext context) {
		 
		System.out.println("this is onfinish method"+context.getPassedTests());
	    
		System.out.println("this is onfinish method"+context.getFailedTests());

	
	}

	public void log(String methodname) {
		System.out.println(methodname);
		
	}
	
}
