package com.app.stepDefinitions;


import com.app.pages.SuiteCRMDashboardPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashboardActionsStepDefinition {
	SuiteCRMDashboardPage dsh = new SuiteCRMDashboardPage();
	
	@When("^I post \"([^\"]*)\"$")
	public void i_post(String note) {
		dsh.postNote(note);   
	}

	@Then("^Post should be displayed$")
	public void post_should_be_displayed() {
	    //Assert.assert
	}
	
	@Then("^I logout from application$")
	public void i_logout_from_application() {
	    
	}

}
