package com.bridgelabz.qa_REST_ASSURED.Spotify;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Playlist extends User_Profile {

	@Test
	public void create_Playlist() {

		// Specify the base URI to the RESTful web service
		RestAssured.baseURI = URI;
		// Get the RequestSpecification of the request to be sent to the server
		RequestSpecification httprequest1 = RestAssured.given();
		httprequest1
				.body("{\r\n" + "  \"name\": \"MYJollywood\",\r\n"
						+ "  \"description\": \"New playlist description\",\r\n" + "  \"public\": false\r\n" + "}")
				.header("Authorization", token).header("Content-Type", "application/json");

		// Specify the method type (POST)
		Response response = httprequest1.request(Method.POST, "/users/317z3bhz25hfjafm63debgcak3zq/playlists");

		// Print the status and message body of the response received from the server
		System.out.println("Status Code Recieved:" + response.getStatusCode());
		System.out.println("Response:" + response.asPrettyString());
	}

	@Test
	public void additems() {
		// Specify the base URI to the RESTful web service
		RestAssured.baseURI = URI;
		// Get the RequestSpecification of the request to be sent to the server
		RequestSpecification httprequest1 = RestAssured.given().header("Authorization", token)
				.header("Content-Type", "application/json").queryParam("uris", "spotify:track:39m83gjG1lNr7Un0dJndFw");

		// Specify the method type (POST)
		Response response = httprequest1.request(Method.POST, "/playlists/3cPS3jM3VbQrONmpH6XyWu/tracks");
		// Print the status and message body of the response received from the server
		System.out.println("Status Code Recieved:" + response.getStatusCode());
		System.out.println("Response:" + response.asPrettyString());
	}

	@Test
	public void get_User_Plalist() {
		// Specify the base URI to the RESTful web service
		RestAssured.baseURI = URI;
		// Get the RequestSpecification of the request to be sent to the server
		RequestSpecification httprequest1 = RestAssured.given().header("Authorization", token).header("Content-Type",
				"application/json");
		// Specify the method type (GET)
		Response response = httprequest1.request(Method.GET, "/users/userid/playlists");
		// Print the status and message body of the response received from the server
		System.out.println("Status Code Recieved:" + response.getStatusCode());
		System.out.println("Response time:" + response.getTime());
		System.out.println("Response:" + response.prettyPrint());
	}

	@Test
	public void get_Playlist() {
		// Specify the base URI to the RESTful web service
		RestAssured.baseURI = URI;
		// Get the RequestSpecification of the request to be sent to the server
		RequestSpecification httprequest1 = RestAssured.given().header("Authorization", token).header("Content-Type",
				"application/json");
		// Specify the method type (GET)
		Response response = httprequest1.request(Method.GET, "playlists/06LfKcuMyeDEd7zuZqqsSf");
		// Print the status and message body of the response received from the server
		System.out.println("Status Code Recieved:" + response.getStatusCode());
		System.out.println("Response time:" + response.getTime());
		System.out.println("Response:" + response.prettyPrint());
	}

	@Test
	public void get_Playlist_Items() {
		// Specify the base URI to the RESTful web service
		RestAssured.baseURI = URI;
		// Get the RequestSpecification of the request to be sent to the server
		RequestSpecification httprequest1 = RestAssured.given().header("Authorization", token).header("Content-Type",
				"application/json");
		// Specify the method type (GET)
		Response response = httprequest1.request(Method.GET, "playlists/06LfKcuMyeDEd7zuZqqsSf/tracks");
		// Print the status and message body of the response received from the server
		System.out.println("Status Code Recieved:" + response.getStatusCode());
		System.out.println("Response time:" + response.getTime());
		System.out.println("Response:" + response.prettyPrint());
	}

	@Test
	public void get_Playlist_Coverimage() {
		// Specify the base URI to the RESTful web service
		RestAssured.baseURI = URI;
		// Get the RequestSpecification of the request to be sent to the server
		RequestSpecification httprequest1 = RestAssured.given().header("Authorization", token).header("Content-Type",
				"application/json");
		// Specify the method type (GET)
		Response response = httprequest1.request(Method.GET, "playlists/06LfKcuMyeDEd7zuZqqsSf/images");
		// Print the status and message body of the response received from the server
		System.out.println("Status Code Recieved:" + response.getStatusCode());
		System.out.println("Response time:" + response.getTime());
		System.out.println("Response:" + response.prettyPrint());
	}

	@Test
	public void get_CurrentPlaylist() {
		// Specify the base URI to the RESTful web service
		RestAssured.baseURI = URI;
		// Get the RequestSpecification of the request to be sent to the server
		RequestSpecification httprequest1 = RestAssured.given().header("Authorization", token).header("Content-Type",
				"application/json");
		// Specify the method type (GET)
		Response response = httprequest1.request(Method.GET, "/me/playlists");
		// Print the status and message body of the response received from the server
		System.out.println("Status Code Recieved:" + response.getStatusCode());
		System.out.println("Response time:" + response.getTime());
		System.out.println("Response:" + response.prettyPrint());
	}

	@Test
	public void update_Playlist_Items() {

		// Specify the base URI to the RESTful web service
		RestAssured.baseURI = URI;
		// Get the RequestSpecification of the request to be sent to the server
		RequestSpecification httprequest1 = RestAssured.given();
		httprequest1
				.body("{\r\n" + "  \"range_start\": 1,\r\n" + "  \"insert_before\": 3,\r\n"
						+ "  \"range_length\": 2\r\n" + "}")
				.header("Authorization", token).header("Content-Type", "application/json")
				.queryParam("uris", "spotify:track:4nKc9yiwXWlEByq1oMfHU6");

		// Specify the method type (POST)
		Response response = httprequest1.request(Method.PUT, "/playlists/06LfKcuMyeDEd7zuZqqsSf/tracks");

		// Print the status and message body of the response received from the server
		System.out.println("Status Code Recieved:" + response.getStatusCode());
		System.out.println("Response:" + response.asPrettyString());
	}

	@Test
	public void change_Playlist_Details() {

		// Specify the base URI to the RESTful web service
		RestAssured.baseURI = URI;
		// Get the RequestSpecification of the request to be sent to the server
		RequestSpecification httprequest1 = RestAssured.given();
		httprequest1
				.body("{\r\n" + "  \"name\": \"MyTollywood\",\r\n"
						+ "  \"description\": \"Updated playlist description\",\r\n" + "  \"public\": false\r\n" + "}")
				.header("Authorization", token).header("Content-Type", "application/json")
				.queryParam("uris", "spotify:track:4nKc9yiwXWlEByq1oMfHU6");

		// Specify the method type (POST)
		Response response = httprequest1.request(Method.PUT, "/playlists/06LfKcuMyeDEd7zuZqqsSf");

		// Print the status and message body of the response received from the server
		System.out.println("Status Code Recieved:" + response.getStatusCode());
		System.out.println("Response:" + response.asPrettyString());
	}

	@Test
	public void deleteEmployee() {
		// Specify the base URI to the RESTful web service
		RestAssured.baseURI = URI;
		// Get the RequestSpecification of the request to be sent to the server
		RequestSpecification httprequest = RestAssured.given();

		httprequest.body("{\r\n" + "    \"tracks\":[{\"uri\":\"spotify:track:39m83gjG1lNr7Un0dJndFw\"}]\r\n" + "}")
				.header("Authorization", token).header("Content-Type", "application/json");
		// Specify the method type (DELETE)
		Response response = httprequest.request(Method.DELETE, "/playlists/3cPS3jM3VbQrONmpH6XyWu/tracks");

		// Print the status and message body of the response received from the server
		System.out.println("Status Code Recieved:" + response.getStatusCode());
		System.out.println("Response:" + response.asPrettyString());

	}

}
