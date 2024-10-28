package cmd;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trail_Test {

	public static void main(String [args]) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://dev-refactor.credentialmydoc.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ctg@credentialmydoc.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Ctgadmin@2022");
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//i[@class='fas fa-bars']")).click();
		WebElement arow=driver.findElement(By.xpath("//aside[@class='left-sidebar']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(arow).perform();
		Thread.sleep(3000);
		WebElement set=	driver.findElement(By.xpath("//i[@class='fa fa-check-square']"));
		ac.moveToElement(set).click().perform();
		Thread.sleep(3000);
		WebElement adduser=	driver.findElement(By.xpath("//a[@ng-reflect-router-link='/settings/addUser/create']"));
		ac.moveToElement(adduser).click().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ctg-add-user[@class='ng-star-inserted']//div[@id='content-wrapper']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='user_first_name']")).sendKeys("Rana");
		driver.findElement(By.xpath("//input[@id='user_last_name']")).sendKeys("Vivek");
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("dranadheer4@gmail.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("9963883545@Durgi");
		driver.findElement(By.xpath("//input[@id='user_confirmPassword']")).sendKeys("9963883545@Durgi");
		driver.findElement(By.xpath("//input[@id='Active']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
		
		
		
		
		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//span[normalize-space()='Provider Passport']")).click();
//        List<WebElement> options=driver.findElements(By.xpath("//ul[@id='provider']"));
//        
//        
//           for(WebElement option:options)
//               
//           { 
//               if(option.getText().equals("Show All Providers"))
//               {
//                   
//                   option.click();
//                   break;
//		
//
//	}
//           }
//   		   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
//           WebElement myElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn customWhite ng-star-inserted']")));
//           myElement.click();
//           //driver.findElement(By.xpath("//div[@class='btn customWhite ng-star-inserted']")).click();
//           //driver.findElement(By.xpath("//button[@aria-controls='Basic Personal Information']")).click();
//           driver.findElement(By.name("subject")).sendKeys("Raki");
//           driver.findElement(By.id("description")).sendKeys("Trail Test");
//           
//        // Select and click on School dropdown web element
//           WebElement reg = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
//           reg.click();
//           reg.sendKeys("AARP");
//           driver.findElement(By.id("a4c55bda5ded-14")).click();
//
//           // Store all School dropdown options into List
//           List<WebElement> allOptions = driver.findElements(By.xpath("//ng-dropdown-panel[@id='abd08315ae05']"));
//
//           //Iterate through the options and match with the desired option to select
//           for (WebElement option : allOptions) {
//           if (option.getText().equals("AARP")) {
//           option.click();
//           break;
//           }
//           }
//           
           
           
           
//           Select payer = new Select(driver.findElement(By.xpath("//ng-select[@class='auto-grow-location-2x ng-select ng-select-multiple ng-select-searchable ng-select-clearable ng-untouched ng-pristine ng-invalid']//div[@class='ng-select-container']")));
//           payer.selectByVisibleText(" 1199 SEIU ");           
           
           
	}

}
