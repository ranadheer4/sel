package com.prakash.ObjectRepo;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

import com.prakash.genericUtility.IConstants;
import com.prakash.genericUtility.WebDriverUtility;

	public class OrangeHrm_NewUser extends WebDriverUtility implements IConstants{
	    @FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']")private WebElement Admin;
	    @FindBy(xpath = "//a[text()='User Management']")private WebElement UserMang;
	    @FindBy(xpath = "//a[@id='menu_admin_viewSystemUsers']")private WebElement ClickUsers;
	    @FindBy(xpath = "//input[@id='btnAdd']")private WebElement ClickAdd;
	    @FindBy(xpath = "//select[@id='systemUser_userType']")private WebElement SelectUserRole;
	    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")private WebElement EmplyeName;
	    @FindBy(xpath = "//input[@id='systemUser_userName']")private WebElement Username;
	    @FindBy(xpath = "//select[@id='systemUser_status']")private WebElement SelectStatus;
	    @FindBy(xpath = "//input[@id='systemUser_password']")private WebElement Pswrd;
	    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")private WebElement Cpswrd;
	    @FindBy(xpath = "//input[@id='btnSave']")private WebElement ClickSave;
	    
	    
	    public OrangeHrm_NewUser(WebDriver driver) {
	          PageFactory.initElements(driver, this);
	       }
	    
	    public WebElement getAdmin() {
	    return Admin;
	    }
	    public WebElement getUserMang() {
	        return UserMang;
	    }
	    public void mouseMover(WebDriver driver) {
	    mouseOverAnElement(driver, ClickUsers);
	    ClickUsers.click();
	    }
	    
	    public WebElement getClickAdd() {
	        return ClickAdd;
	    }
	    public void selectUserrole(String Selectrole) {
	        new Select(SelectUserRole).selectByVisibleText(Selectrole);;
	    }

	    public WebElement getEmplyeName() {
	        return EmplyeName;
	    }
	    public void clickEnter(WebDriver driver) {
	          clickOnEnterButton(driver);
	       }
	    public WebElement getUsername() {
	        return Username;
	    }

	    public WebElement getPswrd() {
	        return Pswrd;
	    }

	    public WebElement getCpswrd() {
	        return Cpswrd;
	    }
	    public void selectStatusdrop(String Select_Status) {
	        new Select(SelectStatus).selectByVisibleText(Select_Status);;
	    }

	    public WebElement getClickSave() {
	        return ClickSave;
	}
	}


