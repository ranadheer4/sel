package rana_selen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Expected_tittle_actual_tittle {

	@Test
	public void Test2() throws Throwable {
		// verify expected tittle and actual tittle
		WebDriver driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		//driver.get("https://google.com");
		Thread.sleep(5000);
		String exptdtittle = "google";
		//get tittle in runtime
		String actualtittle = driver.getTitle();
		//verify both tittles
		if(exptdtittle.equalsIgnoreCase(actualtittle))
		{
			System.out.println("tittle is matching::"+exptdtittle+" "+actualtittle);
		}
		else
		{
			System.out.println("tittle is not matching::"+exptdtittle+" "+actualtittle);
		}
		

	}


}


