

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class ProjectHomePage2 extends WebDriverUtility	{
	
	@FindBy(xpath = "//app-project-list[@id='projectdata']//div[@class='card_links pull-right']//a[@class='actionbtn']//*[name()='svg']//*[name()='path' and contains(@d,'M5.2998 14')]")private WebElement delete;
	@FindBy(xpath = "//app-project-list[@id='projectdata']//div[@class='card_links pull-right']//a[@class='actionbtn']//*[name()='svg']//*[name()='path' and contains(@d,'M14.8496 6')]")private WebElement export;
	@FindBy(xpath = "//app-project-list[@id='projectdata']//div[@class='card_links pull-right']//a[@class='actionbtn']//*[name()='svg']//*[name()='path' and contains(@d,'M14.4002 10')]")private WebElement showFullScreen;
	@FindBy(xpath = "//app-project-list[@id='projectdata']//div[@class='card_links pull-right']//a[@class='actionbtn']//*[name()='svg']//*[name()='path' and contains(@d,'M9.56045')]")private WebElement refresh;
	@FindBy(xpath = "//app-project-list[@id='projectdata']//span[text()='All Projects']")private WebElement allProjects;
	@FindBy(xpath = "//app-project-list[@id='projectdata']//span[text()='My Projects']")private WebElement myProjects;
	@FindBy(xpath = "//app-project-list[@id='projectdata']//span[text()='Assigned to me']")private WebElement assignedToMe;
	@FindBy(xpath = "//app-project-list[@id='projectdata']//span[text()='Assigned to others']")private WebElement assignedToOthers;
	@FindBy(xpath = "//app-project-list[@id='projectdata']//span[text()='Completed projects']")private WebElement completedTasks;
	@FindBy(xpath = "//app-project-list[@id='projectdata']//input[@placeholder='Search Project']")private WebElement searchProject;
	@FindBy(xpath = "//app-project-list[@id='projectdata']//div[@class='btn-group']//a[@class='addbtn pl-0']//*[name()='svg']//*[name()='path' and contains(@d,'M13.4583 16')]")private WebElement addProject;
	@FindBy(xpath = "//app-project-list[@id='projectdata']//a[text()=' Show all']")private WebElement showAll;
	@FindBy(xpath = "//app-project-list[@id='projectdata']//a[text()=' Due today']")private WebElement dueDate;
	@FindBy(xpath = "//app-project-list[@id='projectdata']//a[text()=' Due this week']")private WebElement dueThisWeek;
	@FindBy(xpath = "//app-project-list[@id='projectdata']//a[text()='Assigned today']")private WebElement assignedToday;
	@FindBy(xpath = "//app-project-list[@id='projectdata']//a[text()='Unassigned due date']")private WebElement unassignedDueDate;
	
	public ProjectHomePage2(WebDriver driver)
    {
      PageFactory.initElements(driver, this);
    }

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getExport() {
		return export;
	}

	public WebElement getShowFullScreen() {
		return showFullScreen;
	}

	public WebElement getRefresh() {
		return refresh;
	}

	public WebElement getAllProjects() {
		return allProjects;
	}

	public WebElement getMyProjects() {
		return myProjects;
	}

	public WebElement getAssignedToMe() {
		return assignedToMe;
	}

	public WebElement getAssignedToOthers() {
		return assignedToOthers;
	}

	public WebElement getCompletedTasks() {
		return completedTasks;
	}

	public WebElement getSearchProject() {
		return searchProject;
	}

	public WebElement getAddProject() {
		return addProject;
	}

	public WebElement getShowAll() {
		return showAll;
	}

	public WebElement getDueDate() {
		return dueDate;
	}

	public WebElement getDueThisWeek() {
		return dueThisWeek;
	}

	public WebElement getAssignedToday() {
		return assignedToday;
	}

	public WebElement getUnassignedDueDate() {
		return unassignedDueDate;
	}
	
	
	

}
