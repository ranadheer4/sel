package com.cps.OrangeHRM;

import com.prakash.ObjectRepo.EditGeneralInfoPage;
import com.prakash.ObjectRepo.HomePage;
import com.prakash.genericUtility.BaseClass;
import com.prakash.genericUtility.IConstants;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.prakash.genericUtility.ItestListenerImtn.class)
	public class Demo2EditUser extends BaseClass {
		static {
			System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
		}
		
	    @Test(priority=1)
	    public void editGeneralInfo() throws InterruptedException
	    {
	        EditGeneralInfoPage egi=new EditGeneralInfoPage(driver);
	        egi.getClickAdmin().click();
	        egi.clickOrganization(driver);
	        egi.getEdit().click();
	        egi.getPhone().clear();
	        egi.getPhone().sendKeys(eLib.readDataFromExcel("Orange1_EditGenInfo", 1, 0));
	        egi.selectCountry(eLib.readDataFromExcel("Orange1_EditGenInfo", 1, 1));
	        egi.getSave().click();
	        Reporter.log("Successfully Edited--priority=1",true);
	        HomePage hpage=new HomePage(driver);
	        hpage.getWelComeAbc().click();
	        hpage.getLgoutLink().click();
	     }
	   
}
