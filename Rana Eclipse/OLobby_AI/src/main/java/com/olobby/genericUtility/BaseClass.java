package com.olobby.genericUtility;

import org.openqa.selenium.By;
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

import com.olobby.ObjectRepo.HomePage;
import com.olobby.ObjectRepo.LoginPage;

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
	 * @throws Throwable
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
			URL = fLib.getPropertKeyValue("url");
		} catch (Throwable e) {
			e.printStackTrace();
		}

		if(BROWSER.equalsIgnoreCase("firefox"))
		{
			//WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(BROWSER.equalsIgnoreCase("chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable-notifications");
				//driver=new ChromeDriver(options);
			//WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(options);		
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
	 * @throws InterruptedException 
	 */
	@BeforeMethod
	public void loginToAppln() throws InterruptedException
	{
		String USERNAME = null;
		try {
			USERNAME = fLib.getPropertKeyValue("username");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		String PASSWORD = null;
		try {
			PASSWORD = fLib.getPropertKeyValue("password");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		LoginPage lpage=new LoginPage(driver);
		lpage.enterUsername(USERNAME);
		lpage.enterPassword(PASSWORD);
		lpage.clickLoginBtn();
		System.out.println("Login successful");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		//Thread.sleep(8000);
		//driver.findElement(By.xpath("//div[@id='hdrname']/../descendant::span[@title='Close']")).click();
		
	}
	/**
	 * logout from application
	 * @throws InterruptedException 
	 */


	@AfterMethod
	public void logoutFromAppln() throws InterruptedException
	{
		HomePage hpage=new HomePage(driver);
        Thread.sleep(6000);
        hpage.getCliclCornerdd().click();
        Thread.sleep(4000);
        hpage.getLgBtn().click();
		
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