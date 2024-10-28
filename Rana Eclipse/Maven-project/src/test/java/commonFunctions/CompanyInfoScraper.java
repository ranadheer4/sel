package commonFunctions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class CompanyInfoScraper {

    public static void main(String[] args) throws IOException {
        // Set up WebDriver with user agent
        WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RanadheerDurgi\\Downloads\\chromedriver-win64 (7)\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Path to the Excel file
        String excelFilePath = "C:\\Users\\RanadheerDurgi\\Desktop\\Nvidia Event_Update.xlsx";

        // Open the Excel file
        FileInputStream fis = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        // Loop through each row in the first column (Company Name)
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            Cell companyNameCell = row.getCell(0);

            if (companyNameCell != null) {
                String companyName = companyNameCell.getStringCellValue();

                // Search for the company on the webpage
                driver.get("https://pitchbook.com/profiles");
                WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search Profiles']"));
                searchBox.sendKeys(companyName);
                searchBox.submit();

                // Wait for the search results to load and display the results
                try {
                    Thread.sleep(5000); // sleep for 5 seconds to avoid rate limiting
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                List<WebElement> result = driver.findElements(By.xpath("//div[contains(@class,'flex-justify-center')]//a"));
                result.stream().filter(s -> s.getAttribute("title").equals(companyName)).findFirst().ifPresent(WebElement::click);

                // Locate the elements containing the required information
                List<WebElement> addressList = driver.findElements(By.xpath("//h5[text()='Corporate Office']//following-sibling::ul//li"));
                WebElement yearElement = driver.findElement(By.xpath("//li[text()='Year Founded']//following-sibling::li"));
                WebElement websiteElement = driver.findElement(By.xpath("//h5[text()='Website']//following-sibling::a"));
                WebElement employeesElement = driver.findElement(By.xpath("//li[text()='Employees']//following-sibling::li"));

                String ceo;
                try {
                    WebElement ceoElement = driver.findElement(By.xpath("//h3[contains(text(),'Who is the CEO')]//following-sibling::p"));
                    ceo = ceoElement.getText();
                } catch (NoSuchElementException e) {
                    ceo = "CEO not Provided";
                }

                // Get the text from those elements
                String address = addressList.stream().map(WebElement::getText).collect(Collectors.joining(", "));
                String year = yearElement.getText();
                String website = websiteElement.getAttribute("href");
                String employees = employeesElement.getText();

                // Write the data back into the Excel file
                row.createCell(1).setCellValue(address);
                row.createCell(2).setCellValue(year);
                row.createCell(3).setCellValue(website);
                row.createCell(4).setCellValue(employees);
                row.createCell(5).setCellValue(ceo);
            }
        }

        // Close the input stream
        fis.close();

        // Write the output to the Excel file
        FileOutputStream fos = new FileOutputStream(excelFilePath);
        workbook.write(fos);
        fos.close();

        // Close the workbook
        workbook.close();

        // Close the WebDriver
        driver.quit();
    }
}
