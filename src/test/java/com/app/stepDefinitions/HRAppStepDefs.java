package com.app.stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.app.pages.HRAppDeptEmpPage;
import com.app.utilities.Browser;
import com.app.utilities.BrowserUtils;
import com.app.utilities.Configuration;
import com.app.utilities.DBType;
import com.app.utilities.DBUtility;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HRAppStepDefs {

	private WebDriver driver = Browser.getDriver();
	private HRAppDeptEmpPage depEmpPage = new HRAppDeptEmpPage();
	
	private Map<String,String> UIDepartmentData;
	private Map<String,Object> DBDepartmentData;
	
	@Given("^I am on DepEmpPage$")
	public void i_am_on_DepEmpPage() {
	   driver.get(Configuration.getPropVal("hrapp.url"));
	}

	@When("^I search for department id (\\d+)$")
	public void i_search_for_department_id(int depID) {
		UIDepartmentData = new HashMap<>();
	int currentDepId = Integer.parseInt(depEmpPage.dep_Id.getText());
	
	while(currentDepId != depID) {
		depEmpPage.nextBtn.click();
		BrowserUtils.waitFor(2);
		depEmpPage=new HRAppDeptEmpPage();
		BrowserUtils.waitForVisibility(depEmpPage.dep_Id, 5);
		currentDepId = Integer.parseInt(depEmpPage.dep_Id.getText());
	}
	UIDepartmentData.put("DEPARTMENT_NAME", depEmpPage.dep_Name.getText());
	UIDepartmentData.put("MANAGER_ID", depEmpPage.manager_Id.getText());
	UIDepartmentData.put("LOCATION_ID", depEmpPage.location_Id.getText());

	}

	@When("^I query database with sql \"([^\"]*)\"$")
	public void i_query_database_with_sql(String sql) throws SQLException {
	DBUtility.establishConnection(DBType.ORACLE);
	List<Map<String,Object>> DBDataList = DBUtility.runSQLQuery(sql);
	DBDepartmentData = DBDataList.get(0);
	DBUtility.closeConnections();
	}
	
	@When("^I search for \"([^\"]*)\" to see firstname and lastname$")
	public void i_search_for_to_see_firstname_and_lastname(String email_Id) {
		depEmpPage.email.sendKeys(email_Id);
		depEmpPage.FindDetails.click();
		BrowserUtils.waitForVisibility(depEmpPage.firstName, 5);
		
		UIDepartmentData= new HashMap<>();
		
		UIDepartmentData.put("FIRST_NAME", depEmpPage.firstName.getText());
		UIDepartmentData.put("LAST_NAME", depEmpPage.lastName.getText());

	}

	@Then("^UI data and Database data must match$")
	public void ui_data_and_Database_data_must_match() {
		for(String key : DBDepartmentData.keySet()) {
			assertEquals(UIDepartmentData.get(key),String.valueOf(DBDepartmentData.get(key)));
		}
	//assertEquals(UIDepartmentData,DBDepartmentData);
//		assertEquals(UIDepartmentData.get("DEPARTMENT_NAME"),DBDepartmentData.get("DEPARTMENT_NAME"));
//		assertEquals(UIDepartmentData.get("LOCATION_ID"),String.valueOf(DBDepartmentData.get("LOCATION_ID")));
//		assertEquals(UIDepartmentData.get("MANAGER_ID"),String.valueOf(DBDepartmentData.get("MANAGER_ID")));
		
		
		
		
		
		
		
		
		
	}
}
