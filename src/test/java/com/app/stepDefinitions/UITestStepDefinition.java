package com.app.stepDefinitions;

import org.testng.Assert;

import com.app.pages.SuiteCRMDashboardPage;
import com.app.pages.SuiteCRMLoginPage;
import com.app.utilities.Browser;
import com.app.utilities.Configuration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UITestStepDefinition {
	
	SuiteCRMLoginPage log = new SuiteCRMLoginPage();
	SuiteCRMDashboardPage dsh = new SuiteCRMDashboardPage();
	
	
	@Given("^I logged into SuiteCRM$")
	public void i_logged_into_SuiteCRM() {
	  Browser.getDriver().get(Configuration.getPropVal("url"));
	  log.loginFunc(Configuration.getPropVal("userName"), Configuration.getPropVal("password"));
	}

	@Then("^CRM name should be SuiteCRM$")
	public void crm_name_should_be_SuiteCRM() {
	    Assert.assertTrue(Browser.getDriver().getTitle().endsWith("SuiteCRM"));
	}

	@Then("^Modules should be displayed$")
	public void modules_should_be_displayed() {
		Assert.assertTrue(dsh.support.isDisplayed());
		Assert.assertTrue(dsh.sales.isDisplayed());
		Assert.assertTrue(dsh.activities.isDisplayed());
		Assert.assertTrue(dsh.all.isDisplayed());
		Assert.assertTrue(dsh.collaboration.isDisplayed());
		Assert.assertTrue(dsh.marketing.isDisplayed());
		
	}
	
	
	

}
