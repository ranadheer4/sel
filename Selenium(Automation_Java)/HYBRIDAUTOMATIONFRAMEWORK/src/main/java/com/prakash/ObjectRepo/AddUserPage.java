package com.prakash.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.prakash.genericUtility.WebDriverUtility;

public class AddUserPage extends WebDriverUtility {
	@FindBy(xpath="//select[@id='systemUser_userType']")private WebElement UserRoleField;
	
	@FindBy(xpath="//input[@id='systemUser_employeeName_empName']")private WebElement EmpNameField;
	
	@FindBy(xpath="//input[@id='systemUser_userName']")private WebElement UserNameField;
	
	@FindBy(xpath="//select[@id='systemUser_status']")private WebElement statusDropDown;
	
	@FindBy(xpath="//input[@id='systemUser_password']")private WebElement passwordTxtField;
	
	@FindBy(xpath="//input[@id='systemUser_confirmPassword']")private WebElement confirmPassTextField;
	
	@FindBy(xpath="//input[@id='btnSave']")private WebElement saveBtn;
	
	public AddUserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getUserRoleField() {
		return UserRoleField;
	}

	public WebElement getEmpNameField() {
		return EmpNameField;
	}

	public WebElement getUserNameField() {
		return UserNameField;
	}

	public WebElement getStatusDropDown() {
		return statusDropDown;
	}

	public WebElement getPasswordTxtField() {
		return passwordTxtField;
	}

	public WebElement getConfirmPassTextField() {
		return confirmPassTextField;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public void selectUserRoleFieldDropDown(String value) {
		
	  new Select(UserRoleField).selectByVisibleText(value);
		
	}

	
	
	
	

}
