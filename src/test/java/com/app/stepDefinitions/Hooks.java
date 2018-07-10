package com.app.stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.app.utilities.Browser;

import cucumber.api.Scenario;
import cucumber.api.java.After;


public class Hooks {
	
	@After
	public void teardown(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot)Browser.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
		
		Browser.getDriver().quit();
	}

}
