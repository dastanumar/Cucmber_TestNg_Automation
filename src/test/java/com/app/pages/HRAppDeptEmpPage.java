package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Browser;

public class HRAppDeptEmpPage {

	private WebDriver driver;

	public HRAppDeptEmpPage() {
		this.driver=Browser.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="pt1:ot1")
	public WebElement dep_Id;

	@FindBy(id="pt1:ot2")
	public WebElement dep_Name;

	@FindBy(id="pt1:ot3")
	public WebElement manager_Id;

	@FindBy(id="pt1:ot4")
	public WebElement location_Id;

	@FindBy(id="pt1:cb3")
	public WebElement nextBtn;

	@FindBy(id="pt1:r1:0:it1::content")
	public WebElement email;

	@FindBy(id="pt1:r1:0:cb1")
	public WebElement FindDetails;

	@FindBy(id="pt1:r1:0:ot1")
	public WebElement firstName;

	@FindBy(id="pt1:r1:0:ot2")
	public WebElement lastName;


}
