package com.app.stepDefinitions;

import java.util.List;

import com.app.models.Contact;

import cucumber.api.java.en.Then;

public class DDT_StepDef {
	
	@Then("^I pass info$")
	public void i_pass_info(List<Contact> data) {
	    
	    	System.out.println(data.size());
	    	for(Contact c : data) {
	    		
	    		System.out.println("Prefix: "+c.getPrefix());
	    		System.out.println("First name "+ c.getFirstName());
	    	}
	  }
}
