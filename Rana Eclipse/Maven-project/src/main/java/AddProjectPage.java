

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class AddProjectPage extends WebDriverUtility {
 
@FindBy(xpath="//input[@id='projectnameautofocus']")private WebElement enterProjectName;
 
@FindBy(xpath="//ng-select[@class='ng-select ng-select-multiple ng-select-searchable ng-select-clearable ng-valid ng-dirty ng-touched ng-select-top']//span[@class='ng-arrow-wrapper']")
 private WebElement selectTeamMeambers;
 
@FindBy(xpath="//div[@class='modal-content cursor-draggable']/descendant::ng-select[@bindlabel='Name' and @formcontrolname='locationId']/descendant::div[@role='combobox']/input[@type='text']")
 private WebElement selectLocation;

@FindBy(xpath = "//div[@class='modal-content cursor-draggable']/descendant::ng-select[@bindlabel='Name' and @formcontrolname='locationId']/descendant::div[@aria-expanded='true']/input[@type='text']")
private WebElement selectTask;


@FindBy(xpath="//input[@id='inlineRadio11']")
 private WebElement UnassignedCheqBox;
 
public WebElement getSelectTask() {
	return selectTask;
}
@FindBy(xpath="//button[text()='Save']")
private WebElement clickSaveButton;
 
@FindBy(xpath="//button[text()='Save and add task']")
 private WebElement clickSaveAndAddTask;

@FindBy(xpath="//div[@class='newpopup orangepopup popupstyle']//button[@type='button'][normalize-space()='Cancel']")
 private WebElement clickCancel;
 
 @FindBy(xpath="//input[@formcontrolname='startdate']")
 private WebElement clickStartDate;
 
@FindBy(xpath="//div[@data-hidden='false']//button[@type='button'][normalize-space()='23']")
 private WebElement selectParticularDate;
 
 @FindBy(xpath="//input[@formcontrolname='duedate']")
 private WebElement clickDueDate;

 @FindBy(xpath="//div[@data-hidden='false']//button[@type='button'][normalize-space()='24']")
 private WebElement selectParticularDueDate;
 
@FindBy(xpath="//div[@class='modal-content cursor-draggable']/descendant::ng-select[@bindvalue='Id' and @formcontrolname='status']/descendant::div[@role='combobox']/input[@type='text']")
private WebElement enterStatus;

 @FindBy(xpath="//ng-select[@formcontrolname='priority']//input[@type='text']")
 private WebElement enterPriority;
 
 @FindBy(xpath="//span[normalize-space()='IMPORTANT']")
private WebElement clickImportant;
 
 @FindBy(xpath="//ng-select[@formcontrolname='ownerId']//input[@type='text']")
 private WebElement enterOwner;
 
 @FindBy(xpath="//button[@id='closeprojectafterdelete']")
private WebElement clickCancelButton; 
 
 @FindBy(xpath = "//div[@class='ng-select-container ng-has-value']/span[@title='Clear all']")private WebElement clearAllTeamMembers;
 
 @FindBy(xpath = "//span[text()='Upload file(s)']")private WebElement attachment;
 

@FindBy(xpath = "//div[@id='drag']/descendant::button[text()=' Browse files ']")private WebElement browsefiles;
 
@FindBy(xpath = "//div[@class='modal-content cursor-draggable']/descendant::button[text()='Close']")private WebElement closeAttachementpage;
 
@FindBy(xpath = "//div[@class='model-footer']/descendant::button[@class='btn saveandnext']")private WebElement saveAttachementpage;

@FindBy(xpath = "//button[@id='closeprojectafterdelete']/img[@src='assets/images/close_light.svg']")private WebElement cancelIcon;

@FindBy(xpath = "//div[@class='modal-content cursor-draggable']/descendant::div[@class='row mt-2 mb-2 ng-star-inserted']/descendant::label[@class='label1 mb-0']")private WebElement allProjectTask;

@FindBy(xpath = "//div[@class='modal-content cursor-draggable']/descendant::ng-select[@bindlabel='ProjectName' and @formcontrolname='projectname']/descendant::div[@role='combobox']/input[@type='text']")private WebElement selectProject;

 public AddProjectPage(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}
public WebElement getClearAllTeamMembers() {
	return clearAllTeamMembers;
}
public WebElement getClickCancel() {
	return clickCancel;
}
public WebElement getEnterProjectName() {
	return enterProjectName;
}
public WebElement getCancelIcon() {
	return cancelIcon;
}
public WebElement getSelectTeamMeambers() {
	return selectTeamMeambers;
}
public WebElement getSelectLocation() {
	return selectLocation;
}
public WebElement getUnassignedCheqBox() {
	return UnassignedCheqBox;
}
public WebElement getClickSaveButton() {
	return clickSaveButton;
}
public WebElement getClickSaveAndAddTask() {
	return clickSaveAndAddTask;
}
public WebElement getClickStartDate() {
	return clickStartDate;
}
public WebElement getSelectParticularDate() {
	return selectParticularDate;
}
public WebElement getClickDueDate() {
	return clickDueDate;
}
public WebElement getSelectParticularDueDate() {
	return selectParticularDueDate;
}
public WebElement getEnterStatus() {
	return enterStatus;
}
public WebElement getEnterPriority() {
	return enterPriority;
}
public WebElement getClickImportant() {
	return clickImportant;
}
public WebElement getEnterOwner() {
	return enterOwner;
}
public WebElement getClickCancelButton() {
	return clickCancelButton;
}
public WebElement getCloseAttachementpage() {
	return closeAttachementpage;
}
public WebElement getSaveAttachementpage() {
	return saveAttachementpage;
}
public void clickEnter(WebDriver driver) {
    clickOnEnterButton(driver);
 }
public WebElement getAttachment() {
	return attachment;
}
public WebElement getAllProjectTask() {
	return allProjectTask;
}
public WebElement getSelectProject() {
	return selectProject;
}

}

