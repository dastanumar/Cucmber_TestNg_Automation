package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.app.utilities.Browser;

public class SuiteCRMCreateContactPage {
private WebDriver driver;
	
	public SuiteCRMCreateContactPage() {
		this.driver=Browser.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="salutation")
	public WebElement prefixDrop;
	
	@FindBy(id="first_name")
	public WebElement firstName;
	
	@FindBy(id="last_name")
	public WebElement lastName;
	
	@FindBy(id="phone_work")
	public WebElement phoneNumber;
	
	@FindBy(id="title")
	public WebElement title;
	
	@FindBy(id="SAVE")
	public WebElement saveButton;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	public WebElement save2;
	
	@FindBy(id="first_name")
	public WebElement firstNameSaved;
	
	@FindBy(id="last_name")
	public WebElement lastNameSaved;
	
	@FindBy(xpath="//div[@field='phone_work']")
	public WebElement phoneNumberSaved;
	
	@FindBy(id="title")
	public WebElement titleSaved;
	
	@FindBy(xpath="//h2[@class='module-title-text']")
	public WebElement verifyTopTitle;
	
	public void createContact(String prefix2, String firstName2, String lastName2, String phoneNumber2, String title2) {
		
		Select select = new Select(prefixDrop);
		select.selectByVisibleText(prefix2);
		firstName.sendKeys(firstName2);
		lastName.sendKeys(lastName2);
		phoneNumber.sendKeys(phoneNumber2);
		title.sendKeys(title2);
		saveButton.click();
		try {
			save2.click();
		}catch(Exception e) {
			System.out.println("Contact is not duplicate");
		}
		
	}
	

}
