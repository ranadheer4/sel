package apirl7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_alerts {

	public static void main(String[] args) throws Throwable {
		// Alert message
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		//capture alert text
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
		Thread.sleep(3000);
		//click ok to alert
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();

	}

}
