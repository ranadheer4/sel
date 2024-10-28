

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class Edit_AddTask extends WebDriverUtility{
	
@FindBy(xpath = "")private WebElement taskOpen;
@FindBy(xpath = "//input[@placeholder='Enter Task Name ']")private WebElement taskName;
@FindBy(xpath = "//input[@class='form-control form-control1 nobordershadow inputwithcalendar ng-pristine ng-valid ng-touched']")private WebElement startDate;
@FindBy(xpath = "//input[@class='form-control form-control1 nobordershadow inputwithcalendar ng-untouched ng-pristine ng-valid']")private WebElement dueDate;
@FindBy(xpath = "//div[@class='modal-content cursor-draggable']/descendant::ng-select[@bindlabel='Value' and @formcontrolname='assignto']/descendant::div[@role='combobox']/input[@type='text']")private WebElement teamMembers;
@FindBy(xpath = "//div[@class='modal-content cursor-draggable']/descendant::ng-select[@bindlabel='Value' and @formcontrolname='watcher']/descendant::div[@role='combobox']/input[@type='text']")private WebElement watchers;
@FindBy(xpath = "//div[@class='modal-content cursor-draggable']/descendant::ng-select[@class='ng-select ng-select-single ng-select-searchable ng-untouched ng-pristine ng-valid' and @formcontrolname='status']/descendant::div[@role='combobox']/input[@type='text']")private WebElement status;
@FindBy(xpath = "//div[@class='modal-content cursor-draggable']/descendant::ng-select[@class='ng-select ng-select-single ng-select-searchable ng-untouched ng-pristine ng-valid' and @formcontrolname='priority']/descendant::div[@role='combobox']/input[@type='text']")private WebElement priority;
@FindBy(xpath = "//div[@class='modal-content cursor-draggable']/descendant::ng-select[@bindlabel='Value' and @formcontrolname='ownerId']/descendant::div[@role='combobox']/input[@type='text']")private WebElement owner;
@FindBy(xpath = "//label[normalize-space()='Create custom field']")private WebElement createCustom;
@FindBy(xpath = "//label[normalize-space()='Add task workflow']")private WebElement addTaskFlow;
@FindBy(xpath = "//div[@class='dx-quill-container ql-container']//div[@role='textbox']")private WebElement description;
@FindBy(xpath = "//label[normalize-space()='All Subtask (0)']")private WebElement allSubTask;
@FindBy(xpath = "//label[normalize-space()='Add Subtask']")private WebElement addSubTask;
@FindBy(xpath = "//div[@class='col-md-8 form-group ng-star-inserted']/descendant::ng-select[@bindlabel='Name' and @formcontrolname='locationId']/descendant::div[@role='combobox']/input[@type='text']")private WebElement location;
@FindBy(xpath = "//div[@class='modal-content cursor-draggable']/descendant::ng-select[@bindlabel='ProjectName' and @formcontrolname='projectname']/descendant::div[@role='combobox']/input[@type='text']")private WebElement projectName;
@FindBy(xpath = "//button[@class='btn saveandnext']")private WebElement save;
@FindBy(xpath = "//button[normalize-space()='Cancel']")private WebElement cancel;
@FindBy(xpath = "//button[normalize-space()='Save and add subtask']")private WebElement saveAndAddSubTask;
@FindBy(xpath = "//button[normalize-space()='Delete task']")private WebElement deleteTask;
@FindBy(xpath = "//span[text()='Upload file(s)']")private WebElement uploadFile;
@FindBy(xpath = "//span[normalize-space()='Connect Olobby files']")private WebElement connectOloby;


	public Edit_AddTask(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}
	public void clickEnter(WebDriver driver) {
	    clickOnEnterButton(driver);
	 }
	public WebElement getTaskOpen() {
		return taskOpen;
	}
	
	public WebElement getTaskName() {
		return taskName;
	}
	
	public WebElement getStartDate() {
		return startDate;
	}
	
	public WebElement getDueDate() {
		return dueDate;
	}
	
	public WebElement getTeamMembers() {
		return teamMembers;
	}
	
	public WebElement getWatchers() {
		return watchers;
	}
	
	public WebElement getStatus() {
		return status;
	}
	
	public WebElement getPriority() {
		return priority;
	}
	
	public WebElement getOwner() {
		return owner;
	}
	
	public WebElement getCreateCustom() {
		return createCustom;
	}
	
	public WebElement getAddTaskFlow() {
		return addTaskFlow;
	}
	
	public WebElement getDescription() {
		return description;
	}
	
	public WebElement getAllSubTask() {
		return allSubTask;
	}
	
	public WebElement getAddSubTask() {
		return addSubTask;
	}
	
	public WebElement getLocation() {
		return location;
	}
	
	public WebElement getProjectName() {
		return projectName;
	}
	
	public WebElement getSave() {
		return save;
	}
	
	public WebElement getCancel() {
		return cancel;
	}
	
	public WebElement getSaveAndAddSubTask() {
		return saveAndAddSubTask;
	}
	
	public WebElement getDeleteTask() {
		return deleteTask;
	}
	
	public WebElement getUploadFile() {
		return uploadFile;
	}
	
	public WebElement getConnectOloby() {
		return connectOloby;
	}
	
	
	}
	
