package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTaskPage {
	
	@FindBy(xpath="//input[@id='subject']")private WebElement enterSubject;
	
	@FindBy(xpath="//textarea[@id='description']")private WebElement descriptionBox;
	
	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[4]")private WebElement payerdropdown;
	
	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[5]")private WebElement TINdropDown;
	
	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[6]")private WebElement TinProLocaDropdown;
	
	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[7]")private WebElement PriorityDropDown;
	
	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[8]") private WebElement StatusDropDown;
	
	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[10]")private WebElement AssignToDropDown;
	
	@FindBy(xpath="(//button[@class='btn btn-outline-secondary calendar'])[3]")private WebElement Date;
	
	public CreateTaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEnterSubject() {
		return enterSubject;
	}

	public WebElement getDescriptionBox() {
		return descriptionBox;
	}

	public WebElement getPayerdropdown() {
		return payerdropdown;
	}

	public WebElement getTINdropDown() {
		return TINdropDown;
	}

	public WebElement getTinProLocaDropdown() {
		return TinProLocaDropdown;
	}

	public WebElement getPriorityDropDown() {
		return PriorityDropDown;
	}

	public WebElement getStatusDropDown() {
		return StatusDropDown;
	}

	public WebElement getAssignToDropDown() {
		return AssignToDropDown;
	}

	public WebElement getDate() {
		return Date;
	}
	
	
	
	
	
	

}
