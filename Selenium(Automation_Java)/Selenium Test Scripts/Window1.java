package apirl8;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window1 {

	public static void main(String[] args) throws Throwable {
		//switch to CW get the titles close one by one CW switch to PW and close it'
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		//get parent window id
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		//click on link to open new windows
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		//get collections of all window id's
		Set<String>allwins = driver.getWindowHandles();
		//Iterate all wins
		for(String each:allwins)
		{
			//switch to CW when PW is not equals to CW
			if(!parent.equals(each))
			{
				//switch to each window
				String childpagetitles = driver.switchTo().window(each).getTitle();
				System.out.println(childpagetitles);
				Thread.sleep(5000);
				driver.close();
			}
		}
		//switch to PW
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.id("identifierId")).sendKeys("dranadheer4@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(5000);
		
	}

}
