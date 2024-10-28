


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class TaskManagement extends WebDriverUtility {

	

	    @FindBy(xpath="//span[text()=' Dashboard']")private WebElement dashboardClick;
	    @FindBy(xpath="//span[text()=' Snapshot']")private WebElement snapshotClick;
	    @FindBy(xpath="//span[text()=' Tasks']")private WebElement tasksClick;
	    @FindBy(xpath="//span[text()=' Projects']")private WebElement projectClicik;
	    @FindBy(xpath="//span[text()=' Files']")private WebElement filesClick;
	    @FindBy(xpath="//span[text()=' Comments']")private WebElement commentsClick;
	    @FindBy(xpath="//span[text()=' Activity Log ']")private WebElement actLogClick;
	    @FindBy(xpath="//li[@ngbtooltip='Default Location']")private WebElement defaultLoc;
	    
	    
	    
	    public TaskManagement(WebDriver driver)
	    {
	      PageFactory.initElements(driver, this);
	    }

	    public WebElement getDashboardClick() {
	        return dashboardClick;
	    }


	    public WebElement getSnapshotClick() {
	        return snapshotClick;
	    }


	    public WebElement getTasksClick() {
	        return tasksClick;
	    }


	    public WebElement getProjectClicik() {
	        return projectClicik;
	    }


	    public WebElement getFilesClick() {
	        return filesClick;
	    }


	    public WebElement getCommentsClick() {
	        return commentsClick;
	    }


	    public WebElement getActLogClick() {
	        return actLogClick;
	    }


	    public WebElement getDefaultLoc() {
	        return defaultLoc;
	    }
	     
	    
	}
	


