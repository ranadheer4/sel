package rana_selen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleDropdown {
	WebDriver driver;
	@Test
	public void list() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://dev-refactor.credentialmydoc.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ctg@credentialmydoc.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Ctgadmin@2022");
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//i[@class='fas fa-bars']")).click();
		WebElement arow=driver.findElement(By.xpath("//aside[@class='left-sidebar']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(arow).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='fa fa-th-large']")).click();
		driver.findElement(By.xpath("//i[@class='fa-network-wired fas']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//body/ctg-root/app-main-layout[@class='ng-star-inserted']/section[@id='wrapper']/div[1]")).click();
		driver.findElement(By.xpath("//div[text()='ADD NOTE ']")).click();
		driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("avwb");
		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("dsv");
		Thread.sleep(8000);
		WebElement dd =driver.findElement(By.xpath("//*[@placeholder='Select Payer']"));
		
		Actions act=new Actions(driver);
		ac.moveToElement(dd).click().perform();
		String option=" 90 Degree Benefit Plan ";
		Thread.sleep(5000);
		WebElement customOption=driver.findElement(By.xpath(""));
		customOption.click();
	
	}

}
