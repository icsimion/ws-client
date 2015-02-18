package com.webserv.rest.httpclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class HttpClientRestClient {
	private HttpClient client;

	public HttpClientRestClient() {
		client = new DefaultHttpClient();
	}

	public String performRequest(String action, String url, String content, String format) {
		if(action.equals("GET")){
			return performGet(url, content);
		}
		if(action.equals("POST")){
			return performPost(url, content, format);
		}
		if(action.equals("PUT")){
			return performPut(url, content, format);
		}
		if(action.equals("DELETE")){
			return performDelete(url, content);
		}
		return null;
	}

	private String performGet(String url, String content) {
		HttpGet request = null;
		StringBuffer sb = new StringBuffer();

		if (content!= null && !content.isEmpty()){
			url = url + "/" + content;
		}
		try {
			request = new HttpGet(url);
			HttpResponse response = client.execute(request);
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			sb = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				sb.append(line);
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	private String performPost(String url, String content, String format) {
		HttpPost request = null;
		StringBuffer sb = new StringBuffer();

		try {
			request = new HttpPost(url);
			StringEntity input = new StringEntity(content);
			input.setContentType(format);
			request.setEntity(input);
			HttpResponse response = client.execute(request);
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			sb = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				sb.append(line);
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	private String performPut(String url, String content, String format) {
		HttpPut request = null;
		StringBuffer sb = new StringBuffer();

		try {
			request = new HttpPut(url);
			StringEntity input = new StringEntity(content);
			input.setContentType(format);
			request.setEntity(input);
			HttpResponse response = client.execute(request);
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			sb = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				sb.append(line);
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	private String performDelete(String url, String content) {
		HttpDelete request = null;
		StringBuffer sb = new StringBuffer();

		if (content!= null && !content.isEmpty()){
			url = url + "/" + content;
		}
		try {
			request = new HttpDelete(url);
			HttpResponse response = client.execute(request);
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			sb = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				sb.append(line);
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}


}
