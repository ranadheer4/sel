package april04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capture_text {

	public static void main(String[] args) throws Throwable {
		// capture text in a webpage
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(5000);
		//capture gmail text in google page
		String actuallinkname = driver.findElement(By.linkText("Gmail")).getText();
		String explinkname = "Gmail";
		if (actuallinkname.equalsIgnoreCase(explinkname))
		{
			System.out.println("link name is matching::"+explinkname+ " "+actuallinkname);
		}
		else
		{
			System.out.println("link name is not matching::"+explinkname+ " "+actuallinkname);
		}
	}

}
