package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Browser;

public class SuiteCRMContactPage {
	
	private WebDriver driver;
	
	public SuiteCRMContactPage() {
		this.driver = Browser.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[.='John Doe'])[1]")
	public WebElement jdLink;
	
 
}
