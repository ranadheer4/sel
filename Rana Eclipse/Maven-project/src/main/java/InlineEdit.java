

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class InlineEdit extends WebDriverUtility{
	@FindBy(xpath = "//app-task-list[@id='taskdata']//a[@class='addbtn pl-0']/..//*[name()='path' and contains(@d,'M10 5.7142')]")private WebElement addRow;
	@FindBy(xpath = "//td[@class='hover-column dx-datagrid-validator dx-validator dx-visibility-change-handler']//span[@container='body']")private WebElement taskNameField;

	@FindBy(xpath = "//tbody[@role='presentation']/../descendant::td[@class='hover-column' and @aria-colindex='4']/../descendant::span[text()='dtyhf']")private WebElement editExistingTaskName;
//	@FindBy(xpath = "")private WebElement addRow;
//	@FindBy(xpath = "")private WebElement addRow;
//	@FindBy(xpath = "")private WebElement addRow;
//	@FindBy(xpath = "")private WebElement addRow;

	@FindBy(xpath = "//tbody[@role='presentation']/descendant::td[@aria-colindex='5']/div[text()=' T0000001723 ']/../following-sibling::td[@aria-colindex='11']/../descendant::span[text()='India']")private WebElement editLocation;
	@FindBy(xpath = "//div[@id='task_1717']//span[@class='checkmark']")private WebElement checkbox;
	@FindBy(xpath = "//app-task-list//div[@class='card_links pull-right']//a[@class='actionbtn']//*[name()='svg']//*[name()='path' and contains(@d,'M5.2998 14')]")private WebElement deletelog;
	@FindBy(xpath = "//div[@class='ng-star-inserted']//button[text()='Delete']")private WebElement deleteButton;
	@FindBy(xpath = "//table[@role='presentation']//input[@data-name-row='VikramTask']")private WebElement restoreCheckbox;
	@FindBy(xpath = "//div[@class='btn-group btn-small pl-0 mb-2']//a[text()='Restore']")private WebElement restoreButton;
	@FindBy(xpath = "//div[@class='btn-group mt-2']//button[text()='Restore']")private WebElement restorePopup;
	
	
	//tbody[@role='presentation']/../descendant::td[@aria-colindex='11']/../descendant::span[text()='India']
	//tbody[@role='presentation']/descendant::td[@aria-colindex='5']/div[text()=' T0000001723 ']/../following-sibling::td[@aria-colindex='11']
	public InlineEdit(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}

	
	public WebElement getAddRow() {
		return addRow;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getTaskNameField() {
		return taskNameField;
	
	}


	public WebElement getEditExistingTaskName() {
		return editExistingTaskName;
	}

	public WebElement getEditLocation() {
		return editLocation;
	}

	public WebElement getDeletelog() {
		return deletelog;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getRestoreCheckbox() {
		return restoreCheckbox;
	}

	public WebElement getRestoreButton() {
		return restoreButton;
	}

	public WebElement getRestorePopup() {
		return restorePopup;
	}
	
	
}
