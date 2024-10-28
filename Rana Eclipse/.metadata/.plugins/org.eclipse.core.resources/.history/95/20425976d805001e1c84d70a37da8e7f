package com.cmd.Rana;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.CmdHomePage;
import com.cps.ObjectRepository.Expiration_MailSendNotify;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;

public class Expirations_mailSendnotify extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
	
   @Test(groups = {"SmokeTest"})
   public void sendMail() throws InterruptedException {
	   Expiration_MailSendNotify ms=new Expiration_MailSendNotify(driver);
	   ms.mouseMover(driver);
	   ms.clickExpirations();
	   Thread.sleep(5000);
	   ms.clickPage();
	   Thread.sleep(5000);
	   ms.clickSendmail();
	   ms.clickOption();
	   ms.clickUncheck();
	   ms.getMail().sendKeys(eLib.readDataFromExcel("Exp_Sendmail", 1, 0));
	   ms.clickSend();
	   Reporter.log("Successfully Mail Sent",true);
	   Thread.sleep(3000);
//	   CmdHomePage hpage = new CmdHomePage(driver);
//	   hpage.getSignOut().click();
}
}