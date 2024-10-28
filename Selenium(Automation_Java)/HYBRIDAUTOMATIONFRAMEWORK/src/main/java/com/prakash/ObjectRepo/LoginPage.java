package com.prakash.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//input[@id='txtUsername']")private WebElement Untbx;
	
	@FindBy(xpath="//input[@id='txtPassword']")private WebElement Pwtbx;
	
	@FindBy(xpath="//input[@id='btnLogin']")private WebElement Lgbtn;
	
	 public LoginPage(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }

	public WebElement getUntbx() {
		return Untbx;
	}

	public WebElement getPwtbx() {
		return Pwtbx;
	}

	public WebElement getLgbtn() {
		return Lgbtn;
	}
	public void enterUsername(String userName)
	{
		Untbx.sendKeys(userName);
	}
	
	public void enterPassword(String passWord)
	{
		Pwtbx.sendKeys(passWord);
	}
	
		
	public void clickLoginBtn()
	{
		Lgbtn.click();
	}
	 
	public void loginToApplication(String username1,String password1)
	{
		Untbx.sendKeys(username1);
		Pwtbx.sendKeys(password1);
		getLgbtn();
	}

}
