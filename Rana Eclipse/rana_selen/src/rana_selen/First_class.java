package rana_selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class First_class {

	@Test
	public void Test3() throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:/Rana durgi/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("Rajesh Durgi");
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Raju");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Durgi");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ranadurgi3@gmail.com");
		Thread.sleep(3000);

		Select countryListbox = new Select(driver.findElement(By.name("country_id")));
		boolean value = countryListbox.isMultiple();
		countryListbox.selectByVisibleText("India");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("9963883545Durgi");
		driver.findElement(By.xpath("//div[@id='account-register']//li[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg hidden-xs']")).click();
		

		
		
	}

}
