package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonFunctions.AddEmpPage;
import commonFunctions.AddUserPage;
import commonFunctions.LoginPage;

public class TestScript {
	WebDriver driver;
	@BeforeMethod
	public void adminLogin()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		//call login page class
		LoginPage login =PageFactory.initElements(driver, LoginPage.class);
		login.verifyLogin("Admin", "Qedge123!@#");
	}
	@Test
	public void validateEmp()throws Throwable
	{
		AddEmpPage emp =PageFactory.initElements(driver, AddEmpPage.class);
		boolean results=emp.verifyAddEmp("Akhilesh", "pappasani", "Ranga");
		System.out.println(results);
	}
	@Test
	public void validateUser()throws Throwable
	{
		AddUserPage user = PageFactory.initElements(driver, AddUserPage.class);
		boolean res=user.verifyAdduser("ESS", "amit demo", "Testing12", "Testing@@122335891", "Testing@@122335891");
		System.out.println(res);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	}


