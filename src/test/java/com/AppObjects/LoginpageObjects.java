package com.AppObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.ITestResult;

import com.Project_Utilities.CaptureScreens;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class LoginpageObjects {

	static ExtentReports report = new ExtentReports("./Appreports/logintestreport.html");
	static ExtentTest test;
	
	static WebDriver driver;
	static CaptureScreens capture = new CaptureScreens();

	@FindBy(name="user")WebElement username;
	@FindBy(name="pass")WebElement password;
	@FindBy(name="btnSubmit")WebElement submit;

	@FindBy(xpath="//*[@id=\"user_bar\"]/ul/li[1]/a")WebElement signout;
	@FindBy(id="right_col_top_err")WebElement usermessage;
	
	public void getusername(String un) {
		username.sendKeys(un);
		
	}
	public void getpassword(String pw) {
		
		password.sendKeys(pw);
	}
	
	
public void getsubmit() {
		if(submit.isEnabled()) {
submit.click();
System.out.println("clicking login submit");



try {
	
	String message = usermessage.getText();
	
	System.out.println("user message is..."+"\t"+message);
	System.out.println("login fail");
	capture.screencapture(driver, "user message");
}catch (Exception e) {
System.out.println(e.getMessage());

}

}
		else {
			
			System.out.println("does not performed");
		}	
}
	
public void getsignout() {
	if(signout.isEnabled()) {
		try {
			signout.click();
System.out.println("login success");
capture.screencapture(driver, "signout success");
			
		}catch (Exception e) {
System.out.println(e.getMessage());

		}
		
		
		
		
		
System.out.println("login success");
}
	
}		
	
}
