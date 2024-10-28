package apirl_26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Asserts {
WebDriver driver;
String url = "https://www.google.com/";
@BeforeMethod
public void setUp() throws Throwable
{
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get(url);
	Thread.sleep(3000);
}
@Test
public void verifyTitle1()
{
	String exptdtitle="Google";
	String actualtitle=driver.getTitle();
	try {
	Assert.assertEquals(actualtitle, exptdtitle, "Title is not matching");
	}catch (Throwable t)
	{
		System.out.println(t.getMessage());
	}
}
@Test
public void verifyTitle2()
{
	String exptdtitle="Ggle";
	String actualtitle=driver.getTitle();
	try {
	Assert.assertTrue(exptdtitle.equalsIgnoreCase(actualtitle), "Title is not matching");
	}catch (Throwable t)
	{
		System.out.println(t.getMessage());
	}
}
@Test
public void verifyTitle3()
{
	String exptdtitle="Google";
	String actualtitle=driver.getTitle();
	try {
	Assert.assertFalse(exptdtitle.equalsIgnoreCase(actualtitle), "Title is matching");
	}catch (Throwable t)
	{
		System.out.println(t.getMessage());
	}
}
@AfterMethod
public void tearDown()
{
	driver.close();
}
}
