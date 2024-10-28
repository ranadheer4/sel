package apirl_23;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	@BeforeTest
	public void setUp() throws Throwable{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(3000);
		Reporter.log("Running pre condition",true);
	  }
	
	@Test
	public void pbanking() throws Throwable{
		driver.findElement(By.xpath("(//img)[4]")).click();
		Reporter.log("Excueting pbanking test",true);
		Thread.sleep(3000);
	}
	@Test
	public void cbanking() throws Throwable{
		driver.findElement(By.xpath("(//img)[5]")).click();
		Reporter.log("Excueting cbanking test",true);
		Thread.sleep(3000);
	}
	@Test
	public void ibanking() throws Throwable{
		driver.findElement(By.xpath("(//img)[6]")).click();
		Reporter.log("Excueting ibanking test",true);
		Thread.sleep(3000);
	}
  
	@AfterTest
	public void afterTest() {
		driver.close();
		Reporter.log("Running post condition",true);
	}

}
