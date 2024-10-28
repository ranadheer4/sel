package cmd;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.sql.Time;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class trail {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev-refactor.credentialmydoc.com/workflow");
        
        // Your test logic here
        driver.quit();
    }
}

