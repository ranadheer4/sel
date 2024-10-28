package commonFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddEmpPage {
	WebDriver driver;
	public AddEmpPage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(id="menu_pim_viewPimModule")
	WebElement clickPim;
	@FindBy(id="btnAdd")
	WebElement clickaddbtn;
	@FindBy(id="firstName")
	WebElement fname;
	@FindBy(id="middleName")
	WebElement mname;
	@FindBy(id="lastName")
	WebElement lname;
	@FindBy(id="")
	WebElement empid;
	@FindBy(id="btnSave")
	WebElement clicksavebtn;
	public boolean verifyAddEmp(String Enterfname,String Entermname,String Enterlname)throws Throwable
	{
		Actions ac = new Actions(driver);
		ac.moveToElement(clickPim).click().perform();
		Thread.sleep(2000);
		ac.moveToElement(clickaddbtn).click().perform();
		Thread.sleep(2000);
		fname.sendKeys(Enterfname);
		mname.sendKeys(Entermname);
		lname.sendKeys(Enterlname);
		//capture emid
		String beforeempid =empid.getAttribute("value");
		ac.moveToElement(clicksavebtn).click().perform();
		Thread.sleep(2000);
		String Afteremid =empid.getAttribute("value");
		if(beforeempid.equals(Afteremid))
		{
			Reporter.log("Add emp Success",true);
			return true;
		}
		else
		{
			Reporter.log("Add emp Fail",true);
			return false;
		}
	}

	}

