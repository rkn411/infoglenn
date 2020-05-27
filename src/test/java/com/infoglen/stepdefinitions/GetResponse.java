package com.infoglen.stepdefinitions;

import com.framework.api.RestApiService;
import com.framework.datautils.PropertyFile;

import io.restassured.response.Response;

public class GetResponse extends RestApiService {

	static PropertyFile config = new PropertyFile();
	private Response getResponse= null;
}