package apirl_23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SecondTestNGClass {
WebDriver driver;
@BeforeMethod
public void setUp()
{
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://calc.qedgetech.com/");
	Reporter.log("Running precondition",true);
}
@Test
public void addition()
{
	driver.findElement(By.name("display")).sendKeys("65478954");
	driver.findElement(By.xpath("//input[@value='+']")).click();
	driver.findElement(By.name("display")).sendKeys("478");
	driver.findElement(By.xpath("//input[@value='=']")).click();
	String addres =driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log("Adiition ::"+addres,true);
	Reporter.log("Executing Addition Test",true);
}
@Test
public void division()
{
	driver.findElement(By.name("display")).sendKeys("44124545");
	driver.findElement(By.xpath("//input[@value='/']")).click();
	driver.findElement(By.name("display")).sendKeys("56");
	driver.findElement(By.xpath("//input[@value='=']")).click();
	String divres =driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log("division ::"+divres,true);
	Reporter.log("Executing division Test",true);
}
@Test
public void multiplication()
{
	driver.findElement(By.name("display")).sendKeys("54687955");
	driver.findElement(By.xpath("//input[@value='x']")).click();
	driver.findElement(By.name("display")).sendKeys("69");
	driver.findElement(By.xpath("//input[@value='=']")).click();
	String mulres =driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log("multiplication ::"+mulres,true);
	Reporter.log("Executing multiplication Test",true);
}
@AfterMethod
public void tearDown()throws Throwable
{
	Thread.sleep(2000);
	driver.close();
	Reporter.log("Running postcondition",true);
}
}
