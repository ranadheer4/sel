

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.AddProjectPage;
import com.TaskManagement.ObjRepo.Edit_AddTask;

import com.TaskManagement.ObjRepo.TaskManagement;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;



public class TaskMang extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
      
   )
   public void editProject() throws InterruptedException {
	   HomePage hp = new HomePage(driver);
	   Thread.sleep(2000);
	   hp.getTaskManageMent().click();
	   Thread.sleep(2000);
	   
	   TaskManagement t = new TaskManagement(driver);
	   Thread.sleep(2000);
	   //Projects p = new Projects(driver);
	   t.getProjectClicik().click();
	   Thread.sleep(3000);
//	   Alert alert = driver.switchTo().alert();
//	   alert.accept();
	  
	   WebElement hidenelement = driver.findElement(By.xpath("//tbody[@role='presentation']/../descendant::td[@aria-colindex='2']/../descendant::span[text()='Automation']/..//following-sibling::span[text()='Open']"));
	   Thread.sleep(2000);
	   ((JavascriptExecutor)driver).executeScript("document.scrollIntoView",hidenelement);
	   hidenelement.click();
	   //Thread.sleep(3000);
	   AddProjectPage ap=new AddProjectPage(driver);
	   Thread.sleep(3000);
	   ap.getEnterProjectName().clear();
	   ap.getEnterProjectName().sendKeys(eLib.readDataFromExcel("EditProject", 1, 0));
	   
	   ap.getSelectLocation().sendKeys(eLib.readDataFromExcel("EditProject", 1, 1));
	   ap.clickEnter(driver);
	   ap.getClearAllTeamMembers().click();
	   
	   ap.getUnassignedCheqBox().click();
	   
	   ap.getEnterStatus().sendKeys(eLib.readDataFromExcel("EditProject", 1, 2));
	   ap.clickEnter(driver);
	   ap.getEnterPriority().sendKeys(eLib.readDataFromExcel("EditProject", 1, 3));
	   ap.clickEnter(driver);
	   ap.getClickStartDate().click();
	   ap.getClickStartDate().clear();
	   ap.getClickStartDate().sendKeys(eLib.readDataFromExcel("EditProject", 1, 4));
	   ap.clickEnter(driver);
	   ap.getClickDueDate().click();
	   ap.getClickDueDate().clear();
	   ap.getClickDueDate().sendKeys(eLib.readDataFromExcel("EditProject", 1, 5));
	   ap.clickEnter(driver);
	   
	   
	   //browse the file
//	   ap.getAttachment().click();
//	   WebElement browse = driver.findElement(By.xpath("//div[@id='drag']/descendant::button[text()=' Browse files ']"));
//	   browse.click();
//	   browse.sendKeys("C:\\Users\\RanadheerDurgi\\Downloads\\All.xlsx");
	   ap.getAllProjectTask().click();
	   WebElement hidenelement2 = driver.findElement(By.xpath("//dx-tree-list[@role='presentation']/descendant::td[@aria-colindex='2']/descendant::span[text()='T0000001686']/../../preceding-sibling::td[@aria-colindex='1']/descendant::span[text()='VikramTask']/../following-sibling::span"));
	   Thread.sleep(2000);
	   ((JavascriptExecutor)driver).executeScript("document.scrollIntoView",hidenelement2);
	   hidenelement2.click();
	   Thread.sleep(2000);
	   Edit_AddTask ea=new Edit_AddTask(driver);
	   ea.getTaskName().clear();
	   ea.getTaskName().sendKeys(eLib.readDataFromExcel("EditProject", 1, 6));
//	   ap.getEnterProjectName().clear();
//	   ap.getEnterProjectName().sendKeys(eLib.readDataFromExcel("EditProject", 1, 6));
	   
	   
//	   ea.getStartDate().clear();
//	   ea.getStartDate().sendKeys(eLib.readDataFromExcel("EditProject", 1, 7));
//
//	   ea.getDueDate().clear();
//	   
//	   ea.getDueDate().sendKeys(eLib.readDataFromExcel("EditProject", 1, 8));
	   
	   ea.getLocation().sendKeys(eLib.readDataFromExcel("EditProject", 1, 9));
	   ea.clickEnter(driver);
	   ea.getProjectName().sendKeys(eLib.readDataFromExcel("EditProject", 1, 10));
	   ea.clickEnter(driver);
	   ea.getStatus().sendKeys(eLib.readDataFromExcel("EditProject", 1, 11));
	   ea.getPriority().sendKeys(eLib.readDataFromExcel("EditProject", 1, 12));
	   
	   ea.getSave().click();
	   
	   //ap.getClickSaveButton().click();
	   
	   
	   
   }
   
}