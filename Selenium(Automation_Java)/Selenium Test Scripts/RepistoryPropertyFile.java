package apirl_22;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RepistoryPropertyFile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		//load property file
		p.load(new FileInputStream("Repistory.properties"));
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(p.getProperty("Url"));
		Thread.sleep(5000);
		driver.findElement(By.xpath(p.getProperty("Objfname"))).sendKeys(p.getProperty("Enterfname"));
		driver.findElement(By.xpath(p.getProperty("Objlname"))).sendKeys(p.getProperty("Enterlname"));
		driver.findElement(By.xpath(p.getProperty("Objemail"))).sendKeys(p.getProperty("Enteremail"));
		driver.findElement(By.xpath(p.getProperty("Objcemail"))).sendKeys(p.getProperty("Entercemail"));
		driver.findElement(By.xpath(p.getProperty("Objpassword"))).sendKeys(p.getProperty("Enterpassword"));
		driver.findElement(By.xpath(p.getProperty("Objhear"))).sendKeys(p.getProperty("Enterhear"));
		driver.findElement(By.xpath(p.getProperty("Objcheck"))).click();
		driver.findElement(By.xpath(p.getProperty("Objsign"))).click();
		
	}
}
