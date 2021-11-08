package com.Project_Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;

import net.bytebuddy.asm.Advice.Return;

public class CaptureScreens {
	
	public String screencapture(WebDriver  driver,String screenname) throws IOException  {
	
		
				
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	//File file = element.getScreenshotAs(OutputType.FILE);
		
	String datename = new SimpleDateFormat("yyyMMddhhmmss").format(new Date());
	
	File dest = new File("./Appscreens/"+screenname+datename+".png");
	
	String destpath = dest.getAbsolutePath();
	
	FileUtils.copyFile(file, dest);
	
	
	return destpath;

		
	
	}

	
}

