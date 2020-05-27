package com.framework.api;

	import static io.restassured.RestAssured.given;

	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;

public class RestApiService {
		RequestSpecification requestSpec = given();
		public Response response = null;
		
		/*
		 * * Method for Get Request
		 */
		public Response get_request(String url) {
			response = requestSpec.when().get(url).then().extract().response();
			return response;
		}

	

}
