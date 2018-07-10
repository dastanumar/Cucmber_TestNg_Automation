package com.app.stepDefinitions;

import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.app.pages.SuiteCRMContactPage;
import com.app.pages.SuiteCRMDashboardPage;
import com.app.pages.SuiteCRMLoginPage;
import com.app.utilities.Browser;
import com.app.utilities.Configuration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JohnDoeStepDefinition {
	SuiteCRMLoginPage log = new SuiteCRMLoginPage();
	SuiteCRMDashboardPage dsh = new SuiteCRMDashboardPage();
	SuiteCRMContactPage cp = new SuiteCRMContactPage();
	
	@Given("^I logged into suiteCRM$")
	public void i_logged_into_suiteCRM() {
		 Browser.getDriver().get(Configuration.getPropVal("url"));
		  log.loginFunc(Configuration.getPropVal("userName"), Configuration.getPropVal("password"));
	   
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1)  {
		
	    dsh.search.click();
	    dsh.searchSendKeys.sendKeys(arg1+Keys.ENTER);
	}

	@Then("^link for user \"([^\"]*)\" should be displayed$")
	public void link_for_user_should_be_displayed(String arg1) {
	   Assert.assertTrue(cp.jdLink.isDisplayed());
	   
	}

}
