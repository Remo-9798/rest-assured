package com.bridgelabz.qa_REST_ASSURED.Spotify;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Tracks extends User_Profile{
@Test
	public void get_Track() {
	//Specify the base URI to the RESTful web service
	RestAssured.baseURI=URI;
	//Get the RequestSpecification of the request to be sent to the server
	RequestSpecification httprequest1=RestAssured.given().header("Authorization",token).header("Content-Type","application/json");
	//Specify the method type (GET)
	Response response=httprequest1.request(Method.GET,"/tracks/39m83gjG1lNr7Un0dJndFw");
	//Print the status and message body of the response received from the server
	System.out.println("Status Code Recieved:"+response.getStatusCode());
	System.out.println("Response time:"+response.getTime());
	System.out.println("Response:"+response.prettyPrint());
}
@Test
public void get_Several_Track() {
//Specify the base URI to the RESTful web service
RestAssured.baseURI=URI;
//Get the RequestSpecification of the request to be sent to the server
RequestSpecification httprequest1=RestAssured.given().header("Authorization",token).header("Content-Type","application/json").queryParam("ids", "39m83gjG1lNr7Un0dJndFw,7lVyNLH739NLN6Rp5R6r9u");
//Specify the method type (GET)
Response response=httprequest1.request(Method.GET,"/tracks");
//Print the status and message body of the response received from the server
System.out.println("Status Code Recieved:"+response.getStatusCode());
System.out.println("Response time:"+response.getTime());
System.out.println("Response:"+response.prettyPrint());
}

@Test
public void get_Tracks_Audiofeatures() {
//Specify the base URI to the RESTful web service
RestAssured.baseURI=URI;
//Get the RequestSpecification of the request to be sent to the server
RequestSpecification httprequest1=RestAssured.given().header("Authorization",token).header("Content-Type","application/json");
//Specify the method type (GET)
Response response=httprequest1.request(Method.GET,"/audio-features/39m83gjG1lNr7Un0dJndFw");
//Print the status and message body of the response received from the server
System.out.println("Status Code Recieved:"+response.getStatusCode());
System.out.println("Response time:"+response.getTime());
System.out.println("Response:"+response.prettyPrint());
}
@Test
public void get_Tracks_Audioanalysis() {
//Specify the base URI to the RESTful web service
RestAssured.baseURI=URI;
//Get the RequestSpecification of the request to be sent to the server
RequestSpecification httprequest1=RestAssured.given().header("Authorization",token).header("Content-Type","application/json");
//Specify the method type (GET)
Response response=httprequest1.request(Method.GET,"/audio-analysis/39m83gjG1lNr7Un0dJndFw");
//Print the status and message body of the response received from the server
System.out.println("Status Code Recieved:"+response.getStatusCode());
System.out.println("Response time:"+response.getTime());
System.out.println("Response:"+response.prettyPrint());
}
}
