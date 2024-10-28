package com.olobby.ObjectRepo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class HomePage extends WebDriverUtility {
	// Declaration
	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::*[local-name()='g' and @clip-path='url(#clip0_2_446)']")
	private WebElement location;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/images/stage_icon.svg']")
	private WebElement Organization;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/calendar.png']")
	private WebElement Calender;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/dashboard.png']")
	private WebElement Dashboard;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/Folder.png']")
	private WebElement Folder;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/taskmanagement.png']")
	private WebElement TaskManageMent;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/quicknotes.png']")
	private WebElement Notes;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/workflow.png']")
	private WebElement Workflow;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/email.png']")
	private WebElement Email;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/fileshare.png']")
	private WebElement FileShare;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/settings.png']")
	private WebElement Setting;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/trash.png']")
	private WebElement Trash;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/help.png']")
	private WebElement AboutUs;

	@FindBy(xpath = "//img[@src='assets/sidebaricons/alarm.png']")
	private WebElement Notification;

	@FindBy(xpath = "//a[@routerlink='/settings/location']//*[name()='svg']")private WebElement Location;
	@FindBy(xpath = "//*[name()='path' and contains(@d,'M12 1.5H8.')]")private WebElement roles;
	@FindBy(xpath = "//a[@routerlink='/settings/users']//*[name()='svg']")private WebElement users;
	@FindBy(xpath = "//a[@routerlink='/settings/systemsettings']")private WebElement systemSettings;
	@FindBy(xpath = "//a[@routerlink='/settings/lookup']")private WebElement lookUp;
	@FindBy(xpath = "//a[@routerlink='/settings/language-caption']")private WebElement languageCaption;

    @FindBy(xpath = "//a[@routerlink='/settings/location']//*[name()='svg']")private WebElement locationMO;
    @FindBy(xpath = "//app-main-layout//span[@class='pro-user-name user-name']")
	private WebElement CliclCornerdd;

	@FindBy(xpath = "//app-main-layout//b[normalize-space()='Logout']")
	private WebElement LgBtn;
	
	// Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getRoles() {
		return roles;
	}

	// Utilization
	public WebElement getLocation() {
		return location;
	}
    
	public WebElement getLocationMO() {
		return locationMO;
	}

	public WebElement getOrganization() {
		return Organization;
	}

	public WebElement getCalender() {
		return Calender;
	}

	public WebElement getDashboard() {
		return Dashboard;
	}

	public WebElement getFolder() {
		return Folder;
	}

	public WebElement getTaskManageMent() {
		return TaskManageMent;
	}

	public WebElement getNotes() {
		return Notes;
	}
	

	public WebElement getWorkflow() {
		return Workflow;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getFileShare() {
		return FileShare;
	}

	public WebElement getSetting() {
		return Setting;
	}

	public WebElement getTrash() {
		return Trash;
	}

	public WebElement getAboutUs() {
		return AboutUs;
	}

	public WebElement getNotification() {
		return Notification;
	}

	public WebElement getLgBtn() {
		return LgBtn;
	}
	

	public WebElement getUsers() {
		return users;
	}
	public WebElement getSystemSettings() {
		return systemSettings;
	}
	public WebElement getLookUp() {
		return lookUp;
	}
	public WebElement getLanguageCaption() {
		return languageCaption;
	}
	public WebElement getCliclCornerdd() {
		return CliclCornerdd;
	}
	public void settingLocation(WebDriver driver) {
		mouseOverAnElement(driver, Setting);
		Location.click();
	}
	public void settingroles(WebDriver driver) {
		mouseOverAnElement(driver, Setting);
		roles.click();
	}
	public void settingusers(WebDriver driver) {
		mouseOverAnElement(driver, Setting);
		users.click();
	}
	public void settingsystemSettings(WebDriver driver) {
		mouseOverAnElement(driver, Setting);
		systemSettings.click();
	}
	public void settinglookUp(WebDriver driver) {
		mouseOverAnElement(driver, Setting);
		lookUp.click();
	}
	public void settinglanguageCaption(WebDriver driver) {
		mouseOverAnElement(driver, Setting);
		languageCaption.click();
	}
	public void clickOnEscButton(WebDriver driver) {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
	}
      
	public void mouseOverSetting(WebDriver driver) {
		mouseOverAnElement(driver, Setting);
         		
	}
	
}
