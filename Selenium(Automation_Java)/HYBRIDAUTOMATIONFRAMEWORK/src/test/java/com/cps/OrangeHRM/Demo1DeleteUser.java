package com.cps.OrangeHRM;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.prakash.ObjectRepo.HomePage;
import com.prakash.genericUtility.BaseClass;
import com.prakash.genericUtility.IConstants;
@Listeners(com.prakash.genericUtility.ItestListenerImtn.class)
public class Demo1DeleteUser extends BaseClass {
	//This is mindatory to give path
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
	 @Test
	    public void deleteCustomer() {
	    	Reporter.log("Successfully deleted---priority=non",true);
	    	 HomePage hpage=new HomePage(driver);
		     hpage.getWelComeAbc().click();
		     hpage.getLgoutLink().click();
	    }
	

}
