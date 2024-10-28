package apirl_11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_mouse {

	public static void main(String[] args) throws Throwable {
		// Handling mouses methods
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		//create object for actions class
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		//mouse to fashions
		ac.moveToElement(driver.findElement(By.xpath("(//div[contains(text(),'Fashion')])[1]"))).perform();
		Thread.sleep(5000);
		//mouse to all link and click
		ac.moveToElement(driver.findElement(By.linkText("All"))).click().perform();
		Thread.sleep(5000);
		//move to elctronics
		ac.moveToElement(driver.findElement(By.xpath("(//span[normalize-space()='Electronics'])[1]"))).perform();
		Thread.sleep(5000);
		//move to oppo mobile and click
		ac.moveToElement(driver.findElement(By.linkText("OPPO"))).click().perform();
		Thread.sleep(5000);
		//move to baby and kids
		ac.moveToElement(driver.findElement(By.xpath("(//span[normalize-space()='Baby & Kids'])[1]"))).click().perform();
		Thread.sleep(5000);
		//move to puzzles and click
		ac.moveToElement(driver.findElement(By.linkText("Puzzles"))).perform();
	}

}
