package com.app.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.net.URI;
import java.net.URISyntaxException;

import org.hamcrest.Matchers;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HRRestAPIGetRequests {
	@Test
	public void simpleGet() {
		when().get("http://34.223.219.142:1212/ords/hr/employees")
		.then().statusCode(200);
	}

	@Test
	public void printResponse() {
		when().get("http://34.223.219.142:1212/ords/hr/countries")
		.body().prettyPrint();
	}

	@Test
	public void getWithHeaders() {
		with().accept(ContentType.JSON)
		.when().get("http://34.223.219.142:1212/ords/hr/countries/US")
		.then().statusCode(200);
	}
	
	@Test
	public void negativeGet() {
//		when().get("http://34.223.219.142:1212/ords/hr/countries/1234").then().statusCode(404);
		Response response = when().get("http://34.223.219.142:1212/ords/hr/countries/1234");
		assertEquals(response.statusCode(),404);
		assertTrue(response.asString().contains("Not Found"));
		response.prettyPrint();
		
		response.then().assertThat();
	}
	
	@Test
	public void verifyContentTypeWithAssertThat() {
		String url = "http://34.223.219.142:1212/ords/hr/employees/100";
		 given().accept(ContentType.JSON)
		.when().get(url)
		.then().assertThat().statusCode(200)
		.and().contentType(ContentType.JSON);
	}
	
	@Test
	public void verifyforstName() throws URISyntaxException {
		URI uri = new URI("http://34.223.219.142:1212/ords/hr/employees/100");
		given().accept(ContentType.JSON)
		.when().get(uri)
		.then().assertThat().statusCode(200)
		.and().contentType(ContentType.JSON)
		.and().body("first_name",equalTo("Steven"))
		.and().body("employee_id",equalTo(100));
	}

}
