package com.cmd.Rana;

import com.cps.ObjectRepository.CmdHomePage;
import com.cps.ObjectRepository.Cmd_Add_User;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Add_user extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
	
   @Test(
      groups = {"SmokeTest"}
   )
   public void addUser() throws InterruptedException {
      Cmd_Add_User cd = new Cmd_Add_User(driver);
      cd.mouseMover(driver);
      cd.clickSettings();
      cd.clickAdduser();
      Thread.sleep(5000);
      cd.pageClick();
      Thread.sleep(5000);
      cd.getFirstName().sendKeys(eLib.readDataFromExcel("Add_User", 1, 0));
      cd.getLasttName().sendKeys(eLib.readDataFromExcel("Add_User", 1, 1));
      cd.getEmail().sendKeys(eLib.readDataFromExcel("Add_User", 1, 2));
      cd.getPassword().sendKeys(eLib.readDataFromExcel("Add_User", 1, 3));
      cd.getConfirmPassword().sendKeys(eLib.readDataFromExcel("Add_User", 1, 4));
      cd.getUserType().sendKeys(eLib.readDataFromExcel("Add_User", 1, 5));
      
      cd.clickEnter(driver);
      cd.clickActive();
      cd.clickCreate();
      Reporter.log("Successfully add user",true);
      Thread.sleep(3000);
      
//      CmdHomePage hpage = new CmdHomePage(driver);
//      hpage.getSignOut().click();
//      //eLib.writeDataIntoExcel("Add_User", 1, 7, "Pass");
   }
}