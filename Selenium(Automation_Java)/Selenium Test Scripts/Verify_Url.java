package april04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_Url {

	public static void main(String[] args) {
		//verify Url contains or starts with https
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		//driver.get("http://orangehrm.qedgetech.com");
		String expectedprotocol = "https://";
		//get url in runtime
		String actualprotocol = driver.getCurrentUrl();
		if(actualprotocol.startsWith(expectedprotocol))
		{
			System.out.println("Url is secured::"+expectedprotocol+"  "+actualprotocol);
		}
		else
		{
			System.out.println("Url is not secured::"+expectedprotocol+"  "+actualprotocol);
		}
		driver.close();
	}

}
