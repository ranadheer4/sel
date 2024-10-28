package commonFunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Zoominfo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RanadheerDurgi\\Downloads\\chromedriver-win64 (7)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        WebElement goglesearch=driver.findElement(By.xpath("//form//textarea[@title='Search']"));
	        goglesearch.sendKeys("Mistral AI zoominfo");
	        Thread.sleep(2000);
	        Actions ac = new Actions(driver);
	        ac.sendKeys(Keys.ENTER).perform();
	        
	        String expectedText = "https://www.zoominfo.com/c/mistralcom/405981236";
	        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
            System.out.println("Total number of hyperlinks on the page: " + allLinks.size());
            Thread.sleep(2000);
            // Step 4: Iterate through the hyperlinks and check for the desired text in <h3> under <a>
            //String expectedText = "Your Desired Text"; // Replace with your desired text
            for (WebElement link : allLinks) {
            	 Thread.sleep(2000);
                    // Check if the anchor tag contains an <h3> with the expected text
                    WebElement h3Element = link.findElement(By.xpath("//a/h3"));
                    if (h3Element.getText().equalsIgnoreCase(expectedText)) {
                        // Click on the desired hyperlink
                        link.click();
                        break; // Exit the loop after clicking the desired link
                    }
	}
                       
            }       
}
