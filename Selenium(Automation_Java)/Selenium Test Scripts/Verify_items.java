package apirl7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_items {

	public static void main(String[] args) throws Throwable {
		// Verify exptditem items to actual items 
		String exptdItem = "Baby";
		boolean itemExist = false;
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(5000);
		//store in listbox into select class
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement>Olist = listbox.getOptions();
		System.out.println("No of items are::"+Olist.size());
		Thread.sleep(5000);
		for(WebElement each:Olist)
		{
		//capture each items
		String actualItem = each.getText();
		Thread.sleep(2000);
		System.out.println(actualItem);
		if(actualItem.equalsIgnoreCase(exptdItem))
		{
			//whenever exptditem equals actualItem
			itemExist=true;
			break;
		}		
		}
		if(itemExist)
		{
			System.out.println("Items found in listbox::"+exptdItem);
		}
		else 
			System.out.println("Items not found in listbox::"+exptdItem);
	}

}
