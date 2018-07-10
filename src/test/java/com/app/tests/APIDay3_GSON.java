package com.app.tests;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.app.utilities.Configuration;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class APIDay3_GSON {

	@Test
	public void testWithJsonToHashMap() {
		Response response = given().accept(ContentType.JSON)
		.when().get(Configuration.getPropVal("hrapp.baseresturl")+"/employees/120");
		
		HashMap<String,String> map = response.as(HashMap.class);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		assertEquals(map.get("employee_id"),120);
		assertEquals(map.get("job_id"), "AC_MGR");
	}
	
	@Test
	public void convertJsonToLisTofMaps() {
		Response response = given().accept(ContentType.JSON)
		.when().get(Configuration.getPropVal("hrapp.baseresturl")+"/departments/120");
		
		//convert the response that contains department information into list of maps
		//List<Map<String,String>>
		
//		List<Map<String,String>> listOfMaps = response.as(ArrayList.class);
		List<Map> listOfMaps = response.jsonPath().getList("items", Map.class);
		System.out.println(listOfMaps.get(0));
		assertEquals(listOfMaps.get(0).get("department_name"), "Administrator");
	}
}
