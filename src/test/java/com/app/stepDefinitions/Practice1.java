package com.app.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Practice1 {

	@Given("^I go to create contact page(\\d+)$")
	public void i_go_to_create_contact_page(int arg1) {
	}

	@Then("^I create new contact using(\\d+) \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_create_new_contact_using(int arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
	}

	@Then("^I validate all created contact(\\d+) info \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_validate_all_created_contact_info(int arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
	}

	@Then("^I logout from application(\\d+)$")
	public void i_logout_from_application(int arg1) {
	}
}
