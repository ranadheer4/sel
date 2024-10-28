package apirl6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws Throwable {
		// select items in a listbox
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		//store listbox into select class
		Select bdaylistbox = new Select(driver.findElement(By.name("birthday_day")));
		Select monthlistbox = new Select(driver.findElement(By.name("birthday_month")));
		Select yearlistbox = new Select(driver.findElement(By.name("birthday_year")));
		//verify listbox is single or multiple slection
		boolean value = yearlistbox.isMultiple();
		System.out.println(value);
		//Select items in three listboxes
		bdaylistbox.selectByValue("20");
		Thread.sleep(2000);
		monthlistbox.selectByVisibleText("Apr");
		Thread.sleep(2000);
		yearlistbox.selectByIndex(60);
		System.out.println(yearlistbox.getFirstSelectedOption().getText());
	}

}
