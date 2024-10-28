package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CmdHomePage {
	
	@FindBy(xpath="//div[text()='ADD TASK ']")private WebElement addTask;
	
	@FindBy(xpath="//div[text()='ADD NOTE ']")private WebElement addNote;
	
	@FindBy(xpath="//div[text()='GENERATE FORM '] ")private WebElement generateForm;
	
	@FindBy(xpath="//i[@class='fas fa-user-circle fa-2x m-2 userIcon']")private WebElement SignOut;
	
	@FindBy(xpath="//a[text()='Logout']")private WebElement LogoutLink;
	

	

	public CmdHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddTask() {
		return addTask;
	}

	public WebElement getAddNote() {
		return addNote;
	}

	public WebElement getGenerateForm() {
		return generateForm;
	}
	public WebElement getSignOut() {
		return SignOut;
	}

	public WebElement getLogoutLink() {
		return LogoutLink;
	}
//	public void clickAssetsModule(WebDriver driver)
//	{
//		mouseHoverOnElement(moreButton, driver);
//		assetsModule.click();
//	}
	

	
	

}
