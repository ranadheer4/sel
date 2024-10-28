package rana_selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Verify_page {
WebDriver driver;
	@BeforeTest
	public void setUp() throws Throwable {
	driver=new EdgeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://primusbank.qedgetech.com/");
	Thread.sleep(3000);
	Reporter.log("Ruuning Pre conditions, true");
	}
	@Test(priority = 2)
	public void pbanking() throws Throwable {
		driver.findElement(By.xpath("//a[@href='personal_banking.html']//img")).click();
		Reporter.log("Executing pbanking,true");
		Thread.sleep(3000);

	}
	@Test(priority = 1)
	public void cbanking() throws Throwable {
		driver.findElement(By.xpath("//[@href='Corporate Banking.html']//img")).click();
		Reporter.log("Executing cbanking,true");
		Thread.sleep(3000);

	}
	@Test(priority = 0)
	public void ibanking() throws Throwable {
		driver.findElement(By.xpath("//a[@href='International Banking.html']//img")).click();
		Reporter.log("Executing ibanking,true");
		Thread.sleep(3000);

	}
		
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	
}
	
	
	

