package com.moduleName.OrangeHRM;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.projectName.ObjectRepo.HomePage;
import com.projectName.genericUtility.BaseClass;
import com.projectName.genericUtility.IConstants;
@Listeners(com.projectName.genericUtility.ItestListenerImtn.class)
public class Demo1DeleteUser extends BaseClass {
	
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
//	
	 @Test
	    public void deleteCustomer() {
		 
	    	Reporter.log("Successfully deleted---priority=non",true);
//	    	 HomePage hpage=new HomePage(driver);
//		     hpage.getWelComeAbc().click();
//		     hpage.getLgoutLink().click();
	    }
}
