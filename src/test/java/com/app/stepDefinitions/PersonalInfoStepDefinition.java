package com.app.stepDefinitions;

import org.openqa.selenium.Keys;

import com.app.pages.SuiteCRMContactPage;
import com.app.pages.SuiteCRMDashboardPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PersonalInfoStepDefinition {
	
	SuiteCRMDashboardPage dsh = new SuiteCRMDashboardPage();
	SuiteCRMContactPage cp = new SuiteCRMContactPage();
	
	@Given("^I open contact \"([^\"]*)\"$")
	public void i_open_contact(String arg1) {
		dsh.search.click();
		dsh.searchSendKeys.sendKeys(arg1+Keys.ENTER);
		
		

	}

	@Then("^contact name should be \"([^\"]*)\"$")
	public void contact_name_should_be(String arg1) {
	    
	}

	@Then("^contact email should be \"([^\"]*)\"$")
	public void contact_email_should_be(String arg1) {
	    
	}

}
