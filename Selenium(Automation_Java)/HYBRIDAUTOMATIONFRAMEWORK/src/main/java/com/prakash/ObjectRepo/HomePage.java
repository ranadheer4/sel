package com.prakash.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prakash.genericUtility.WebDriverUtility;

public class HomePage extends WebDriverUtility{
	
	
	@FindBy(xpath="//img[@src='/web/index.php/pim/viewPhoto/empNumber/7']")private WebElement clickSignOut;
	
	@FindBy(xpath="//a[text()='Logout']")private WebElement Lgbtn;
	
	@FindBy(xpath="//b[normalize-space()='Admin']")private WebElement clickAdminBtn;
	
    @FindBy(xpath="//input[@id='btnAdd']")private WebElement AddButton;
    
    @FindBy(xpath="//a[@id='welcome']")private WebElement welComeAbc;
    
    @FindBy(xpath="//a[text()='Logout']")private WebElement LgoutLink;
	
	 public HomePage(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }

	public WebElement getClickSignOut() {
		return clickSignOut;
	}

	public WebElement getLgbtn() {
		return Lgbtn;
	}
	 
	public WebElement getAddButton() {
		return AddButton;
	}


	public WebElement getClickAdminBtn() {
		return clickAdminBtn;
	}

	public WebElement getWelComeAbc() {
		return welComeAbc;
	}

	public WebElement getLgoutLink() {
		return LgoutLink;
	}

	public void clickSignoutLink(WebDriver driver)
	{
		mouseOverAnElement(driver, welComeAbc);
		LgoutLink.click();
	}
	

	
	

}
