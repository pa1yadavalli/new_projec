package com.testcases;

import com.AppObjects.LoginpageObjects;

public class Logintestcase extends LoginpageObjects{

	
	public Logintestcase insertusername(String uname) {
		
		getusername(uname);
		return this;
		

	}
	
	
public Logintestcase insertpasssword(String pword) {
	getpassword(pword);
	return this;
		
		
		
	}
	
public Logintestcase clicksubmit() {
	getsubmit();
	return this;
	
	
	
}

public Logintestcase clicksignout() {
	getsignout();
	return this;

}
	
}
