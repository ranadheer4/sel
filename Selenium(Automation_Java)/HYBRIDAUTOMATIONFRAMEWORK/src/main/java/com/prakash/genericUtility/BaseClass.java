package com.prakash.genericUtility;
/**
 * 
 * @author PrakashSrivastava
 *
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.prakash.ObjectRepo.LoginPage;



public class BaseClass 
{
	public static WebDriver sdriver;
	public WebDriver driver;
	public DataBaseUtility dLib=new DataBaseUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public FileUtility fLib=new FileUtility();
	public WebDriverUtility  wLib=new WebDriverUtility();
	public JavaUtility jLib=new JavaUtility();

	/**
	 * connecting to database
	 */
	/*@BeforeSuite
	public void dbConfig()
	{
		dLib.connectToDB();
	}*/
	/**
	 * launching the browser
	 * 
	 */
	//@Parameters("BROWSER")
	@BeforeClass
	public void launchTheBrowser()
	{  
		
		String BROWSER = null;
		try {
			BROWSER = fLib.getPropertKeyValue("browser");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println(BROWSER);
		String URL = null;
		try {
			URL = fLib.getPropertKeyValue("url1");
		} catch (Throwable e) {
			e.printStackTrace();
		}

		if(BROWSER.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}else if(BROWSER.equalsIgnoreCase("chrome"))
		{

			driver=new ChromeDriver();
		}
		else  {
			driver=new ChromeDriver();
		}
	
        System.out.println("Browser successfully launched");
		//implicitly wait
		sdriver=driver;
		wLib.waitForPageToLoad(driver);
		//enter the URL of the Application
		sdriver.get(URL);
		//maximize the screen
		driver.manage().window().maximize();
	}
	/**
	 * login to application
	 *  
	 */
	@BeforeMethod
	public void loginToAppln() throws InterruptedException
	{
		String USERNAME = null;
		try {
			USERNAME = fLib.getPropertKeyValue("username1");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		String PASSWORD = null;
		try {
			PASSWORD = fLib.getPropertKeyValue("password1");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
			
		
        LoginPage lpage= new LoginPage(driver);
        lpage.enterUsername(USERNAME);
        lpage.enterPassword(PASSWORD);
      
		lpage.clickLoginBtn();
		  
		System.out.println("Login successful");
		
	}
	/**
	 * logout from application
	 */
	
	@AfterMethod
	public void logoutFromAppln()
	{
		
		System.out.println("Logout successful");
	}
	/**
	 * close the browser
	 */
	
	@AfterClass
	public void closeTheBrowser()
	{
		driver.quit();
		System.out.println("Browser successfully closed");
	}
	/**
	 * close database configuration
	 */
	/*@AfterSuite
	public void closeDBconfig()
	{
		dLib.closeDB();
	}*/
}