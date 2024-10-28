package apirl5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws Throwable {
		// Validate login functionality by storing them into webelement
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		//store username textbox into webelement
		WebElement username = driver.findElement(By.cssSelector("#txtUsername"));
		username.clear();
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.cssSelector("#txtPassword"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#btnLogin")).submit();
		Thread.sleep(6000);
		String exptd = "dashboard";
		String actual = driver.getCurrentUrl();
		if(actual.contains(exptd))
		{
			System.out.println("Login success::"+exptd+" "+actual);
			{
				//capture error message 
				String errormessage = driver.findElement(By.cssSelector("#spanMessage")).getText();
				System.out.println(errormessage+" "+exptd+" "+actual);
				
			}
			Thread.sleep(5000);
			//driverclose();
		}
		
	}

}
