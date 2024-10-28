package com.olobby.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.WebDriverUtility;

public class LoginPage extends WebDriverUtility {

	// declaration
	@FindBy(xpath = "//input[@placeholder='Email']")

	private WebElement emailtxtbox;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordtxtEdt;

	
	@FindBy(xpath = "//button[text()='Sign In']")
	private WebElement Btn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the emailtxtbox
	 */
	public WebElement getEmailtxtbox() {
		return emailtxtbox;
	}

	/**
	 * @return the passwordtxtEdt
	 */
	public WebElement getPasswordtxtEdt() {
		return passwordtxtEdt;
	}

	/**
	 * @return the btn
	 */
	public WebElement getBtn() {
		return Btn;
	}

	public void enterUsername(String userName) {
		emailtxtbox.sendKeys(userName);
	}

	public void enterPassword(String passWord) {
		passwordtxtEdt.sendKeys(passWord);
	}

	public void clickLoginBtn() {
		Btn.click();
	}

	public void loginToApplication(String username, String password) {
		emailtxtbox.sendKeys(username);
		passwordtxtEdt.sendKeys(password);
		clickLoginBtn();
	}

}
