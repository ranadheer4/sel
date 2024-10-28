package april01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Opencart {

	public static void main(String[] args) throws Throwable {
		// opencart register
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.partialLinkText("Regist")).click();
		driver.findElement(By.name("firstname")).sendKeys("Testing");
		driver.findElement(By.id("input-lastname")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("dranadheer45@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("9963883545@Durgi");
		driver.findElement(By.xpath("//input[@id='input-newsletter-no']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		
	}

}
