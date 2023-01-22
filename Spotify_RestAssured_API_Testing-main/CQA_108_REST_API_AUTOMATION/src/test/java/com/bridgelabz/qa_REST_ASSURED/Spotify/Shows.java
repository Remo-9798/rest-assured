package com.bridgelabz.qa_REST_ASSURED.Spotify;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test
public class Shows extends User_Profile {
	public void get_Show() {
		// Specify the base URI to the RESTful web service
		RestAssured.baseURI = URI;
		// Get the RequestSpecification of the request to be sent to the server
		RequestSpecification httprequest1 = RestAssured.given().header("Authorization", token).header("Content-Type",
				"application/json");
		// Specify the method type (GET)
		Response response = httprequest1.request(Method.GET, "/shows/5c26B28vZMN8PG0Nppmn5G");
		// Print the status and message body of the response received from the server
		System.out.println("Status Code Recieved:" + response.getStatusCode());
		System.out.println("Response time:" + response.getTime());
		System.out.println("Response:" + response.prettyPrint());

	}

	@Test
	public void get_Show_Episodes() {
		// Specify the base URI to the RESTful web service
		RestAssured.baseURI = URI;
		// Get the RequestSpecification of the request to be sent to the server
		RequestSpecification httprequest1 = RestAssured.given().header("Authorization", token).header("Content-Type",
				"application/json");
		// Specify the method type (GET)
		Response response = httprequest1.request(Method.GET, "/shows/5c26B28vZMN8PG0Nppmn5G/episodes");
		// Print the status and message body of the response received from the server
		System.out.println("Status Code Recieved:" + response.getStatusCode());
		System.out.println("Response time:" + response.getTime());
		System.out.println("Response:" + response.prettyPrint());
	}

	@Test
	public void get_Several_Episodes() {
		// Specify the base URI to the RESTful web service
		RestAssured.baseURI = URI;
		// Get the RequestSpecification of the request to be sent to the server
		RequestSpecification httprequest1 = RestAssured.given().header("Authorization", token)
				.header("Content-Type", "application/json")
				.queryParam("ids", "5c26B28vZMN8PG0Nppmn5G,7bnjJ7Va1nM07Um4Od55dW");
		// Specify the method type (GET)
		Response response = httprequest1.request(Method.GET, "/shows/");
		// Print the status and message body of the response received from the server
		System.out.println("Status Code Recieved:" + response.getStatusCode());
		System.out.println("Response time:" + response.getTime());
		System.out.println("Response:" + response.prettyPrint());
	}
}