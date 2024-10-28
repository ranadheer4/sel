package apirl5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation_commands {

	public static void main(String[] args) throws Throwable {
		// Navigation commands in a browser
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://google.com");
		System.out.println("page tittle[1]"+driver.getTitle());
		Thread.sleep(5000);
		//click on gmail link
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("page tittle[2]"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().back();
		System.out.println("page tittle[3]"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().forward();
		System.out.println("page tittle[4]"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
	}

}
