package commonFunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mar {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Rana durgi\\Rana Eclipse\\Maven-project\\chromedriver.exe");
		
        // Create a new instance of the Chrome driver
        //WebDriver driver = new EdgeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

        driver.get("https://pitchbook.com/profiles");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Search profile previews']")).sendKeys("Adept");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='onetrust-banner-sdk']//button[text()='Accept All Cookies']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);
                
       // List<WebElement> links = driver.findElements(By.tagName("a"));
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("sizes" +links.size());
        
        String expectedTitle = "Adept";
        Thread.sleep(1000);
        
        for (WebElement link : links) {
        	
            if (link.getAttribute("title").equals(expectedTitle)) {
            	System.out.println(link.getText());
                link.click(); 
                break; 
            }
        }
        Thread.sleep(1000);
        java.util.List<WebElement> liElements = driver.findElements(By.tagName("li"));
   
        for (WebElement liElement : liElements) {
                     
            if (liElement.getText().contains("CEO")) {
                
                WebElement pElement = liElement.findElement(By.tagName("p"));
                
                String ceoName = pElement.getText();
                System.out.println("CEO Name: " + ceoName);
                                
            }
        }
        
	}}


