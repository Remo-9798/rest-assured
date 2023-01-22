package com.bridgelabz.qa_REST_ASSURED.Spotify;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class User_Profile {
	public String token;
	public String userid;
	String URI = "https://api.spotify.com/v1";

	@BeforeTest
	public void gettoken() {
		token = "Bearer BQCoGeTq4VRASNFrd2HbGWhZvNg5cS5jEg-SHRodmnXm7OSDvYFIQgFFL8VSDenqBbrEFU89Z6ajikzRolWIvqZB2GV_YTD4QYCVPXzhY_5PKayL8R-ThTy091-tBvb9jag2GkeVHAwgudjt82pVGFy86d4tudJiyVB1mAAazfy8mxshPvbo0XyMaOWfa-1ZFzztgKYjr7pxnfdPw8odjQ";
	}

	public void userid() {

		userid = "317z3bhz25hfjafm63debgcak3zq";
	}

	@Test

	public void get_Users_Profile() {
		// Specify the base URI to the RESTful web service
		RestAssured.baseURI = URI;
		// Get the RequestSpecification of the request to be sent to the server
		RequestSpecification httprequest1 = RestAssured.given().header("Authorization", token).header("Content-Type",
				"application/json");
		// Specify the method type (GET)
		Response response = httprequest1.request(Method.GET, "/users/userid");
		// Print the status and message body of the response received from the server
		System.out.println("Status Code Recieved:" + response.getStatusCode());
		System.out.println("Response time:" + response.getTime());
		System.out.println("Response:" + response.prettyPrint());
	}

	@Test
	public void get_Current_User_Profile() {
		// Specify the base URI to the RESTful web service
		RestAssured.baseURI = URI;
		// Get the RequestSpecification of the request to be sent to the server
		RequestSpecification httprequest1 = RestAssured.given().header("Authorization", token).header("Content-Type",
				"application/json");
		// Specify the method type (GET)
		Response response = httprequest1.request(Method.GET, "/me");
		// Print the status and message body of the response received from the server
		System.out.println("Status Code Recieved:" + response.getStatusCode());
		System.out.println("Response time:" + response.getTime());
		System.out.println("Response:" + response.prettyPrint());

	}

}
