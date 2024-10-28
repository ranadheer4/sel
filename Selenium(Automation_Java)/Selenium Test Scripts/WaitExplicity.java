package apirl_27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitExplicity {
	WebDriver driver;
	@Test
	public void rana()
	{
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebDriverWait myWait = new WebDriverWait(driver, 20);
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create New Account")));
		driver.findElement(By.linkText("Create New Account")).click();
		myWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
		driver.findElement(By.name("firstname")).sendKeys("Testingra");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname")));
		driver.findElement(By.name("lastname")).sendKeys("RajaRani");
		new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText("20");
	}
	                                                                                                                 

}
