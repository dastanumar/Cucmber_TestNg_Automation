package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Browser;

public class SuiteCRMLoginPage {

	private WebDriver driver;

	public SuiteCRMLoginPage() {
		this.driver = Browser.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user_name")
	public WebElement userName;

	@FindBy(id = "username_password")
	public WebElement password;

	@FindBy(name = "Login")
	public WebElement login;

	public void loginFunc(String userNm, String pwd) {
		userName.sendKeys(userNm);
		password.sendKeys(pwd);
		login.click();

	}

}
