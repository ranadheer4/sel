package apirl_12;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) throws Throwable {
		// right click on gmail link and open that gmail link in new window by using robut class, handle multiple window has multiple wins
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
		//create object robot class
		Robot r = new Robot();
		Thread.sleep(5000);
		//pressdown arrow for 2 times
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		//click on the enter button in keyboard
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//get collections of windows
		ArrayList<String>brw = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(brw.get(1));
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//div[contains(text(),'Use another account')])[1]")).click();
		driver.findElement(By.xpath("(//span[normalize-space()='Create account'])[1]")).click();
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(brw.get(0));
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[normalize-space()='Images'])[1]")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
