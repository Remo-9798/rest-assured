package com.bridgelabz.qa_REST_ASSURED.Spotify;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Search extends User_Profile {
	@Test
	public void search() {
		// Specify the base URI to the RESTful web service
		RestAssured.baseURI = URI;
		// Get the RequestSpecification of the request to be sent to the server
		RequestSpecification httprequest1 = RestAssured.given().header("Authorization", token)
				.header("Content-Type", "application/json").param("q", "Arjit Singh").param("type", "track");
		// Specify the method type (GET)
		Response response = httprequest1.request(Method.GET, "/search");
		// Print the status and message body of the response received from the server
		System.out.println("Status Code Recieved:" + response.getStatusCode());
		System.out.println("Response time:" + response.getTime());
		System.out.println("Response:" + response.prettyPrint());
	}
}
