package com.prakash.ObjectRepo;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import com.prakash.genericUtility.WebDriverUtility;
	public class EditGeneralInfoPage extends WebDriverUtility {
	@FindBy(xpath="//b[normalize-space()='Admin']")private WebElement clickAdmin;
	@FindBy(xpath = "//a[@id='menu_admin_Organization']")private WebElement organization;
	    @FindBy(xpath = "//a[@id='menu_admin_viewOrganizationGeneralInformation']")private WebElement generalInfo;
	    @FindBy(xpath = "//input[@id='btnSaveGenInfo']")private WebElement edit;
	    @FindBy(xpath = "//input[@id='organization_phone']")private WebElement phone;
	    @FindBy(xpath = "//select[@id='organization_country']")private WebElement country;
	    @FindBy(xpath = "//input[@id='btnSaveGenInfo']")private WebElement save;
	    
	    public EditGeneralInfoPage(WebDriver driver)
	    {
	        PageFactory.initElements(driver, this);
	    }
	    public WebElement getClickAdmin() {
	        return clickAdmin;
	    }
	    public void clickOrganization(WebDriver driver)
	    {
	        mouseOverAnElement(driver, organization);
	        generalInfo.click();
	    }
	    public WebElement getEdit() {
	        return edit;
	    }
	    public WebElement getPhone() {
	        return phone;
	    }
	    public void selectCountry(String value)
	    {
	        selectDropDownByVtext(country, value);
	    }
	    public WebElement getSave() {
	        return save;
	    }
	    
	}


