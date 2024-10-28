package apirl_23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThirdTestNGClass {
WebDriver driver;
@Test(invocationCount = 3)
public void LoginMultipleTimes()throws Throwable
{
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://primusbank.qedgetech.com/");
	Thread.sleep(3000);
	driver.findElement(By.name("txtuId")).sendKeys("Admin");
	driver.findElement(By.name("txtPword")).sendKeys("Admin");
	driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
	driver.close();
}
}
