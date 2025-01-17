package cmd;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import rana_selen.Expected_tittle_actual_tittle;

public class workflow_createTask {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://dev-refactor.credentialmydoc.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
//		Actions ac = new Actions(driver);
//		ac.moveToElement(driver.findElement(By.xpath("//div[@class='scroll-sidebar']"))).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ctg@credentialmydoc.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Ctgadmin@2022");
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("")	
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='col-md-7 m-0 p-0'] div:nth-child(1)"))).click();
		driver.findElement(By.xpath("//div[normalize-space()='ADD NOTE']")).click();
		//driver.findElement(By.cssSelector("div[class='col-md-7 m-0 p-0'] div:nth-child(1)")).click();
		driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("Raju");
		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("fdbf");
//		WebElement Note=driver.findElement(By.xpath("//div[@class='modal-content']/descendant::ng-select[@bindvalue='id']/descendant::div[@role='combobox']/input[@type='text']"));
//		Thread.sleep(3000);
//		Note.sendKeys("YMCA");
//		Thread.sleep(3000);
//		Note.click();
//        List<WebElement> options=driver.findElements(By.xpath("//span[@class='ng-arrow-wrapper']"));
//        
//        
//           for(WebElement option:options)
//               
//           { 
//               if(option.getText().equals("AARP"))
//               {
//                   
//                   option.click();
//                   break;
		WebElement dropdown=driver.findElement(By.xpath("//div[@class='modal-content']/descendant::ng-select[@bindvalue='id']/descendant::div[@role='combobox']/input[@type='text']"));
		//div[@class='modal-content']/descendant::ng-select[@formcontrolname='payer_id']/descendant::div[@role='combobox']/input[@type='text']
		dropdown.sendKeys("HCP");
		Thread.sleep(5000);
        List<WebElement> options=driver.findElements(By.xpath("//div[@class='modal-content']/descendant::div[@class='form-group'][2]/label[@for='payer_id']/following-sibling::ng-select[@placeholder='Select Payer']/descendant::ng-dropdown-panel[@role='listbox']/div/div[@class='scrollable-content']"));
        Thread.sleep(5000);
        for(int i=0;i<options.size();i++)//descendant::ng-dropdown-panel[@role='listbox']
        {
            String text=options.get(i).getText();
            System.out.println("Text is" +text);
            if(text.contains("HCP"))
            {
                options.get(i).click();
                break;
            }
        }
        WebElement Tindropdown=driver.findElement(By.xpath("//div[@class='modal-content']/descendant::ng-select[@bindlabel='name' and @placeholder='Select TIN']/descendant::div[@role='combobox']/input[@type='text']"));
		//div[@class='modal-content']/descendant::ng-select[@formcontrolname='payer_id']/descendant::div[@role='combobox']/input[@type='text']
        Tindropdown.sendKeys("007007-Group");
		Thread.sleep(5000);
        List<WebElement> Tinoptions=driver.findElements(By.xpath("//div[@class='modal-content']/descendant::ng-dropdown-panel[@role='listbox']/div[@class='ng-dropdown-panel-items scroll-host']"));
        for(int i=0;i<Tinoptions.size();i++)
        {
            String Tintext=Tinoptions.get(i).getText();
            System.out.println("Text is" +Tintext);
            if(Tintext.contains("007007-Group"))
            {
            	Tinoptions.get(i).click();
                break;
            }
        }
        WebElement TPLdropdown=driver.findElement(By.xpath("//div[@class='modal-content']/descendant::ng-select[@bindlabel='name' and @name='location-provider']/descendant::div[@role='combobox']/input[@type='text']"));
		//div[@class='modal-content']/descendant::ng-select[@formcontrolname='payer_id']/descendant::div[@role='combobox']/input[@type='text']
        TPLdropdown.sendKeys("Location");
		Thread.sleep(5000);
        List<WebElement> TPLoptions=driver.findElements(By.xpath("//div[@class='modal-content']/descendant::ng-dropdown-panel[@role='listbox']/div[@class='ng-dropdown-panel-items scroll-host']"));
        for(int i=0;i<TPLoptions.size();i++)
        {
            String TPLtext=TPLoptions.get(i).getText();
            System.out.println("Text is" +TPLtext);
            if(TPLtext.contains("Location"))
            {
            	TPLoptions.get(i).click();
                break;
            }
        }
        WebElement Statusdropdown=driver.findElement(By.xpath("//div[@class='modal-content']/descendant::ng-select[@bindlabel='name' and @placeholder='Select Status']/descendant::div[@role='combobox']/input[@type='text']"));
		//div[@class='modal-content']/descendant::ng-select[@formcontrolname='payer_id']/descendant::div[@role='combobox']/input[@type='text']
        Statusdropdown.sendKeys("Submitted");
		Thread.sleep(5000);
        List<WebElement> Statusoptions=driver.findElements(By.xpath("//div[@class='modal-content']/descendant::ng-dropdown-panel[@role='listbox' and @class='ng-dropdown-panel ng-star-inserted ng-select-bottom']/div[@class='ng-dropdown-panel-items scroll-host']"));
        for(int i=0;i<Statusoptions.size();i++)
        {
            String Statustext=Statusoptions.get(i).getText();
            System.out.println("Text is" +Statustext);
            if(Statustext.contains("Submitted"))
            {
            	Statusoptions.get(i).click();
                break;
            }
        }
        
//		driver.findElement(By.xpath("//body[@class='modal-open']/descendant::div[@class='ng-value-container']/div[text()='Select Payer']/../descendant::div[@role='combobox']/input[@type='text']")).sendKeys("");
//		//driver.findElement(By.cssSelector("ng-select[class='auto-grow-location-2x ng-select ng-select-multiple ng-select-searchable ng-select-clearable ng-select-bottom ng-dirty ng-touched ng-invalid'] div[class='ng-select-container']")).click();
//		List<WebElement>options=driver.findElements(By.xpath(""));
//		for(WebElement option:options)
//		{
//			if(option.getText().equals(" AAA "))
//			{
//				option.click();
//				break;//ng-select[@placeholder='Select Payer']
//			}
//		}
		
		
		
		
		
		
		//Select sc = new Select(driver.findElement(By.xpath("//div[@id='a083ee23b006-6']")));
		//sc.selectByVisibleText("90 Degree Benefit Plan");
		
		
		
		//Alert prompt = driver.switchTo().alert();
		
		//prompt.sendKeys("Rana");
		//driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("Rana");
		
		//Actions ac = new Actions(driver);
		//driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("Raju");
		
		
		
               }
           }

		
	
