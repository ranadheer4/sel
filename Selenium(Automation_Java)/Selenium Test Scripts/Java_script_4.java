package apirl_13;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Java_script_4 {

	public static void main(String[] args) throws Throwable {
		// locate element without using webdriver only by using javascriprt
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//launch url
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#txtUsername\").value='Admin'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#txtPassword\").value='Qedge123!@#'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#btnLogin\").click()");
		Thread.sleep(5000);
		String exptd = "dashboard";
		String actual = js.executeScript("return document.URL").toString();
		if(actual.contains(exptd))
		{
			System.out.println("Login sucess::"+exptd+" "+actual);
		}
		else
		{
			//capture errormssg
			String errormssg = js.executeScript("return document.querySelector(\"#spanMessage\").innerHTML").toString();
			System.out.println(errormssg+" "+exptd+" "+actual);
		}
	}

}
