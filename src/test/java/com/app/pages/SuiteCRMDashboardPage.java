package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Browser;

public class SuiteCRMDashboardPage {
	
	private WebDriver driver;
	
	public SuiteCRMDashboardPage() {
		this.driver=Browser.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="SALES")
	public WebElement sales;
	
	@FindBy(linkText="MARKETING")
	public WebElement marketing;
	
	@FindBy(linkText="SUPPORT")
	public WebElement support;
	
	@FindBy(linkText="ACTIVITIES")
	public WebElement activities;
	
	@FindBy(linkText="COLLABORATION")
	public WebElement collaboration;
	
	@FindBy(linkText="ALL")
	public WebElement all;
	
	@FindBy(xpath="//input[contains(@title,'Post Status')]")
	public WebElement postBox;
	
	@FindBy(xpath="//div[@class='dashletNonTable']//input[@value='Post']")
	public WebElement post;
	
	@FindBy(xpath="(//button[@id='searchbutton'])[3]")
	public WebElement search;
	
//	@FindBy(xpath="(//form[@id='searchformdropdown']//div[@class='input-group']//span[@class='input-group-btn'])[3]")
//	public WebElement search2;
	
	@FindBy(xpath="(//div[@class='dropdown-menu'] //div[@class='input-group']/input[@placeholder='Search...'])[2]")
	public WebElement searchSendKeys;
	
	@FindBy(xpath="//div[@class='desktop-bar']//li[@id='quickcreatetop']//a[contains(text(),'CREATE')]")
	public WebElement createMenu;
	
	@FindBy(linkText="Create Contact")
	public WebElement createContactButton;
	
	public void postNote(String note) {
		postBox.sendKeys(note);
		post.click();
		
	}
	
	

	
	
	
	
	
	
	
	

}
