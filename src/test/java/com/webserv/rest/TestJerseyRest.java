package com.webserv.rest;

import com.webserv.rest.httpclient.HttpClientRestClient;
import com.webserv.rest.jersey.JerseyRestClient;
import org.junit.Assert;
import org.junit.Test;

public class TestJerseyRest {

	JerseyRestClient jerseyRestClient = new JerseyRestClient();
	String baseUrl = "http://isimion-wstraining.rhcloud.com/isimion/score/";

	@Test
	public void testGet(){
		String url = "getJson";
		String content = null;
		String response = jerseyRestClient.performRequest("GET", baseUrl+url, content, null);
		System.out.println(response);
		Assert.assertNotNull(response);
	}

	@Test
	public void testPost(){
		String url = "addGame";
		String content = "{\n" +
				"   \"name\": \"Pool\",\n" +
				"   \"description\": \"mobile game simulating pool\",\n" +
				"   \"releaseMonth\": 12,\n" +
				"   \"releaseYear\": 13,\n" +
				"   \"bugdet\": 5000\n" +
				"}";
		String response = jerseyRestClient.performRequest("POST", baseUrl+url, content, "application/json");
		System.out.println(response);
		Assert.assertNotNull(response);
	}

	@Test
	public void testPut(){
		String url = "updateScore";
		String content = "1";
		String response = jerseyRestClient.performRequest("PUT", baseUrl+url, content, "application/json");
		System.out.println(response);
		Assert.assertNotNull(response);
	}

	@Test
	public void testDelete(){
		String url = "deleteGame";
		String content = "1";
		String response = jerseyRestClient.performRequest("DELETE", baseUrl+url, content, null);
		System.out.println(response);
		Assert.assertNotNull(response);
	}}

