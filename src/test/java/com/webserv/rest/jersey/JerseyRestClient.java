package com.webserv.rest.jersey;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyRestClient {
	private Client client;

	public JerseyRestClient()
	{
		client = Client.create();
	}

	public String performRequest(String action, String url, String content, String format) {
		if(action.equals("GET")){
			return performGet(url, content, format);
		}
		if(action.equals("POST")){
			return performPost(url, content, format);
		}
		if(action.equals("PUT")){
			return performPut(url, content, format);
		}
		if(action.equals("DELETE")){
			return performDelete(url, content, format);
		}
		return null;
	}


	private String performGet(String url, String content, String format){
		if (content!= null && !content.isEmpty()){
			url = url + "/" + content;
		}
		WebResource webResource = client
				.resource(url);
		ClientResponse response = webResource.accept(format)
				.get(ClientResponse.class);
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
		}
		String output = response.getEntity(String.class);
		return output;
	}

	private String performPost(String url, String content, String format){
		WebResource webResource = client.resource(url);
		ClientResponse response = webResource.type(format)
				.post(ClientResponse.class, content);
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
		}
		String output = response.getEntity(String.class);
		return output;
	}

	private String performPut(String url, String content, String format){
		WebResource webResource = client.resource(url);
		ClientResponse response = webResource.type(format)
				.put(ClientResponse.class, content);
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
		}
		String output = response.getEntity(String.class);
		return output;
	}

	private String performDelete(String url, String content, String format){
		if (content!= null && !content.isEmpty()){
			url = url + "/" + content;
		}
		WebResource webResource = client
				.resource(url);
		ClientResponse response = webResource.accept(format)
				.delete(ClientResponse.class);
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
		}
		String output = response.getEntity(String.class);
		return output;
	}


}
