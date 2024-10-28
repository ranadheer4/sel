package apirl_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondTestngclass {
WebDriver driver;
@BeforeMethod
public void setUp()
{
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://calc.qedgetech.com/");
	Reporter.log("Running preconditions",true);
}
@Test
public void Addition()
{
	driver.findElement(By.name("display")).sendKeys("515");
	driver.findElement(By.xpath("//nput[@value='+']")).click();
	driver.findElement(By.name("display")).sendKeys("23");
	driver.findElement(By.xpath("//input[@value='=']")).click();
	String adress = driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log("Addition::"+adress,true);
	Reporter.log("Excueting Addition Test",true);
}
@Test(priority = 0)
public void Divison()
{
	driver.findElement(By.name("display")).sendKeys("515");
	driver.findElement(By.xpath("//input[@value='/']")).click();
	driver.findElement(By.name("display")).sendKeys("23");
	driver.findElement(By.xpath("//input[@value='=']")).click();
	String divs = driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log("Divison::"+divs,true);
	Reporter.log("Excueting Divison Test",true);
}
@Test(priority = 1)
public void Multiplication()
{
	driver.findElement(By.name("display")).sendKeys("515");
	driver.findElement(By.xpath("//input[@value='x']")).click();
	driver.findElement(By.name("display")).sendKeys("23");
	driver.findElement(By.xpath("//input[@value='=']")).click();
	String muls = driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log("Multiplication::"+muls,true);
	Reporter.log("Excueting Multiplication Test",true);
}
@AfterMethod
public void tearDown() throws Throwable
{
	Thread.sleep(3000);
	driver.close();
	Reporter.log("Running post conditions",true);
}
}
