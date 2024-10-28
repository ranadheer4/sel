package com.prakash.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prakash.genericUtility.WebDriverUtility;

public class AdminPage extends WebDriverUtility {
	
	@FindBy(xpath="//input[@id='btnAdd']")private WebElement addusBtn;
	
	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getAddusBtn() {
		return addusBtn;
	}

	
	

}
