package apirl_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_3 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/droppable/");
		Actions ac = new Actions(driver);
		Thread.sleep(4000);
		//switch to frame
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(src, dst).perform();

	}

}