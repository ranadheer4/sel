package com.moduleName.OrangeHRM;


	import org.testng.Reporter;
import org.testng.annotations.Test;

import com.projectName.ObjectRepo.HomePage;
import com.projectName.ObjectRepo.OrangeHrm_NewUser;
import com.projectName.genericUtility.BaseClass;
import com.projectName.genericUtility.IConstants;

	

	public class New_User_OrangeHrm extends BaseClass{
	    static {
	        System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	    }
	    
	   @Test(priority=0)
	   public void create_User() throws InterruptedException {
	       OrangeHrm_NewUser nu=new OrangeHrm_NewUser(driver);
	       //Thread.sleep(3000);
	       nu.getAdmin().click();
	       //Thread.sleep(3000);
	       nu.getUserMang().click();
	       //Thread.sleep(3000);
	       nu.mouseMover(driver);
	       //Thread.sleep(5000);
	       nu.getClickAdd().click();
	       //Thread.sleep(5000);
	       nu.selectUserrole(eLib.readDataFromExcel("New_User_Orange", 1, 0));
	       nu.getEmplyeName().sendKeys(eLib.readDataFromExcel("New_User_Orange", 1, 1));
	       nu.clickEnter(driver);
	       nu.getUsername().sendKeys(eLib.readDataFromExcel("New_User_Orange", 1, 2)+jLib.getRandomNumber());
	       //Thread.sleep(5000);
	       nu.selectStatusdrop(eLib.readDataFromExcel("New_User_Orange", 1, 3));
	       nu.getPswrd().sendKeys(eLib.readDataFromExcel("New_User_Orange", 1, 4));
	       nu.getCpswrd().sendKeys(eLib.readDataFromExcel("New_User_Orange", 1, 5));
	       //Thread.sleep(5000);
	       nu.getClickSave().click();
	       //Thread.sleep(5000);
	       Reporter.log("Successfully created User----priority=0",true);
	    //   HomePage hpage = new HomePage(driver);
	       //Thread.sleep(5000);
	      // hpage.getClickSignOut();
	      // hpage.getWelComeAbc().click();
	       //hpage.getLgoutLink().click();
	       
	       
	       //Thread.sleep(5000);
	      // hpage.getLogoutLink().click();
	   }

	   
	   
	   
	
	}


